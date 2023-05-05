package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.InsuranceCostSchema;
import com.github.shary2023.docs.model.InsuranceItemSchema;
import com.github.shary2023.docs.model.InsuranceMediaSchema;
import com.github.shary2023.docs.model.InsuranceMetadataSchema;
import com.github.shary2023.docs.model.InsuranceOwnerSchema;
import com.github.shary2023.docs.model.InsuranceRenterSchema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceCreationResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-05T19:03:21.093931500+03:00[Europe/Moscow]")
public class InsuranceCreationResponseSchema implements GetLease200Response {

  @JsonProperty("coverage")
  private InsuranceCostSchema coverage;

  @JsonProperty("deductible")
  private InsuranceCostSchema deductible;

  @JsonProperty("id")
  private String id;

  @JsonProperty("policy_id")
  private Long policyId;

  @JsonProperty("policy_number")
  private String policyNumber;

  @JsonProperty("premium")
  private InsuranceCostSchema premium;

  @JsonProperty("media")
  @Valid
  private List<InsuranceMediaSchema> media = null;

  @JsonProperty("missed_media")
  @Valid
  private List<InsuranceMediaSchema> missedMedia = null;

  @JsonProperty("status")
  private String status;

  @JsonProperty("ends_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endsAt;

  @JsonProperty("item")
  private InsuranceItemSchema item;

  @JsonProperty("lease_cost")
  private InsuranceCostSchema leaseCost;

  @JsonProperty("metadata")
  private InsuranceMetadataSchema metadata;

  @JsonProperty("starts_at")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startsAt;

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

  public InsuranceCreationResponseSchema coverage(InsuranceCostSchema coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Get coverage
   * @return coverage
  */
  @Valid 
  @Schema(name = "coverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceCostSchema getCoverage() {
    return coverage;
  }

  public void setCoverage(InsuranceCostSchema coverage) {
    this.coverage = coverage;
  }

  public InsuranceCreationResponseSchema deductible(InsuranceCostSchema deductible) {
    this.deductible = deductible;
    return this;
  }

  /**
   * Get deductible
   * @return deductible
  */
  @Valid 
  @Schema(name = "deductible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceCostSchema getDeductible() {
    return deductible;
  }

  public void setDeductible(InsuranceCostSchema deductible) {
    this.deductible = deductible;
  }

  public InsuranceCreationResponseSchema id(String id) {
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

  public InsuranceCreationResponseSchema policyId(Long policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
  */
  
  @Schema(name = "policy_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getPolicyId() {
    return policyId;
  }

  public void setPolicyId(Long policyId) {
    this.policyId = policyId;
  }

  public InsuranceCreationResponseSchema policyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
    return this;
  }

  /**
   * Get policyNumber
   * @return policyNumber
  */
  
  @Schema(name = "policy_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPolicyNumber() {
    return policyNumber;
  }

  public void setPolicyNumber(String policyNumber) {
    this.policyNumber = policyNumber;
  }

  public InsuranceCreationResponseSchema premium(InsuranceCostSchema premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Get premium
   * @return premium
  */
  @Valid 
  @Schema(name = "premium", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceCostSchema getPremium() {
    return premium;
  }

  public void setPremium(InsuranceCostSchema premium) {
    this.premium = premium;
  }

  public InsuranceCreationResponseSchema media(List<InsuranceMediaSchema> media) {
    this.media = media;
    return this;
  }

  public InsuranceCreationResponseSchema addMediaItem(InsuranceMediaSchema mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

  /**
   * Get media
   * @return media
  */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<InsuranceMediaSchema> getMedia() {
    return media;
  }

  public void setMedia(List<InsuranceMediaSchema> media) {
    this.media = media;
  }

  public InsuranceCreationResponseSchema missedMedia(List<InsuranceMediaSchema> missedMedia) {
    this.missedMedia = missedMedia;
    return this;
  }

  public InsuranceCreationResponseSchema addMissedMediaItem(InsuranceMediaSchema missedMediaItem) {
    if (this.missedMedia == null) {
      this.missedMedia = new ArrayList<>();
    }
    this.missedMedia.add(missedMediaItem);
    return this;
  }

  /**
   * Get missedMedia
   * @return missedMedia
  */
  @Valid 
  @Schema(name = "missed_media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<InsuranceMediaSchema> getMissedMedia() {
    return missedMedia;
  }

  public void setMissedMedia(List<InsuranceMediaSchema> missedMedia) {
    this.missedMedia = missedMedia;
  }

  public InsuranceCreationResponseSchema status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", example = "assembling", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InsuranceCreationResponseSchema endsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
    return this;
  }

  /**
   * Get endsAt
   * @return endsAt
  */
  @Valid 
  @Schema(name = "ends_at", example = "2023-04-30T23:59:59.294Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  public InsuranceCreationResponseSchema item(InsuranceItemSchema item) {
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

  public InsuranceCreationResponseSchema leaseCost(InsuranceCostSchema leaseCost) {
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

  public InsuranceCreationResponseSchema metadata(InsuranceMetadataSchema metadata) {
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

  public InsuranceCreationResponseSchema startsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * Get startsAt
   * @return startsAt
  */
  @Valid 
  @Schema(name = "starts_at", example = "2023-04-27T10:00:59.294Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  public InsuranceCreationResponseSchema completed(Boolean completed) {
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

  public InsuranceCreationResponseSchema description(String description) {
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

  public InsuranceCreationResponseSchema leaseKey(String leaseKey) {
    this.leaseKey = leaseKey;
    return this;
  }

  /**
   * Get leaseKey
   * @return leaseKey
  */
  
  @Schema(name = "lease_key", example = "1045", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLeaseKey() {
    return leaseKey;
  }

  public void setLeaseKey(String leaseKey) {
    this.leaseKey = leaseKey;
  }

  public InsuranceCreationResponseSchema owner(InsuranceRenterSchema owner) {
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

  public InsuranceCreationResponseSchema renter(InsuranceOwnerSchema renter) {
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
    InsuranceCreationResponseSchema insuranceCreationResponseSchema = (InsuranceCreationResponseSchema) o;
    return Objects.equals(this.coverage, insuranceCreationResponseSchema.coverage) &&
        Objects.equals(this.deductible, insuranceCreationResponseSchema.deductible) &&
        Objects.equals(this.id, insuranceCreationResponseSchema.id) &&
        Objects.equals(this.policyId, insuranceCreationResponseSchema.policyId) &&
        Objects.equals(this.policyNumber, insuranceCreationResponseSchema.policyNumber) &&
        Objects.equals(this.premium, insuranceCreationResponseSchema.premium) &&
        Objects.equals(this.media, insuranceCreationResponseSchema.media) &&
        Objects.equals(this.missedMedia, insuranceCreationResponseSchema.missedMedia) &&
        Objects.equals(this.status, insuranceCreationResponseSchema.status) &&
        Objects.equals(this.endsAt, insuranceCreationResponseSchema.endsAt) &&
        Objects.equals(this.item, insuranceCreationResponseSchema.item) &&
        Objects.equals(this.leaseCost, insuranceCreationResponseSchema.leaseCost) &&
        Objects.equals(this.metadata, insuranceCreationResponseSchema.metadata) &&
        Objects.equals(this.startsAt, insuranceCreationResponseSchema.startsAt) &&
        Objects.equals(this.completed, insuranceCreationResponseSchema.completed) &&
        Objects.equals(this.description, insuranceCreationResponseSchema.description) &&
        Objects.equals(this.leaseKey, insuranceCreationResponseSchema.leaseKey) &&
        Objects.equals(this.owner, insuranceCreationResponseSchema.owner) &&
        Objects.equals(this.renter, insuranceCreationResponseSchema.renter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage, deductible, id, policyId, policyNumber, premium, media, missedMedia, status, endsAt, item, leaseCost, metadata, startsAt, completed, description, leaseKey, owner, renter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceCreationResponseSchema {\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    deductible: ").append(toIndentedString(deductible)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    missedMedia: ").append(toIndentedString(missedMedia)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

