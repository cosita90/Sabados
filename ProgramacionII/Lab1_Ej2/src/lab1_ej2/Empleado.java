/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_ej2;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class Empleado {
private int legajo;
private String apellido;
private String nombre;
private Date fingreso;
private Float sueldo_basico;
private String ciudad;
private Date fegreso;
private Date fnacimiento;
private String sexo;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFingreso() {
        return fingreso;
    }

    public void setFingreso(Date fingreso) {
        this.fingreso = fingreso;
    }

    public Float getSueldo_basico() {
        return sueldo_basico;
    }

    public void setSueldo_basico(float sueldo_basico) {
        this.sueldo_basico = sueldo_basico;
    }
    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFegreso() {
        return fegreso;
    }

    public void setFegreso(Date fegreso) {
        this.fegreso = fegreso;
    }



    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

public Empleado ()
{
    legajo = 0;
    nombre= "";
    apellido="";
    fingreso=null;
    sueldo_basico=0f;
    ciudad="";
    fegreso=null;
    fnacimiento=null;
    sexo="";
}

public void registrarEmpleado() throws ParseException
{
    int leg;
    String nom, ape, ciu, sex, sfi,sfn;
    Date fing, fnac;
    float sb;
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    
    leg=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de legajo:"));
    nom=JOptionPane.showInputDialog("Ingrese Nombre:");
    ape=JOptionPane.showInputDialog("Ingrese Apellido:");
    sfi=JOptionPane.showInputDialog("Ingrese Fecha de ingreso");
    fing=formato.parse(sfi);
    sb=Float.parseFloat(JOptionPane.showInputDialog("Ingrese sueldo basico:"));
    do
    {
    ciu=JOptionPane.showInputDialog("Ingrese Ciudad (RG/T/U)");
    } while (ciu.equalsIgnoreCase("RG")==false & ciu.equalsIgnoreCase("T") == false & ciu.equalsIgnoreCase("U")==false);
    sfn=JOptionPane.showInputDialog("Ingrese Fecha de Nacimiento:");
    fnac=formato.parse(sfn);
    sex=JOptionPane.showInputDialog("Ingrese su sexo:");
    
   this.setLegajo(leg);
   this.setNombre(nom);
   this.setApellido(ape);
   this.setFingreso(fing);
   this.setSueldo_basico(sb);
   this.setCiudad(ciu);
   this.setFnacimiento(fnac);
   this.setSexo(sex);
}
public int antiguedad ()
{
    int a=0;
    Date hoy= new Date ();
    a=hoy.getYear()-this.getFingreso().getYear();
    return a;
}

public int edad ()
{
    int a=0;
    Date hoy= new Date ();
    a=hoy.getYear()- this.getFnacimiento().getYear();
    return a;
}
public void mostrarEmpleado()
{
   if (this.legajo!=-1)
   {
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    String info= "";
    info="\nLegajo: " + this.getLegajo() +
         "\nNombre y Apellido: " +this.getNombre() + " " + this.getApellido() +
         "\nCiudad: " + this.getCiudad() +
         "\nSexo: " + this.getSexo() +
         "\nSueldo Basico: " + this.getSueldo_basico() +
         "\nFecha de Ingreso: " + formato.format(this.getFingreso()) +
         "\nAntigüedad: " + this.antiguedad() +
         "\nFecha de Nacimiento: " + formato.format(this.getFnacimiento()) +
         "\nEdad: " + this.edad();
    JOptionPane.showMessageDialog(null, info);
   }
}
public void BajaEmpleado(int bus, Empleado ve[])
{
    if(bus!=-1)
    {
        ve[bus].legajo=-1;
    }
}






}
