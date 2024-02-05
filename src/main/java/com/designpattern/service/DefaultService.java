package com.designpattern.service;

import com.designpattern.utils.Constants;
import org.springframework.stereotype.Service;

@Service(Constants.DEFAULT)
public class DefaultService implements IProcessor {
    @Override
    public String getCompanyDetails(String carName) {
        return Constants.INVALID_SERVICE;
    }
}
