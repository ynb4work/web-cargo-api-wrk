package com.webcargo.webcargo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(schema = "web_cargo", name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate DateField;

    @Column(name = "quantity")
    private Double quantity;

    @Enumerated(EnumType.STRING)
    @Column(name = "units")
    private Units units;

    @Enumerated(EnumType.STRING)
    @Column(name = "product")
    private Product product;

    @Enumerated(EnumType.STRING)
    @Column(name = "legalEntity")
    private LegalEntity legalEntity;

    @Column(name = "counterparty")
    private String Counterparty;

    @Column(name = "unloading_addresses")
    private String unloadingAddresses;

    @Column(name = "maps_location")
    private String mapsLocation;

    @Column(name = "phone_number_consignee")
    private String phoneNumberConsignee;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "descriptions")
    private String descriptions;

}