package com.codingdojo.mvc.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.model.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo,Long>{
	
	List<Dojo> findAll();

}