package KI35.Skipar.Lab6;

import static java.lang.Math.*;

/**
 *  Class <code>Equations</code> implements method for (tg(x)^2) expression
 *  calculation
 *  @author Illia
 *  @version 1.0
 */
public class Equations {
    /**
     * Method calculate the (tg(x)^2) expression
     * @param deg angle in degrees
     * @return expression result
     * @throws ArithmeticException check correct input
     */
    public double calculate(double deg) throws ArithmeticException
    {
        double res = 0, rad;
        rad = toRadians(deg);

        try {
            res = tan(rad)* tan(rad);
            if ((int)(deg/90)%2!=0) throw new ArithmeticException();
        }
        catch (ArithmeticException e)
        {
            throw new ArithmeticException("Invalid X");
        }

        return res;
    }
}