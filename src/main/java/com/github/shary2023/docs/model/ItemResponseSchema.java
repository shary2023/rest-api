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
 * ItemResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-04T17:04:52.810889100+06:00[Asia/Almaty]")
public class ItemResponseSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("serialNumber")
  private String serialNumber;

  @JsonProperty("category")
  private Long category;

  @JsonProperty("subcategory")
  private Long subcategory;

  @JsonProperty("price")
  private String price;

  @JsonProperty("description")
  private String description;

  @JsonProperty("photo")
  private String photo;

  public ItemResponseSchema id(Long id) {
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

  public ItemResponseSchema name(String name) {
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

  public ItemResponseSchema serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  @NotNull 
  @Schema(name = "serialNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public ItemResponseSchema category(Long category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getCategory() {
    return category;
  }

  public void setCategory(Long category) {
    this.category = category;
  }

  public ItemResponseSchema subcategory(Long subcategory) {
    this.subcategory = subcategory;
    return this;
  }

  /**
   * Get subcategory
   * @return subcategory
  */
  @NotNull 
  @Schema(name = "subcategory", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(Long subcategory) {
    this.subcategory = subcategory;
  }

  public ItemResponseSchema price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @NotNull 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ItemResponseSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @NotNull 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemResponseSchema photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @NotNull 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseSchema itemResponseSchema = (ItemResponseSchema) o;
    return Objects.equals(this.id, itemResponseSchema.id) &&
        Objects.equals(this.name, itemResponseSchema.name) &&
        Objects.equals(this.serialNumber, itemResponseSchema.serialNumber) &&
        Objects.equals(this.category, itemResponseSchema.category) &&
        Objects.equals(this.subcategory, itemResponseSchema.subcategory) &&
        Objects.equals(this.price, itemResponseSchema.price) &&
        Objects.equals(this.description, itemResponseSchema.description) &&
        Objects.equals(this.photo, itemResponseSchema.photo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serialNumber, category, subcategory, price, description, photo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
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

