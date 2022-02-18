package com.haydikodlayalim.graphql.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehicle")
@Getter
@Setter
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String year;
    private String brand;
    private Long brandId;
    private String model;
    private Long modelId;
    private String bodyType;
    private Long bodyTypeId;
    private String transmissionType;
    private Long transmissionTypeId;
    private String fuelType;
    private Long fuelTypeId;
    private String version;
    private Long versionId;
    private Integer km;
    private String createdAt;
    private String apiUser;
    private Long companyId;
    private Integer retailPrice;
    private Integer quickSellPrice;
    private Integer aboveMarketPrice;
    private Integer galleryPriceUp;
    private Integer galleryPriceDown;
    private String clientIp;
    private Long duration;
    private Integer statusCode;
    private String statusDesc;
    private String pricingDate;
    private String color;
    private String city;
    private String userType;
    private Long userId;
    private String source;
}
