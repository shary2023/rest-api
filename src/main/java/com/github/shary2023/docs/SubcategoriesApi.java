/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.SubcategoriesListSchema;
import com.github.shary2023.docs.model.SubcategoryResponseSchema;
import com.github.shary2023.docs.model.SubcategorySchema;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-14T21:08:52.567072300+06:00[Asia/Almaty]")
@Validated
@Tag(name = "subcategories", description = "Methods available only to the administrator")
public interface SubcategoriesApi {

    /**
     * POST /subcategories : Create a new item subcategory.
     * Create a new subcategory of items (for example, laptops).
     *
     * @param subcategorySchema  (required)
     * @return Successful response to the creation of a new subcategory. (status code 200)
     *         or User input error (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "createSubcategory",
        summary = "Create a new item subcategory.",
        description = "Create a new subcategory of items (for example, laptops).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to the creation of a new subcategory.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SubcategoryResponseSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error", content = {
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
        value = "/subcategories",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<SubcategoryResponseSchema> createSubcategory(
        @Parameter(name = "SubcategorySchema", description = "", required = true) @Valid @RequestBody SubcategorySchema subcategorySchema
    );


    /**
     * DELETE /subcategories/{subcategoryId} : Delete subcategory.
     * Completely delete a subcategory from the application (including from the database).
     *
     * @param subcategoryId Subcategory entity ID (subcategory). (required)
     * @return A successful response to deleting a subcategory. (status code 200)
     *         or User input error. (status code 400)
     *         or The subcategory with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "deleteSubcategory",
        summary = "Delete subcategory.",
        description = "Completely delete a subcategory from the application (including from the database).",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A successful response to deleting a subcategory.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))
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
        method = RequestMethod.DELETE,
        value = "/subcategories/{subcategoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<Boolean> deleteSubcategory(
        @Parameter(name = "subcategoryId", description = "Subcategory entity ID (subcategory).", required = true, in = ParameterIn.PATH) @PathVariable("subcategoryId") Long subcategoryId
    );


    /**
     * GET /subcategories : Get subcategories.
     * Get all subcategories in our service.
     *
     * @return Successful response to get all subcategories request. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllSubcategories",
        summary = "Get subcategories.",
        description = "Get all subcategories in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get all subcategories request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SubcategoriesListSchema.class))
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
        value = "/subcategories",
        produces = { "application/json" }
    )
    ResponseEntity<SubcategoriesListSchema> getAllSubcategories(
        
    );


    /**
     * GET /subcategories/categories/{categoryId} : Get all subcategories for category.
     * Get all subcategories for category in our service.
     *
     * @param categoryId Category entity ID (category). (required)
     * @return Successful response to a request to get all subcategories for a category. (status code 200)
     *         or User input error. (status code 400)
     *         or The category with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllSubcategoriesForCategory",
        summary = "Get all subcategories for category.",
        description = "Get all subcategories for category in our service.",
        tags = { "Public API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a request to get all subcategories for a category.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SubcategoriesListSchema.class))
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
        value = "/subcategories/categories/{categoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<SubcategoriesListSchema> getAllSubcategoriesForCategory(
        @Parameter(name = "categoryId", description = "Category entity ID (category).", required = true, in = ParameterIn.PATH) @PathVariable("categoryId") Long categoryId
    );


    /**
     * GET /subcategories/{subcategoryId} : Get subcategory.
     * Get subcategory by id.
     *
     * @param subcategoryId Subcategory entity ID (subcategory). (required)
     * @return Successful response to get subcategory by id. (status code 200)
     *         or User input error. (status code 400)
     *         or The subcategory with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getSubcategoryById",
        summary = "Get subcategory.",
        description = "Get subcategory by id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get subcategory by id.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SubcategoryResponseSchema.class))
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
        value = "/subcategories/{subcategoryId}",
        produces = { "application/json" }
    )
    ResponseEntity<SubcategoryResponseSchema> getSubcategoryById(
        @Parameter(name = "subcategoryId", description = "Subcategory entity ID (subcategory).", required = true, in = ParameterIn.PATH) @PathVariable("subcategoryId") Long subcategoryId
    );


    /**
     * PATCH /subcategories : Update subcategory.
     * Change subcategory name or image.
     *
     * @param subcategorySchema  (required)
     * @return Successful response to a subcategory change. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "updateSubcategory",
        summary = "Update subcategory.",
        description = "Change subcategory name or image.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a subcategory change.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SubcategoryResponseSchema.class))
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
        value = "/subcategories",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<SubcategoryResponseSchema> updateSubcategory(
        @Parameter(name = "SubcategorySchema", description = "", required = true) @Valid @RequestBody SubcategorySchema subcategorySchema
    );

}
