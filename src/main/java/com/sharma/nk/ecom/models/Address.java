package com.sharma.nk.ecom.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" })
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String houseName;
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
}
