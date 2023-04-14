package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.ItemSchema;
import com.github.shary2023.docs.model.RenterSchema;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-14T20:11:49.711567300+06:00[Asia/Almaty]")
public class OrderSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("status")
  private String status;

  @JsonProperty("renter")
  private RenterSchema renter;

  @JsonProperty("creation")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creation;

  @JsonProperty("updated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  @JsonProperty("rentEnd")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime rentEnd;

  @JsonProperty("isActive")
  private Boolean isActive = true;

  @JsonProperty("items")
  @Valid
  private List<ItemSchema> items = new ArrayList<>();

  public OrderSchema id(Long id) {
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

  public OrderSchema status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OrderSchema renter(RenterSchema renter) {
    this.renter = renter;
    return this;
  }

  /**
   * Get renter
   * @return renter
  */
  @NotNull @Valid 
  @Schema(name = "renter", requiredMode = Schema.RequiredMode.REQUIRED)
  public RenterSchema getRenter() {
    return renter;
  }

  public void setRenter(RenterSchema renter) {
    this.renter = renter;
  }

  public OrderSchema creation(OffsetDateTime creation) {
    this.creation = creation;
    return this;
  }

  /**
   * Get creation
   * @return creation
  */
  @NotNull @Valid 
  @Schema(name = "creation", requiredMode = Schema.RequiredMode.REQUIRED)
  public OffsetDateTime getCreation() {
    return creation;
  }

  public void setCreation(OffsetDateTime creation) {
    this.creation = creation;
  }

  public OrderSchema updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public OrderSchema rentEnd(OffsetDateTime rentEnd) {
    this.rentEnd = rentEnd;
    return this;
  }

  /**
   * Get rentEnd
   * @return rentEnd
  */
  @Valid 
  @Schema(name = "rentEnd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getRentEnd() {
    return rentEnd;
  }

  public void setRentEnd(OffsetDateTime rentEnd) {
    this.rentEnd = rentEnd;
  }

  public OrderSchema isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Get isActive
   * @return isActive
  */
  @NotNull 
  @Schema(name = "isActive", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public OrderSchema items(List<ItemSchema> items) {
    this.items = items;
    return this;
  }

  public OrderSchema addItemsItem(ItemSchema itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  public List<ItemSchema> getItems() {
    return items;
  }

  public void setItems(List<ItemSchema> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSchema orderSchema = (OrderSchema) o;
    return Objects.equals(this.id, orderSchema.id) &&
        Objects.equals(this.status, orderSchema.status) &&
        Objects.equals(this.renter, orderSchema.renter) &&
        Objects.equals(this.creation, orderSchema.creation) &&
        Objects.equals(this.updated, orderSchema.updated) &&
        Objects.equals(this.rentEnd, orderSchema.rentEnd) &&
        Objects.equals(this.isActive, orderSchema.isActive) &&
        Objects.equals(this.items, orderSchema.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, renter, creation, updated, rentEnd, isActive, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    renter: ").append(toIndentedString(renter)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    rentEnd: ").append(toIndentedString(rentEnd)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

