
package Clases;

public class Nodo {
    
     int informacion;
     Nodo siguiente;

    public int getValor() {
        return informacion;
    }

    public void setValor(int valor) {
        this.informacion = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
