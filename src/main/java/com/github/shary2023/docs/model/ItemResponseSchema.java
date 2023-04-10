package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.CharacteristicsSchema;
import java.util.ArrayList;
import java.util.List;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-10T23:28:51.974252100+06:00[Asia/Almaty]")
public class ItemResponseSchema {

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

  @JsonProperty("characteristics")
  @Valid
  private List<CharacteristicsSchema> characteristics = null;

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

  public ItemResponseSchema video(String video) {
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

  public ItemResponseSchema verified(Boolean verified) {
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

  public ItemResponseSchema onLease(Boolean onLease) {
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

  public ItemResponseSchema category(Integer category) {
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

  public ItemResponseSchema subcategory(Integer subcategory) {
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

  public ItemResponseSchema renter(Long renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getRenter() {
    return renter;
  }

  public void setRenter(Long renter) {
    this.renter = renter;
  }

  public ItemResponseSchema owner(Long owner) {
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

  public ItemResponseSchema characteristics(List<CharacteristicsSchema> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public ItemResponseSchema addCharacteristicsItem(CharacteristicsSchema characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

  /**
   * Get characteristics
   * @return characteristics
  */
  @Valid 
  @Schema(name = "characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CharacteristicsSchema> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<CharacteristicsSchema> characteristics) {
    this.characteristics = characteristics;
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
        Objects.equals(this.photo, itemResponseSchema.photo) &&
        Objects.equals(this.video, itemResponseSchema.video) &&
        Objects.equals(this.description, itemResponseSchema.description) &&
        Objects.equals(this.verified, itemResponseSchema.verified) &&
        Objects.equals(this.onLease, itemResponseSchema.onLease) &&
        Objects.equals(this.category, itemResponseSchema.category) &&
        Objects.equals(this.subcategory, itemResponseSchema.subcategory) &&
        Objects.equals(this.price, itemResponseSchema.price) &&
        Objects.equals(this.renter, itemResponseSchema.renter) &&
        Objects.equals(this.owner, itemResponseSchema.owner) &&
        Objects.equals(this.characteristics, itemResponseSchema.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serialNumber, photo, video, description, verified, onLease, category, subcategory, price, renter, owner, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseSchema {\n");
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
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
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

