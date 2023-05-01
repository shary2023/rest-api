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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-01T22:08:02.206892800+06:00[Asia/Almaty]")
public class RenterSchema {

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

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("telegramId")
  private Long telegramId;

  @JsonProperty("chatId")
  private Long chatId;

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

  public RenterSchema givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Get givenName
   * @return givenName
  */
  @NotNull 
  @Schema(name = "givenName", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public RenterSchema telegramId(Long telegramId) {
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

  public RenterSchema chatId(Long chatId) {
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
    RenterSchema renterSchema = (RenterSchema) o;
    return Objects.equals(this.id, renterSchema.id) &&
        Objects.equals(this.email, renterSchema.email) &&
        Objects.equals(this.password, renterSchema.password) &&
        Objects.equals(this.firstName, renterSchema.firstName) &&
        Objects.equals(this.secondName, renterSchema.secondName) &&
        Objects.equals(this.givenName, renterSchema.givenName) &&
        Objects.equals(this.telegramId, renterSchema.telegramId) &&
        Objects.equals(this.chatId, renterSchema.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, password, firstName, secondName, givenName, telegramId, chatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenterSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
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

