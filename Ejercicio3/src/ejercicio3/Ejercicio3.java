/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import clases.Equipo;
import clases.ListaEquipo;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
  Scanner myKeyboard = new Scanner(System.in);
        ListaEquipo list = new ListaEquipo();
        String tipo, marca, modelo, fecha;
        Equipo prod;
        int opc, serial;

        serial = 1;
        list.addEquipo(new Equipo("Portatil", "Dell", "modelo1", serial++));
        list.addEquipo(new Equipo("Video Beam", "Espson", "modelo2", serial++));
        list.addEquipo(new Equipo("Grabadora", "Sony", "modelo3", serial++));
        list.addEquipo(new Equipo("Parlante", "Bose", "modelo4", serial++));
        list.addEquipo(new Equipo("Televisor", "Samsung", "modelo5", serial++));
        list.addEquipo(new Equipo("Portatil", "Samsung", "modelo6", serial++));
        list.addEquipo(new Equipo("Portatil", "Samsung", "modelo7", serial++));
        list.print();

        list.prestarEquipo(1, "Christopher", "12-09-12");
        list.prestarEquipo(6, "Christopher", "12-09-12");
        list.prestarEquipo(7, "Christopher", "12-09-15");

        list.recibirEquipo(6, "12-12-21");
        opc = 1;
        while (opc != 0) {
            menu();
            opc = myKeyboard.nextInt();
            switch (opc) {

                case 0:
                    System.out.println("SALIENDO...");
                    break;

                case 1:
                    System.out.println("Tipo");
                    tipo = myKeyboard.next();
                    System.out.println("Marca");
                    marca = myKeyboard.next();
                    System.out.println("Modelo");
                    modelo = myKeyboard.next();
                    prod = new Equipo(tipo, marca, modelo, serial++);
                    list.addEquipo(prod);
                    list.print();
                    break;

                case 2:
                    System.out.println("Ingrese el serial");
                    serial = myKeyboard.nextInt();
                    list.removeAt(serial);
                    list.print();
                    break;

                case 3:
                    System.out.println("Digite el nombre");
                    modelo = myKeyboard.next();
                    System.out.println("Ingrese el serial");
                    serial = myKeyboard.nextInt();
                    list.update(serial, modelo);
                    list.print();
                    break;

                case 4:
                    System.out.println("Digite el nombre");
                    modelo = myKeyboard.next();
                    System.out.println("Ingrese la fecha");
                    fecha = myKeyboard.next();
                    System.out.println("Ingrese el serial");
                    serial = myKeyboard.nextInt();
                    list.prestarEquipo(serial, modelo, fecha);
                    break;

                case 5:
                    System.out.println("Ingrese la fecha");
                    fecha = myKeyboard.next();
                    System.out.println("Ingrese el serial");
                    serial = myKeyboard.nextInt();
                    list.recibirEquipo(serial, fecha);
                    break;

                case 6:
                    System.out.println("Ingrese el usuario");
                    modelo = myKeyboard.next();
                    list.printUser(modelo);
                    break;

                case 7:
                    list.printPrestados();
                    break;
                case 8:
                    list.printTipo();
                    break;
                case 9:
                    list.printTipoPrestados();
                    break;
                case 10:
                    list.printUsers();
                    break;
            }
        }

    }

    public static void menu() {
       
        System.out.println(" 0, Salir del programa");
        System.out.println(" 1, Agregar equipo");
        System.out.println(" 2, Eliminar equipo");
        System.out.println(" 3, Actualizar nombre");
        System.out.println(" 4, Prestar equipo");
        System.out.println(" 5, Devolver equipo");
        System.out.println(" 6, Mostar equipo prestados por usuario");
        System.out.println(" 7, Mostrar equipos prestados");
        System.out.println(" 8, Mostrar equipos por tipo");
        System.out.println(" 9, Mostrar equipos prestados por tipo");
        System.out.println(" 10, Mostrar Usuarios");
       

    }
        
        
        
    
    
}
