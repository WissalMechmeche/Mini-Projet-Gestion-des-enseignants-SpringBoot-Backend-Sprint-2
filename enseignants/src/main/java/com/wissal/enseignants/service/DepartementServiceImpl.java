package com.wissal.enseignants.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissal.enseignants.entities.Departement;
import com.wissal.enseignants.repos.DepartementRepository;

@Service
public class DepartementServiceImpl implements DepartementService {
	
	@Autowired
	DepartementRepository departementRepository ;

	@Override
	public Departement saveDepartement(Departement dep) {
		return departementRepository.save(dep);
	}

	@Override
	public Departement updateDepartement(Departement dep) {
		return departementRepository.save(dep);
	}

	@Override
	public void deleteDepartement(Departement dep) {
		departementRepository.delete(dep);	
	}

	@Override
	public void deleteDepartementById(Long id) {
		departementRepository.deleteById(id);	
	}

	@Override
	public Departement getDepartement(Long id) {
		return departementRepository.findById(id).get();
	}

	@Override
	public List<Departement> getAllDepartements() {
		return departementRepository.findAll();
	}

}
