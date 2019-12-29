package com.abhinavjain.masterslavedatasources.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "books")
@Data
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String authorName;
    private Double price;
    private String genre;
    private Integer rating;
    @CreationTimestamp
    private Date createdAt = new Date();
    @UpdateTimestamp
    private Date updatedAt = new Date();
}
