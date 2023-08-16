package it.mybankapplication.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mybankapplication.repository.CustomerRepository;
import model.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository cusRep;
	
	@Override
	public boolean isCustomerPresent(String email) {
		return Optional.ofNullable(cusRep.findByEmail(email)).isPresent();
	}

}
