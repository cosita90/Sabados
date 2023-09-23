/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_veterinaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class mascota {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

private String nombre;
private String especie;
private Date fnac;
private String raza;

public mascota (){
    nombre="";
    especie="";
    fnac=null;
    raza="";
}

public void registrar_mascota () throws ParseException{
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    String name, esp, raz, sfn;
    Date fn;
    name=JOptionPane.showInputDialog("Ingrese Nombre de la Mascota:");
    esp=JOptionPane.showInputDialog("Ingrese Especie del animal:");
    sfn=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento de la Mascota:");
    fn=formato.parse(sfn);
    raz=JOptionPane.showInputDialog("Ingrese Raza de la Mascota:");
    
    this.setNombre(name);
    this.setEspecie(esp);
    this.setFnac(fn);
    this.setRaza(raz);
}

public void mostrar_mascota (){
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    String msg;
    msg="Nombre: " + this.getNombre() +
            "\nEspecie: " + this.getEspecie() +
            "\nFecha de Nacimiento: " + formato.format(this.getFnac()) +
            "\nRaza: " + this.getRaza();
    JOptionPane.showMessageDialog(null, msg);
}
}

