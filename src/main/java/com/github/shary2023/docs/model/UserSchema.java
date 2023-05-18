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
 * UserSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T18:28:26.671559500+06:00[Asia/Almaty]")
public class UserSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("phoneNumber")
  private String phoneNumber;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("secondName")
  private String secondName;

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("birthday")
  private String birthday;

  @JsonProperty("registrationAddress")
  private String registrationAddress;

  @JsonProperty("residenceAddress")
  private String residenceAddress;

  @JsonProperty("isAddressesMatch")
  private Boolean isAddressesMatch = true;

  @JsonProperty("isAgreeWithPublicOffer")
  private Boolean isAgreeWithPublicOffer = false;

  @JsonProperty("isAgreeWithFullDeposit")
  private Boolean isAgreeWithFullDeposit = false;

  @JsonProperty("isDishonestClient")
  private Boolean isDishonestClient = false;

  @JsonProperty("isValid")
  private Boolean isValid;

  @JsonProperty("owner")
  private Boolean owner;

  @JsonProperty("renter")
  private Boolean renter;

  @JsonProperty("telegramId")
  private Long telegramId;

  @JsonProperty("chatId")
  private Long chatId;

  @JsonProperty("inn")
  private String inn;

  @JsonProperty("passportNumber")
  private String passportNumber;

  @JsonProperty("passportSeries")
  private String passportSeries;

  public UserSchema id(Long id) {
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

  public UserSchema phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
  */
  @NotNull @Size(min = 5, max = 15) 
  @Schema(name = "phoneNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserSchema email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @Email
  @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserSchema password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @Size(min = 2, max = 50) 
  @Schema(name = "firstName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserSchema secondName(String secondName) {
    this.secondName = secondName;
    return this;
  }

  /**
   * Get secondName
   * @return secondName
  */
  @Size(min = 2, max = 50) 
  @Schema(name = "secondName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public UserSchema givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  @Size(max = 50) 
  @Schema(name = "givenName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public UserSchema birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  */
  
  @Schema(name = "birthday", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public UserSchema registrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
    return this;
  }

  /**
   * Get registrationAddress
   * @return registrationAddress
  */
  
  @Schema(name = "registrationAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRegistrationAddress() {
    return registrationAddress;
  }

  public void setRegistrationAddress(String registrationAddress) {
    this.registrationAddress = registrationAddress;
  }

  public UserSchema residenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
    return this;
  }

  /**
   * Get residenceAddress
   * @return residenceAddress
  */
  
  @Schema(name = "residenceAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getResidenceAddress() {
    return residenceAddress;
  }

  public void setResidenceAddress(String residenceAddress) {
    this.residenceAddress = residenceAddress;
  }

  public UserSchema isAddressesMatch(Boolean isAddressesMatch) {
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

  public UserSchema isAgreeWithPublicOffer(Boolean isAgreeWithPublicOffer) {
    this.isAgreeWithPublicOffer = isAgreeWithPublicOffer;
    return this;
  }

  /**
   * Get isAgreeWithPublicOffer
   * @return isAgreeWithPublicOffer
  */
  
  @Schema(name = "isAgreeWithPublicOffer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsAgreeWithPublicOffer() {
    return isAgreeWithPublicOffer;
  }

  public void setIsAgreeWithPublicOffer(Boolean isAgreeWithPublicOffer) {
    this.isAgreeWithPublicOffer = isAgreeWithPublicOffer;
  }

  public UserSchema isAgreeWithFullDeposit(Boolean isAgreeWithFullDeposit) {
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

  public UserSchema isDishonestClient(Boolean isDishonestClient) {
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

  public UserSchema isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Get isValid
   * @return isValid
  */
  
  @Schema(name = "isValid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public UserSchema owner(Boolean owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getOwner() {
    return owner;
  }

  public void setOwner(Boolean owner) {
    this.owner = owner;
  }

  public UserSchema renter(Boolean renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getRenter() {
    return renter;
  }

  public void setRenter(Boolean renter) {
    this.renter = renter;
  }

  public UserSchema telegramId(Long telegramId) {
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

  public UserSchema chatId(Long chatId) {
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

  public UserSchema inn(String inn) {
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

  public UserSchema passportNumber(String passportNumber) {
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

  public UserSchema passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Get passportSeries
   * @return passportSeries
  */
  @Pattern(regexp = "^([0-9]{2}\\s{1}[0-9]{2})?$") 
  @Schema(name = "passportSeries", example = "6282", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserSchema userSchema = (UserSchema) o;
    return Objects.equals(this.id, userSchema.id) &&
        Objects.equals(this.phoneNumber, userSchema.phoneNumber) &&
        Objects.equals(this.email, userSchema.email) &&
        Objects.equals(this.password, userSchema.password) &&
        Objects.equals(this.firstName, userSchema.firstName) &&
        Objects.equals(this.secondName, userSchema.secondName) &&
        Objects.equals(this.givenName, userSchema.givenName) &&
        Objects.equals(this.birthday, userSchema.birthday) &&
        Objects.equals(this.registrationAddress, userSchema.registrationAddress) &&
        Objects.equals(this.residenceAddress, userSchema.residenceAddress) &&
        Objects.equals(this.isAddressesMatch, userSchema.isAddressesMatch) &&
        Objects.equals(this.isAgreeWithPublicOffer, userSchema.isAgreeWithPublicOffer) &&
        Objects.equals(this.isAgreeWithFullDeposit, userSchema.isAgreeWithFullDeposit) &&
        Objects.equals(this.isDishonestClient, userSchema.isDishonestClient) &&
        Objects.equals(this.isValid, userSchema.isValid) &&
        Objects.equals(this.owner, userSchema.owner) &&
        Objects.equals(this.renter, userSchema.renter) &&
        Objects.equals(this.telegramId, userSchema.telegramId) &&
        Objects.equals(this.chatId, userSchema.chatId) &&
        Objects.equals(this.inn, userSchema.inn) &&
        Objects.equals(this.passportNumber, userSchema.passportNumber) &&
        Objects.equals(this.passportSeries, userSchema.passportSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, phoneNumber, email, password, firstName, secondName, givenName, birthday, registrationAddress, residenceAddress, isAddressesMatch, isAgreeWithPublicOffer, isAgreeWithFullDeposit, isDishonestClient, isValid, owner, renter, telegramId, chatId, inn, passportNumber, passportSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    birthday: ").append(toIndentedString(birthday)).append("\n");
    sb.append("    registrationAddress: ").append(toIndentedString(registrationAddress)).append("\n");
    sb.append("    residenceAddress: ").append(toIndentedString(residenceAddress)).append("\n");
    sb.append("    isAddressesMatch: ").append(toIndentedString(isAddressesMatch)).append("\n");
    sb.append("    isAgreeWithPublicOffer: ").append(toIndentedString(isAgreeWithPublicOffer)).append("\n");
    sb.append("    isAgreeWithFullDeposit: ").append(toIndentedString(isAgreeWithFullDeposit)).append("\n");
    sb.append("    isDishonestClient: ").append(toIndentedString(isDishonestClient)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    renter: ").append(toIndentedString(renter)).append("\n");
    sb.append("    telegramId: ").append(toIndentedString(telegramId)).append("\n");
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
    sb.append("    inn: ").append(toIndentedString(inn)).append("\n");
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

