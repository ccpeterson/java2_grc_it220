package random;

import java.util.Date;
import java.util.Random;

public class nextBooleanTest
{
    public static void main(String[] args)
    {
        // Get the current time.
        Date date = new Date();
        long time = date.getTime();

        // Initialize the random number generator using the
        // time from above.
        Random r = new Random(time);

        // Generate 10 random Boolean values.
        for (int i = 0; i < 20; i++)
        {
            System.out.println(r.nextBoolean());
        }
    }
}
