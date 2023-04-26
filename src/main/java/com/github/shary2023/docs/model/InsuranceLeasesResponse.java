package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.InsuranceItemResponseSchema;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceLeasesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T15:01:50.640643700+06:00[Asia/Almaty]")
public class InsuranceLeasesResponse {

  @JsonProperty("after")
  private String after;

  @JsonProperty("before")
  private String before;

  @JsonProperty("leases")
  @Valid
  private List<InsuranceItemResponseSchema> leases = null;

  @JsonProperty("limit")
  private Integer limit;

  public InsuranceLeasesResponse after(String after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
  */
  
  @Schema(name = "after", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public InsuranceLeasesResponse before(String before) {
    this.before = before;
    return this;
  }

  /**
   * Get before
   * @return before
  */
  
  @Schema(name = "before", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBefore() {
    return before;
  }

  public void setBefore(String before) {
    this.before = before;
  }

  public InsuranceLeasesResponse leases(List<InsuranceItemResponseSchema> leases) {
    this.leases = leases;
    return this;
  }

  public InsuranceLeasesResponse addLeasesItem(InsuranceItemResponseSchema leasesItem) {
    if (this.leases == null) {
      this.leases = new ArrayList<>();
    }
    this.leases.add(leasesItem);
    return this;
  }

  /**
   * Get leases
   * @return leases
  */
  @Valid 
  @Schema(name = "leases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<InsuranceItemResponseSchema> getLeases() {
    return leases;
  }

  public void setLeases(List<InsuranceItemResponseSchema> leases) {
    this.leases = leases;
  }

  public InsuranceLeasesResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceLeasesResponse insuranceLeasesResponse = (InsuranceLeasesResponse) o;
    return Objects.equals(this.after, insuranceLeasesResponse.after) &&
        Objects.equals(this.before, insuranceLeasesResponse.before) &&
        Objects.equals(this.leases, insuranceLeasesResponse.leases) &&
        Objects.equals(this.limit, insuranceLeasesResponse.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(after, before, leases, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceLeasesResponse {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    before: ").append(toIndentedString(before)).append("\n");
    sb.append("    leases: ").append(toIndentedString(leases)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

