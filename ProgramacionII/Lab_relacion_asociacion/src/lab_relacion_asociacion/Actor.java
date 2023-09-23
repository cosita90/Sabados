/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_relacion_asociacion;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Actor {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
private String nombre;
private Date fnacimiento;
private String nacionalidad;

public Actor ()
{
    nombre=null;
    fnacimiento=null;
    nacionalidad=null;
}
public void registrar_Actor() throws ParseException
{
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    String name, snacionalidad, snacimiento;
    Date fnac;
    
    name=JOptionPane.showInputDialog("Ingrese Nombre del Actor: ");
    snacionalidad=JOptionPane.showInputDialog("Ingrese Nacionalidad del Actor: ");
    snacimiento=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento (dd//mm/aaaa):");
    fnac= formato.parse(snacimiento);
    
    this.nombre=name;
    this.nacionalidad=snacionalidad;
    this.fnacimiento=fnac;
    
}

public void mostrar_actor ()
{
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    String msg="";
    msg=JOptionPane.showInputDialog("Nombre: " + getNombre() +
                                    "\n Fecha de nacimiento: " + formato.format(getFnacimiento()) +
                                    "\nNacionalidad: "+ getNacionalidad());
}
}
