package it.mybankapplication.repository;

import org.springframework.data.repository.CrudRepository;

import it.mybankapplication.entity.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}