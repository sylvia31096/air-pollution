package com.example.weatherapi.prediction;

public interface PredictionService {

    /*
        Given a list of x variables, returns a float variable, y from a prediction model 
    */

    float predict();
}