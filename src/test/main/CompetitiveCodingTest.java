package main;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

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

    @Test
    public void testLongestConsecutiveSeq(){
        Integer [] an = {4, 5, 6, 7, 8};
        int [] arr = {11, 13, 14, 5, 4, 12, 6, 8, 10, 7};
        ArrayList<Integer> ans = new ArrayList<>(Arrays.asList(an));
        assertTrue(LongestConsecutiveSeq.longestConsecutiveSeq(arr).equals(ans));
    }

    @Test
    public void testAggressiveCows(){
        int stall = 5;
        int cows = 3;
        int []pos = {1, 2, 8, 4, 9};
        assertEquals(3, AggressiveCows.findDistance(stall, cows, pos));
    }
}