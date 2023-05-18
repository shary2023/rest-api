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
 * When sent to the insurance company, this model is named \&quot;owner\&quot;
 */

@Schema(name = "InsuranceRenterSchema", description = "When sent to the insurance company, this model is named \"owner\"")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T18:28:26.671559500+06:00[Asia/Almaty]")
public class InsuranceRenterSchema {

  @JsonProperty("type")
  private String type;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("given_name")
  private String givenName;

  @JsonProperty("second_name")
  private String secondName;

  public InsuranceRenterSchema type(String type) {
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

  public InsuranceRenterSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @Size(min = 2, max = 50) 
  @Schema(name = "first_name", example = "Иван", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InsuranceRenterSchema givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  @Size(min = 2, max = 50) 
  @Schema(name = "given_name", example = "Иванов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public InsuranceRenterSchema secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
  */
  @Size(max = 50) 
  @Schema(name = "second_name", example = "Иванович", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceRenterSchema insuranceRenterSchema = (InsuranceRenterSchema) o;
    return Objects.equals(this.type, insuranceRenterSchema.type) &&
        Objects.equals(this.firstName, insuranceRenterSchema.firstName) &&
        Objects.equals(this.givenName, insuranceRenterSchema.givenName) &&
        Objects.equals(this.secondName, insuranceRenterSchema.secondName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, firstName, givenName, secondName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceRenterSchema {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
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

