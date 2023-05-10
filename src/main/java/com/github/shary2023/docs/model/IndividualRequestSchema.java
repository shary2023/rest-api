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
 * IndividualRequestSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-10T21:17:16.102639400+06:00[Asia/Almaty]")
public class IndividualRequestSchema {

  @JsonProperty("number_contract")
  private String numberContract;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("patronymic")
  private String patronymic;

  @JsonProperty("last_name_initials")
  private String lastNameInitials;

  @JsonProperty("citizenship")
  private String citizenship;

  @JsonProperty("passport_number")
  private String passportNumber;

  @JsonProperty("passport_issue_date")
  private String passportIssueDate;

  @JsonProperty("passport_department")
  private String passportDepartment;

  @JsonProperty("product_name")
  private String productName;

  @JsonProperty("set")
  private String set;

  @JsonProperty("date_end")
  private String dateEnd;

  @JsonProperty("price_per_day")
  private String pricePerDay;

  @JsonProperty("final_price")
  private String finalPrice;

  @JsonProperty("client_phone")
  private String clientPhone;

  @JsonProperty("client_address")
  private String clientAddress;

  @JsonProperty("client_email")
  private String clientEmail;

  public IndividualRequestSchema numberContract(String numberContract) {
    this.numberContract = numberContract;
    return this;
  }

  /**
   * Get numberContract
   * @return numberContract
  */
  
  @Schema(name = "number_contract", example = "5345234523", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNumberContract() {
    return numberContract;
  }

  public void setNumberContract(String numberContract) {
    this.numberContract = numberContract;
  }

  public IndividualRequestSchema lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "last_name", example = "Сидоров", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public IndividualRequestSchema firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", example = "Игорь", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public IndividualRequestSchema patronymic(String patronymic) {
    this.patronymic = patronymic;
    return this;
  }

  /**
   * Get patronymic
   * @return patronymic
  */
  
