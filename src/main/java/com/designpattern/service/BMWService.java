package com.designpattern.service;

import com.designpattern.utils.Constants;
import org.springframework.stereotype.Service;

@Service(Constants.BMW_X7)
public class BMWService implements IProcessor{
    @Override
    public String getCompanyDetails(String carName) {
        return Constants.BMW;
    }
}
