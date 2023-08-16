package it.mybankapplication.repository;

import org.springframework.data.repository.CrudRepository;

import it.mybankapplication.entity.Card;

public interface CardRepository extends CrudRepository<Card, Integer> {

}