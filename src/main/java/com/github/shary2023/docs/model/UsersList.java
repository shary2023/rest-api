package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.UserSchema;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UsersList
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-04T17:35:50.717742100+06:00[Asia/Almaty]")
public class UsersList {

  @JsonProperty("users")
  @Valid
  private List<UserSchema> users = new ArrayList<>();

  @JsonProperty("code")
  private String code = "SHARY-0000";

  @JsonProperty("errorUserMessage")
  private String errorUserMessage;

  @JsonProperty("stackTrace")
  private String stackTrace;

  @JsonProperty("totalCount")
  private Long totalCount;

  @JsonProperty("success")
  private Boolean success = true;

  public UsersList users(List<UserSchema> users) {
    this.users = users;
    return this;
  }

  public UsersList addUsersItem(UserSchema usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @NotNull @Valid 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<UserSchema> getUsers() {
    return users;
  }

  public void setUsers(List<UserSchema> users) {
    this.users = users;
  }

  public UsersList code(String code) {
    this.code = code;
    return this;
  }

  /**
   * ��� �������� �� �������
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "SHARY-0000", description = "��� �������� �� �������", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public UsersList errorUserMessage(String errorUserMessage) {
    this.errorUserMessage = errorUserMessage;
    return this;
  }

  /**
   * ��������� �� ������, ��� ����������� ������������.
   * @return errorUserMessage
  */
  
  @Schema(name = "errorUserMessage", description = "��������� �� ������, ��� ����������� ������������.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getErrorUserMessage() {
    return errorUserMessage;
  }

  public void setErrorUserMessage(String errorUserMessage) {
    this.errorUserMessage = errorUserMessage;
  }

  public UsersList stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * StackTrace ������ �� �������.
   * @return stackTrace
  */
  
  @Schema(name = "stackTrace", description = "StackTrace ������ �� �������.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public UsersList totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * ���-�� ���������, ������������ � ��������� ��������.
   * @return totalCount
  */
  
  @Schema(name = "totalCount", description = "���-�� ���������, ������������ � ��������� ��������.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public UsersList success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * true - ������ ������� ��������� ��������
   * @return success
  */
  
  @Schema(name = "success", description = "true - ������ ������� ��������� ��������", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersList usersList = (UsersList) o;
    return Objects.equals(this.users, usersList.users) &&
        Objects.equals(this.code, usersList.code) &&
        Objects.equals(this.errorUserMessage, usersList.errorUserMessage) &&
        Objects.equals(this.stackTrace, usersList.stackTrace) &&
        Objects.equals(this.totalCount, usersList.totalCount) &&
        Objects.equals(this.success, usersList.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users, code, errorUserMessage, stackTrace, totalCount, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersList {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errorUserMessage: ").append(toIndentedString(errorUserMessage)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

