package TestDrivenDevelopment.MainTest;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import Strategy.SortingStrategy;
import Strategy.SortingFactoryImpI.SortingFactoryImpI;

public class MainTest {
	SortingFactory= new SortingFactoryImpl();
}

void testQuickSort1() {
	    int[] numbers = {2,5,7,134,34,55,77,88,90};
	    SortingStrategy strategy = SortingFactoryImpI.createSortingStrategy("quick");
	    strategy.sort(numbers);
	    assertArrayEquals(new int[]{2,5,7,34,55,77,88,90,134}, numbers);
	}
	void testMergeSort() {
	    int[] numbers = {34,56,122,465,321,67,22,33,567};
	    SortingStrategy strategy = SortingFactoryImpI.createSortingStrategy("merge");
	    strategy.sort(numbers);
	    assertArrayEquals(new int[]{22,34,56,67,122,321,465,567}, numbers);
	}

	    void testQuickSort() {
	        int[] numbers = {3, 7, 8, 5, 2, 1, 9, 5, 4};
	        SortingStrategy strategy = SortingFactoryImpI.createSortingStrategy("bubble");
	        strategy.sort(numbers);
	        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 5, 7, 8, 9}, numbers);
	    }
	    void testInvalidSortingStrategy() {
	        int[] numbers = {10, 20, 30};
	        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
	            sortingFactory.createSortingStrategy("invalid");
	        });
	        assertEquals("Invalid sorting strategy: invalid", exception.getMessage());
	    }

	    void testEmptyArray() {
	        int[] numbers = {};
	        SortingStrategy strategy = sortingFactory.createSortingStrategy("quick");
	        strategy.sort(numbers);
	        assertArrayEquals(new int[]{}, numbers);
	    }
	    void testSingleElementArray() {
	        int[] numbers = {42};
	        SortingStrategy strategy = sortingFactory.createSortingStrategy("merge");
	        strategy.sort(numbers);
	        assertArrayEquals(new int[]{42}, numbers);
	    }

