package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.InsuranceCostSchema;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceItemResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-23T11:37:42.382147200+06:00[Asia/Almaty]")
public class InsuranceItemResponseSchema implements GetLease200Response {

  @JsonProperty("completed")
  private Boolean completed;

  @JsonProperty("coverage")
  private InsuranceCostSchema coverage;

  @JsonProperty("deductible")
  private InsuranceCostSchema deductible;

  @JsonProperty("ends_at")
  private String endsAt;

  @JsonProperty("id")
  private String id;

  @JsonProperty("lease_cost")
  private InsuranceCostSchema leaseCost;

  @JsonProperty("lease_key")
  private String leaseKey;

  @JsonProperty("policy_id")
  private String policyId;

  @JsonProperty("policy_number")
  private String policyNumber;

  @JsonProperty("premium")
  private InsuranceCostSchema premium;

  @JsonProperty("starts_at")
  private String startsAt;

  @JsonProperty("status")
  private String status;

  public InsuranceItemResponseSchema completed(Boolean completed) {
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

  public InsuranceItemResponseSchema coverage(InsuranceCostSchema coverage) {
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

  public InsuranceItemResponseSchema deductible(InsuranceCostSchema deductible) {
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

  public InsuranceItemResponseSchema endsAt(String endsAt) {
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

  public InsuranceItemResponseSchema id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InsuranceItemResponseSchema leaseCost(InsuranceCostSchema leaseCost) {
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

  public InsuranceItemResponseSchema leaseKey(String leaseKey) {
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

  public InsuranceItemResponseSchema policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  /**
   * Get policyId
   * @return policyId
  */
  
  @Schema(name = "policy_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public InsuranceItemResponseSchema policyNumber(String policyNumber) {
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

  public InsuranceItemResponseSchema premium(InsuranceCostSchema premium) {
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

  public InsuranceItemResponseSchema startsAt(String startsAt) {
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

  public InsuranceItemResponseSchema status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    InsuranceItemResponseSchema insuranceItemResponseSchema = (InsuranceItemResponseSchema) o;
    return Objects.equals(this.completed, insuranceItemResponseSchema.completed) &&
        Objects.equals(this.coverage, insuranceItemResponseSchema.coverage) &&
        Objects.equals(this.deductible, insuranceItemResponseSchema.deductible) &&
        Objects.equals(this.endsAt, insuranceItemResponseSchema.endsAt) &&
        Objects.equals(this.id, insuranceItemResponseSchema.id) &&
        Objects.equals(this.leaseCost, insuranceItemResponseSchema.leaseCost) &&
        Objects.equals(this.leaseKey, insuranceItemResponseSchema.leaseKey) &&
        Objects.equals(this.policyId, insuranceItemResponseSchema.policyId) &&
        Objects.equals(this.policyNumber, insuranceItemResponseSchema.policyNumber) &&
        Objects.equals(this.premium, insuranceItemResponseSchema.premium) &&
        Objects.equals(this.startsAt, insuranceItemResponseSchema.startsAt) &&
        Objects.equals(this.status, insuranceItemResponseSchema.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completed, coverage, deductible, endsAt, id, leaseCost, leaseKey, policyId, policyNumber, premium, startsAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceItemResponseSchema {\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    deductible: ").append(toIndentedString(deductible)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaseCost: ").append(toIndentedString(leaseCost)).append("\n");
    sb.append("    leaseKey: ").append(toIndentedString(leaseKey)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    policyNumber: ").append(toIndentedString(policyNumber)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
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

