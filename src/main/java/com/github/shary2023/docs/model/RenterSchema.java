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
 * RenterSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T23:02:44.459311200+03:00[Europe/Moscow]")
public class RenterSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("password")
  private String password;

  @JsonProperty("isAgreeWithPublicOffer")
  private Boolean isAgreeWithPublicOffer = false;

  @JsonProperty("isAgreeWithFullDeposit")
  private Boolean isAgreeWithFullDeposit = false;

  @JsonProperty("isDishonestClient")
  private Boolean isDishonestClient = false;

  @JsonProperty("telegramId")
  private Long telegramId;

  @JsonProperty("chatId")
  private Long chatId;

  @JsonProperty("email")
  private String email;

  @JsonProperty("inn")
  private String inn;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("passportNumber")
  private String passportNumber;

  @JsonProperty("passportSeries")
  private String passportSeries;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("secondName")
  private String secondName;

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

  public RenterSchema password(String password) {
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

  public RenterSchema isAgreeWithPublicOffer(Boolean isAgreeWithPublicOffer) {
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

  public RenterSchema isAgreeWithFullDeposit(Boolean isAgreeWithFullDeposit) {
    this.isAgreeWithFullDeposit = isAgreeWithFullDeposit;
    return this;
  }

  /**
   * Get isAgreeWithFullDeposit
   * @return isAgreeWithFullDeposit
  */
  
  @Schema(name = "isAgreeWithFullDeposit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsAgreeWithFullDeposit() {
    return isAgreeWithFullDeposit;
  }

  public void setIsAgreeWithFullDeposit(Boolean isAgreeWithFullDeposit) {
    this.isAgreeWithFullDeposit = isAgreeWithFullDeposit;
  }

  public RenterSchema isDishonestClient(Boolean isDishonestClient) {
    this.isDishonestClient = isDishonestClient;
    return this;
  }

  /**
   * Get isDishonestClient
   * @return isDishonestClient
  */
  @NotNull 
  @Schema(name = "isDishonestClient", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsDishonestClient() {
    return isDishonestClient;
  }

  public void setIsDishonestClient(Boolean isDishonestClient) {
    this.isDishonestClient = isDishonestClient;
  }

  public RenterSchema telegramId(Long telegramId) {
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

  public RenterSchema chatId(Long chatId) {
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

  public RenterSchema email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @NotNull @Pattern(regexp = "/^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$/i") 
  @Schema(name = "email", example = "user@example.com", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RenterSchema inn(String inn) {
    this.inn = inn;
    return this;
  }

  /**
   * Get inn
   * @return inn
  */
  @Pattern(regexp = "^(([0-9]{12})|([0-9]{10}))?$") 
  @Schema(name = "inn", example = "123453488322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getInn() {
    return inn;
  }

  public void setInn(String inn) {
    this.inn = inn;
  }

  public RenterSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @NotNull @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$") 
  @Schema(name = "phoneNumber", example = "+79008883322", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public RenterSchema passportNumber(String passportNumber) {
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

  public RenterSchema passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Get passportSeries
   * @return passportSeries
  */
  @Pattern(regexp = "^([0-9]{2}\\s{0,1}[0-9]{2})?$") 
  @Schema(name = "passportSeries", example = "6282 or 62 82", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public RenterSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @NotNull @Pattern(regexp = "^[a-zA-ZА-Яа-я]{2,50}$") 
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
  @NotNull @Pattern(regexp = "^[a-zA-ZА-Яа-я]{0,50}$") 
  @Schema(name = "secondName", requiredMode = Schema.RequiredMode.REQUIRED)
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
    RenterSchema renterSchema = (RenterSchema) o;
    return Objects.equals(this.id, renterSchema.id) &&
        Objects.equals(this.password, renterSchema.password) &&
        Objects.equals(this.isAgreeWithPublicOffer, renterSchema.isAgreeWithPublicOffer) &&
        Objects.equals(this.isAgreeWithFullDeposit, renterSchema.isAgreeWithFullDeposit) &&
        Objects.equals(this.isDishonestClient, renterSchema.isDishonestClient) &&
        Objects.equals(this.telegramId, renterSchema.telegramId) &&
        Objects.equals(this.chatId, renterSchema.chatId) &&
        Objects.equals(this.email, renterSchema.email) &&
        Objects.equals(this.inn, renterSchema.inn) &&
        Objects.equals(this.phoneNumber, renterSchema.phoneNumber) &&
        Objects.equals(this.passportNumber, renterSchema.passportNumber) &&
        Objects.equals(this.passportSeries, renterSchema.passportSeries) &&
        Objects.equals(this.firstName, renterSchema.firstName) &&
        Objects.equals(this.secondName, renterSchema.secondName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, password, isAgreeWithPublicOffer, isAgreeWithFullDeposit, isDishonestClient, telegramId, chatId, email, inn, phoneNumber, passportNumber, passportSeries, firstName, secondName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenterSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    isAgreeWithPublicOffer: ").append(toIndentedString(isAgreeWithPublicOffer)).append("\n");
    sb.append("    isAgreeWithFullDeposit: ").append(toIndentedString(isAgreeWithFullDeposit)).append("\n");
    sb.append("    isDishonestClient: ").append(toIndentedString(isDishonestClient)).append("\n");
    sb.append("    telegramId: ").append(toIndentedString(telegramId)).append("\n");
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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

