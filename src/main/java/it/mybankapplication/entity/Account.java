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
@Table(name = "account", schema = "mybank")
public class Account {

	@Id
	@Column(name = "id_account", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAccount;

	@Column(name = "balance", nullable = false)
	private float balance;

	@Column(name = "creation_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public int getIdAccount() {
		return idAccount;
	}

}
