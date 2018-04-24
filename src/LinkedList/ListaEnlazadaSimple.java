package LinkedList;

/**
 *
 * @author david
 */
public class ListaEnlazadaSimple {
    private Nodo head;
    private int size;
    
    /**
     * Constructor
     * SimpleLinkedList
     */
    public ListaEnlazadaSimple(){
        this.head = null;
        this.size = 0;
    }

    public Nodo getFlag(){
        return this.head;
    }

    public int getSize(){
        return this.size;
    }
    
    public int getData(int pos){
        Nodo current = head;
        int count = 1;
        while(count <= this.size){
            if(count == pos){
                break;
            }
            current = current.getNext();
        }
        return current.getData();
    }
    
    public void insertEnd(int data){
        Nodo nuevoNodo = new Nodo(data, null);
        if(head == null){
            head = nuevoNodo;
        }
        else{
            Nodo current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(nuevoNodo);
        }
        size++;
        nuevoNodo.setPos(size);
    }
}
