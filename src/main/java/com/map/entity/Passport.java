package com.map.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="passport_tbl")
public class Passport {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer passid;
	
	private String passnum;
	private LocalDate issuedate;
	private LocalDate expireDate;
	
	@OneToOne
	@JoinColumn(name="person_id" )
	private Person person;

	public Integer getPassid() {
		return passid;
	}

	public void setPassid(Integer passid) {
		this.passid = passid;
	}

	public String getPassnum() {
		return passnum;
	}

	public void setPassnum(String passnum) {
		this.passnum = passnum;
	}

	public LocalDate getIssuedate() {
		return issuedate;
	}

	public void setIssuedate(LocalDate issuedate) {
		this.issuedate = issuedate;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Passport [passid=" + passid + ", passnum=" + passnum + ", issuedate=" + issuedate + ", expireDate="
				+ expireDate + ", person=" + person + "]";
	}
	
	
}
