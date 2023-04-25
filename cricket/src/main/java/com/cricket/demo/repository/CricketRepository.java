package com.cricket.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.demo.model.CricketModel;

@Repository
public interface CricketRepository extends JpaRepository<CricketModel,Integer>{

}
