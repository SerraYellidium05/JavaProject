package Strategy.AbstractSortingFactory;
import Strategy.SortingStrategy;
public interface AbstractSortingFactory {
	SortingStrategy createSortingStrategy(String type);
}
