package com.cricket.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.demo.model.CricketModel;

@Repository
public interface CricketRepository extends JpaRepository<CricketModel,Integer>{
	 List<CricketModel> findByNameStartingWith(String prefix);
	 List<CricketModel> findByNameEndingWith(String suffix);
	 List<CricketModel> findByName(String name);

}
