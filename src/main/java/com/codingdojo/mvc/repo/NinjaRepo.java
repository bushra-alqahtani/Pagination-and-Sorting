package com.codingdojo.mvc.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.model.Ninja;



@Repository
public interface NinjaRepo extends CrudRepository <Ninja,Long> , PagingAndSortingRepository<Ninja,Long> {
	
	List<Ninja> findAll();

}