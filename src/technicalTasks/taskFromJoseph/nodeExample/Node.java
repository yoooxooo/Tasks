package technicalTasks.taskFromJoseph.nodeExample;

public class Node <T> {
    private T data;
    private Node <T> previous;
    private Node <T> next;


    public Node (T data, Node <T> previousNode) {
        previous = previousNode;
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrevious(Node <T> previous) {
        this.previous = previous;
    }

    public void setNext(Node <T> next) {
        this.next = next;
    }

    public Node <T> getNextNode() {
        return next;
    }

    public Node <T> getPreviousNode() {
        return previous;
    }

    public T getData() {
        return data;
    }

}
