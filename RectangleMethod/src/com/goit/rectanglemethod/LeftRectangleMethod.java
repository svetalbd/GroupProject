package com.goit.rectanglemethod;

/**
 * Created by Сергей on 12.04.2016.
 */
public class LeftRectangleMethod extends AbstractRectangleMethod {

    public LeftRectangleMethod(String expression) {
        super(expression);
    }

    public double leftCornerRM (Double lowerBorder, Double upperBorder, Integer countOfSteps) {
        Double result;
        Double deltaX = (upperBorder - lowerBorder) / countOfSteps;
        Double[] array = new Double[countOfSteps];
        array[0] = lowerBorder;
        result = deltaX * convertFunctionToRPN.calculateIntegral(expression, lowerBorder);
        for (int i = 1; i<=countOfSteps-1; i++){
            array[i] = array[i-1]+ deltaX;
            result = result + deltaX * convertFunctionToRPN.calculateIntegral(expression, array[i]);

        }
        return result;
    }
}
