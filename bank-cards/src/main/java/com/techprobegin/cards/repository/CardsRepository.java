package com.techprobegin.cards.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techprobegin.cards.model.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {
	Optional<List<Cards>> findByCustomerId(int customerId);

}
