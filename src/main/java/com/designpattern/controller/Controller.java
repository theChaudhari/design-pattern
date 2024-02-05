package com.designpattern.controller;

import com.designpattern.service.IProcessor;
import com.designpattern.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/strategy-pattern")
public class Controller {

    @Autowired
    private Map<String, IProcessor> getService;


    @PostMapping("/{carName}")
    public String getCompanyDetails(@PathVariable String carName){
       return getService.getOrDefault(carName,getService.get(Constants.DEFAULT)).getCompanyDetails(carName);
    }





}
