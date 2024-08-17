package Strategy;
/*import Strategy.BubbleSort;
import Strategy.MergeSort;
import Strategy.QuickSort;
import Strategy.AbstractSortingFactory;
import Strategy.SortingFactoryImpl; 
import Strategy.SortingStrategy;  
*/
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        AbstractSortingFactory sortingFactory = new SortingFactoryImpl();  // Corrected class name

        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        SortingStrategy strategy = sortingFactory.createSortingStrategy("quick");
        strategy.sort(numbers);

        strategy = sortingFactory.createSortingStrategy("bubble");
        strategy.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        strategy = sortingFactory.createSortingStrategy("merge");
        strategy.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}