  @Schema(name = "patronymic", example = "Петрович", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public IndividualRequestSchema lastNameInitials(String lastNameInitials) {
    this.lastNameInitials = lastNameInitials;
    return this;
  }

  /**
   * Get lastNameInitials
   * @return lastNameInitials
  */
  
  @Schema(name = "last_name_initials", example = "Сидоров И.П.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLastNameInitials() {
    return lastNameInitials;
  }

  public void setLastNameInitials(String lastNameInitials) {
    this.lastNameInitials = lastNameInitials;
  }

  public IndividualRequestSchema citizenship(String citizenship) {
    this.citizenship = citizenship;
    return this;
  }

  /**
   * Get citizenship
   * @return citizenship
  */
  
  @Schema(name = "citizenship", example = "Россия", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCitizenship() {
    return citizenship;
  }

  public void setCitizenship(String citizenship) {
    this.citizenship = citizenship;
  }

  public IndividualRequestSchema passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Get passportNumber
   * @return passportNumber
  */
  
  @Schema(name = "passport_number", example = "93 27 128433", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public IndividualRequestSchema passportIssueDate(String passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    return this;
  }

  /**
   * Get passportIssueDate
   * @return passportIssueDate
  */
  
  @Schema(name = "passport_issue_date", example = "20.11.2012", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportIssueDate() {
    return passportIssueDate;
  }

  public void setPassportIssueDate(String passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
  }

  public IndividualRequestSchema passportDepartment(String passportDepartment) {
    this.passportDepartment = passportDepartment;
    return this;
  }

  /**
   * Get passportDepartment
   * @return passportDepartment
  */
  
  @Schema(name = "passport_department", example = "ОТДЕЛЕНИЕМ УФМС", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassportDepartment() {
    return passportDepartment;
  }

  public void setPassportDepartment(String passportDepartment) {
    this.passportDepartment = passportDepartment;
  }

  public IndividualRequestSchema productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "product_name", example = "Самокат", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public IndividualRequestSchema set(String set) {
    this.set = set;
    return this;
  }

  /**
   * Get set
   * @return set
  */
  
  @Schema(name = "set", example = "Зарядное устройство, Чехол", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSet() {
    return set;
  }

  public void setSet(String set) {
    this.set = set;
  }

  public IndividualRequestSchema dateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }

  /**
   * Get dateEnd
   * @return dateEnd
  */
  
  @Schema(name = "date_end", example = "20.11.2023", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDateEnd() {
    return dateEnd;
  }

  public void setDateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
  }

  public IndividualRequestSchema pricePerDay(String pricePerDay) {
    this.pricePerDay = pricePerDay;
    return this;
  }

  /**
   * Get pricePerDay
   * @return pricePerDay
  */
  
  @Schema(name = "price_per_day", example = "9000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPricePerDay() {
    return pricePerDay;
  }

  public void setPricePerDay(String pricePerDay) {
    this.pricePerDay = pricePerDay;
  }

  public IndividualRequestSchema finalPrice(String finalPrice) {
    this.finalPrice = finalPrice;
    return this;
  }

  /**
   * Get finalPrice
   * @return finalPrice
  */
  
  @Schema(name = "final_price", example = "90000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFinalPrice() {
    return finalPrice;
  }

  public void setFinalPrice(String finalPrice) {
    this.finalPrice = finalPrice;
  }

  public IndividualRequestSchema clientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
    return this;
  }

  /**
   * Get clientPhone
   * @return clientPhone
  */
  
  @Schema(name = "client_phone", example = "79999999999", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getClientPhone() {
    return clientPhone;
  }

  public void setClientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
  }

  public IndividualRequestSchema clientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
    return this;
  }

  /**
   * Get clientAddress
   * @return clientAddress
  */
  
  @Schema(name = "client_address", example = "г. Москва", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getClientAddress() {
    return clientAddress;
  }

  public void setClientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
  }

  public IndividualRequestSchema clientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
    return this;
  }

  /**
   * Get clientEmail
   * @return clientEmail
  */
  
  @Schema(name = "client_email", example = "example@example.example", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualRequestSchema individualRequestSchema = (IndividualRequestSchema) o;
    return Objects.equals(this.numberContract, individualRequestSchema.numberContract) &&
        Objects.equals(this.lastName, individualRequestSchema.lastName) &&
        Objects.equals(this.firstName, individualRequestSchema.firstName) &&
        Objects.equals(this.patronymic, individualRequestSchema.patronymic) &&
        Objects.equals(this.lastNameInitials, individualRequestSchema.lastNameInitials) &&
        Objects.equals(this.citizenship, individualRequestSchema.citizenship) &&
        Objects.equals(this.passportNumber, individualRequestSchema.passportNumber) &&
        Objects.equals(this.passportIssueDate, individualRequestSchema.passportIssueDate) &&
        Objects.equals(this.passportDepartment, individualRequestSchema.passportDepartment) &&
        Objects.equals(this.productName, individualRequestSchema.productName) &&
        Objects.equals(this.set, individualRequestSchema.set) &&
        Objects.equals(this.dateEnd, individualRequestSchema.dateEnd) &&
        Objects.equals(this.pricePerDay, individualRequestSchema.pricePerDay) &&
        Objects.equals(this.finalPrice, individualRequestSchema.finalPrice) &&
        Objects.equals(this.clientPhone, individualRequestSchema.clientPhone) &&
        Objects.equals(this.clientAddress, individualRequestSchema.clientAddress) &&
        Objects.equals(this.clientEmail, individualRequestSchema.clientEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberContract, lastName, firstName, patronymic, lastNameInitials, citizenship, passportNumber, passportIssueDate, passportDepartment, productName, set, dateEnd, pricePerDay, finalPrice, clientPhone, clientAddress, clientEmail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualRequestSchema {\n");
    sb.append("    numberContract: ").append(toIndentedString(numberContract)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    patronymic: ").append(toIndentedString(patronymic)).append("\n");
    sb.append("    lastNameInitials: ").append(toIndentedString(lastNameInitials)).append("\n");
    sb.append("    citizenship: ").append(toIndentedString(citizenship)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportIssueDate: ").append(toIndentedString(passportIssueDate)).append("\n");
    sb.append("    passportDepartment: ").append(toIndentedString(passportDepartment)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    pricePerDay: ").append(toIndentedString(pricePerDay)).append("\n");
    sb.append("    finalPrice: ").append(toIndentedString(finalPrice)).append("\n");
    sb.append("    clientPhone: ").append(toIndentedString(clientPhone)).append("\n");
    sb.append("    clientAddress: ").append(toIndentedString(clientAddress)).append("\n");
    sb.append("    clientEmail: ").append(toIndentedString(clientEmail)).append("\n");
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

