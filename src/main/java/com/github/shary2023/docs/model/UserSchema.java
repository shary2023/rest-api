package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.ItemSchema;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-04T17:04:52.810889100+06:00[Asia/Almaty]")
public class UserSchema {

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
  private String birthday;

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

  @JsonProperty("itemsForRent")
  @Valid
  private List<ItemSchema> itemsForRent = null;

  @JsonProperty("itemsRented")
  @Valid
  private List<ItemSchema> itemsRented = null;

  public UserSchema id(Long id) {
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

  public UserSchema email(String email) {
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

  public UserSchema firstName(String firstName) {
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

  public UserSchema secondName(String secondName) {
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

  public UserSchema inn(String inn) {
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

  public UserSchema birthday(String birthday) {
    this.birthday = birthday;
    return this;
  }

  /**
   * Get birthday
   * @return birthday
  */
  @NotNull 
  @Schema(name = "birthday", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public UserSchema passportNumber(String passportNumber) {
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

  public UserSchema passportSeries(String passportSeries) {
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

  public UserSchema phoneNumber(String phoneNumber) {
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

  public UserSchema registrationAddress(String registrationAddress) {
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

  public UserSchema residenceAddress(String residenceAddress) {
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

  public UserSchema itemsForRent(List<ItemSchema> itemsForRent) {
    this.itemsForRent = itemsForRent;
    return this;
  }

  public UserSchema addItemsForRentItem(ItemSchema itemsForRentItem) {
    if (this.itemsForRent == null) {
      this.itemsForRent = new ArrayList<>();
    }
    this.itemsForRent.add(itemsForRentItem);
    return this;
  }

  /**
   * Get itemsForRent
   * @return itemsForRent
  */
  @Valid 
  @Schema(name = "itemsForRent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<ItemSchema> getItemsForRent() {
    return itemsForRent;
  }

  public void setItemsForRent(List<ItemSchema> itemsForRent) {
    this.itemsForRent = itemsForRent;
  }

  public UserSchema itemsRented(List<ItemSchema> itemsRented) {
    this.itemsRented = itemsRented;
    return this;
  }

  public UserSchema addItemsRentedItem(ItemSchema itemsRentedItem) {
    if (this.itemsRented == null) {
      this.itemsRented = new ArrayList<>();
    }
    this.itemsRented.add(itemsRentedItem);
    return this;
  }

  /**
   * Get itemsRented
   * @return itemsRented
  */
  @Valid 
  @Schema(name = "itemsRented", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<ItemSchema> getItemsRented() {
    return itemsRented;
  }

  public void setItemsRented(List<ItemSchema> itemsRented) {
    this.itemsRented = itemsRented;
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
        Objects.equals(this.email, userSchema.email) &&
        Objects.equals(this.firstName, userSchema.firstName) &&
        Objects.equals(this.secondName, userSchema.secondName) &&
        Objects.equals(this.inn, userSchema.inn) &&
        Objects.equals(this.birthday, userSchema.birthday) &&
        Objects.equals(this.passportNumber, userSchema.passportNumber) &&
        Objects.equals(this.passportSeries, userSchema.passportSeries) &&
        Objects.equals(this.phoneNumber, userSchema.phoneNumber) &&
        Objects.equals(this.registrationAddress, userSchema.registrationAddress) &&
        Objects.equals(this.residenceAddress, userSchema.residenceAddress) &&
        Objects.equals(this.itemsForRent, userSchema.itemsForRent) &&
        Objects.equals(this.itemsRented, userSchema.itemsRented);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, secondName, inn, birthday, passportNumber, passportSeries, phoneNumber, registrationAddress, residenceAddress, itemsForRent, itemsRented);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSchema {\n");
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
    sb.append("    itemsForRent: ").append(toIndentedString(itemsForRent)).append("\n");
    sb.append("    itemsRented: ").append(toIndentedString(itemsRented)).append("\n");
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

