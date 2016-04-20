package test;

import com.goit.rectanglemethod.LowerUpperLimits;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Mykhailenko Svitlana on 19.04.2016.
 */
@RunWith(value = Parameterized.class)
public class StepsLimitsTest {
    final LowerUpperLimits lowerUpperLimits = new LowerUpperLimits();
    private Double lowerLimit;
    private Double upperLimit;
    private Integer countOfSteps;
    private Boolean expectedResult;

    public StepsLimitsTest(Double lowerLimit, Double upperLimit, Integer countOfSteps, Boolean expectedResult) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.countOfSteps = countOfSteps;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0d, 1d, 1000000, false},
                {0d, 1d, 100000, false},
                {0d, 1d, 99999, true},
                {0d, 1d, 10000, true},
                {0d, 1d, 20, true}
        }
        );

    }

    @Test
    public void testCorrectCountOfStepsInput() throws Exception {
        Assert.assertEquals(lowerUpperLimits.correctCountOfStepsInput(lowerLimit, upperLimit, countOfSteps), expectedResult);
    }

}
