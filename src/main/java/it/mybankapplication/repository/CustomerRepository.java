package it.mybankapplication.repository;

import org.springframework.data.repository.CrudRepository;

import it.mybankapplication.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	Customer findByEmail(String email);

}
