package com.sharma.nk.ecom.models;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt", "customerId"})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String name;
    private String type;
    private String email;
    private String phoneNumber;
    private Date dob;

    @OneToMany
    private Set<Address> addresses = new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    public int getCustomerId() {
        return customerId;
    }

    public Customer withCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer withName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Customer withType(String type) {
        this.type = type;
        return this;
    }

    public Date getDob() {
        return dob;
    }

    public Customer withDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public Set<Address> getAddress() {
        return addresses;
    }

    public Customer addAddress(Address address) {
        this.addresses.add(address);
        return this;
    }

    public Customer removeAddress(Address address) {
        this.addresses.remove(address);
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer withEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dob=" + dob +
                ", addresses=" + addresses +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
