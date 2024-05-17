package com.ytech.eazyschool.model;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name="holidays")
public class Holiday extends BaseEntity {

    @Id
    private String day;

    private String reason;

    @Enumerated(EnumType.STRING)	//converting enum type to string while storing in Database
    private Type type;

    public enum Type {
        FESTIVAL, FEDERAL
    }
}
