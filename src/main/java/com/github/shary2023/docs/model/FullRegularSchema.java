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
 * FullRegularSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T01:07:11.565983700+03:00[Europe/Moscow]")
public class FullRegularSchema {

  @JsonProperty("email")
  @Pattern(regexp = "/^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$/i")
  @Email
  @NotBlank(message = "Email should not be empty")
  private String email;

  @JsonProperty("inn")
  @Pattern(regexp = "^(([0-9]{12})|([0-9]{10}))?$")
  @NotBlank(message = "INN should not be empty")
  private String inn;

  @JsonProperty("phoneNumber")
  @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
  @Size(min = 5, max = 15)
  @NotBlank(message = "Phone number should not be empty")
  private String phoneNumber;

  @JsonProperty("passportNumber")
  @Pattern(regexp = "^([0-9]{6})?$")
  @NotBlank(message = "Passport number should not be empty")
  private String passportNumber;

  @JsonProperty("passportSeries")
  @Pattern(regexp = "^([0-9]{2}\\s{0,1}[0-9]{2})?$")
  @NotBlank(message = "Passport series should not be empty")
  private String passportSeries;

  public FullRegularSchema email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", example = "user@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public FullRegularSchema inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  
  @Schema(name = "inn", example = "123453488322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public FullRegularSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  
  @Schema(name = "phoneNumber", example = "+79008883322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public FullRegularSchema passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Get passportNumber
   * @return passportNumber
  */
  
  @Schema(name = "passportNumber", example = "454322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public FullRegularSchema passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Get passportSeries
   * @return passportSeries
  */
  
  @Schema(name = "passportSeries", example = "6282 or 62 82", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullRegularSchema fullRegularSchema = (FullRegularSchema) o;
    return Objects.equals(this.email, fullRegularSchema.email) &&
        Objects.equals(this.inn, fullRegularSchema.inn) &&
        Objects.equals(this.phoneNumber, fullRegularSchema.phoneNumber) &&
        Objects.equals(this.passportNumber, fullRegularSchema.passportNumber) &&
        Objects.equals(this.passportSeries, fullRegularSchema.passportSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, inn, phoneNumber, passportNumber, passportSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullRegularSchema {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
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

