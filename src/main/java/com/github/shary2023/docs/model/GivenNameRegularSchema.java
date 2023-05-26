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
 * GivenNameRegularSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T22:35:15.904712900+03:00[Europe/Moscow]")
public class GivenNameRegularSchema {

  @JsonProperty("secondName")
  private String secondName;

  public GivenNameRegularSchema secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
  */
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]{0,50}$") 
  @Schema(name = "secondName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    GivenNameRegularSchema givenNameRegularSchema = (GivenNameRegularSchema) o;
    return Objects.equals(this.secondName, givenNameRegularSchema.secondName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GivenNameRegularSchema {\n");
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

