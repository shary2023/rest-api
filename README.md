SHARY
=====
Библиотека автоматической генерации моделей сущностей и описания REST-API.
-----
##### Для работы с данным репозиторием, обратитесь к сотруднику компании, 
##### который сможет дать вам необходимые права доступа и сообщите ему логин своего аккаунта на github.com


Подключение библиотеки:
-----
1. В build.gradle Вашего модуля добавьте репозиторий: 

>
>       allprojects {
>		   repositories {
>			  ...
>             gradlePluginPortal()
>			  maven { url 'https://jitpack.io' }
>		   }
>	    }
> 

2. В зависимости build.gradle добавьте:

>          dependencies {
>              implementation 'com.github.shary2023:rest-api:Tag'
>          }

    где Tag - буква v + последняя версия релиза (например, v0.0.1)

### Описание модели сущности.

- Модели данных описываются в yaml-формате в файле ___src/main/resources/docs-eng.yaml___. 
- При запуске команды ___./gradlew build___ из данного файла будет сгенерирован код класса.

***Пример описания модели данных:***
- При выборе имени модели, руководствуйтесь следующими принципами:
1. Имя - существительное на английском языке, максимально отражающее суть объекта, написанное
верблюжьей нотацией с обязательным постфиксом Schema.

>
>       CategorySchema:
>           type: object
>           required:
>               - name
>           properties:
>               id:
>                   type: integer
>                   format: int64
>               name:
>                   type: string

***Пример описания коллекции объектов:***

    CategoriesListSchema:
      allOf:
        - $ref: 'base.yml#/components/schemas/BaseResponse'
      type: object
      required:
        - categories
      properties:
        categories:
          type: array
          items:
            $ref: '#/components/schemas/CategoryResponseSchema'

### Описание эндпоинта контроллера.

- Эндпоинты контроллеров также описываются в yaml-формате в файле ___src/main/resources/docs-eng.yaml___.
- При запуске команды ___./gradlew build___ из данного файла будет сгенерирован код класса.

***Пример эндпоинта контроллера:***

>
>       /subcategories/{subcategoryId}:
>       parameters:
>           name: subcategoryId 
>           in: path
>           required: true
>           description: Subcategory entity ID (subcategory).
>           schema:
>               type: integer
>               format: int64
>
>       get:
>           tags:
>               - System API
>           operationId: getSubcategoryById
>           summary: Get subcategory.
>           description: Get subcategory by id.
>           responses:
>               '200':
>                   description: Successful response to get subcategory by id.
>                   content:
>                       application/json:
>                           schema:
>                               $ref: '#/components/schemas/SubcategoryResponseSchema'
>               '400':
>                   description: User input error.
>                   content:
>                       application/json:
>                           schema:
>                               $ref: 'base.yml#/components/schemas/BaseResponse'
>               '404':
>                   description: The subcategory with the specified ID was not found.
>                   content:
>                       application/json:
>                           schema:
>                               $ref: 'base.yml#/components/schemas/BaseResponse'
>               '500':
>                   description: Unexpected error.
>                   content:
>                       application/json:
>                           schema:
>                               $ref: 'base.yml#/components/schemas/BaseResponse'
>

- Описывать подобным образом можно rest-запросы любых типов (post, get, put, patch, delete) 
- В запросах можно описывать любые http-коды ответов к ним.
- Полный туториал по описанию rest-api через yaml-файл: https://starkovden.github.io/openapi-tutorial-overview.html
- Ещё полезная ссылка: https://swagger.io/docs/specification/data-models/data-types
- Ссылка на swagger-editor для данного сервиса: https://editor.swagger.io/?_ga=2.195340271.2106227544.1676378173-424664439.1676378173
#### После описания новой модели данных, или эндпоинта контроллера, нужно убедиться в отсутствии ошибок,
#### выполнить билд проекта и запушить изменения в этот репозиторий.

#### Далее нужно создать в репозитории новый тэг и выполнить сборку новой версии библиотеки на jitpack, тут:

https://jitpack.io/#shary2023/rest-api/Tag
