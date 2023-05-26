/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.GetLease200Response;
import com.github.shary2023.docs.model.InsuranceCreationRequestSchema;
import com.github.shary2023.docs.model.InsuranceCreationResponseSchema;
import com.github.shary2023.docs.model.InsuranceLeaseCancelledSchema;
import com.github.shary2023.docs.model.InsuranceLeasesResponse;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T22:35:15.904712900+03:00[Europe/Moscow]")
@Validated
@Tag(name = "renters", description = "Methods available only to the administrator")
public interface RentersApi {

    /**
     * POST /renters/items/leases/{lease_id}/cancel : Cancel insurance by lease ID
     * Cancel insurance by lease ID
     *
     * @param leaseId Insurance lease by id (required)
     * @return Successful response of cancel insurance (status code 201)
     *         or Access forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Unprocessable Entity (status code 422)
     */
    @Operation(
        operationId = "cancelLease",
        summary = "Cancel insurance by lease ID",
        description = "Cancel insurance by lease ID",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful response of cancel insurance", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InsuranceLeaseCancelledSchema.class))
            }),
            @ApiResponse(responseCode = "403", description = "Access forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/renters/items/leases/{lease_id}/cancel",
        produces = { "application/json" }
    )
    ResponseEntity<InsuranceLeaseCancelledSchema> cancelLease(
        @Parameter(name = "lease_id", description = "Insurance lease by id", required = true, in = ParameterIn.PATH) @PathVariable("lease_id") String leaseId
    );


    /**
     * POST /renters/lease : Create an insurance for the item
     * Create an insurance for the item
     *
     * @param insuranceCreationRequestSchema Create an insurance for the item (required)
     * @return Successful response to an insurance request created as part of a lease (status code 201)
     *         or Access forbidden (status code 403)
     *         or Unprocessable Entity (status code 422)
     */
    @Operation(
        operationId = "createLease",
        summary = "Create an insurance for the item",
        description = "Create an insurance for the item",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful response to an insurance request created as part of a lease", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InsuranceCreationResponseSchema.class))
            }),
            @ApiResponse(responseCode = "403", description = "Access forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/renters/lease",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<InsuranceCreationResponseSchema> createLease(
        @Parameter(name = "InsuranceCreationRequestSchema", description = "Create an insurance for the item", required = true) @Valid @RequestBody InsuranceCreationRequestSchema insuranceCreationRequestSchema
    );


    /**
     * GET /renters/items/leases/{lease_id} : Get Insurance lease by id.
     * Get Insurance lease by id.
     *
     * @param leaseId Insurance lease by id. (required)
     * @param completeness Get the entity of insurance in basic form or in full (optional, default to basic)
     * @return Successful response to get a insurance  by ID (status code 200)
     *         or Access forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Unprocessable Entity (status code 422)
     */
    @Operation(
        operationId = "getLease",
        summary = "Get Insurance lease by id.",
        description = "Get Insurance lease by id.",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get a insurance  by ID", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetLease200Response.class))
            }),
            @ApiResponse(responseCode = "403", description = "Access forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/renters/items/leases/{lease_id}",
        produces = { "application/json" }
    )
    ResponseEntity<GetLease200Response> getLease(
        @Parameter(name = "lease_id", description = "Insurance lease by id.", required = true, in = ParameterIn.PATH) @PathVariable("lease_id") String leaseId,
        @Parameter(name = "completeness", description = "Get the entity of insurance in basic form or in full", in = ParameterIn.QUERY) @Valid @RequestParam(value = "completeness", required = false, defaultValue = "basic") String completeness
    );


    /**
     * GET /renters/items/leases : Get a list of registered insurances
     * Get a list of registered insurances
     *
     * @param limit The number of insurance approvals received (required)
     * @param after cursor to the next page (optional)
     * @param before cursor to the previous page (optional)
     * @return Successful response to get a list of registered insurance (status code 200)
     *         or Access forbidden (status code 403)
     *         or Unprocessable Entity (status code 422)
     */
    @Operation(
        operationId = "getLeases",
        summary = "Get a list of registered insurances",
        description = "Get a list of registered insurances",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get a list of registered insurance", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InsuranceLeasesResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "Access forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InsuranceLeasesResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/renters/items/leases",
        produces = { "application/json" }
    )
    ResponseEntity<InsuranceLeasesResponse> getLeases(
        @NotNull @Parameter(name = "limit", description = "The number of insurance approvals received", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = true) Integer limit,
        @Parameter(name = "after", description = "cursor to the next page", in = ParameterIn.QUERY) @Valid @RequestParam(value = "after", required = false) Integer after,
        @Parameter(name = "before", description = "cursor to the previous page", in = ParameterIn.QUERY) @Valid @RequestParam(value = "before", required = false) Integer before
    );


    /**
     * GET /renters/items/leases/{lease_id}/document : Get insurance policy in pdf format
     * Get insurance policy in pdf format
     *
     * @param leaseId Lease entity ID (required)
     * @param policesId Police entity ID (required)
     * @return Successful response to get a policy insurance in pdf format (status code 200)
     */
    @Operation(
        operationId = "getPdfPolices",
        summary = "Get insurance policy in pdf format",
        description = "Get insurance policy in pdf format",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to get a policy insurance in pdf format", content = {
                @Content(mediaType = "application/pdf", schema = @Schema(implementation = byte[].class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/renters/items/leases/{lease_id}/document",
        produces = { "application/pdf" }
    )
    ResponseEntity<byte[]> getPdfPolices(
        @Parameter(name = "lease_id", description = "Lease entity ID", required = true, in = ParameterIn.PATH) @PathVariable("lease_id") String leaseId,
        @NotNull @Parameter(name = "polices_id", description = "Police entity ID", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "polices_id", required = true) Long policesId
    );


    /**
     * POST /renters/items/leases/{lease_id}/submit : Approve the required for insurance
     * Approve the required for insurance
     *
     * @param leaseId Insurance lease by id (required)
     * @return Successful response to approve the lease insurance (status code 201)
     *         or Access forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Unprocessable Entity (status code 422)
     */
    @Operation(
        operationId = "submitLease",
        summary = "Approve the required for insurance",
        description = "Approve the required for insurance",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful response to approve the lease insurance", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InsuranceCreationResponseSchema.class))
            }),
            @ApiResponse(responseCode = "403", description = "Access forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/renters/items/leases/{lease_id}/submit",
        produces = { "application/json" }
    )
    ResponseEntity<InsuranceCreationResponseSchema> submitLease(
        @Parameter(name = "lease_id", description = "Insurance lease by id", required = true, in = ParameterIn.PATH) @PathVariable("lease_id") String leaseId
    );


    /**
     * PUT /renters/items/leases/{update_lease_id} : Update insurance by lease ID
     * Update insurance by lease ID
     *
     * @param updateLeaseId Insurance lease by id (required)
     * @param insuranceCreationRequestSchema Updating the insurance (required)
     * @return Successful insurance update (status code 201)
     *         or Access forbidden (status code 403)
     *         or Not found (status code 404)
     *         or Unprocessable Entity (status code 422)
     */
    @Operation(
        operationId = "updateLease",
        summary = "Update insurance by lease ID",
        description = "Update insurance by lease ID",
        tags = { "System API" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Successful insurance update", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = InsuranceCreationResponseSchema.class))
            }),
            @ApiResponse(responseCode = "403", description = "Access forbidden", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            }),
            @ApiResponse(responseCode = "422", description = "Unprocessable Entity", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BaseResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/renters/items/leases/{update_lease_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<InsuranceCreationResponseSchema> updateLease(
        @Parameter(name = "update_lease_id", description = "Insurance lease by id", required = true, in = ParameterIn.PATH) @PathVariable("update_lease_id") String updateLeaseId,
        @Parameter(name = "InsuranceCreationRequestSchema", description = "Updating the insurance", required = true) @Valid @RequestBody InsuranceCreationRequestSchema insuranceCreationRequestSchema
    );

}
