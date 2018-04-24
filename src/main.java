
public class main {

	public static void main(String[] args) {
            //Comentario de prueba David!
            abb arbol = new abb ();
	    arbol.insertar (100);
	    arbol.insertar (10);
	    arbol.insertar (17);
	    arbol.insertar (200);
	    arbol.insertar (11);
	    arbol.insertar (7);
	    arbol.insertar (10);
	    arbol.insertar (100);
	    arbol.insertar (110);
	  



	    System.out.print ("Impresion preOrden: ");
	    arbol.preOrder();
	    System.out.print ("Impresion inOrden: ");
	    arbol.inOrder();
	    System.out.print ("Impresion posOrden: ");
	    arbol.posOrder();

}
}