package com.wissal.enseignants.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wissal.enseignants.entities.Departement;

@RepositoryRestResource(path ="rest")
public interface DepartementRepository extends JpaRepository<Departement, Long> {
	//List<Departement> findByNomDepartement(String nom);

}
