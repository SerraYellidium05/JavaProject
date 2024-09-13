package Strategy.MergeSort;
import Strategy.SortingStrategy;
public class MergeSort implements SortingStrategy {
    public void sort(int[] numbers) {
        mergeSort(numbers, 0, numbers.length - 1);
        System.out.println("Merge Sort.");
    }

    private void mergeSort(int[] numbers, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(numbers, left, mid);
            mergeSort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }
    }

    private void merge(int[] numbers, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(numbers, left, L, 0, n1);
        System.arraycopy(numbers, mid + 1, R, 0, n2);

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                numbers[k] = L[i];
                i++;
            } else {
                numbers[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            numbers[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            numbers[k] = R[j];
            j++;
            k++;
        }
    }
}

