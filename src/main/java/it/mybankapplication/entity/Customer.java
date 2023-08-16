package it.mybankapplication.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "customer", schema = "mybank")
public class Customer {

	@Id
	@Column(name = "id_customer", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCustomer;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "birth_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date birthDate;

	@Column(name = "residency", nullable = false)
	private String residency;

	@Column(name = "citizenship", nullable = false)
	private String citizenship;

	@Column(name = "email", nullable = false)
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdCustomer() {
		return idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getResidency() {
		return residency;
	}

	public void setResidency(String residency) {
		this.residency = residency;
	}

	public String getCitizenship() {
		return citizenship;
	}

	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}

}
