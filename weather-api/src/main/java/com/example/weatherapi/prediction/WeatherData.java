package prediction;

import lombok.*;
import org.json.simple.JSONObject;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class WeatherData{

    // class variables
    String api;

    // class constructor
    public WeatherData()

    // call api
    public JSONObject callWeatherApi() {

        // declare the weather object
        JSONObject weatherJsonObj = new JSONObject();

        // make call to api

        

        return weatherJsonObj;
    }

    
   
}