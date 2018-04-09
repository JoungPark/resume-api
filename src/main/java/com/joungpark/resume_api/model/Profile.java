package com.joungpark.resume_api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "profile")
public class Profile {
	@Id
    @GeneratedValue
    @Column(name="profile_id")
	public int id;
	
	@Column(unique=true)
	public String userId;
	@Column
	public String firstName;
	@Column
	public String lastName;
	@Column
	public String job;
	@Column
	public String mobile;
	@Column
	public String emailAddress;
	@Column
	public String homeAddress;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "profile", cascade = CascadeType.ALL)
	@JsonManagedReference
	public List<KeySkill> keySkills;
	
	@Override
	public String toString() {
		return "Profile [id=" + id + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", job=" + job + ", mobile=" + mobile + ", emailAddress=" + emailAddress + ", homeAddress="
				+ homeAddress + ", keySkills=" + keySkills + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public List<KeySkill> getKeySkills() {
		return keySkills;
	}

	public void setKeySkills(List<KeySkill> keySkills) {
		this.keySkills = keySkills;
	}
	
	
}
