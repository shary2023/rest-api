/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.RoleSchema;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-10T21:17:16.102639400+06:00[Asia/Almaty]")
@Validated
@Tag(name = "roles", description = "Methods available only to the administrator")
public interface RolesApi {

    /**
     * POST /roles : Create role.
     * Create role.
     *
     * @param roleSchema  (required)
     * @return Successful response to create a role. (status code 200)
     *         or User input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "createRole",
        summary = "Create role.",
        description = "Create role.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to create a role.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RoleSchema.class))
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
        value = "/roles",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<RoleSchema> createRole(
        @Parameter(name = "RoleSchema", description = "", required = true) @Valid @RequestBody RoleSchema roleSchema
    );


    /**
     * GET /roles : Get all roles.
     * Get all roles in db.
     *
     * @return Successful response to a request to get all roles. (status code 200)
     *         or User input error. (status code 400)
     *         or Role with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getAllRoles",
        summary = "Get all roles.",
        description = "Get all roles in db.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to a request to get all roles.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = RoleSchema.class)))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Role with the specified ID was not found.", content = {
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
        value = "/roles",
        produces = { "application/json" }
    )
    ResponseEntity<List<RoleSchema>> getAllRoles(
        
    );


    /**
     * GET /roles/{roleId} : Get role.
     * Get role by id.
     *
     * @param roleId Role entity ID (role). (required)
     * @return Successful response to get role by id. (status code 200)
     *         or User input error. (status code 400)
     *         or The role with the specified ID was not found. (status code 404)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "getRoleById",
        summary = "Get role.",
        description = "Get role by id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get role by id.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RoleSchema.class))
            }),
            @ApiResponse(responseCode = "400", description = "User input error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "The role with the specified ID was not found.", content = {
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
        value = "/roles/{roleId}",
        produces = { "application/json" }
    )
    ResponseEntity<RoleSchema> getRoleById(
        @Parameter(name = "roleId", description = "Role entity ID (role).", required = true, in = ParameterIn.PATH) @PathVariable("roleId") Long roleId
    );

}
