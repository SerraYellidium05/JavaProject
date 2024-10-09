package Strategy.Main;
import java.util.Arrays;
import Strategy.SortingStrategy;
import Strategy.AbstractSortingFactory.AbstractSortingFactory;
import Strategy.SortingFactoryImpI.SortingFactoryImpI;
public class Main {

	public static void main(String[] args) {
		AbstractSortingFactory sortingFactory = new SortingFactoryImpI();

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
