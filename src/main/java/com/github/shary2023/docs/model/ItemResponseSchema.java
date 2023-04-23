package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.CategorySchema;
import com.github.shary2023.docs.model.CharacteristicsSchema;
import com.github.shary2023.docs.model.OwnerSchema;
import com.github.shary2023.docs.model.RenterSchema;
import com.github.shary2023.docs.model.SubcategorySchema;
import java.net.URI;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-23T11:37:42.382147200+06:00[Asia/Almaty]")
public class ItemResponseSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("serialNumber")
  private String serialNumber;

  @JsonProperty("photo")
  private URI photo;

  @JsonProperty("video")
  private URI video;

  @JsonProperty("description")
  private String description;

  @JsonProperty("verified")
  private Boolean verified = false;

  @JsonProperty("onLease")
  private Boolean onLease = false;

  @JsonProperty("category")
  private CategorySchema category;

  @JsonProperty("subcategory")
  private SubcategorySchema subcategory;

  @JsonProperty("price")
  private String price;

  @JsonProperty("renter")
  private RenterSchema renter;

  @JsonProperty("owner")
  private OwnerSchema owner;

  @JsonProperty("characteristics")
  private CharacteristicsSchema characteristics;

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
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  
  @Schema(name = "serialNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public ItemResponseSchema photo(URI photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getPhoto() {
    return photo;
  }

  public void setPhoto(URI photo) {
    this.photo = photo;
  }

  public ItemResponseSchema video(URI video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
  */
  @Valid 
  @Schema(name = "video", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public URI getVideo() {
    return video;
  }

  public void setVideo(URI video) {
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
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  
  @Schema(name = "verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  
  @Schema(name = "onLease", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getOnLease() {
    return onLease;
  }

  public void setOnLease(Boolean onLease) {
    this.onLease = onLease;
  }

  public ItemResponseSchema category(CategorySchema category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CategorySchema getCategory() {
    return category;
  }

  public void setCategory(CategorySchema category) {
    this.category = category;
  }

  public ItemResponseSchema subcategory(SubcategorySchema subcategory) {
    this.subcategory = subcategory;
    return this;
  }

  /**
   * Get subcategory
   * @return subcategory
  */
  @Valid 
  @Schema(name = "subcategory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public SubcategorySchema getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(SubcategorySchema subcategory) {
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
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ItemResponseSchema renter(RenterSchema renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  @Valid 
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public RenterSchema getRenter() {
    return renter;
  }

  public void setRenter(RenterSchema renter) {
    this.renter = renter;
  }

  public ItemResponseSchema owner(OwnerSchema owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OwnerSchema getOwner() {
    return owner;
  }

  public void setOwner(OwnerSchema owner) {
    this.owner = owner;
  }

  public ItemResponseSchema characteristics(CharacteristicsSchema characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  /**
   * Get characteristics
   * @return characteristics
  */
  @Valid 
  @Schema(name = "characteristics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CharacteristicsSchema getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(CharacteristicsSchema characteristics) {
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

