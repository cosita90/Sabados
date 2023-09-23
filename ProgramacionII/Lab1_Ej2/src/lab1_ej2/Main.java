/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_ej2;

import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws ParseException {
    int n,i;
    Empleado emp=null;
    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Empleados: "));
    Empleado ve[]=new Empleado [n];
    for (i=0;i<ve.length;i++)
    {
        emp=new Empleado ();
        emp.registrarEmpleado();
        ve[i]=emp;
    }
    for (i=0;i<ve.length;i++)
    {
        ve[i].mostrarEmpleado();
    }
    
    int op=0;
    do 
    {
        op=Integer.parseInt(JOptionPane.showInputDialog("\n1- Ingresar una ciudad y listar empleados\n" +
"    2- Ingresar un sueldo basico y listar los empleados que perciban un sueldo inferior\n" +
"    3- Listar los datos de los empleados con mas de 10 años de antiguedad\n" +
"    4- Listar los datos de los empleados con edad mayor a 55 años\n" +
"    5- Registrar la baja de un empleado\n" +
"    6- Informar la cantidad de empleados dados de baja\n" +
"    7- Listar empleados por antiguedad (mayor o menor)\n" +
"    8- Buscar un empleado por su legajo y actualizar sus datos\n" +
"    9- Listar empleados ordenados por fecha de nacimiento\n" +
"    9- Salir"));
    
        switch (op)
        {
            case 1: busqueda_ciudad(ve);
            break;
            case 2: busqueda_sueldo_inferior(ve);
            break;
            case 3: busqueda_antiguedad_10anos(ve);
            break;
            case 4: busqueda_mayor55(ve);
            break;
            case 5: 
            {
                int bus;
                bus=busqueda_legajo(ve);
                ve[bus].BajaEmpleado(bus, ve);
                for (i=0; i<ve.length;i++)
                {
                    ve[i].mostrarEmpleado();
                }
            }
            break;
            case 6:
            break;
            case 7:
            break;
            case 8:
            break;
            case 9: JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
            break;
        }
    }while (op!=9);
    }
    
    public static void busqueda_antiguedad_10anos (Empleado ve[])
    {
        Date hoy = new Date ();
        int i =0;
        for (i=0;i<ve.length;i++)
        {
            if (hoy.getYear()-ve[i].getFingreso().getYear()>10)
            {
             ve[i].mostrarEmpleado();
            }
        }
    }
    public static void busqueda_mayor55 (Empleado ve[])
    {
        Date hoy =new Date ();
        int i=0;
        for (i=0;i<ve.length;i++)
        {
            if (hoy.getYear()- ve[i].getFnacimiento().getYear()>55)
            {
                ve[i].mostrarEmpleado();
            }
        }
    }
    public static void busqueda_sueldo_inferior (Empleado ve[])
    {
        float bus =0;
        int i;
        boolean ban=false;
        bus=Float.parseFloat(JOptionPane.showInputDialog("Ingrese Sueldo: "));
        for (i=0;i<ve.length;i++)
        {
            if(bus>ve[i].getSueldo_basico())
            {
                ve[i].mostrarEmpleado();
            }
        }
        
    }
    public static void busqueda_ciudad (Empleado ve [])
    {
        String bus = "";
        int i;
        boolean ban=false;
        bus=JOptionPane.showInputDialog("Ingrese Ciudad a buscar: ");
        
        for (i=0;i<ve.length;i++)
        {
            if (bus.equalsIgnoreCase(ve[i].getCiudad()))
            {
            JOptionPane.showMessageDialog(null, "Dato encontrado: ");
            ve[i].mostrarEmpleado();
            ban=true;
            }
        if (ban==false)
        {
            JOptionPane.showMessageDialog(null, "Dato no encontrado");
        }
            
        }
    }
    public static int busqueda_legajo (Empleado ve[])
    {
        int bus,i,ban;
        bus=i=0;
        ban=-1;
        bus=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Legajo a buscar: "));
        for (i=0;i<ve.length;i++)
        {
            if (bus==ve[i].getLegajo())
            {
                ban=i;
            }
            if (ban!=-1)
            {
                JOptionPane.showMessageDialog(null, "Legajo no Encontrado");
            }
            
        }
        return ban;
    }
    
    /*
    1- Ingresar una ciudad y listar empleados
    2- Ingresar un sueldo basico y listar los empleados que perciban un sueldo inferior
    3- Listar los datos de los empleados con mas de 10 años de antiguedad
    4- Listar los datos de los empleados con edad mayor a 55 años
    5- Registrar la baja de un empleado
    6- Informar la cantidad de empleados dados de baja
    7- Listar empleados por antiguedad (mayor o menor)
    8- Buscar un empleado por su legajo y actualizar sus datos
    */
}
