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
 * ItemCompleteSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T18:28:26.671559500+06:00[Asia/Almaty]")
public class ItemCompleteSchema {

  @JsonProperty("complication")
  private String complication;

  public ItemCompleteSchema complication(String complication) {
    this.complication = complication;
    return this;
  }

  /**
   * Get complication
   * @return complication
  */
  
  @Schema(name = "complication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getComplication() {
    return complication;
  }

  public void setComplication(String complication) {
    this.complication = complication;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemCompleteSchema itemCompleteSchema = (ItemCompleteSchema) o;
    return Objects.equals(this.complication, itemCompleteSchema.complication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemCompleteSchema {\n");
    sb.append("    complication: ").append(toIndentedString(complication)).append("\n");
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

