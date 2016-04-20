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
public class LowerUpperLimitsTest {
    final LowerUpperLimits lowerUpperLimits = new LowerUpperLimits();
    private Double lowerLimit;
    private Double upperLimit;
    private Boolean expectedResult;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object [] []{
                {1d, 4d, true},
                {0d, 0d, true},
                {5d, -2d, false}
        }
        );

    }

    public LowerUpperLimitsTest(Double lowerLimit, Double upperLimit, Boolean expectedResult) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.expectedResult = expectedResult;
    }

    @Test
    public void correctBorderInput() throws Exception {
        Assert.assertEquals(lowerUpperLimits.correctBorderInput(lowerLimit, upperLimit), expectedResult);
    }

}
