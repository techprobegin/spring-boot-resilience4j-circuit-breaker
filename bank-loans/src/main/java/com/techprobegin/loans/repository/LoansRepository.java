package com.techprobegin.loans.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techprobegin.loans.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {
	Optional<List<Loans>> findByCustomerIdOrderByStartDtDesc(int customerId);

}
