package Strategy;

public interface AbstractSortingFactory {
    SortingStrategy createSortingStrategy(String type);
}
