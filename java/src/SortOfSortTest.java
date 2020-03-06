import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {
    // Generic Test to ensure that the code runs properly :)
    @Test
    public void sortOfSort() {
        int[] A = {1,4,3,17,44,6};
        int[] B = {6,4,1,3,17,44};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(A,B);
    }
    // It passed

    // Generic Test to see if my code can handle odd length areas properly
    @Test
    public void sortOfSort2() {
        int[] A = {2,8,33,91,4,-1,5};
        int[] B = {8,5,-1,2,4,33,91};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(A,B);
    }
    // It passed

    // Fairly Generic Test, but due to how i set up my base case, this is to test if there is any issues when the array is smaller then 4 and even
    @Test
    public void sortOfSort3() {
        int[] A = {8,4};
        int[] B = {4,8};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(A,B);
    }
    // It passed

    //Same as the previous test, but smaller then 4 and odd
    @Test
    public void sortOfSort4() {
        int[] A = {1,9,8};
        int[] B = {1,8,9};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(A,B);
    }
    // It passed

    //Simple Test to see if the code bugs out or breaks when encountering duplicates
    @Test
    public void sortOfSort5() {
        int[] A = {13,4,23,23,8,12};
        int[] B = {13,12,4,8,23,23};
        SortOfSort test = new SortOfSort();
        test.sortOfSort(A);
        assertArrayEquals(A,B);
    }
    // It passed
}