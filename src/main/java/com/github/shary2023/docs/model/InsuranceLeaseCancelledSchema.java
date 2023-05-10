package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.InsuranceCostSchema;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceLeaseCancelledSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-10T20:27:03.046386100+06:00[Asia/Almaty]")
public class InsuranceLeaseCancelledSchema {

  @JsonProperty("completed")
  private Boolean completed;

  @JsonProperty("ends_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endsAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("lease_cost")
  private InsuranceCostSchema leaseCost;

  @JsonProperty("lease_key")
  private String leaseKey;

  @JsonProperty("starts_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startsAt;

  @JsonProperty("status")
  private String status;

  public InsuranceLeaseCancelledSchema completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
  */
  
  @Schema(name = "completed", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public InsuranceLeaseCancelledSchema endsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
    return this;
  }

  /**
   * Get endsAt
   * @return endsAt
  */
  @Valid 
  @Schema(name = "ends_at", example = "2023-04-30T23:59:59Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  public InsuranceLeaseCancelledSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "5bd6f668-e723-4b81-8f71-7b1549153368", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InsuranceLeaseCancelledSchema leaseCost(InsuranceCostSchema leaseCost) {
    this.leaseCost = leaseCost;
    return this;
  }

  /**
   * Get leaseCost
   * @return leaseCost
  */
  @Valid 
  @Schema(name = "lease_cost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceCostSchema getLeaseCost() {
    return leaseCost;
  }

  public void setLeaseCost(InsuranceCostSchema leaseCost) {
    this.leaseCost = leaseCost;
  }

  public InsuranceLeaseCancelledSchema leaseKey(String leaseKey) {
    this.leaseKey = leaseKey;
    return this;
  }

  /**
   * Get leaseKey
   * @return leaseKey
  */
  
  @Schema(name = "lease_key", example = "1046", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLeaseKey() {
    return leaseKey;
  }

  public void setLeaseKey(String leaseKey) {
    this.leaseKey = leaseKey;
  }

  public InsuranceLeaseCancelledSchema startsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * Get startsAt
   * @return startsAt
  */
  @Valid 
  @Schema(name = "starts_at", example = "2023-04-27T10:00:59Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  public InsuranceLeaseCancelledSchema status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", example = "cancelled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceLeaseCancelledSchema insuranceLeaseCancelledSchema = (InsuranceLeaseCancelledSchema) o;
    return Objects.equals(this.completed, insuranceLeaseCancelledSchema.completed) &&
        Objects.equals(this.endsAt, insuranceLeaseCancelledSchema.endsAt) &&
        Objects.equals(this.id, insuranceLeaseCancelledSchema.id) &&
        Objects.equals(this.leaseCost, insuranceLeaseCancelledSchema.leaseCost) &&
        Objects.equals(this.leaseKey, insuranceLeaseCancelledSchema.leaseKey) &&
        Objects.equals(this.startsAt, insuranceLeaseCancelledSchema.startsAt) &&
        Objects.equals(this.status, insuranceLeaseCancelledSchema.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, endsAt, id, leaseCost, leaseKey, startsAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceLeaseCancelledSchema {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaseCost: ").append(toIndentedString(leaseCost)).append("\n");
    sb.append("    leaseKey: ").append(toIndentedString(leaseKey)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

