package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.InsuranceCostSchema;
import com.github.shary2023.docs.model.InsuranceItemSchema;
import com.github.shary2023.docs.model.InsuranceMetadataSchema;
import com.github.shary2023.docs.model.InsuranceOwnerSchema;
import com.github.shary2023.docs.model.InsuranceRenterSchema;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceCreationRequestSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T15:01:50.640643700+06:00[Asia/Almaty]")
public class InsuranceCreationRequestSchema {

  @JsonProperty("ends_at")
  private String endsAt;

  @JsonProperty("item")
  private InsuranceItemSchema item;

  @JsonProperty("lease_cost")
  private InsuranceCostSchema leaseCost;

  @JsonProperty("metadata")
  private InsuranceMetadataSchema metadata;

  @JsonProperty("starts_at")
  private String startsAt;

  @JsonProperty("completed")
  private Boolean completed;

  @JsonProperty("description")
  private String description;

  @JsonProperty("lease_key")
  private String leaseKey;

  @JsonProperty("owner")
  private InsuranceRenterSchema owner;

  @JsonProperty("renter")
  private InsuranceOwnerSchema renter;

  public InsuranceCreationRequestSchema endsAt(String endsAt) {
    this.endsAt = endsAt;
    return this;
  }

  /**
   * Get endsAt
   * @return endsAt
  */
  
  @Schema(name = "ends_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }

  public InsuranceCreationRequestSchema item(InsuranceItemSchema item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceItemSchema getItem() {
    return item;
  }

  public void setItem(InsuranceItemSchema item) {
    this.item = item;
  }

  public InsuranceCreationRequestSchema leaseCost(InsuranceCostSchema leaseCost) {
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

  public InsuranceCreationRequestSchema metadata(InsuranceMetadataSchema metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @Valid 
  @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceMetadataSchema getMetadata() {
    return metadata;
  }

  public void setMetadata(InsuranceMetadataSchema metadata) {
    this.metadata = metadata;
  }

  public InsuranceCreationRequestSchema startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * Get startsAt
   * @return startsAt
  */
  
  @Schema(name = "starts_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public InsuranceCreationRequestSchema completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
  */
  
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public InsuranceCreationRequestSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InsuranceCreationRequestSchema leaseKey(String leaseKey) {
    this.leaseKey = leaseKey;
    return this;
  }

  /**
   * Get leaseKey
   * @return leaseKey
  */
  
  @Schema(name = "lease_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLeaseKey() {
    return leaseKey;
  }

  public void setLeaseKey(String leaseKey) {
    this.leaseKey = leaseKey;
  }

  public InsuranceCreationRequestSchema owner(InsuranceRenterSchema owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceRenterSchema getOwner() {
    return owner;
  }

  public void setOwner(InsuranceRenterSchema owner) {
    this.owner = owner;
  }

  public InsuranceCreationRequestSchema renter(InsuranceOwnerSchema renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  @Valid 
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceOwnerSchema getRenter() {
    return renter;
  }

  public void setRenter(InsuranceOwnerSchema renter) {
    this.renter = renter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceCreationRequestSchema insuranceCreationRequestSchema = (InsuranceCreationRequestSchema) o;
    return Objects.equals(this.endsAt, insuranceCreationRequestSchema.endsAt) &&
        Objects.equals(this.item, insuranceCreationRequestSchema.item) &&
        Objects.equals(this.leaseCost, insuranceCreationRequestSchema.leaseCost) &&
        Objects.equals(this.metadata, insuranceCreationRequestSchema.metadata) &&
        Objects.equals(this.startsAt, insuranceCreationRequestSchema.startsAt) &&
        Objects.equals(this.completed, insuranceCreationRequestSchema.completed) &&
        Objects.equals(this.description, insuranceCreationRequestSchema.description) &&
        Objects.equals(this.leaseKey, insuranceCreationRequestSchema.leaseKey) &&
        Objects.equals(this.owner, insuranceCreationRequestSchema.owner) &&
        Objects.equals(this.renter, insuranceCreationRequestSchema.renter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endsAt, item, leaseCost, metadata, startsAt, completed, description, leaseKey, owner, renter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceCreationRequestSchema {\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    leaseCost: ").append(toIndentedString(leaseCost)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    leaseKey: ").append(toIndentedString(leaseKey)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    renter: ").append(toIndentedString(renter)).append("\n");
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

