package com.designpattern.service;


import com.designpattern.utils.Constants;
import org.springframework.stereotype.Service;

@Service(Constants.FORD_MUSTANG)
public class FordService implements IProcessor {


    @Override
    public String getCompanyDetails(String carName) {
        return Constants.FORD;
    }
}
