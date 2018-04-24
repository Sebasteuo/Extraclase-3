
import java.util.ArrayList;

/**
 * 
 * @author sebastianalba
 *
 */
public class abb {
 
    private class nodoArbol {
        private abb hd;
        private abb hi;
        private int dato;
 /**
  * 
  */
        private void nodoArbol(){
            hd = null;
            hi = null;
            dato = 0;
        }
    }
 
    public nodoArbol raiz;
 /**
  * 
  */
    public void abb(){
        nodoArbol raiz = new nodoArbol();
    }
/**
 *  
 * @return
 */
    public boolean esVacio(){
        return (raiz == null);
    }
/**
 *  Se crea un nodo, se establece punteros izquierdo y derecho a null, se guarda la información que llega al método en el nodo. Si el árbol está vacío, se apunta 
 *  raíz al nodo creado. Si no está vacío, dentro de una estructura repetitiva se va comparando info con la información del nodo, si info
 *  es mayor a la del nodo, se deciende por el subárbol derecho,en caso contrario, se deciende por el subárbol izquierdo. Cuando se encuentra un subárbol vacío, se inserta 
 *  el nodo en ese subárbol, para eso se lleva un puntero anterior en el while.
 * @param a
 */
    public void insertar(int a){
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.dato = a;
            nuevo.hd = new abb();
            nuevo.hi = new abb();
            raiz = nuevo;
        }
        else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato){
                (raiz.hi).insertar(a);
            }
            
        }
    }
/**
 *  En este método se recorre el árbol con preOrden, primero raíz, luego subárbol izquierdo y por último el subárbol derecho. 
 *  Se visita la raíz, se atraviesa el subárbol irzquierdo y luego se atraviesa el subárbol derecho.
 */
    public void preOrder(){
        if (!esVacio()) {
            System.out.print( raiz.dato + ", "  );
            raiz.hi.preOrder();
            raiz.hd.preOrder();
        }
    }
 /**
  * En este método se recorre el árbol con InOrden, primero subárbol izquierdo, luego la raíz
  * y de último el subárbol derecho.
  * Se atraviesa el subárbol izquierdo, se visita la raíz y luego se atraviesa el subárbol derecho.
  */
    public void inOrder(){
        if (!esVacio()) {
            raiz.hi.inOrder();
            System.out.print( raiz.dato + ", "  );
            raiz.hd.inOrder();
        }
    }
 /**
  * En este método se recorre el árbol en PostOrden primero el subárbol izquierdo, luego el subárbol derecho y de último la raíz.
  * Primero se atraviesa el subárbol izuierdo, luego el subárbol derecho y por último se visita la raíz
  */
    public void posOrder(){
        if (!esVacio()) {
            raiz.hi.posOrder();
            raiz.hd.posOrder();
            System.out.print( raiz.dato + ", "  );
 
        }
    }
 /**
  * 
  * @param a
  * @return
  */
    public abb buscar(int a){
        abb arbolito = null;
        if (!esVacio()) {
            if (a == raiz.dato) {
            return this;
            }
            else {
                if (a < raiz.dato) {
                    arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
    }

 /**
  * 
  * @param a
  * @return
  */
    public boolean existe(int a){
    if (!esVacio()) {
            if (a == raiz.dato) {
            return true;
            }
            else {
                if (a < raiz.dato) {
                    raiz.hi.existe(a);
                }
                else {
                    raiz.hd.existe(a);
                }
            }
        }
        return false;
    }
 /**
  * 
  * @return
  */
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }
 /**
  * 
  * @return
  */
    public int altura() {
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }
 /**
  * 
  * @return
  */
    public int buscarMin() {
        abb arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.dato;
        arbolActual.raiz=null;
        return devuelvo;
    }
/**
 *  
 * @return
 */
    public int buscarMan() {
        abb arbolActual = this;
        while( !arbolActual.raiz.hd.esVacio() ) {
            arbolActual = arbolActual.raiz.hd;
        }
        int devuelvo= arbolActual.raiz.dato;
            arbolActual.raiz=null;
        return devuelvo;
    }
 /**
  * 
  * @return
  */
    public boolean esHoja() {
        boolean hoja = false;
        if( (raiz.hi).esVacio() && (raiz.hd).esVacio() ) {
            hoja = true;
        }
        return hoja;
    }
 /**
  * Este método es para eliminar un nodo en el árbol. Primero se verifica
  * @param a
  */
    public void eliminar(int a) {
    		//if(existe(a) != false){
	        abb paraEliminar = buscar(a);
		        if (!paraEliminar.esVacio()) {
		            if (paraEliminar.esHoja()) {
		                paraEliminar.raiz = null;
		            }
		            else {
		                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {
		                    paraEliminar.raiz.dato = paraEliminar.raiz.hd.buscarMin();
		                }
		                else {
		                    if (paraEliminar.raiz.hi.esVacio()) {
		                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
		                    }else{
		                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
		                    }
	                }
	            }
	        }
    	
    }
    
    public ArrayList<Integer> almacenarInOrder(nodoArbol nodo){
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = almacenarInOrderUtil(nodo, lista1);
        return lista2;
    }
    
    public ArrayList<Integer> almacenarInOrderUtil(nodoArbol nodo, ArrayList<Integer> lista){
        if(nodo == null){
            return null;
        }
        almacenarInOrderUtil(nodo.hi, lista);
        lista.add(nodo.dato);
        almacenarInOrderUtil(nodo.hd, lista);
        return lista;
    }
    
    public ArrayList<Integer> unir(ArrayList<Integer> lista1, ArrayList<Integer> lista2, int m, int n){
        ArrayList<Integer> lista3 = new ArrayList<>();
        int i = 0;
        int j =0;
        
        while(i<m && j<n){
            if(lista1.get(i) < lista2.get(j)){
                lista3.add(lista1.get(i));
                i++;
            }else{
                lista3.add(lista2.get(j));
                j++;
            }
        }
        
        while(i<m){
            lista3.add(lista1.get(i));
            i++;
        }
        
        while(j<n){
            lista3.add(lista2.get(j));
            j++;
        }
        
        return lista3;
    }
    
    public nodoArbol ALtoBST(ArrayList<Integer> lista, int comienzo, int finale){
        if(comienzo > finale){
            return null;
        }
        int mitad = (comienzo + finale)/2;
        nodoArbol nodo = new nodoArbol();
        nodo.dato = lista.get(mitad);
        
        nodo.hi = ALtoBST(lista, comienzo, mitad-1);
        nodo.hd = ALtoBST(lista, mitad+1, finale);
        
        return nodo;
    }
    
    public nodoArbol unirArboles(nodoArbol nodo1, nodoArbol nodo2){
        ArrayList<Integer> lista1 = almacenarInOrder(nodo1);
        
        ArrayList<Integer> lista2 = almacenarInOrder(nodo2);
        
        ArrayList<Integer> lista3 = unir (lista1, lista2, lista1.size(), lista2.size());
        
        nodoArbol nodo = ALtoBST(lista3, 0, lista3.size()-1);
        
        return nodo;
    }
}
//}