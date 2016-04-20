package test;

import com.goit.rectanglemethod.ConvertFunctionToRPN;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.experimental.theories.internal.Assignments;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created by Mykhailenko Svitlana on 19.04.2016.
 */
@RunWith(value = Parameterized.class)
public class ConvertFunctionToRPNTest {
    final ConvertFunctionToRPN convertFunctionToRPN = new ConvertFunctionToRPN();
    private String expression;
    private String expectedExpression;

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"sin(x)", "x sin"},
                {"l","l"},
                {"1/sin(x)^2","1 / x 2 ^ sin"}
        }
        );

    }

    public ConvertFunctionToRPNTest(String expression, String expectedExpression) {
        this.expression = expression;
        this.expectedExpression = expectedExpression;
    }

    @Test
    public void conversionToRPN() throws Exception {
        Assert.assertEquals(convertFunctionToRPN.conversionToRPN(expression, convertFunctionToRPN.OPERATORS), expectedExpression);
    }

}
