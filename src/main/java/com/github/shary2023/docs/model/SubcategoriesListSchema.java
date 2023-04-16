package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.SubcategoryResponseSchema;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubcategoriesListSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-16T21:15:44.328497100+06:00[Asia/Almaty]")
public class SubcategoriesListSchema {

  @JsonProperty("subcategories")
  @Valid
  private List<SubcategoryResponseSchema> subcategories = new ArrayList<>();

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

  public SubcategoriesListSchema subcategories(List<SubcategoryResponseSchema> subcategories) {
    this.subcategories = subcategories;
    return this;
  }

  public SubcategoriesListSchema addSubcategoriesItem(SubcategoryResponseSchema subcategoriesItem) {
    if (this.subcategories == null) {
      this.subcategories = new ArrayList<>();
    }
    this.subcategories.add(subcategoriesItem);
    return this;
  }

  /**
   * Get subcategories
   * @return subcategories
  */
  @NotNull @Valid 
  @Schema(name = "subcategories", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<SubcategoryResponseSchema> getSubcategories() {
    return subcategories;
  }

  public void setSubcategories(List<SubcategoryResponseSchema> subcategories) {
    this.subcategories = subcategories;
  }

  public SubcategoriesListSchema code(String code) {
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

  public SubcategoriesListSchema errorUserMessage(String errorUserMessage) {
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

  public SubcategoriesListSchema stackTrace(String stackTrace) {
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

  public SubcategoriesListSchema totalCount(Long totalCount) {
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

  public SubcategoriesListSchema success(Boolean success) {
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
    SubcategoriesListSchema subcategoriesListSchema = (SubcategoriesListSchema) o;
    return Objects.equals(this.subcategories, subcategoriesListSchema.subcategories) &&
        Objects.equals(this.code, subcategoriesListSchema.code) &&
        Objects.equals(this.errorUserMessage, subcategoriesListSchema.errorUserMessage) &&
        Objects.equals(this.stackTrace, subcategoriesListSchema.stackTrace) &&
        Objects.equals(this.totalCount, subcategoriesListSchema.totalCount) &&
        Objects.equals(this.success, subcategoriesListSchema.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subcategories, code, errorUserMessage, stackTrace, totalCount, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubcategoriesListSchema {\n");
    sb.append("    subcategories: ").append(toIndentedString(subcategories)).append("\n");
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

