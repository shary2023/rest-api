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
 * OwnerSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-22T18:25:06.613258600+06:00[Asia/Almaty]")
public class OwnerSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

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

  @JsonProperty("telegramId")
  private Long telegramId;

  @JsonProperty("chatId")
  private Long chatId;

  public OwnerSchema id(Long id) {
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

  public OwnerSchema email(String email) {
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

  public OwnerSchema password(String password) {
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

  public OwnerSchema firstName(String firstName) {
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

  public OwnerSchema secondName(String secondName) {
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

  public OwnerSchema inn(String inn) {
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

  public OwnerSchema birthday(LocalDate birthday) {
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

  public OwnerSchema passportNumber(String passportNumber) {
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

  public OwnerSchema passportSeries(String passportSeries) {
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

  public OwnerSchema phoneNumber(String phoneNumber) {
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

  public OwnerSchema registrationAddress(String registrationAddress) {
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

  public OwnerSchema residenceAddress(String residenceAddress) {
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

  public OwnerSchema telegramId(Long telegramId) {
    this.telegramId = telegramId;
    return this;
  }

  /**
   * Get telegramId
   * @return telegramId
  */
  
  @Schema(name = "telegramId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getTelegramId() {
    return telegramId;
  }

  public void setTelegramId(Long telegramId) {
    this.telegramId = telegramId;
  }

  public OwnerSchema chatId(Long chatId) {
    this.chatId = chatId;
    return this;
  }

  /**
   * Get chatId
   * @return chatId
  */
  
  @Schema(name = "chatId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getChatId() {
    return chatId;
  }

  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnerSchema ownerSchema = (OwnerSchema) o;
    return Objects.equals(this.id, ownerSchema.id) &&
        Objects.equals(this.email, ownerSchema.email) &&
        Objects.equals(this.password, ownerSchema.password) &&
        Objects.equals(this.firstName, ownerSchema.firstName) &&
        Objects.equals(this.secondName, ownerSchema.secondName) &&
        Objects.equals(this.inn, ownerSchema.inn) &&
        Objects.equals(this.birthday, ownerSchema.birthday) &&
        Objects.equals(this.passportNumber, ownerSchema.passportNumber) &&
        Objects.equals(this.passportSeries, ownerSchema.passportSeries) &&
        Objects.equals(this.phoneNumber, ownerSchema.phoneNumber) &&
        Objects.equals(this.registrationAddress, ownerSchema.registrationAddress) &&
        Objects.equals(this.residenceAddress, ownerSchema.residenceAddress) &&
        Objects.equals(this.telegramId, ownerSchema.telegramId) &&
        Objects.equals(this.chatId, ownerSchema.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, firstName, secondName, inn, birthday, passportNumber, passportSeries, phoneNumber, registrationAddress, residenceAddress, telegramId, chatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    registrationAddress: ").append(toIndentedString(registrationAddress)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
    sb.append("    telegramId: ").append(toIndentedString(telegramId)).append("\n");
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
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

