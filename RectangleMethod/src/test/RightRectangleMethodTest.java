package test;

import com.goit.rectanglemethod.AbstractRectangleMethod;

/**
 * Created by ZahornyiAI on 19.04.2016.
 */
public class RightRectangleMethodTest extends AbstractRectangleMethod {
    public RightRectangleMethodTest(String expression) {
        super(expression);
    }

    public double rightCornerRM (Double lowerBorder, Double upperBorder, Integer countOfSteps) {

        Double result;
        Double deltaX = (upperBorder - lowerBorder) / countOfSteps;
        Double[] array = new Double[countOfSteps];
        array[0] = lowerBorder+deltaX;
        result = deltaX * convertFunctionToRPN.calculateIntegral(expression, array[0]);
        for (int i = 1; i<=countOfSteps-1; i++){
            array[i] = array[i-1]+ deltaX;
            result = result + deltaX * convertFunctionToRPN.calculateIntegral(expression, array[i]);

        }
        return result;
    }
}