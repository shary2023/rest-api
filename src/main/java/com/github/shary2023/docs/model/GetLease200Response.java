package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.shary2023.docs.model.InsuranceCostSchema;
import com.github.shary2023.docs.model.InsuranceCreationResponseSchema;
import com.github.shary2023.docs.model.InsuranceItemResponseSchema;
import com.github.shary2023.docs.model.InsuranceItemSchema;
import com.github.shary2023.docs.model.InsuranceMetadataSchema;
import com.github.shary2023.docs.model.InsuranceOwnerSchema;
import com.github.shary2023.docs.model.InsuranceRenterSchema;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-01T13:30:32.305512900+06:00[Asia/Almaty]")
public interface GetLease200Response {
}
