package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.InsuranceCostSchema;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InsuranceItemSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-23T11:59:36.641457800+06:00[Asia/Almaty]")
public class InsuranceItemSchema {

  @JsonProperty("type")
  private String type;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("model")
  private String model;

  @JsonProperty("number")
  private String number;

  @JsonProperty("sum_insured")
  private InsuranceCostSchema sumInsured;

  public InsuranceItemSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * the line \"shary2023-02\" is used here
   * @return type
  */
  
  @Schema(name = "type", description = "the line \"shary2023-02\" is used here", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InsuranceItemSchema brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public InsuranceItemSchema model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public InsuranceItemSchema number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public InsuranceItemSchema sumInsured(InsuranceCostSchema sumInsured) {
    this.sumInsured = sumInsured;
    return this;
  }

  /**
   * Get sumInsured
   * @return sumInsured
  */
  @Valid 
  @Schema(name = "sum_insured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InsuranceCostSchema getSumInsured() {
    return sumInsured;
  }

  public void setSumInsured(InsuranceCostSchema sumInsured) {
    this.sumInsured = sumInsured;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceItemSchema insuranceItemSchema = (InsuranceItemSchema) o;
    return Objects.equals(this.type, insuranceItemSchema.type) &&
        Objects.equals(this.brand, insuranceItemSchema.brand) &&
        Objects.equals(this.model, insuranceItemSchema.model) &&
        Objects.equals(this.number, insuranceItemSchema.number) &&
        Objects.equals(this.sumInsured, insuranceItemSchema.sumInsured);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, brand, model, number, sumInsured);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceItemSchema {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    sumInsured: ").append(toIndentedString(sumInsured)).append("\n");
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

