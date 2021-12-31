package com.wissal.enseignants.service;

import java.util.List;

import com.wissal.enseignants.entities.Departement;

public interface DepartementService {
	Departement saveDepartement(Departement dep);
	Departement updateDepartement(Departement dep);
	void deleteDepartement(Departement dep);
	void deleteDepartementById(Long id);
	Departement getDepartement(Long id);
	List<Departement> getAllDepartements();
}
