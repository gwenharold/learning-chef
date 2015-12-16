package com.autencio.learning.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResults;
import org.springframework.data.geo.Point;
import org.springframework.data.repository.CrudRepository;

import com.autencio.learning.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

	List<Customer> findByLastName(String lastname, Sort sort);
	
	GeoResults<Customer> findByAddressLocationNear(Point point, Distance distance);
}
