package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.model.Dojo;
import com.codingdojo.mvc.repo.DojoRepo;


@Service
public class DojoService {

	private final DojoRepo dojoRepo ;


	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}

	// =======================Find By Id ===================================
	public Dojo findDojo(Long id) {
		Optional<Dojo> foundDojo = dojoRepo.findById(id);
		if(foundDojo.isPresent()) {
			return foundDojo.get();
		}
		return null;
	}
	
	//========================List All =======================================
	public List<Dojo> findAllDojos(){
		return dojoRepo.findAll();
	}
	

}