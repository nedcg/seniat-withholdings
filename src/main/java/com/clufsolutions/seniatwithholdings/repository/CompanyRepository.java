package com.clufsolutions.seniatwithholdings.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.clufsolutions.seniatwithholdings.domain.Company;

@RepositoryRestResource
public interface CompanyRepository extends
		CrudRepository<Company, Long> {

}
