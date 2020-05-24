package main;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CompetitiveCodingTest {
    @Test
    public void testFindUnique(){
        int [] arr = {1, 2, 2, 3, 3};
        assertEquals(1, FindingUnique.findUnique(arr));
    }

    @Test
    public void testPairSumZero(){
        int [] arr = {1, 2, 3, -2, -2};
        PairSumZero.PairSum(arr, arr.length);
        /*
        * expected output
        * -2 2
        * -2 2
        * */
    }
}