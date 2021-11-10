public interface IQueue<T> {

    public boolean isEmpty();
    public void insert(T x);
    public T extract();

}
