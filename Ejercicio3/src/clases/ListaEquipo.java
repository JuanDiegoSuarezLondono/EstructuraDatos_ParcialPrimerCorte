/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Estudiante
 */
public class ListaEquipo {
     private final ArrayList<Equipo> myArray;

    public ListaEquipo() {
        this.myArray = new ArrayList<>();
    }

    public Equipo getEquipo(int i) {
        return myArray.get(i);
    }

    public void print() {
        Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        System.out.println("");
        while (it.hasNext()) {
            equipo = it.next();
            System.out.println(equipo.getSerial() + ": " + equipo.getTipo() + "," + equipo.getModelo() + ", " + equipo.getMarca());
        }
        System.out.println("");
    }

    public void printUser(String user) {
        Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        int x = 0;
        System.out.println("");
       
        while (it.hasNext()) {
            equipo = it.next();
            if (equipo.getUsuario().equalsIgnoreCase(user) && (equipo.getFechaD().equals("Ninguna"))) {
                x++;
                System.out.println(equipo.getSerial() + ": " + equipo.getTipo() + "," + equipo.getModelo() + ", " + equipo.getMarca());
            }
        }
        if (x == 0) {
            System.out.println("Este usuario no tiene prestado nada");
        }
      
        System.out.println("");
    }

    public void printPrestados() {
        Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        int x = 0;
        System.out.println("");
      
        while (it.hasNext()) {
            equipo = it.next();
            if ((!equipo.getUsuario().equals("Ninguno")) && equipo.getFechaD().equals("Ninguna")) {
                x++;
                System.out.println(equipo.getSerial() + ": " + equipo.getTipo() + "," + equipo.getModelo() + ", " + equipo.getMarca());
            }
        }
        if (x == 0) {
            System.out.println("No hay ningun equipo prestado");
        }
    }

   public void printTipo() {
       Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        String Tipo;

        System.out.println("");
        System.out.println("Portatiles ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if (Tipo.equals("Portatil")) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Video beams ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if (Tipo.equals("Video Beam")) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Grabadoras ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if (Tipo.equals("Grabadora")) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Parlantes ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if (Tipo.equals("Parlante")) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Televisor ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if (Tipo.equals("Televisor")) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        System.out.println("");
    }
   
   

   public void printTipoPrestados() {
       Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        String Tipo;

        System.out.println("");
        System.out.println("Portatiles ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if ((Tipo.equals("Portatil"))&&(!equipo.getUsuario().equals("Ninguno")||!equipo.getFechaD().equals("Ninguna"))) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Video beams ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if ((Tipo.equals("Video Beam"))&&(!equipo.getUsuario().equals("Ninguno")||!equipo.getFechaD().equals("Ninguna"))) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Grabadoras ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if ((Tipo.equals("Grabadora"))&&(!equipo.getUsuario().equals("Ninguno")||!equipo.getFechaD().equals("Ninguna"))) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Parlantes ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if ((Tipo.equals("Parlante"))&&(!equipo.getUsuario().equals("Ninguno")||!equipo.getFechaD().equals("Ninguna"))) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        it = myArray.iterator();
        System.out.println("Televisor ");
        while (it.hasNext()) {
            equipo = it.next();
            Tipo = equipo.getTipo();
            if ((Tipo.equals("Televisor"))&&(!equipo.getUsuario().equals("Ninguno")||!equipo.getFechaD().equals("Ninguna"))) {
                System.out.println(" - Equipo " + equipo.getSerial() + " con tipo " +equipo.getTipo());
            }
        }
        System.out.println("");
    }

    public void printPrestadosTipo() {
        Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        System.out.println("");
        while (it.hasNext()) {
            equipo = it.next();
            if ((!equipo.getUsuario().equals("Ninguno")) && equipo.getFechaD().equals("Ninguna")) {
                System.out.println(equipo.getSerial() + ": " + equipo.getTipo() + "," + equipo.getModelo() + ", " + equipo.getMarca());
            }
        }
        System.out.println("");
    }

    public void printUsers() {
        Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        System.out.println("");
     
        while (it.hasNext()) {
            equipo = it.next();
            if (!equipo.getUsuario().equals("Ninguno")) {
                System.out.println(equipo.getUsuario());
            }
        }
    }

    public void addEquipo(Equipo equipo) {
        myArray.add(equipo);
    }

    private int search(int serial) {
        int i;
        Equipo equipo;
        Iterator<Equipo> it = myArray.iterator();
        i = 0;
        while (it.hasNext()) {
            equipo = it.next();
            if (equipo.getSerial() == serial) {
                return i;
            }
            i++;
        }
        return -1;
    }
    
    

    public void removeAt(int seriaL) {
        if (search(seriaL) != -1) {
            myArray.remove(search(seriaL));
        } else {
            System.out.println("No existe");
        }
    }

    public void update(int serial, String modelo) {
        if (search(serial) != -1) {
            Equipo equipo = clonar(myArray.get(search(serial)));
            equipo.setModelo(modelo);
            myArray.set(search(serial), equipo);
        } else {
            System.out.println("No existe");
        }
    }

    public void prestarEquipo(int serial, String usuario, String fechaI) {
        int ser = search(serial);
        if (ser == -1) {
            System.out.println("No existe equipo");
        } else {
            Equipo eq = myArray.get(ser);
            if (eq.getUsuario() == "Ninguno") {
                eq.setUsuario(usuario);
                eq.setFechaP(fechaI);
            } else {
                if (eq.getFechaD() != "Ninguna") {
                    eq.setUsuario(usuario);
                    eq.setFechaP(fechaI);
                    eq.setFechaD("Ninguna");
                } else {
                    System.out.println("Se encuentra prestado a " + eq.getUsuario());
                }
            }
        }
    }

    public void recibirEquipo(int serial, String fechaD) {
        int ser = search(serial);
        if (ser == -1) {
            System.out.println("No existe equipo");
        } else {
            Equipo eq = myArray.get(ser);
            if (eq.getUsuario() != "Ninguno") {
                eq.setFechaD(fechaD);
            } else {
                System.out.println("No se encuentra prestado ");
            }
        }
    }

    private Equipo clonar(Equipo eq) {
        Equipo equipo;
        equipo = new Equipo();
        equipo.setFechaD(eq.getFechaD());
        equipo.setFechaP(eq.getFechaP());
        equipo.setMarca(eq.getMarca());
        equipo.setModelo(eq.getModelo());
        equipo.setSerial(eq.getSerial());
        equipo.setTipo(eq.getTipo());
        equipo.setUsuario(eq.getUsuario());

        return equipo;

    }
}
