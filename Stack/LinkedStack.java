public class LinkedStack implements Stack{
    private SinglyLinkedList list;

    public LinkedStack(){
        this.list = new SinglyLinkedList();
    }

    @Override
    public void push(Object value){
        list.prepend(value);
    }

    @Override
    public Object pop(){
        if (isEmpty()){
            System.out.println("Stack empty!");
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
        Node topNode = list.getHead();
        if (topNode != null){
            return topNode.getValue();
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

    public void printStack(){
        System.out.print("Stack (top -> bottom): ");
        list.printList();
    }
}