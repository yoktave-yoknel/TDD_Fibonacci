package fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    @Test
    public void testFibonacci() {
        int cases[][] = { { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 } };
        for (int i = 0; i < cases.length; i++)
            assertEquals(cases[i][1], fib(cases[i][0]));
    }
}
