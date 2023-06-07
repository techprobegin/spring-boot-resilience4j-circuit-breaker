/**
 * 
 */
package com.techprobegin.loans.controller;

import com.techprobegin.loans.config.LoansServiceConfig;
import com.techprobegin.loans.model.Customer;
import com.techprobegin.loans.model.Loans;
import com.techprobegin.loans.repository.LoansRepository;
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
public class LoansController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoansController.class);

	@Autowired
	private LoansRepository loansRepository;
	
	@Autowired
    LoansServiceConfig loansConfig;

	@PostMapping("/my-loans")
	public List<Loans> getLoansDetails(@RequestBody Customer customer) {
		logger.info("getLoansDetails() method started");
		return loansRepository.findByCustomerIdOrderByStartDtDesc(customer.getCustomerId()).orElse(null);
	}

}
