package com.book.online.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tbl_book")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String sku;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @NotNull
    @Column(name = "image_url")
    private String imageUrl;

    @NotNull
    private boolean active = true;

    @NotNull
    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    private Date createdOn;

    @Column(name = "last_updated")
    private Date updatedOn;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private BookCategory category;



}