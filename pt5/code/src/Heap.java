import java.util.Arrays;
import java.util.Comparator;

public class Heap<T> {

    private static final int DEFAULT_CAPACITY = 20;

    private int currentSize;
    private T[] vector;
    private CustomComparator<? super T> cmp;

    public Heap() {
        this.currentSize = 0;
        this.vector = (T[]) new Object[DEFAULT_CAPACITY + 1];
        cmp = new CustomComparator();
    }

    public boolean add(T x) {

        if (currentSize == DEFAULT_CAPACITY)
            return false;

        currentSize++;
        vector[currentSize] = x;

        if (currentSize != 1 && cmp.compare(x, vector[currentSize / 2]) < 0) {

            for (int j = currentSize; j >= 0; j /= 2) {
                if (cmp.compare(vector[j], vector[j / 2]) >= 0) {
                    break;
                }

                int itTmp = j / 2;
                vector[j] = vector[itTmp];
                vector[itTmp] = x;
            }

        }

        return true;
    }

    public T remove() {
        T minItem = vector[1];
        vector[1] = vector[currentSize];
        vector[currentSize] = null;
        currentSize--;
        percolateDown(1);
        return minItem;
    }

    private void percolateDown(int hole) {
        // Se supera la capacidad máxima
        if (hole * 2 > DEFAULT_CAPACITY || hole * 2 + 1 > DEFAULT_CAPACITY)
            return;

        // No tiene hijos
        if (vector[hole * 2] == null || vector[hole * 2 + 1] == null)
            return;

        // Sus hijos son más grandes
        if (cmp.compare(vector[hole], vector[hole * 2]) <= 0 && cmp.compare(vector[hole], vector[hole * 2 + 1]) <= 0)
            return;

        T tmp = vector[hole];
        int newHole = (cmp.compare(vector[hole * 2], vector[hole * 2 + 1]) <= 0 ? hole * 2 : hole * 2 + 1);
        vector[hole] = vector[newHole];
        vector[newHole] = tmp;

        percolateDown(newHole);
    }

    @Override
    public String toString() {
        return "Heap{" +
                "vector=" + Arrays.toString(vector) +
                '}';
    }
}
