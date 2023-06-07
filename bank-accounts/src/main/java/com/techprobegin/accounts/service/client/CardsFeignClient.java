package com.techprobegin.accounts.service.client;

import com.techprobegin.accounts.model.Cards;
import com.techprobegin.accounts.model.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="bank-cards",url="http://localhost:9000/")
public interface CardsFeignClient {
	@RequestMapping(method = RequestMethod.POST, value = "my-cards", consumes = "application/json")
	List<Cards> getCardDetails(@RequestBody Customer customer);
}
