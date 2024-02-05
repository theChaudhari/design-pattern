package com.designpattern.service;

import com.designpattern.utils.Constants;
import org.springframework.stereotype.Service;

@Service(Constants.MERCEDES_G_WAGEN)
public class MercedesService implements IProcessor{
    @Override
    public String getCompanyDetails(String carName) {
        return Constants.MERCEDES;
    }
}
