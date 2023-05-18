package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.CategorySchema;
import com.github.shary2023.docs.model.CharacteristicsSchema;
import com.github.shary2023.docs.model.ItemDataForRentSchema;
import com.github.shary2023.docs.model.SubcategorySchema;
import java.net.URI;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T18:28:26.671559500+06:00[Asia/Almaty]")
public class ItemSchema {

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

  @JsonProperty("isExtendLease")
  private Boolean isExtendLease = false;

  @JsonProperty("category")
  private CategorySchema category;

  @JsonProperty("subcategory")
  private SubcategorySchema subcategory;

  @JsonProperty("price")
  private String price;

  @JsonProperty("renterPhone")
  private String renterPhone;

  @JsonProperty("ownerPhone")
  private String ownerPhone;

  @JsonProperty("characteristics")
  private CharacteristicsSchema characteristics;

  @JsonProperty("data")
  private ItemDataForRentSchema data;

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
  
  @Schema(name = "serialNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public ItemSchema photo(URI photo) {
    this.photo = photo;
    return this;
  }

  /**
   * Get photo
   * @return photo
  */
  @NotNull @Valid 
  @Schema(name = "photo", requiredMode = Schema.RequiredMode.REQUIRED)
  public URI getPhoto() {
    return photo;
  }

  public void setPhoto(URI photo) {
    this.photo = photo;
  }

  public ItemSchema video(URI video) {
    this.video = video;
    return this;
  }

  /**
   * Get video
   * @return video
  */
  @NotNull @Valid 
  @Schema(name = "video", requiredMode = Schema.RequiredMode.REQUIRED)
  public URI getVideo() {
    return video;
  }

  public void setVideo(URI video) {
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
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

  public ItemSchema isExtendLease(Boolean isExtendLease) {
    this.isExtendLease = isExtendLease;
    return this;
  }

  /**
   * Get isExtendLease
   * @return isExtendLease
  */
  
  @Schema(name = "isExtendLease", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsExtendLease() {
    return isExtendLease;
  }

  public void setIsExtendLease(Boolean isExtendLease) {
    this.isExtendLease = isExtendLease;
  }

  public ItemSchema category(CategorySchema category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @NotNull @Valid 
  @Schema(name = "category", requiredMode = Schema.RequiredMode.REQUIRED)
  public CategorySchema getCategory() {
    return category;
  }

  public void setCategory(CategorySchema category) {
    this.category = category;
  }

  public ItemSchema subcategory(SubcategorySchema subcategory) {
    this.subcategory = subcategory;
    return this;
  }

  /**
   * Get subcategory
   * @return subcategory
  */
  @NotNull @Valid 
  @Schema(name = "subcategory", requiredMode = Schema.RequiredMode.REQUIRED)
  public SubcategorySchema getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(SubcategorySchema subcategory) {
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

  public ItemSchema renterPhone(String renterPhone) {
    this.renterPhone = renterPhone;
    return this;
  }

  /**
   * Get renterPhone
   * @return renterPhone
  */
  
  @Schema(name = "renterPhone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRenterPhone() {
    return renterPhone;
  }

  public void setRenterPhone(String renterPhone) {
    this.renterPhone = renterPhone;
  }

  public ItemSchema ownerPhone(String ownerPhone) {
    this.ownerPhone = ownerPhone;
    return this;
  }

  /**
   * Get ownerPhone
   * @return ownerPhone
  */
  @NotNull 
  @Schema(name = "ownerPhone", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getOwnerPhone() {
    return ownerPhone;
  }

  public void setOwnerPhone(String ownerPhone) {
    this.ownerPhone = ownerPhone;
  }

  public ItemSchema characteristics(CharacteristicsSchema characteristics) {
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

  public ItemSchema data(ItemDataForRentSchema data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ItemDataForRentSchema getData() {
    return data;
  }

  public void setData(ItemDataForRentSchema data) {
    this.data = data;
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
        Objects.equals(this.isExtendLease, itemSchema.isExtendLease) &&
        Objects.equals(this.category, itemSchema.category) &&
        Objects.equals(this.subcategory, itemSchema.subcategory) &&
        Objects.equals(this.price, itemSchema.price) &&
        Objects.equals(this.renterPhone, itemSchema.renterPhone) &&
        Objects.equals(this.ownerPhone, itemSchema.ownerPhone) &&
        Objects.equals(this.characteristics, itemSchema.characteristics) &&
        Objects.equals(this.data, itemSchema.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serialNumber, photo, video, description, verified, isExtendLease, category, subcategory, price, renterPhone, ownerPhone, characteristics, data);
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
    sb.append("    isExtendLease: ").append(toIndentedString(isExtendLease)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    renterPhone: ").append(toIndentedString(renterPhone)).append("\n");
    sb.append("    ownerPhone: ").append(toIndentedString(ownerPhone)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

