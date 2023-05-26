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
 * GuestSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T01:07:11.565983700+03:00[Europe/Moscow]")
public class GuestSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("password")
  private String password;

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

  @JsonProperty("firstName")
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]$")
  @Size(min = 2, max = 50)
  @NotBlank(message = "Name should not be empty")
  private String firstName;

  public GuestSchema id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GuestSchema password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @NotNull 
  @Schema(name = "password", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public GuestSchema email(String email) {
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

  public GuestSchema inn(String inn) {
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

  public GuestSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @NotNull 
  @Schema(name = "phoneNumber", example = "+79008883322", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public GuestSchema passportNumber(String passportNumber) {
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

  public GuestSchema passportSeries(String passportSeries) {
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

  public GuestSchema firstName(String firstName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuestSchema guestSchema = (GuestSchema) o;
    return Objects.equals(this.id, guestSchema.id) &&
        Objects.equals(this.password, guestSchema.password) &&
        Objects.equals(this.email, guestSchema.email) &&
        Objects.equals(this.inn, guestSchema.inn) &&
        Objects.equals(this.phoneNumber, guestSchema.phoneNumber) &&
        Objects.equals(this.passportNumber, guestSchema.passportNumber) &&
        Objects.equals(this.passportSeries, guestSchema.passportSeries) &&
        Objects.equals(this.firstName, guestSchema.firstName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, email, inn, phoneNumber, passportNumber, passportSeries, firstName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuestSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

