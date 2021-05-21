package com.example.weatherapi.prediction;

import java.util.List;

import org.springframework.Service;

@Service
public class PollutantPredictionService implements PredictionService{

    private final double x[] = new double[74];

    PollutantPredictionService(){
        this.x = x;
    }

    protected PollutantPredictionService(final double x[]){
        this.x = x; 
    }

    @Override
    public float predict() {

        return null;
        
    }
}