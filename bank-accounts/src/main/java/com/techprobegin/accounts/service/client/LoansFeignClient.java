package com.techprobegin.accounts.service.client;

import com.techprobegin.accounts.model.Customer;
import com.techprobegin.accounts.model.Loans;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="bank-loans",url = "http://localhost:8090/")
public interface LoansFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "my-loans", consumes = "application/json")
	List<Loans>  getLoansDetails(@RequestBody Customer customer);
}
