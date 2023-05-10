package com.github.shary2023.core.component.patcher;

import com.github.shary2023.core.component.Patcher;
import com.github.shary2023.core.exception.UpdateRequestException;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class EntityPatcher<E> implements Patcher<E> {
    @Value("${app.messages.errors.entity.update}")
    private String updateError;

    /**
     * Updates only those entity fields that are passed in the map as not null.
     *
     * @param entity - entity for update
     * @param data   - data for entity update
     * @return - updated entity E-type
     */
    public E patch(@NotNull E entity, @NotNull Map<String, Object> data) {
            Class<?> clazz = entity.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (data.get(field.getName()) == null) {
                    try {
                        data.put(field.getName(), field.get(entity));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
                data.forEach((key, value) -> {
                    if (key.equalsIgnoreCase(field.getName())) {
                        try {
                            setValue(key, entity, value);
                        } catch (Exception e) {
                            log.error(String.format("Unable to do partial update field: %s ", key), e);
                            throw new UpdateRequestException(updateError);
                        }
                    }
                });
            }
        return  entity;
    }

    public E patchWithNullFields(@NotNull E goal, @NotNull Map<String, Object> update) {

        Map<String, Object> goalMap = toUpdateMap(goal);

        for (String key : update.keySet()) {
            if (update.get(key) == null) {
                update.put(key, goalMap.get(key));
            }
        }
        return patch(goal, update);
    }

    /**
     * Converts entity E to a collection of type java.util.Map
     *
     * @param entity - convertible entity of type E
     * @return - java.util.Map
     */
    public Map<String, Object> toUpdateMap(E entity) {
        Class<?> clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        HashMap<String, Object> result = new HashMap<>();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                result.put(field.getName(), field.get(entity));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

    private void setValue(String fieldName, E data, Object value) {
        try {
            var field = data.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            if (field.getAnnotatedType().getType().getTypeName().equals(Long.class.getTypeName())) {
                var longValue = value != null ? Long.valueOf(value.toString()) : null;
                field.set(data, longValue);
            } else {
                field.set(data, value);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
