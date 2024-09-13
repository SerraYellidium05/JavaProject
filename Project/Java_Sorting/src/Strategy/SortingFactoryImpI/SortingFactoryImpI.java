package Strategy.SortingFactoryImpI;
import Strategy.SortingStrategy;
import Strategy.AbstractSortingFactory.AbstractSortingFactory;
import Strategy.MergeSort.MergeSort;
import Strategy.QuickSort.QuickSort;
import Strategy.bubblesort.BubbleSort;
public class SortingFactoryImpI implements AbstractSortingFactory{
    public SortingStrategy createSortingStrategy(String type){
        switch(type.toLowerCase()){
        case "bubble":
        return new BubbleSort();
        case "quick":
        return new QuickSort();
        case "merge":
        return new MergeSort();
        default:
        throw new IllegalArgumentException("Unknown sorting type:"+type);
        }
    }
}