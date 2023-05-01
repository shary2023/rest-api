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
 * When sent to the insurance company, this model is named \&quot;renter\&quot;
 */

@Schema(name = "InsuranceOwnerSchema", description = "When sent to the insurance company, this model is named \"renter\"")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-01T13:30:32.305512900+06:00[Asia/Almaty]")
public class InsuranceOwnerSchema {

  @JsonProperty("type")
  private String type;

  @JsonProperty("INN")
  private String INN;

  @JsonProperty("birthday")
  private String birthday;

  @JsonProperty("email")
  private String email;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("given_name")
  private String givenName;

  @JsonProperty("second_name")
  private String secondName;

  @JsonProperty("passport_number")
  private String passportNumber;

  @JsonProperty("passport_series")
  private String passportSeries;

  @JsonProperty("phone_number")
  private String phoneNumber;

  @JsonProperty("registration_address")
  private String registrationAddress;

  @JsonProperty("residence_address")
  private String residenceAddress;

  public InsuranceOwnerSchema type(String type) {
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

  public InsuranceOwnerSchema INN(String INN) {
    this.INN = INN;
    return this;
  }

  /**
   * Get INN
   * @return INN
  */
  
  @Schema(name = "INN", example = "123453488322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getINN() {
    return INN;
  }

  public void setINN(String INN) {
    this.INN = INN;
  }

  public InsuranceOwnerSchema birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  */
  
  @Schema(name = "birthday", example = "2003-01-03", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public InsuranceOwnerSchema email(String email) {
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

  public InsuranceOwnerSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", example = "Иван", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InsuranceOwnerSchema givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  
  @Schema(name = "given_name", example = "Иванович", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public InsuranceOwnerSchema secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
  */
  
  @Schema(name = "second_name", example = "Иванов", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public InsuranceOwnerSchema passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Get passportNumber
   * @return passportNumber
  */
  
  @Schema(name = "passport_number", example = "454322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public InsuranceOwnerSchema passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Get passportSeries
   * @return passportSeries
  */
  
  @Schema(name = "passport_series", example = "6282", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public InsuranceOwnerSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  
  @Schema(name = "phone_number", example = "+79008883322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public InsuranceOwnerSchema registrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
    return this;
  }

  /**
   * Get registrationAddress
   * @return registrationAddress
  */
  
  @Schema(name = "registration_address", example = "Россия, г. Москва, улица Новый Арбат, дом 5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRegistrationAddress() {
    return registrationAddress;
  }

  public void setRegistrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
  }

  public InsuranceOwnerSchema residenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
    return this;
  }

  /**
   * Get residenceAddress
   * @return residenceAddress
  */
  
  @Schema(name = "residence_address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    InsuranceOwnerSchema insuranceOwnerSchema = (InsuranceOwnerSchema) o;
    return Objects.equals(this.type, insuranceOwnerSchema.type) &&
        Objects.equals(this.INN, insuranceOwnerSchema.INN) &&
        Objects.equals(this.birthday, insuranceOwnerSchema.birthday) &&
        Objects.equals(this.email, insuranceOwnerSchema.email) &&
        Objects.equals(this.firstName, insuranceOwnerSchema.firstName) &&
        Objects.equals(this.givenName, insuranceOwnerSchema.givenName) &&
        Objects.equals(this.secondName, insuranceOwnerSchema.secondName) &&
        Objects.equals(this.passportNumber, insuranceOwnerSchema.passportNumber) &&
        Objects.equals(this.passportSeries, insuranceOwnerSchema.passportSeries) &&
        Objects.equals(this.phoneNumber, insuranceOwnerSchema.phoneNumber) &&
        Objects.equals(this.registrationAddress, insuranceOwnerSchema.registrationAddress) &&
        Objects.equals(this.residenceAddress, insuranceOwnerSchema.residenceAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, INN, birthday, email, firstName, givenName, secondName, passportNumber, passportSeries, phoneNumber, registrationAddress, residenceAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceOwnerSchema {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    INN: ").append(toIndentedString(INN)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
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

