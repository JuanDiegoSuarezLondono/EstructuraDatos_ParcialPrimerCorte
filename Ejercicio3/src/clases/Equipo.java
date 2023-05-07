/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class Equipo {
     private String tipo;
    private String marca;
    private String modelo;
    private int serial;
    private String usuario;
    private String fechaP;
    private String fechaD;

    public Equipo() {
    }

    public Equipo(String tipo, String marca, String modelo, int serial) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        usuario="Ninguno";
        fechaD="Ninguna";
        fechaP="Ninguna";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getFechaD() {
        return fechaD;
    }

    public void setFechaD(String fechaD) {
        this.fechaD = fechaD;
    }

}
