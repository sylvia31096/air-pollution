package prediction;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PollutantPrediction{

    // class variables
    double x[] = new double[74];

    // class constructor
    public PollutantPrediction(double[] x){
        this.x = x;
    }

    // get y, the prediction
    public float predict(){
        return null;
    }

    
   
}