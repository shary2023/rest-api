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
 * PassportNumberRegularSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-09T18:39:19.097834700+06:00[Asia/Almaty]")
public class PassportNumberRegularSchema {

  @JsonProperty("passportNumber")
  private String passportNumber;

  public PassportNumberRegularSchema passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Get passportNumber
   * @return passportNumber
  */
  @Pattern(regexp = "^([0-9]{6})?$") 
  @Schema(name = "passportNumber", example = "454322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportNumberRegularSchema passportNumberRegularSchema = (PassportNumberRegularSchema) o;
    return Objects.equals(this.passportNumber, passportNumberRegularSchema.passportNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passportNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassportNumberRegularSchema {\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

