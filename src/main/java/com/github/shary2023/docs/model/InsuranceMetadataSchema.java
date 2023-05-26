package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceMetadataSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T23:02:44.459311200+03:00[Europe/Moscow]")
public class InsuranceMetadataSchema {

  @JsonProperty("type")
  private String type;

  @JsonProperty("agreement_datetime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime agreementDatetime;

  @JsonProperty("lease_type")
  private String leaseType;

  public InsuranceMetadataSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * the line \"shary2023-02\" is used here
   * @return type
  */
  
  @Schema(name = "type", example = "shary2023-02", description = "the line \"shary2023-02\" is used here", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InsuranceMetadataSchema agreementDatetime(OffsetDateTime agreementDatetime) {
    this.agreementDatetime = agreementDatetime;
    return this;
  }

  /**
   * Get agreementDatetime
   * @return agreementDatetime
  */
  @Valid 
  @Schema(name = "agreement_datetime", example = "2023-04-27T09:33:07.294Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getAgreementDatetime() {
    return agreementDatetime;
  }

  public void setAgreementDatetime(OffsetDateTime agreementDatetime) {
    this.agreementDatetime = agreementDatetime;
  }

  public InsuranceMetadataSchema leaseType(String leaseType) {
    this.leaseType = leaseType;
    return this;
  }

  /**
   * Get leaseType
   * @return leaseType
  */
  
  @Schema(name = "lease_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLeaseType() {
    return leaseType;
  }

  public void setLeaseType(String leaseType) {
    this.leaseType = leaseType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceMetadataSchema insuranceMetadataSchema = (InsuranceMetadataSchema) o;
    return Objects.equals(this.type, insuranceMetadataSchema.type) &&
        Objects.equals(this.agreementDatetime, insuranceMetadataSchema.agreementDatetime) &&
        Objects.equals(this.leaseType, insuranceMetadataSchema.leaseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, agreementDatetime, leaseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceMetadataSchema {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agreementDatetime: ").append(toIndentedString(agreementDatetime)).append("\n");
    sb.append("    leaseType: ").append(toIndentedString(leaseType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

