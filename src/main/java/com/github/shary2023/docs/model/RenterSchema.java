package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RenterSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-04T17:04:52.810889100+06:00[Asia/Almaty]")
public class RenterSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("secondName")
  private String secondName;

  @JsonProperty("inn")
  private String inn;

  @JsonProperty("birthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthday;

  @JsonProperty("passportNumber")
  private String passportNumber;

  @JsonProperty("passportSeries")
  private String passportSeries;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("registrationAddress")
  private String registrationAddress;

  @JsonProperty("residenceAddress")
  private String residenceAddress;

  public RenterSchema id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RenterSchema email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @Email
  @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RenterSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull 
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public RenterSchema secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
  */
  @NotNull 
  @Schema(name = "secondName", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public RenterSchema inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  @NotNull 
  @Schema(name = "inn", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public RenterSchema birthday(LocalDate birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  */
  @NotNull @Valid 
  @Schema(name = "birthday", requiredMode = Schema.RequiredMode.REQUIRED)
  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public RenterSchema passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Get passportNumber
   * @return passportNumber
  */
  @NotNull 
  @Schema(name = "passportNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public RenterSchema passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Get passportSeries
   * @return passportSeries
  */
  @NotNull 
  @Schema(name = "passportSeries", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public RenterSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @NotNull 
  @Schema(name = "phoneNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RenterSchema registrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
    return this;
  }

  /**
   * Get registrationAddress
   * @return registrationAddress
  */
  @NotNull 
  @Schema(name = "registrationAddress", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getRegistrationAddress() {
    return registrationAddress;
  }

  public void setRegistrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
  }

  public RenterSchema residenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
    return this;
  }

  /**
   * Get residenceAddress
   * @return residenceAddress
  */
  @NotNull 
  @Schema(name = "residenceAddress", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getResidenceAddress() {
    return residenceAddress;
  }

  public void setResidenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenterSchema renterSchema = (RenterSchema) o;
    return Objects.equals(this.id, renterSchema.id) &&
        Objects.equals(this.email, renterSchema.email) &&
        Objects.equals(this.firstName, renterSchema.firstName) &&
        Objects.equals(this.secondName, renterSchema.secondName) &&
        Objects.equals(this.inn, renterSchema.inn) &&
        Objects.equals(this.birthday, renterSchema.birthday) &&
        Objects.equals(this.passportNumber, renterSchema.passportNumber) &&
        Objects.equals(this.passportSeries, renterSchema.passportSeries) &&
        Objects.equals(this.phoneNumber, renterSchema.phoneNumber) &&
        Objects.equals(this.registrationAddress, renterSchema.registrationAddress) &&
        Objects.equals(this.residenceAddress, renterSchema.residenceAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, secondName, inn, birthday, passportNumber, passportSeries, phoneNumber, registrationAddress, residenceAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenterSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    registrationAddress: ").append(toIndentedString(registrationAddress)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
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

