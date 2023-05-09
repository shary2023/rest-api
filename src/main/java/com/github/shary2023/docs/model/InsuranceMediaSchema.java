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
 * InsuranceMediaSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-09T17:49:00.801131400+06:00[Asia/Almaty]")
public class InsuranceMediaSchema {

  @JsonProperty("collection")
  private String collection;

  @JsonProperty("key")
  private String key;

  public InsuranceMediaSchema collection(String collection) {
    this.collection = collection;
    return this;
  }

  /**
   * Get collection
   * @return collection
  */
  
  @Schema(name = "collection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCollection() {
    return collection;
  }

  public void setCollection(String collection) {
    this.collection = collection;
  }

  public InsuranceMediaSchema key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsuranceMediaSchema insuranceMediaSchema = (InsuranceMediaSchema) o;
    return Objects.equals(this.collection, insuranceMediaSchema.collection) &&
        Objects.equals(this.key, insuranceMediaSchema.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsuranceMediaSchema {\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

