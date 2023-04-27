/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.ItemSchema;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T15:01:50.640643700+06:00[Asia/Almaty]")
@Validated
@Tag(name = "items", description = "Methods available only to the administrator")
public interface ItemsApi {

    /**
     * POST /items : To rent.
     * Create the entity of the rented item.
     *
     * @param itemSchema  (required)
     * @return A successful response to the creation of a new item. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "createItem",
        summary = "To rent.",
        description = "Create the entity of the rented item.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A successful response to the creation of a new item.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/items",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ItemSchema> createItem(
        @Parameter(name = "ItemSchema", description = "", required = true) @Valid @RequestBody ItemSchema itemSchema
    );


    /**
     * DELETE /items/{itemId} : Delete item.
     * Completely delete a item from the application (including from the database).
     *
     * @param itemId Item entity ID (item). (required)
     * @return A successful response to deleting a item by id. (status code 200)
     *         or User input error (status code 400)
     *         or The item with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "deleteItem",
        summary = "Delete item.",
        description = "Completely delete a item from the application (including from the database).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A successful response to deleting a item by id.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The item with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/items/{itemId}",
        produces = { "application/json" }
    )
    ResponseEntity<Boolean> deleteItem(
        @Parameter(name = "itemId", description = "Item entity ID (item).", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    );


    /**
     * GET /items : Get all items.
     * Get all items in our service.
     *
     * @return Successful response to get all items request. (status code 200)
     *         or User input error. (status code 400)
     *         or The item with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllItems",
        summary = "Get all items.",
        description = "Get all items in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get all items request.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ItemSchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The item with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items",
        produces = { "application/json" }
    )
    ResponseEntity<List<ItemSchema>> getAllItems(
        
    );


    /**
     * GET /items/categories/{categoryId} : Get all items for category.
     * Get all items for category in our service.
     *
     * @param categoryId Id of the category for which we get all items. (required)
     * @return Successful response to a request to get all items for a category. (status code 200)
     *         or User input error. (status code 400)
     *         or The category with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllItemsForCategory",
        summary = "Get all items for category.",
        description = "Get all items for category in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a request to get all items for a category.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ItemSchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The category with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items/categories/{categoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<List<ItemSchema>> getAllItemsForCategory(
        @Parameter(name = "categoryId", description = "Id of the category for which we get all items.", required = true, in = ParameterIn.PATH) @PathVariable("categoryId") Long categoryId
    );


    /**
     * GET /items/subcategories/{subcategoryId} : Get all items for subcategory.
     * Get all items for subcategory in our service.
     *
     * @param subcategoryId Id of the subcategory for which we get all items. (required)
     * @return Successful response to a request to get all items for a subcategory. (status code 200)
     *         or User input error. (status code 400)
     *         or The subcategory with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllItemsForSubcategory",
        summary = "Get all items for subcategory.",
        description = "Get all items for subcategory in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a request to get all items for a subcategory.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ItemSchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The subcategory with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items/subcategories/{subcategoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<List<ItemSchema>> getAllItemsForSubcategory(
        @Parameter(name = "subcategoryId", description = "Id of the subcategory for which we get all items.", required = true, in = ParameterIn.PATH) @PathVariable("subcategoryId") Long subcategoryId
    );


    /**
     * GET /items/{itemId} : Get an item.
     * Get an item by its id.
     *
     * @param itemId Item entity ID (item). (required)
     * @return Successful response to finding a item. (status code 200)
     *         or User input error. (status code 400)
     *         or The item with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getItemById",
        summary = "Get an item.",
        description = "Get an item by its id.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to finding a item.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The item with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items/{itemId}",
        produces = { "application/json" }
    )
    ResponseEntity<ItemSchema> getItemById(
        @Parameter(name = "itemId", description = "Item entity ID (item).", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    );


    /**
     * GET /items/users/{ownerId} : Get items rented for user.
     * Get all items rented for user(owner) by user id in our service.
     *
     * @param ownerId Id of the user(owner) for which we get all items. (required)
     * @return Successful response to a request to get all items for rent for a user. (status code 200)
     *         or User input error. (status code 400)
     *         or The user with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getItemsRentedForUserByUserId",
        summary = "Get items rented for user.",
        description = "Get all items rented for user(owner) by user id in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a request to get all items for rent for a user.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ItemSchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The user with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items/users/{ownerId}",
        produces = { "application/json" }
    )
    ResponseEntity<List<ItemSchema>> getItemsRentedForUserByUserId(
        @Parameter(name = "ownerId", description = "Id of the user(owner) for which we get all items.", required = true, in = ParameterIn.PATH) @PathVariable("ownerId") Long ownerId
    );


    /**
     * GET /items/users/{renterId}/rent : Get rent items for user.
     * Get all rented items for user(renter) by user id in our service.
     *
     * @param renterId Id of the user(renter) for which we get all items. (required)
     * @return Successful response to a request to get all rented items for a user. (status code 200)
     *         or User input error. (status code 400)
     *         or The user with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getRentedItemsForUserByUserId",
        summary = "Get rent items for user.",
        description = "Get all rented items for user(renter) by user id in our service.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a request to get all rented items for a user.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ItemSchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The user with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/items/users/{renterId}/rent",
        produces = { "application/json" }
    )
    ResponseEntity<List<ItemSchema>> getRentedItemsForUserByUserId(
        @Parameter(name = "renterId", description = "Id of the user(renter) for which we get all items.", required = true, in = ParameterIn.PATH) @PathVariable("renterId") Long renterId
    );


    /**
     * POST /items/{itemId}/rent : Rent an item.
     * Rent an item (bind it to the tenant).
     *
     * @param itemId Item entity ID (item). (required)
     * @param renterId ID of the Renter entity that rented the item. (required)
     * @return Successful response to the return of the rented item. (status code 200)
     *         or User input error. (status code 400)
     *         or The item or owner with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "rentAnItem",
        summary = "Rent an item.",
        description = "Rent an item (bind it to the tenant).",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to the return of the rented item.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The item or owner with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/items/{itemId}/rent",
        produces = { "application/json" }
    )
    ResponseEntity<ItemSchema> rentAnItem(
        @Parameter(name = "itemId", description = "Item entity ID (item).", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId,
        @NotNull @Parameter(name = "renterId", description = "ID of the Renter entity that rented the item.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "renterId", required = true) Long renterId
    );


    /**
     * POST /items/{itemId}/rent/out : Return item.
     * Return the thing rented (untie it from the tenant).
     *
     * @param itemId Item entity ID (item). (required)
     * @return Successful response to the return of the rented item. (status code 200)
     *         or User input error. (status code 400)
     *         or The item or owner with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "returnRentedItem",
        summary = "Return item.",
        description = "Return the thing rented (untie it from the tenant).",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to the return of the rented item.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The item or owner with the specified ID was not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/items/{itemId}/rent/out",
        produces = { "application/json" }
    )
    ResponseEntity<Boolean> returnRentedItem(
        @Parameter(name = "itemId", description = "Item entity ID (item).", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    );


    /**
     * PATCH /items : Update item.
     * Update data about the item (for example, whether it is rented).
     *
     * @param itemSchema  (required)
     * @return Successful response to update items. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "updateItem",
        summary = "Update item.",
        description = "Update data about the item (for example, whether it is rented).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to update items.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ItemSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/items",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ItemSchema> updateItem(
        @Parameter(name = "ItemSchema", description = "", required = true) @Valid @RequestBody ItemSchema itemSchema
    );

}
