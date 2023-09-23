/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_veterinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class Cliente {

    public String getNomyape() {
        return nomyape;
    }

    public void setNomyape(String nomyape) {
        this.nomyape = nomyape;
    }

    public String getDir() {
        return direccion;
    }

    public void setDir(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    private String nomyape;
    private String direccion;
    private int telefono;
    private String ciudad;

public Cliente (){
    nomyape="";
    direccion="";
    telefono=0;
    ciudad="";
}

public void Registrar_Cliente (){
    String nya,dir,ciu;
    int tel;
    nya=JOptionPane.showInputDialog("Ingrese Nombre y Apellido del cliente:");
    dir=JOptionPane.showInputDialog("Ingrese Direccion del Cliente:");
    tel=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Telefono del Cliente:"));
    ciu=JOptionPane.showInputDialog("Ingrese Ciudad del Cliente:");
    this.setNomyape(nya);
    this.setDir(dir);
    this.setTelefono(tel);
    this.setCiudad(ciu);
}

public void Mostrar_Cliente (){
    String msg;
    msg="Nombre y Apellido: " + this.getNomyape() +
            "\nDireccion: " + this.getDir() +
            "\nTelefono: " + this.getTelefono() +
            "\nCiudad: " + this.getCiudad();
    JOptionPane.showMessageDialog(null, msg);
}
        
}
