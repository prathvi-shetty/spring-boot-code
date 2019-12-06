package com.example.springwebApplicationjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.springwebApplicationjpa.model.Phone;

public interface PhoneRepo extends JpaRepository<Phone, Integer> {

	List<Phone> findBySim(String sim);
	
	@Query("from Phone where sim =?1 order by name")
	List<Phone> findBySimSorted(String sim);
}
