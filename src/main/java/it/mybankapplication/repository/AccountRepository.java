package it.mybankapplication.repository;

import org.springframework.data.repository.CrudRepository;

import it.mybankapplication.entity.Account;

public interface AccountRepository extends CrudRepository<Account, Integer> {

}
