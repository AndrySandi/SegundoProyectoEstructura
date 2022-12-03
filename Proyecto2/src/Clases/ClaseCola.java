
package Clases;

import javax.swing.JOptionPane;

public class ClaseCola {
    
    private Nodo inicioCola, finalCola;
    String Cola = " ";

    public ClaseCola() {

        inicioCola = null;
        finalCola = null;
    }
    
    public void Insertar(int informacion){
        
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.informacion = informacion;
        nuevoNodo.siguiente = null;
        
        if (ColaVacia()) {
            
            inicioCola =  nuevoNodo;
            finalCola = nuevoNodo;
            
        } else {
            
            finalCola.siguiente = nuevoNodo;
            finalCola = nuevoNodo;
        }
    }
    
    public void MostrarContenido(){
        
        Nodo recorrido = inicioCola;
        String colaInvertida = " ";
        
        while(recorrido != null){
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        
        String cadena[] =  Cola.split(" ");
        
        for (int i = cadena.length - 1; i >= 0; i--) {
            colaInvertida += " " + cadena[i];
        }
        
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola = " ";
    }
    
    public int CantLista (){
       
        Nodo actual = inicioCola;
        Nodo recorrido = inicioCola;
        
        int i = 0;
        
        while (actual != null) {            
            
            i++;
            actual = recorrido.siguiente;
            
        }
        return i;
    }
    
    public int ExtraerInfo(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;

            if (inicioCola == finalCola) {
                inicioCola = null;
                finalCola = null;               
            } else {
                
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    public void Borrartodo()
  {
     inicioCola = null;
     finalCola = null;
  }
    
    public boolean ColaVacia() {
        
        if (inicioCola == null) {
            return true;
            
        } else {
            return false;
        }
    }
}
