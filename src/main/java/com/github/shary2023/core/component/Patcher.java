package com.github.shary2023.core.component;

import jakarta.validation.constraints.NotNull;

import java.util.Map;

public interface Patcher<E> {
    E patch(@NotNull E entity, @NotNull Map<String, Object> data);
    Map<String, Object> toUpdateMap(E entity);
}