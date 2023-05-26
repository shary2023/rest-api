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
 * FullNameRegularSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T01:07:11.565983700+03:00[Europe/Moscow]")
public class FullNameRegularSchema {

  @JsonProperty("firstName")
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]$")
  @Size(min = 2, max = 50)
  @NotBlank(message = "Name should not be empty")
  private String firstName;

  @JsonProperty("secondName")
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]$")
  @Size(min = 2, max = 50)
  @NotBlank(message = "Surname should not be empty")
  private String secondName;

  @JsonProperty("givenName")
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]$")
  @Size(max = 50)
  private String givenName;

  public FullNameRegularSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public FullNameRegularSchema secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
  */
  
  @Schema(name = "secondName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public FullNameRegularSchema givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  
  @Schema(name = "givenName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullNameRegularSchema fullNameRegularSchema = (FullNameRegularSchema) o;
    return Objects.equals(this.firstName, fullNameRegularSchema.firstName) &&
        Objects.equals(this.secondName, fullNameRegularSchema.secondName) &&
        Objects.equals(this.givenName, fullNameRegularSchema.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, secondName, givenName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullNameRegularSchema {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
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

