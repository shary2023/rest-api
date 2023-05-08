/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.OrderSchema;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-08T20:12:42.845236800+06:00[Asia/Almaty]")
@Validated
@Tag(name = "orders", description = "Methods available only to the administrator")
public interface OrdersApi {

    /**
     * DELETE /orders/{orderId} : Delete order.
     * Completely delete a order from the application (including from the database).
     *
     * @param orderId Order entity ID (order). (required)
     * @return A successful response to deleting a order. (status code 200)
     *         or User input error. (status code 400)
     *         or The order with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "deleteOrder",
        summary = "Delete order.",
        description = "Completely delete a order from the application (including from the database).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A successful response to deleting a order.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The order with the specified ID was not found.", content = {
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
        value = "/orders/{orderId}",
        produces = { "application/json" }
    )
    ResponseEntity<Boolean> deleteOrder(
        @Parameter(name = "orderId", description = "Order entity ID (order).", required = true, in = ParameterIn.PATH) @PathVariable("orderId") Long orderId
    );


    /**
     * GET /orders : Get orders.
     * Get all orders in our service.
     *
     * @return Successful response to get all orders request. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllOrders",
        summary = "Get orders.",
        description = "Get all orders in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get all orders request.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderSchema.class)))
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
        method = RequestMethod.GET,
        value = "/orders",
        produces = { "application/json" }
    )
    ResponseEntity<List<OrderSchema>> getAllOrders(
        
    );


    /**
     * GET /orders/{orderId} : Get order.
     * Get order by id.
     *
     * @param orderId Order entity ID (order). (required)
     * @return Successful response to get order by id. (status code 200)
     *         or User input error. (status code 400)
     *         or The order with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getOrderById",
        summary = "Get order.",
        description = "Get order by id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get order by id.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OrderSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The order with the specified ID was not found.", content = {
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
        value = "/orders/{orderId}",
        produces = { "application/json" }
    )
    ResponseEntity<OrderSchema> getOrderById(
        @Parameter(name = "orderId", description = "Order entity ID (order).", required = true, in = ParameterIn.PATH) @PathVariable("orderId") Long orderId
    );


    /**
     * GET /orders/items/{itemId} : Get order by item id.
     * Get order by item id.
     *
     * @param itemId Item entity ID (item). (required)
     * @return Successful response to get order by item id. (status code 200)
     *         or User input error. (status code 400)
     *         or The item with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getOrderByItemId",
        summary = "Get order by item id.",
        description = "Get order by item id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get order by item id.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OrderSchema.class))
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
        value = "/orders/items/{itemId}",
        produces = { "application/json" }
    )
    ResponseEntity<OrderSchema> getOrderByItemId(
        @Parameter(name = "itemId", description = "Item entity ID (item).", required = true, in = ParameterIn.PATH) @PathVariable("itemId") Long itemId
    );


    /**
     * GET /orders/amount : Get orders amount.
     * Get all orders amount in our service.
     *
     * @return Successful response to get all orders amount request. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getOrdersAmount",
        summary = "Get orders amount.",
        description = "Get all orders amount in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get all orders amount request.", content = {
                @Content(mediaType = "text/plain", schema = @Schema(implementation = Long.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = Long.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "text/plain", schema = @Schema(implementation = BaseResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Unexpected error.", content = {
                @Content(mediaType = "text/plain", schema = @Schema(implementation = BaseResponse.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/amount",
        produces = { "text/plain", "application/json" }
    )
    ResponseEntity<Long> getOrdersAmount(
        
    );


    /**
     * GET /orders/users/{userId} : Get user orders.
     * Get user orders by user id.
     *
     * @param userId User entity ID (user). (required)
     * @return Successful response to get user orders by user id. (status code 200)
     *         or User input error. (status code 400)
     *         or The user with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getOrdersByUserId",
        summary = "Get user orders.",
        description = "Get user orders by user id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get user orders by user id.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderSchema.class)))
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
        value = "/orders/users/{userId}",
        produces = { "application/json" }
    )
    ResponseEntity<List<OrderSchema>> getOrdersByUserId(
        @Parameter(name = "userId", description = "User entity ID (user).", required = true, in = ParameterIn.PATH) @PathVariable("userId") Long userId
    );


    /**
     * PATCH /orders/{orderId} : Update order.
     * Update order.
     *
     * @param orderId Order entity ID (order). (required)
     * @param orderSchema  (required)
     * @return Successful response to a order change. (status code 200)
     *         or User input error. (status code 400)
     *         or The order with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "updateOrder",
        summary = "Update order.",
        description = "Update order.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a order change.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OrderSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The order with the specified ID was not found.", content = {
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
        value = "/orders/{orderId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<OrderSchema> updateOrder(
        @Parameter(name = "orderId", description = "Order entity ID (order).", required = true, in = ParameterIn.PATH) @PathVariable("orderId") Long orderId,
        @Parameter(name = "OrderSchema", description = "", required = true) @Valid @RequestBody OrderSchema orderSchema
    );

}
