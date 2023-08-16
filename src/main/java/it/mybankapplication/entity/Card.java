package it.mybankapplication.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "card", schema = "mybank")
public class Card {

	@Id
	@Column(name = "id_card", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCard;

	@Column(name = "card_number", nullable = false)
	private int cardNumber;

	@Column(name = "expiry_date", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date expiryDate;

	@ManyToOne
	@JoinColumn(name = "customer_id", referencedColumnName = "id_customer", nullable = false)
	private Customer customer;

	@ManyToOne
	@JoinColumn(name = "account_id", referencedColumnName = "id_account", nullable = false)
	private Account account;
	
	@Column(name = "password", nullable = false)
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdCard() {
		return idCard;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
