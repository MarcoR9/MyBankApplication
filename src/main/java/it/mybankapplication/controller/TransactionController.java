package it.mybankapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.dto.LoginDto;
import model.dto.TransactionDto;
import model.service.LoginService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins="*")
public class TransactionController {
	
	@Autowired
	private LoginService loginSrv;

	
	
	@PostMapping("/list")
	  public ResponseEntity<List<TransactionDto>> getTransactionList(@RequestParam LoginDto login) {
		loginSrv.authorize(login);
	    return null;
	  }
	
	@PostMapping("/deposit")
	  public ResponseEntity<TransactionDto> deposit(@RequestParam LoginDto login, @RequestParam float amount) {
//		loginSrv.authorize(login);
	    return null;
	  }
	
	@PostMapping("/withdraw")
	  public ResponseEntity<TransactionDto> withdraw(@RequestParam LoginDto login, @RequestParam float amount) {
//		loginSrv.authorize(login);
	    return null;
	  }
	
	@PostMapping("/pay")
	  public ResponseEntity<TransactionDto> pay(@RequestParam LoginDto login, @RequestParam float amount, @RequestParam int recipientCardNumber) {
//		loginSrv.authorize(login);
	    return null;
	  }
	
}
