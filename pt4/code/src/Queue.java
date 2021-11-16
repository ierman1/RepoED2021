public class Queue<T> implements IQueue<T> {

    private QueueNode<T> head;
    private QueueNode<T> tail;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void insert(T x) {
        QueueNode<T> newElem = new QueueNode<>(x);

        if (this.isEmpty()) {
            this.head = newElem;
        } else {
            this.tail.setNext(newElem);
        }

        this.tail = newElem;
    }

    public T extract() {
        if (this.isEmpty())
            return null;

        T result = this.head.getElement();

        if (this.head.equals(this.tail)) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
        }

        return result;
    }

}
