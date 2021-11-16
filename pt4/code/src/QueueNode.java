public class QueueNode<T> {

    private T element;
    private QueueNode next;

    public QueueNode(T object) {
        this.element = object;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T object) {
        this.element = object;
    }

    public QueueNode getNext() {
        return next;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        QueueNode<?> queueNode = (QueueNode<?>) o;
        return this.getElement().equals(queueNode.getElement());
    }

}
