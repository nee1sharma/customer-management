package com.sharma.nk.ecom.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt", "id"})
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String houseName;
    private String block;
    private String street;
    private String city;
    private String state;
    private String pincode;
    private String landmark;
    private String type;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public String getHouseName() {
        return houseName;
    }

    public Address withHouseName(String houseName) {
        this.houseName = houseName;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    public String getPincode() {
        return pincode;
    }

    public Address withPincode(String pincode) {
        this.pincode = pincode;
        return this;
    }

    public String getLandmark() {
        return landmark;
    }

    public Address withLandmark(String landmark) {
        this.landmark = landmark;
        return this;
    }

    public String getType() {
        return type;
    }

    public Address withType(String type) {
        this.type = type;
        return this;
    }

    public String getBlock() {
        return block;
    }

    public Address withBlock(String block) {
        this.block = block;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }
}
