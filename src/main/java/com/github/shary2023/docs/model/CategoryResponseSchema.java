package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CategoryResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-01T22:08:02.206892800+06:00[Asia/Almaty]")
public class CategoryResponseSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("image")
  private URI image;

  public CategoryResponseSchema id(Long id) {
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

  public CategoryResponseSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryResponseSchema image(URI image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @Valid 
  @Schema(name = "image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getImage() {
    return image;
  }

  public void setImage(URI image) {
    this.image = image;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryResponseSchema categoryResponseSchema = (CategoryResponseSchema) o;
    return Objects.equals(this.id, categoryResponseSchema.id) &&
        Objects.equals(this.name, categoryResponseSchema.name) &&
        Objects.equals(this.image, categoryResponseSchema.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResponseSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

