package com.joungpark.resume_api.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "key_skill")
public class KeySkill {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="key_skill_id")
	private int id;
	@Column
	private String skillName;
	@Column
	private int orderNo;
//	@Column
//	private String details;
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="profile_id")
	@JsonBackReference
    private Profile profile;

	@Override
	public String toString() {
		return "KeySkill [id=" + id + ", skillName=" + skillName + ", orderNo=" + orderNo + ", details="
				+ ", profile=" + (profile != null ? profile.id : "null") + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

//	public String getDetails() {
//		return details;
//	}
//
//	public void setDetails(String details) {
//		this.details = details;
//	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
}
