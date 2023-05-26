/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.shary2023.docs;

import com.github.shary2023.docs.model.BaseResponse;
import com.github.shary2023.docs.model.IndividualRequestSchema;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T23:02:44.459311200+03:00[Europe/Moscow]")
@Validated
@Tag(name = "docx", description = "the docx API")
public interface DocxApi {

    /**
     * POST /docx/individual : Creates an individual contract.
     * Creates an individual contract with parameters.
     *
     * @param individualRequestSchema  (optional)
     * @return Successful response to create contract. (status code 200)
     *         or Parameters input error. (status code 400)
     *         or Unexpected error. (status code 500)
     */
    @Operation(
        operationId = "postIndividualDocx",
        summary = "Creates an individual contract.",
        description = "Creates an individual contract with parameters.",
        tags = { "System Api" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response to create contract.", content = {
                @Content(mediaType = "text/plain", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "Parameters input error.", content = {
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
        method = RequestMethod.POST,
        value = "/docx/individual",
        produces = { "text/plain", "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<String> postIndividualDocx(
        @Parameter(name = "IndividualRequestSchema", description = "") @Valid @RequestBody(required = false) IndividualRequestSchema individualRequestSchema
    );

}
