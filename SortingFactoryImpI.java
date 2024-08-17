package Strategy;

public class SortingFactoryImpI implements AbstractSortingFactory{
    @Override
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
