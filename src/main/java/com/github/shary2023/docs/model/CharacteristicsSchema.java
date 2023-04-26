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
 * CharacteristicsSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T15:01:50.640643700+06:00[Asia/Almaty]")
public class CharacteristicsSchema {

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("color")
  private String color;

  @JsonProperty("operatingSystem")
  private String operatingSystem;

  @JsonProperty("cpu")
  private String cpu;

  @JsonProperty("ram")
  private String ram;

  @JsonProperty("videoCard")
  private String videoCard;

  @JsonProperty("memory")
  private String memory;

  @JsonProperty("memoryType")
  private String memoryType;

  @JsonProperty("batteryCapacity")
  private String batteryCapacity;

  @JsonProperty("weight")
  private String weight;

  public CharacteristicsSchema brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public CharacteristicsSchema color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Get color
   * @return color
  */
  
  @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public CharacteristicsSchema operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Get operatingSystem
   * @return operatingSystem
  */
  
  @Schema(name = "operatingSystem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public CharacteristicsSchema cpu(String cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Get cpu
   * @return cpu
  */
  
  @Schema(name = "cpu", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCpu() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public CharacteristicsSchema ram(String ram) {
    this.ram = ram;
    return this;
  }

  /**
   * Get ram
   * @return ram
  */
  
  @Schema(name = "ram", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRam() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram = ram;
  }

  public CharacteristicsSchema videoCard(String videoCard) {
    this.videoCard = videoCard;
    return this;
  }

  /**
   * Get videoCard
   * @return videoCard
  */
  
  @Schema(name = "videoCard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getVideoCard() {
    return videoCard;
  }

  public void setVideoCard(String videoCard) {
    this.videoCard = videoCard;
  }

  public CharacteristicsSchema memory(String memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
  */
  
  @Schema(name = "memory", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMemory() {
    return memory;
  }

  public void setMemory(String memory) {
    this.memory = memory;
  }

  public CharacteristicsSchema memoryType(String memoryType) {
    this.memoryType = memoryType;
    return this;
  }

  /**
   * Get memoryType
   * @return memoryType
  */
  
  @Schema(name = "memoryType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMemoryType() {
    return memoryType;
  }

  public void setMemoryType(String memoryType) {
    this.memoryType = memoryType;
  }

  public CharacteristicsSchema batteryCapacity(String batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
    return this;
  }

  /**
   * Get batteryCapacity
   * @return batteryCapacity
  */
  
  @Schema(name = "batteryCapacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBatteryCapacity() {
    return batteryCapacity;
  }

  public void setBatteryCapacity(String batteryCapacity) {
    this.batteryCapacity = batteryCapacity;
  }

  public CharacteristicsSchema weight(String weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacteristicsSchema characteristicsSchema = (CharacteristicsSchema) o;
    return Objects.equals(this.brand, characteristicsSchema.brand) &&
        Objects.equals(this.color, characteristicsSchema.color) &&
        Objects.equals(this.operatingSystem, characteristicsSchema.operatingSystem) &&
        Objects.equals(this.cpu, characteristicsSchema.cpu) &&
        Objects.equals(this.ram, characteristicsSchema.ram) &&
        Objects.equals(this.videoCard, characteristicsSchema.videoCard) &&
        Objects.equals(this.memory, characteristicsSchema.memory) &&
        Objects.equals(this.memoryType, characteristicsSchema.memoryType) &&
        Objects.equals(this.batteryCapacity, characteristicsSchema.batteryCapacity) &&
        Objects.equals(this.weight, characteristicsSchema.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, color, operatingSystem, cpu, ram, videoCard, memory, memoryType, batteryCapacity, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacteristicsSchema {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    videoCard: ").append(toIndentedString(videoCard)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    memoryType: ").append(toIndentedString(memoryType)).append("\n");
    sb.append("    batteryCapacity: ").append(toIndentedString(batteryCapacity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

