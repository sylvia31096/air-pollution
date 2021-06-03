package prediction;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PollutantPrediction{

    // class variables
    double xWeather[] = new double[6];
    double xPollutants[] = new double[60];

    // class constructor
    public PollutantPrediction(double[] x){
        this.x = x;
    }

    // get y, the prediction
    public float predict(){
        return null;
    }

    
   
}