package com.github.shary2023.docs.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.shary2023.docs.model.DeliverySchema;
import com.github.shary2023.docs.model.ItemSchema;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-18T18:28:26.671559500+06:00[Asia/Almaty]")
public class OrderSchema {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("status")
  private String status;

  @JsonProperty("fullPrice")
  private String fullPrice;

  @JsonProperty("rentStart")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime rentStart;

  @JsonProperty("isRenterNew")
  private Boolean isRenterNew = false;

  @JsonProperty("isPrepaymentGet")
  private Boolean isPrepaymentGet = false;

  @JsonProperty("isNeedCourier")
  private Boolean isNeedCourier = false;

  @JsonProperty("renterPhone")
  private String renterPhone;

  @JsonProperty("creation")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime creation;

  @JsonProperty("updated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  @JsonProperty("rentEnd")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime rentEnd;

  @JsonProperty("active")
  private Boolean active = true;

  @JsonProperty("isAgreeWithFullDeposit")
  private Boolean isAgreeWithFullDeposit = false;

  @JsonProperty("delivery")
  private DeliverySchema delivery;

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

  public OrderSchema fullPrice(String fullPrice) {
    this.fullPrice = fullPrice;
    return this;
  }

  /**
   * Get fullPrice
   * @return fullPrice
  */
  
  @Schema(name = "fullPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(String fullPrice) {
    this.fullPrice = fullPrice;
  }

  public OrderSchema rentStart(OffsetDateTime rentStart) {
    this.rentStart = rentStart;
    return this;
  }

  /**
   * Get rentStart
   * @return rentStart
  */
  @Valid 
  @Schema(name = "rentStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getRentStart() {
    return rentStart;
  }

  public void setRentStart(OffsetDateTime rentStart) {
    this.rentStart = rentStart;
  }

  public OrderSchema isRenterNew(Boolean isRenterNew) {
    this.isRenterNew = isRenterNew;
    return this;
  }

  /**
   * Get isRenterNew
   * @return isRenterNew
  */
  
  @Schema(name = "isRenterNew", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsRenterNew() {
    return isRenterNew;
  }

  public void setIsRenterNew(Boolean isRenterNew) {
    this.isRenterNew = isRenterNew;
  }

  public OrderSchema isPrepaymentGet(Boolean isPrepaymentGet) {
    this.isPrepaymentGet = isPrepaymentGet;
    return this;
  }

  /**
   * Get isPrepaymentGet
   * @return isPrepaymentGet
  */
  
  @Schema(name = "isPrepaymentGet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsPrepaymentGet() {
    return isPrepaymentGet;
  }

  public void setIsPrepaymentGet(Boolean isPrepaymentGet) {
    this.isPrepaymentGet = isPrepaymentGet;
  }

  public OrderSchema isNeedCourier(Boolean isNeedCourier) {
    this.isNeedCourier = isNeedCourier;
    return this;
  }

  /**
   * Get isNeedCourier
   * @return isNeedCourier
  */
  
  @Schema(name = "isNeedCourier", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsNeedCourier() {
    return isNeedCourier;
  }

  public void setIsNeedCourier(Boolean isNeedCourier) {
    this.isNeedCourier = isNeedCourier;
  }

  public OrderSchema renterPhone(String renterPhone) {
    this.renterPhone = renterPhone;
    return this;
  }

  /**
   * Get renterPhone
   * @return renterPhone
  */
  @NotNull @Size(min = 5, max = 15) 
  @Schema(name = "renterPhone", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getRenterPhone() {
    return renterPhone;
  }

  public void setRenterPhone(String renterPhone) {
    this.renterPhone = renterPhone;
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

  public OrderSchema active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Get active
   * @return active
  */
  @NotNull 
  @Schema(name = "active", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public OrderSchema isAgreeWithFullDeposit(Boolean isAgreeWithFullDeposit) {
    this.isAgreeWithFullDeposit = isAgreeWithFullDeposit;
    return this;
  }

  /**
   * Get isAgreeWithFullDeposit
   * @return isAgreeWithFullDeposit
  */
  @NotNull 
  @Schema(name = "isAgreeWithFullDeposit", requiredMode = Schema.RequiredMode.REQUIRED)
  public Boolean getIsAgreeWithFullDeposit() {
    return isAgreeWithFullDeposit;
  }

  public void setIsAgreeWithFullDeposit(Boolean isAgreeWithFullDeposit) {
    this.isAgreeWithFullDeposit = isAgreeWithFullDeposit;
  }

  public OrderSchema delivery(DeliverySchema delivery) {
    this.delivery = delivery;
    return this;
  }

  /**
   * Get delivery
   * @return delivery
  */
  @Valid 
  @Schema(name = "delivery", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DeliverySchema getDelivery() {
    return delivery;
  }

  public void setDelivery(DeliverySchema delivery) {
    this.delivery = delivery;
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
        Objects.equals(this.fullPrice, orderSchema.fullPrice) &&
        Objects.equals(this.rentStart, orderSchema.rentStart) &&
        Objects.equals(this.isRenterNew, orderSchema.isRenterNew) &&
        Objects.equals(this.isPrepaymentGet, orderSchema.isPrepaymentGet) &&
        Objects.equals(this.isNeedCourier, orderSchema.isNeedCourier) &&
        Objects.equals(this.renterPhone, orderSchema.renterPhone) &&
        Objects.equals(this.creation, orderSchema.creation) &&
        Objects.equals(this.updated, orderSchema.updated) &&
        Objects.equals(this.rentEnd, orderSchema.rentEnd) &&
        Objects.equals(this.active, orderSchema.active) &&
        Objects.equals(this.isAgreeWithFullDeposit, orderSchema.isAgreeWithFullDeposit) &&
        Objects.equals(this.delivery, orderSchema.delivery) &&
        Objects.equals(this.items, orderSchema.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, fullPrice, rentStart, isRenterNew, isPrepaymentGet, isNeedCourier, renterPhone, creation, updated, rentEnd, active, isAgreeWithFullDeposit, delivery, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSchema {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fullPrice: ").append(toIndentedString(fullPrice)).append("\n");
    sb.append("    rentStart: ").append(toIndentedString(rentStart)).append("\n");
    sb.append("    isRenterNew: ").append(toIndentedString(isRenterNew)).append("\n");
    sb.append("    isPrepaymentGet: ").append(toIndentedString(isPrepaymentGet)).append("\n");
    sb.append("    isNeedCourier: ").append(toIndentedString(isNeedCourier)).append("\n");
    sb.append("    renterPhone: ").append(toIndentedString(renterPhone)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    rentEnd: ").append(toIndentedString(rentEnd)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    isAgreeWithFullDeposit: ").append(toIndentedString(isAgreeWithFullDeposit)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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

