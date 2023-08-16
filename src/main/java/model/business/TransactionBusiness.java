package model.business;

import java.util.Date;

import lombok.Data;

@Data
public class TransactionBusiness {

	private int idTransaction;

	private float amount;

	private Date date;

	private int cardNumber;
}
