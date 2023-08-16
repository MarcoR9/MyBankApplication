package model.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TransactionDto {

	private int idTransaction;

	private float amount;

	private Date date;

	private int cardNumber;
}
