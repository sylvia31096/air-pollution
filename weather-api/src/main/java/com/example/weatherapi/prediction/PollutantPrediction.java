package prediction;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PollutantPrediction{

    // class variables
    double xValues[] = new double[74];

    // class constructor
    public Challenge(double[] xValues){
        this.xValues = xValues;
    }

    // get class variable
    public double[] getXValues(){
        return this.xValues;
    }

    // equals

    // hashCode

    // toString

    // get model

    // return target
}