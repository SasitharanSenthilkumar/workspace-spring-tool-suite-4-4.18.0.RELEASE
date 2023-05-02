package com.cricket.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.demo.model.CricketModel;
import com.cricket.demo.repository.CricketRepository;

@Service
public class CricketService {
	@Autowired

 CricketRepository rpos;
	public List<CricketModel> getAllCricket()
	{
		List<CricketModel> cricksList = rpos.findAll();
		return cricksList;
	}
	public CricketModel saveCricket(CricketModel c)
	{
		return rpos.save(c);
	}
	public CricketModel updateCricket(CricketModel c)
	{
		return rpos.save(c);
	}
	public void deleteCricket(int number)
	{
		rpos.deleteById(number);
	}
	public CricketModel getCricket(int number)
	{
		CricketModel c = rpos.findById(number).get();
		return c;
	}
	public Optional<CricketModel> getAllCricket(int num)
	{
		return rpos.findById(num);
	}

}
