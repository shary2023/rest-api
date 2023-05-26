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
 * UserResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-26T22:35:15.904712900+03:00[Europe/Moscow]")
public class UserResponseSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("owner")
  private Boolean owner = false;

  @JsonProperty("renter")
  private Boolean renter = false;

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

  public UserResponseSchema id(Long id) {
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

  public UserResponseSchema owner(Boolean owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getOwner() {
    return owner;
  }

  public void setOwner(Boolean owner) {
    this.owner = owner;
  }

  public UserResponseSchema renter(Boolean renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  @NotNull 
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getRenter() {
    return renter;
  }

  public void setRenter(Boolean renter) {
    this.renter = renter;
  }

  public UserResponseSchema isAgreeWithFullDeposit(Boolean isAgreeWithFullDeposit) {
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

  public UserResponseSchema isDishonestClient(Boolean isDishonestClient) {
    this.isDishonestClient = isDishonestClient;
    return this;
  }

  /**
   * Get isDishonestClient
   * @return isDishonestClient
  */
  
  @Schema(name = "isDishonestClient", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsDishonestClient() {
    return isDishonestClient;
  }

  public void setIsDishonestClient(Boolean isDishonestClient) {
    this.isDishonestClient = isDishonestClient;
  }

  public UserResponseSchema telegramId(Long telegramId) {
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

  public UserResponseSchema chatId(Long chatId) {
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

  public UserResponseSchema email(String email) {
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

  public UserResponseSchema inn(String inn) {
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

  public UserResponseSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$") 
  @Schema(name = "phoneNumber", example = "+79008883322", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserResponseSchema passportNumber(String passportNumber) {
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

  public UserResponseSchema passportSeries(String passportSeries) {
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

  public UserResponseSchema firstName(String firstName) {
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

  public UserResponseSchema secondName(String secondName) {
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
    UserResponseSchema userResponseSchema = (UserResponseSchema) o;
    return Objects.equals(this.id, userResponseSchema.id) &&
        Objects.equals(this.owner, userResponseSchema.owner) &&
        Objects.equals(this.renter, userResponseSchema.renter) &&
        Objects.equals(this.isAgreeWithFullDeposit, userResponseSchema.isAgreeWithFullDeposit) &&
        Objects.equals(this.isDishonestClient, userResponseSchema.isDishonestClient) &&
        Objects.equals(this.telegramId, userResponseSchema.telegramId) &&
        Objects.equals(this.chatId, userResponseSchema.chatId) &&
        Objects.equals(this.email, userResponseSchema.email) &&
        Objects.equals(this.inn, userResponseSchema.inn) &&
        Objects.equals(this.phoneNumber, userResponseSchema.phoneNumber) &&
        Objects.equals(this.passportNumber, userResponseSchema.passportNumber) &&
        Objects.equals(this.passportSeries, userResponseSchema.passportSeries) &&
        Objects.equals(this.firstName, userResponseSchema.firstName) &&
        Objects.equals(this.secondName, userResponseSchema.secondName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, renter, isAgreeWithFullDeposit, isDishonestClient, telegramId, chatId, email, inn, phoneNumber, passportNumber, passportSeries, firstName, secondName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    renter: ").append(toIndentedString(renter)).append("\n");
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

