package com.teraret.career.career.controller;

import com.teraret.career.career.dao.CareerDao;
import com.teraret.career.career.model.Career;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CareerController {

  @Autowired
  private CareerDao careerDao;

  @GetMapping("/career")
  public Iterable<Career> listCareer(){
    return  careerDao.findAll();
  }

  @PostMapping("/career")
  public Career createCareer(@RequestBody Career career){
    Career careersave = new Career();
    careersave.setName(career.getName());
    careersave.setJobcode(career.getJobcode());
    careersave.setDescription(career.getDescription());
    careersave.setLocation(career.getLocation());
    return careerDao.save(careersave);
  }



}
