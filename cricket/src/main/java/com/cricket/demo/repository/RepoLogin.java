package com.cricket.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.demo.model.ModelLogin;

public interface RepoLogin extends JpaRepository<ModelLogin, Integer> {

	ModelLogin findByuname(String uname);
}
