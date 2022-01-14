package com.org.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Institute_Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Address_ID")
	private Long id;
	
	private String location;
	
	@ManyToMany(mappedBy="coachingInstituteAddress")
	private List<CoachingInstitute> coaching = new ArrayList<>();
	

	public Address() {
		super();
	}

	public Address(String location) {
		super();
		this.location = location;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<CoachingInstitute> getCoaching() {
		return coaching;
	}

	public void setCoaching(List<CoachingInstitute> coaching) {
		this.coaching = coaching;
	}

	
}
