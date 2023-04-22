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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-22T18:25:06.613258600+06:00[Asia/Almaty]")
public class UserResponseSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("email")
  private String email;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("secondName")
  private String secondName;

  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("owner")
  private Boolean owner = false;

  @JsonProperty("renter")
  private Boolean renter = false;

  @JsonProperty("telegramId")
  private Long telegramId;

  @JsonProperty("chatId")
  private Long chatId;

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

  public UserResponseSchema email(String email) {
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

  public UserResponseSchema firstName(String firstName) {
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

  public UserResponseSchema secondName(String secondName) {
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

  public UserResponseSchema givenName(String givenName) {
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

  public UserResponseSchema telegramId(Long telegramId) {
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

  public UserResponseSchema chatId(Long chatId) {
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
    UserResponseSchema userResponseSchema = (UserResponseSchema) o;
    return Objects.equals(this.id, userResponseSchema.id) &&
        Objects.equals(this.email, userResponseSchema.email) &&
        Objects.equals(this.firstName, userResponseSchema.firstName) &&
        Objects.equals(this.secondName, userResponseSchema.secondName) &&
        Objects.equals(this.givenName, userResponseSchema.givenName) &&
        Objects.equals(this.owner, userResponseSchema.owner) &&
        Objects.equals(this.renter, userResponseSchema.renter) &&
        Objects.equals(this.telegramId, userResponseSchema.telegramId) &&
        Objects.equals(this.chatId, userResponseSchema.chatId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, firstName, secondName, givenName, owner, renter, telegramId, chatId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    renter: ").append(toIndentedString(renter)).append("\n");
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

