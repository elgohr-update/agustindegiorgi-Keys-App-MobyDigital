package com.mobydigital.keysapp.backend.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//Entidad Users
@Entity
@Table(name = "users")
public class User implements Serializable {

	@Id
	private Integer dni;
	private String telephone;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String lastname;
	private String email;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Doorkey> doorkeys;

	public List<Doorkey> getDoorkeys() {
		return doorkeys;
	}

	public void setDoorkeys(List<Doorkey> doorkeys) {
		this.doorkeys = doorkeys;
		for (Doorkey doorkey : doorkeys) {
			doorkey.setUser(this);
		}

	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private static final long serialVersionUID = 1L;

}
