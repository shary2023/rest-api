package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeliveryDataSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T01:07:11.565983700+03:00[Europe/Moscow]")
public class DeliveryDataSchema {

  @JsonProperty("addressFrom")
  private String addressFrom;

  @JsonProperty("addressTo")
  private String addressTo;

  @JsonProperty("openingHours")
  private String openingHours;

  @JsonProperty("phone")
  private String phone;

  public DeliveryDataSchema addressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
    return this;
  }

  /**
   * Get addressFrom
   * @return addressFrom
  */
  
  @Schema(name = "addressFrom", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddressFrom() {
    return addressFrom;
  }

  public void setAddressFrom(String addressFrom) {
    this.addressFrom = addressFrom;
  }

  public DeliveryDataSchema addressTo(String addressTo) {
    this.addressTo = addressTo;
    return this;
  }

  /**
   * Get addressTo
   * @return addressTo
  */
  
  @Schema(name = "addressTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAddressTo() {
    return addressTo;
  }

  public void setAddressTo(String addressTo) {
    this.addressTo = addressTo;
  }

  public DeliveryDataSchema openingHours(String openingHours) {
    this.openingHours = openingHours;
    return this;
  }

  /**
   * Get openingHours
   * @return openingHours
  */
  
  @Schema(name = "openingHours", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getOpeningHours() {
    return openingHours;
  }

  public void setOpeningHours(String openingHours) {
    this.openingHours = openingHours;
  }

  public DeliveryDataSchema phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */
  
  @Schema(name = "phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryDataSchema deliveryDataSchema = (DeliveryDataSchema) o;
    return Objects.equals(this.addressFrom, deliveryDataSchema.addressFrom) &&
        Objects.equals(this.addressTo, deliveryDataSchema.addressTo) &&
        Objects.equals(this.openingHours, deliveryDataSchema.openingHours) &&
        Objects.equals(this.phone, deliveryDataSchema.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressFrom, addressTo, openingHours, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryDataSchema {\n");
    sb.append("    addressFrom: ").append(toIndentedString(addressFrom)).append("\n");
    sb.append("    addressTo: ").append(toIndentedString(addressTo)).append("\n");
    sb.append("    openingHours: ").append(toIndentedString(openingHours)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

