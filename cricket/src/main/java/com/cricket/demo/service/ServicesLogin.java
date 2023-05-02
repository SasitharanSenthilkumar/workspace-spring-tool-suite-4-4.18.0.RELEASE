package com.cricket.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.demo.model.ModelLogin;
import com.cricket.demo.repository.RepoLogin;

@Service
	public class ServicesLogin {
		

			@Autowired
			private RepoLogin repository;
			
			public String checkLogin(String uname, String pwd) {
			    ModelLogin user = repository.findByuname(uname);
			    if (user == null) {
			      return "User Not Found";
			    }
			    else{
			    	if(user.getPwd().equals(pwd)) {	    		
			    		return"Login Succesfull"; 
			    	}
			    	else {
			    		return "Login Failed";
			    	}
			    }
			}
			public ModelLogin addUser(ModelLogin game) {
				return repository.save(game);
			}
			public List<ModelLogin> getUser()
			{
				return repository.findAll();
			}

}
