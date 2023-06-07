/**
 * 
 */
package com.techprobegin.cards.controller;

import com.techprobegin.cards.config.CardsServiceConfig;
import com.techprobegin.cards.model.Cards;
import com.techprobegin.cards.model.Customer;
import com.techprobegin.cards.repository.CardsRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tech Pro Begin
 *
 */

@RestController
@Slf4j
public class CardsController {
	
	@Autowired
	private CardsRepository cardsRepository;
	
	@Autowired
	CardsServiceConfig cardsConfig;

	@PostMapping("/my-cards")
	public List<Cards> getCardDetails(@RequestBody Customer customer) {
		log.info("getCardDetails() method started");
		return cardsRepository.findByCustomerId(customer.getCustomerId()).orElse(null);
	}

}
