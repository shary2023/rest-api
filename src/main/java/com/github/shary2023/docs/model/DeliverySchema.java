package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.DeliveryDataSchema;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeliverySchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T23:02:44.459311200+03:00[Europe/Moscow]")
public class DeliverySchema {

  @JsonProperty("address")
  private String address;

  @JsonProperty("deliveryData")
  private DeliveryDataSchema deliveryData;

  @JsonProperty("dataTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dataTime;

  @JsonProperty("isPickUp")
  private Boolean isPickUp = false;

  public DeliverySchema address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public DeliverySchema deliveryData(DeliveryDataSchema deliveryData) {
    this.deliveryData = deliveryData;
    return this;
  }

  /**
   * Get deliveryData
   * @return deliveryData
  */
  @Valid 
  @Schema(name = "deliveryData", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DeliveryDataSchema getDeliveryData() {
    return deliveryData;
  }

  public void setDeliveryData(DeliveryDataSchema deliveryData) {
    this.deliveryData = deliveryData;
  }

  public DeliverySchema dataTime(OffsetDateTime dataTime) {
    this.dataTime = dataTime;
    return this;
  }

  /**
   * Get dataTime
   * @return dataTime
  */
  @Valid 
  @Schema(name = "dataTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getDataTime() {
    return dataTime;
  }

  public void setDataTime(OffsetDateTime dataTime) {
    this.dataTime = dataTime;
  }

  public DeliverySchema isPickUp(Boolean isPickUp) {
    this.isPickUp = isPickUp;
    return this;
  }

  /**
   * Get isPickUp
   * @return isPickUp
  */
  
  @Schema(name = "isPickUp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsPickUp() {
    return isPickUp;
  }

  public void setIsPickUp(Boolean isPickUp) {
    this.isPickUp = isPickUp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliverySchema deliverySchema = (DeliverySchema) o;
    return Objects.equals(this.address, deliverySchema.address) &&
        Objects.equals(this.deliveryData, deliverySchema.deliveryData) &&
        Objects.equals(this.dataTime, deliverySchema.dataTime) &&
        Objects.equals(this.isPickUp, deliverySchema.isPickUp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, deliveryData, dataTime, isPickUp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliverySchema {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    deliveryData: ").append(toIndentedString(deliveryData)).append("\n");
    sb.append("    dataTime: ").append(toIndentedString(dataTime)).append("\n");
    sb.append("    isPickUp: ").append(toIndentedString(isPickUp)).append("\n");
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

