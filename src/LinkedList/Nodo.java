package LinkedList;

/**
 *
 * @author david
 */
public class Nodo {
    private Nodo prev;
    private Nodo next;
    private int data;
    private int pos;
    
    /**
     * Constructor Node
     * @param data : valor que contendra el nodo
     */
    public Nodo(int data){
        this.data = data;
    }
    
    /**
     * Constructor Node
     * @param data : valor que contendra el nodo
     * @param next : Referencia al siguiente nodo
     */
    public Nodo(int data, Nodo next){
        this.data = data;
        this.next = next;
    }
    
    /**
    * Constructor Node
    * @param data : valor que contendra el nodo
    * @param prev : Referencia al nodo anterior
    * @param next : Referencia al nodo siguiente
    */
    public Nodo(int data, Nodo prev, Nodo next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    
    /**
     * Setter, establece la referencia al nodo anterior
     * @param prev : Nodo anterior
     */
    public void setPrev(Nodo prev){
        this.prev = prev;
    }
    
    /**
     * Getter, retorna el nodo anterior
     * @return Node prev : nodo anterior
     */
    public Nodo getPrev(){
        return this.prev;
    }
    
    /**
     * Setter, establece la referencia al nodo siguiente
     * @param next : Nodo siguiente
     */
    public void setNext(Nodo next){
        this.next = next;
    }
    
    /**
     * Getter, retorna el nodo siguiente
     * @return Node next : Nodo siguiente
     */
    public Nodo getNext(){
        return this.next;
    }
     /**
      * Setter, establece la nave que almacenara el nodo
      * @param data : valor que contendra el nodo
      */
    public void setData(int data){
        this.data = data;
    }
     /**
      * Getter, retorna la nave almacenada en el nodo
      * @return int data : valor que contiene el nodo
      */
    public int getData(){
        return this.data;
    }
    
    /**
     * Getter, retorna la posicion del nodo.
     * @return int pos : posicion del nodo en la lista 
     */
    public int getPos(){
        return this.pos;
    }
    
    /**
     * Setter, establece la posicion del nodo en la lista
     * @param pos : el valor de posicion que tendra el nodo
     */
    public void setPos(int pos){
        this.pos = pos;
    }
}
