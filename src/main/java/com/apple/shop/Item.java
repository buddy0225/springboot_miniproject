package com.apple.shop;

import jakarta.persistence.*;
import lombok.ToString;

@ToString
@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String title;
    public Integer price;
}


