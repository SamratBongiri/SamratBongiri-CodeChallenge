import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    Solution solution;
    public SolutionTest(){}

    @Before
    public void setUp()
    {
        solution = new Solution();
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void test0()
    {
        String[] input = {"101", "101101101", "1111101", "00000", "11111111111111111111111111111111111111111111111111",
                "10110001101000101011110000101110110001010", "10110001101000101011110000101110110001011", "111011100110101100101110111",
                "001000", "000001", "110111110101111000011", "10111", "1011", "1011000110100010101111000010111011000101"};
        int[] result = {1, 3, 1, -1, 50, -1, 2, 5, -1, -1, 3, 3, 2, 1};
        assertArrayEquals(result, solution.getMin(input));
    }



}
