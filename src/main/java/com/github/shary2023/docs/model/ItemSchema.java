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
 * ItemSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-04T17:35:50.717742100+06:00[Asia/Almaty]")
public class ItemSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("serialNumber")
  private String serialNumber;

  @JsonProperty("photo")
  private String photo;

  @JsonProperty("video")
  private String video;

  @JsonProperty("description")
  private String description;

  @JsonProperty("verified")
  private Boolean verified = true;

  @JsonProperty("onLease")
  private Boolean onLease = false;

  @JsonProperty("category")
  private Integer category;

  @JsonProperty("subcategory")
  private Integer subcategory;

  @JsonProperty("price")
  private String price;

  @JsonProperty("renter")
  private Long renter;

  @JsonProperty("owner")
  private Long owner;

  public ItemSchema id(Long id) {
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

  public ItemSchema name(String name) {
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

  public ItemSchema serialNumber(String serialNumber) {
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

  public ItemSchema photo(String photo) {
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

  public ItemSchema video(String video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
  */
  @NotNull 
  @Schema(name = "video", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  public ItemSchema description(String description) {
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

  public ItemSchema verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Get verified
   * @return verified
  */
  @NotNull 
  @Schema(name = "verified", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public ItemSchema onLease(Boolean onLease) {
    this.onLease = onLease;
    return this;
  }

  /**
   * Get onLease
   * @return onLease
  */
  @NotNull 
  @Schema(name = "onLease", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getOnLease() {
    return onLease;
  }

  public void setOnLease(Boolean onLease) {
    this.onLease = onLease;
  }

  public ItemSchema category(Integer category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getCategory() {
    return category;
  }

  public void setCategory(Integer category) {
    this.category = category;
  }

  public ItemSchema subcategory(Integer subcategory) {
    this.subcategory = subcategory;
    return this;
  }

  /**
   * Get subcategory
   * @return subcategory
  */
  @NotNull 
  @Schema(name = "subcategory", requiredMode = Schema.RequiredMode.REQUIRED)
  public Integer getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(Integer subcategory) {
    this.subcategory = subcategory;
  }

  public ItemSchema price(String price) {
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

  public ItemSchema renter(Long renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  @NotNull 
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getRenter() {
    return renter;
  }

  public void setRenter(Long renter) {
    this.renter = renter;
  }

  public ItemSchema owner(Long owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @NotNull 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
  public Long getOwner() {
    return owner;
  }

  public void setOwner(Long owner) {
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSchema itemSchema = (ItemSchema) o;
    return Objects.equals(this.id, itemSchema.id) &&
        Objects.equals(this.name, itemSchema.name) &&
        Objects.equals(this.serialNumber, itemSchema.serialNumber) &&
        Objects.equals(this.photo, itemSchema.photo) &&
        Objects.equals(this.video, itemSchema.video) &&
        Objects.equals(this.description, itemSchema.description) &&
        Objects.equals(this.verified, itemSchema.verified) &&
        Objects.equals(this.onLease, itemSchema.onLease) &&
        Objects.equals(this.category, itemSchema.category) &&
        Objects.equals(this.subcategory, itemSchema.subcategory) &&
        Objects.equals(this.price, itemSchema.price) &&
        Objects.equals(this.renter, itemSchema.renter) &&
        Objects.equals(this.owner, itemSchema.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serialNumber, photo, video, description, verified, onLease, category, subcategory, price, renter, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    onLease: ").append(toIndentedString(onLease)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    renter: ").append(toIndentedString(renter)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

