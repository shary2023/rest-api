package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.ItemCompleteSchema;
import com.github.shary2023.docs.model.ItemStateSchema;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemDataForRentSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T18:28:26.671559500+06:00[Asia/Almaty]")
public class ItemDataForRentSchema {

  @JsonProperty("onLease")
  private Boolean onLease = false;

  @JsonProperty("isBooked")
  private Boolean isBooked = false;

  @JsonProperty("isNeedInsurance")
  private Boolean isNeedInsurance = false;

  @JsonProperty("onLeaseDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime onLeaseDate;

  @JsonProperty("isBookedDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime isBookedDate;

  @JsonProperty("complete")
  private ItemCompleteSchema complete;

  @JsonProperty("state")
  private ItemStateSchema state;

  public ItemDataForRentSchema onLease(Boolean onLease) {
    this.onLease = onLease;
    return this;
  }

  /**
   * Get onLease
   * @return onLease
  */
  
  @Schema(name = "onLease", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getOnLease() {
    return onLease;
  }

  public void setOnLease(Boolean onLease) {
    this.onLease = onLease;
  }

  public ItemDataForRentSchema isBooked(Boolean isBooked) {
    this.isBooked = isBooked;
    return this;
  }

  /**
   * Get isBooked
   * @return isBooked
  */
  
  @Schema(name = "isBooked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsBooked() {
    return isBooked;
  }

  public void setIsBooked(Boolean isBooked) {
    this.isBooked = isBooked;
  }

  public ItemDataForRentSchema isNeedInsurance(Boolean isNeedInsurance) {
    this.isNeedInsurance = isNeedInsurance;
    return this;
  }

  /**
   * Get isNeedInsurance
   * @return isNeedInsurance
  */
  
  @Schema(name = "isNeedInsurance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsNeedInsurance() {
    return isNeedInsurance;
  }

  public void setIsNeedInsurance(Boolean isNeedInsurance) {
    this.isNeedInsurance = isNeedInsurance;
  }

  public ItemDataForRentSchema onLeaseDate(OffsetDateTime onLeaseDate) {
    this.onLeaseDate = onLeaseDate;
    return this;
  }

  /**
   * Get onLeaseDate
   * @return onLeaseDate
  */
  @Valid 
  @Schema(name = "onLeaseDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getOnLeaseDate() {
    return onLeaseDate;
  }

  public void setOnLeaseDate(OffsetDateTime onLeaseDate) {
    this.onLeaseDate = onLeaseDate;
  }

  public ItemDataForRentSchema isBookedDate(OffsetDateTime isBookedDate) {
    this.isBookedDate = isBookedDate;
    return this;
  }

  /**
   * Get isBookedDate
   * @return isBookedDate
  */
  @Valid 
  @Schema(name = "isBookedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getIsBookedDate() {
    return isBookedDate;
  }

  public void setIsBookedDate(OffsetDateTime isBookedDate) {
    this.isBookedDate = isBookedDate;
  }

  public ItemDataForRentSchema complete(ItemCompleteSchema complete) {
    this.complete = complete;
    return this;
  }

  /**
   * Get complete
   * @return complete
  */
  @Valid 
  @Schema(name = "complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ItemCompleteSchema getComplete() {
    return complete;
  }

  public void setComplete(ItemCompleteSchema complete) {
    this.complete = complete;
  }

  public ItemDataForRentSchema state(ItemStateSchema state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ItemStateSchema getState() {
    return state;
  }

  public void setState(ItemStateSchema state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDataForRentSchema itemDataForRentSchema = (ItemDataForRentSchema) o;
    return Objects.equals(this.onLease, itemDataForRentSchema.onLease) &&
        Objects.equals(this.isBooked, itemDataForRentSchema.isBooked) &&
        Objects.equals(this.isNeedInsurance, itemDataForRentSchema.isNeedInsurance) &&
        Objects.equals(this.onLeaseDate, itemDataForRentSchema.onLeaseDate) &&
        Objects.equals(this.isBookedDate, itemDataForRentSchema.isBookedDate) &&
        Objects.equals(this.complete, itemDataForRentSchema.complete) &&
        Objects.equals(this.state, itemDataForRentSchema.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onLease, isBooked, isNeedInsurance, onLeaseDate, isBookedDate, complete, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDataForRentSchema {\n");
    sb.append("    onLease: ").append(toIndentedString(onLease)).append("\n");
    sb.append("    isBooked: ").append(toIndentedString(isBooked)).append("\n");
    sb.append("    isNeedInsurance: ").append(toIndentedString(isNeedInsurance)).append("\n");
    sb.append("    onLeaseDate: ").append(toIndentedString(onLeaseDate)).append("\n");
    sb.append("    isBookedDate: ").append(toIndentedString(isBookedDate)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

