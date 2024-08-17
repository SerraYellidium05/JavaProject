package tdd;
import Strategy;
import Strategy.BubbleSort;
import Strategy.MergeSort;
import Strategy.QuickSort;
import Strategy.AbstractSortingFactory;
import Strategy.SortingFactoryImpl; 
import Strategy.SortingStrategy;  
import jdk.jfr.Timestamp;
public class Clienttest {
    sortingFactory= new SortingFactoryImpl();
}

@Test 
void testQuickSort() {
    int[] numbers = {2,5,7,134,34,55,77,88,90};
    SortingStrategy strategy = sortingFactory.createSortingStrategy("quick");
    strategy.sort(numbers);
    assertArrayEquals(new int[]{2,5,7,34,55,77,88,90,134}, numbers);
}

@Test
void testMergeSort() {
    int[] numbers = {34,56,122,465,321,67,22,33,567};
    SortingStrategy strategy = sortingFactory.createSortingStrategy("merge");
    strategy.sort(numbers);
    assertArrayEquals(new int[]{22,34,56,67,122,321,465,567}, numbers);
}

@Test
    void testQuickSort() {
        int[] numbers = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        SortingStrategy strategy = sortingFactory.createSortingStrategy("quick");
        strategy.sort(numbers);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9}, numbers);
    }

    @Test
    void testInvalidSortingStrategy() {
        int[] numbers = {10, 20, 30};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sortingFactory.createSortingStrategy("invalid");
        });
        assertEquals("Invalid sorting strategy: invalid", exception.getMessage());
    }

    @Test
    void testEmptyArray() {
        int[] numbers = {};
        SortingStrategy strategy = sortingFactory.createSortingStrategy("quick");
        strategy.sort(numbers);
        assertArrayEquals(new int[]{}, numbers);
    }

    @Test
    void testSingleElementArray() {
        int[] numbers = {42};
        SortingStrategy strategy = sortingFactory.createSortingStrategy("merge");
        strategy.sort(numbers);
        assertArrayEquals(new int[]{42}, numbers);
    }

