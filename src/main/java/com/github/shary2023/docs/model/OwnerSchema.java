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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-27T01:07:11.565983700+03:00[Europe/Moscow]")
public class OwnerSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("password")
  private String password;

  @JsonProperty("birthday")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthday;

  @JsonProperty("registrationAddress")
  private String registrationAddress;

  @JsonProperty("residenceAddress")
  private String residenceAddress;

  @JsonProperty("isAddressesMatch")
  private Boolean isAddressesMatch = true;

  @JsonProperty("isAgreeWithPublicOffer")
  private Boolean isAgreeWithPublicOffer = false;

  @JsonProperty("telegramId")
  private Long telegramId;

  @JsonProperty("chatId")
  private Long chatId;

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

  @JsonProperty("secondName")
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]$")
  @Size(min = 2, max = 50)
  @NotBlank(message = "Surname should not be empty")
  private String secondName;

  @JsonProperty("givenName")
  @Pattern(regexp = "^[a-zA-ZА-Яа-я]$")
  @Size(max = 50)
  private String givenName;

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

  public OwnerSchema isAddressesMatch(Boolean isAddressesMatch) {
    this.isAddressesMatch = isAddressesMatch;
    return this;
  }

  /**
   * Get isAddressesMatch
   * @return isAddressesMatch
  */
  
  @Schema(name = "isAddressesMatch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsAddressesMatch() {
    return isAddressesMatch;
  }

  public void setIsAddressesMatch(Boolean isAddressesMatch) {
    this.isAddressesMatch = isAddressesMatch;
  }

  public OwnerSchema isAgreeWithPublicOffer(Boolean isAgreeWithPublicOffer) {
    this.isAgreeWithPublicOffer = isAgreeWithPublicOffer;
    return this;
  }

  /**
   * Get isAgreeWithPublicOffer
   * @return isAgreeWithPublicOffer
  */
  @NotNull 
  @Schema(name = "isAgreeWithPublicOffer", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsAgreeWithPublicOffer() {
    return isAgreeWithPublicOffer;
  }

  public void setIsAgreeWithPublicOffer(Boolean isAgreeWithPublicOffer) {
    this.isAgreeWithPublicOffer = isAgreeWithPublicOffer;
  }

  public OwnerSchema telegramId(Long telegramId) {
    this.telegramId = telegramId;
    return this;
  }

  /**
   * Get telegramId
   * minimum: 1
   * @return telegramId
  */
  @Min(1L) 
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
   * minimum: 1
   * @return chatId
  */
  @Min(1L) 
  @Schema(name = "chatId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getChatId() {
    return chatId;
  }

  public void setChatId(Long chatId) {
    this.chatId = chatId;
  }

  public OwnerSchema email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull 
  @Schema(name = "email", example = "user@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
  @Schema(name = "inn", example = "123453488322", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
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
  @Schema(name = "phoneNumber", example = "+79008883322", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
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
  @Schema(name = "passportNumber", example = "454322", requiredMode = Schema.RequiredMode.REQUIRED)
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
  @Schema(name = "passportSeries", example = "6282 or 62 82", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
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

  public OwnerSchema givenName(String givenName) {
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
    OwnerSchema ownerSchema = (OwnerSchema) o;
    return Objects.equals(this.id, ownerSchema.id) &&
        Objects.equals(this.password, ownerSchema.password) &&
        Objects.equals(this.birthday, ownerSchema.birthday) &&
        Objects.equals(this.registrationAddress, ownerSchema.registrationAddress) &&
        Objects.equals(this.residenceAddress, ownerSchema.residenceAddress) &&
        Objects.equals(this.isAddressesMatch, ownerSchema.isAddressesMatch) &&
        Objects.equals(this.isAgreeWithPublicOffer, ownerSchema.isAgreeWithPublicOffer) &&
        Objects.equals(this.telegramId, ownerSchema.telegramId) &&
        Objects.equals(this.chatId, ownerSchema.chatId) &&
        Objects.equals(this.email, ownerSchema.email) &&
        Objects.equals(this.inn, ownerSchema.inn) &&
        Objects.equals(this.phoneNumber, ownerSchema.phoneNumber) &&
        Objects.equals(this.passportNumber, ownerSchema.passportNumber) &&
        Objects.equals(this.passportSeries, ownerSchema.passportSeries) &&
        Objects.equals(this.firstName, ownerSchema.firstName) &&
        Objects.equals(this.secondName, ownerSchema.secondName) &&
        Objects.equals(this.givenName, ownerSchema.givenName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, birthday, registrationAddress, residenceAddress, isAddressesMatch, isAgreeWithPublicOffer, telegramId, chatId, email, inn, phoneNumber, passportNumber, passportSeries, firstName, secondName, givenName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnerSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    registrationAddress: ").append(toIndentedString(registrationAddress)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
    sb.append("    isAddressesMatch: ").append(toIndentedString(isAddressesMatch)).append("\n");
    sb.append("    isAgreeWithPublicOffer: ").append(toIndentedString(isAgreeWithPublicOffer)).append("\n");
    sb.append("    telegramId: ").append(toIndentedString(telegramId)).append("\n");
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
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

