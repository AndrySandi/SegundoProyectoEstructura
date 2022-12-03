package proyecto2;

import Clases.ClaseCola;
import javax.swing.JOptionPane;

public class Proyecto2 {

    public static void main(String[] args) {
  
        int opcion = 0;
        int nodoInformacion = 0;

        ClaseCola cola1 = new ClaseCola();
        ClaseCola cola2 = new ClaseCola();
        ClaseCola cola3 = new ClaseCola();
        ClaseCola cola4 = new ClaseCola();

        int CantC1;
        int CantC2;
        int CantC3;
        int CantC4;

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                          "1. Ingresar elementos en algún cajero\n"
                        + "2. Extraer información de algún cajero\n"
                        + "3. Mostrar contenido de las colas\n"
                        + "4. Borrar todos los elementos\n"       
                        + "5. Salir del menú\n\n","---MENÚ DE OPCIONES",                        
                        JOptionPane.QUESTION_MESSAGE));

                switch (opcion) {
                    case 1:
                        CantC1 = cola1.CantLista();
                        CantC2 = cola2.CantLista();
                        CantC3 = cola3.CantLista();
                        CantC4 = cola4.CantLista();

                        int CantColas[] = {CantC1, CantC2, CantC3, CantC4};
                        int menor = CantC1;

                        for (int i = 0; i < CantColas.length; i++) {

                            if (menor < CantColas[i]) {

                                menor = CantColas[i];

                            }
                        }

                        if (menor == CantC1 && menor != CantC2 && menor != CantC3 && menor != CantC4) {
                            nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el valor que desea guardar: "));
                            cola1.Insertar(nodoInformacion);
                        }

                        if (menor == CantC2 && menor != CantC1 && menor != CantC3 && menor != CantC4) {
                            nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                   "Porfavor ingrese el valor que desea guardar: "));
                            cola2.Insertar(nodoInformacion);
                        }

                        if (menor == CantC3 && menor != CantC2 && menor != CantC1 && menor != CantC4) {
                            nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el valor que desea guardar: "));
                            cola3.Insertar(nodoInformacion);
                        }

                        if (menor == CantC4 && menor != CantC2 && menor != CantC3 && menor != CantC1) {
                            nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                    "Porfavor ingrese el valor que desea guardar: "));
                            cola4.Insertar(nodoInformacion);
                        }

                        if (CantC1 == CantC2 || CantC1 == CantC3 || CantC1 == CantC4
                                || CantC2 == CantC3 || CantC2 == CantC4 || CantC3 == CantC4) {

                            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                      "SELECCIONE ALGÚN CAJERO:\n"
                                    + "\tCajero 1\n"
                                    + "\tCajero 2\n"
                                    + "\tCajero 3\n"
                                    + "\tCajero 4\n"
                                    + "\tVolver al menú\n","---INGRESAR ELEMENTOS EN ALGÚN CAJERO",
                                    JOptionPane.QUESTION_MESSAGE));

                            if (opcion == 1) {
                                nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el valor que desea guardar: "));
                                cola1.Insertar(nodoInformacion);
                            }

                            if (opcion == 2) {
                                nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el valor que desea guardar: "));
                                cola2.Insertar(nodoInformacion);
                            }

                            if (opcion == 3) {
                                nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el valor que desea guardar: "));
                                cola3.Insertar(nodoInformacion);
                            }

                            if (opcion == 4) {
                                nodoInformacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Porfavor ingrese el valor que desea guardar: "));
                                cola4.Insertar(nodoInformacion);
                            }
      
                                
                        }

                        break;

                    case 2:

                        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                      "SELECCIONE ALGÚN CAJERO:\n"
                                    + "\tCajero 1\n"
                                    + "\tCajero 2\n"
                                    + "\tCajero 3\n"
                                    + "\tCajero 4\n\n", "---EXTRAER INFORMACIÓN DE LOS NODOS",
                                    JOptionPane.QUESTION_MESSAGE));

                        if (opcion == 1) {

                            if (!cola1.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola1.ExtraerInfo());
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta lista esta vacia");
                            }
                        }

                        if (opcion == 2) {

                            if (!cola2.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola2.ExtraerInfo());
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta lista esta vacia");
                            }
                        }

                        if (opcion == 3) {

                            if (!cola3.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola3.ExtraerInfo());
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta lista esta vacia");
                            }
                        }

                        if (opcion == 4) {

                            if (!cola4.ColaVacia()) {
                                JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                        + cola4.ExtraerInfo());
                            } else {
                                JOptionPane.showMessageDialog(null, "Esta lista esta vacia");
                            }
                        }

                        break;

                    case 3:      
                        cola1.MostrarContenido();
                        cola2.MostrarContenido();
                        cola3.MostrarContenido();
                        cola4.MostrarContenido();
                        break;

                    case 4:
                        cola1.Borrartodo();
                        cola2.Borrartodo();
                        cola3.Borrartodo();
                        cola4.Borrartodo();
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "¡GRACIAS POR UTILIZAR NUESTRO SISTEMA!");
                        opcion = 5;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "¡OPCIÓN NO DISPONIBLE!");
                        break;

                }

            } catch (NumberFormatException e) {
            }
        } while (opcion != 5);
    }
    
}
