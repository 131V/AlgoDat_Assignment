public class LinkedQueue implements Queue{
    private SinglyLinkedList list;

    public LinkedQueue(){
        this.list = new SinglyLinkedList();
    }

    @Override
    public void enqueue(Object value){
        list.append(value);
    }

    @Override
    public Object dequeue(){
        if (isEmpty()){
            System.out.println("Queue Empty!");
            return null;
        }
        Node removed = list.removeFirst();
        if (removed != null){
            return removed.getValue();
        } else {
            return null;
        }
    }

    @Override
    public Object peek(){
        if (isEmpty()){
            return null;
        }
        Node frontNode = list.getHead();
        if (frontNode != null){
            return frontNode.getValue();
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public int size(){
        return list.getLength();
    }

    public void printQueue(){
        System.out.print("Queue (front -> rear): ");
        list.printList();
    }
}