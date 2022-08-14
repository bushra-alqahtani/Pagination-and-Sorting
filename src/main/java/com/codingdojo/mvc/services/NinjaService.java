package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.codingdojo.mvc.model.Ninja;
import com.codingdojo.mvc.repo.NinjaRepo;



@Service
@Transactional
public class NinjaService {
	@Autowired
	private NinjaRepo ninjaRepo;
	private static final int PAGE_SIZE = 3;
	
	//==================Find By Id ===============================================
	public Ninja findNinja(Long id) {
		
		Optional<Ninja> foundNinja = ninjaRepo.findById(id);
		if(foundNinja.isPresent()) {
			return foundNinja.get();
		}
		return null;
	}
	
	//====================List all ==============================================
	public List<Ninja> findAllNinjas(){
		return ninjaRepo.findAll();
	}

	//====================Pages====================================================
	public Page<Ninja> ninjasPerPage(int pageNumber) {
        // get all the ninjas page and sort them in ascending order the last name property
        PageRequest pageRequest = PageRequest.of(pageNumber, PAGE_SIZE, Sort.Direction.ASC, "lastName");
        return ninjaRepo.findAll(pageRequest);
    }
	

}