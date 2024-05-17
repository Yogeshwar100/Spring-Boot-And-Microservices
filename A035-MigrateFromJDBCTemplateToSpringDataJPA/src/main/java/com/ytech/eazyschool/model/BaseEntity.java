package com.ytech.eazyschool.model;

import lombok.Data;

import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@MappedSuperclass	//To consider fields inside this class as column names
public class BaseEntity {

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}
