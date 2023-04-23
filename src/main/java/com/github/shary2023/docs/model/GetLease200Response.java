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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-23T11:37:42.382147200+06:00[Asia/Almaty]")
public interface GetLease200Response {
}
