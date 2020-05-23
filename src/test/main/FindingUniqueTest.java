package main;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FindingUniqueTest {
    @Test
    public void testFindUnique(){
        int [] arr = {1, 2, 3};
        assertEquals(0, FindingUnique.findUnique(arr));
    }
}