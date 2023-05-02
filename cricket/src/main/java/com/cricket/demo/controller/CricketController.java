package com.cricket.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.demo.model.CricketModel;
import com.cricket.demo.service.CricketService;
@RestController
public class CricketController {
   @Autowired
   CricketService cricksService;
   @GetMapping("/Cricket")
   public List<CricketModel> cricketValues()
   {
	   List<CricketModel> a = cricksService.getAllCricket();
	   return a;
	   
   }
   @PostMapping(value="/saveCricket")
   public CricketModel saveCricket(@RequestBody CricketModel c )
   {
	   return cricksService.saveCricket(c);
   }
   @PutMapping("/updateCricket")
   public CricketModel updateCricket(@RequestBody CricketModel c)
   {
	   return cricksService.updateCricket(c);
   }
   @DeleteMapping(value="/deleteCricket/{number}")
   public void deleteCricket(@PathVariable("number") int number)
   {
	   cricksService.deleteCricket(number);
   }
   @GetMapping(value="/getCricket/{number}")
   public Optional<CricketModel> getCricket(@PathVariable("number") int num)
   {
	   return cricksService.getAllCricket(num);
   }
   @GetMapping(value="/sort/{name}")
   public List<CricketModel> sort(@PathVariable("name") String name)
   {
    return cricksService.sort(name);
   }
   @GetMapping(value="/paginate/{offset}/{pageSize}")
   public List<CricketModel> paginate(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
   {
    return cricksService.paginate(offset, pageSize);
   }
   @GetMapping(value="/paginAndSortingDetol/{offset}/{pageSize}/{name}")
   public List<CricketModel> paginateAndSorting(@PathVariable("offset") int offset,@PathVariable("pageSize")int pageSize,@PathVariable("name") String name)
   {
    return cricksService.paginateAndSorting(offset,pageSize,name);
   }
   @GetMapping("/fetchPrefix")
   public List<CricketModel> fetchCricketByNamePrefix(@RequestParam String prefix)
   {
    return cricksService.fetchCricketByNamePrefix(prefix);
   }
   @GetMapping("/fetchSuffix")
   public List<CricketModel> fetchCricketByNameSuffix(@RequestParam String suffix)
   {
    return cricksService.fetchCricketByNameSuffix(suffix);
   }

}
