package lab1_ej1;
import javax.swing.JOptionPane;

public class Alumno {
    private int legajo;
    private String nomyape;
    private int telefono;
    private String email;
    private int dni;
    private String domicilio;
    private int año_ingreso;
    private boolean egresado_secundario;

public void set_legajo(int legajo)
{
    this.legajo=legajo;
}

public int get_legajo ()
{
    return legajo;
}

public void set_nomyape (String nomyape)
{
    this.nomyape=nomyape;
}

public String get_nomyape ()
{
    return nomyape;
}

public void set_telefono(int telefono)
{
    this.telefono=telefono;
}

public int get_telefono ()
{
    return telefono;
}

public void set_email (String email)
{
    this.email=email;
}

public String get_email ()
{
    return email;
}

public void set_dni (int dni)
{
    this.dni=dni;
}

public int get_dni ()
{
    return dni;
}

public void set_domicilio (String domicilio)
{
    this.domicilio=domicilio;
}

public String get_domicilio ()
{
    return domicilio;
}

public void set_año_ingreso (int año_ingreso)
{
    this.año_ingreso=año_ingreso;
}

public int get_año_ingreso ()
{
    return año_ingreso;
}

public void set_egresado_secundario (boolean egresado_secundario)
{
    this.egresado_secundario=egresado_secundario;
}

public boolean get_egresado_secundario ()
{
    return egresado_secundario;
}

public void registrar_alumno()
{
    int leg, tel, dni, ai;
    String nya, em, dom;
    int es;
    boolean e;
    leg=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Legajo:"));
    nya=JOptionPane.showInputDialog("Ingrese Nombre y Apellido:");
    tel=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Telefono:"));
    dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de DNI:"));
    ai=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de Ingreso:"));
    em=JOptionPane.showInputDialog("Ingrese su Email:");
    dom=JOptionPane.showInputDialog("Ingrese su domicilio:");
    es=JOptionPane.showConfirmDialog(null, "¿Termino la Secundaria?");
    if (es==0)
    {
        e=true;
    }
    else
    {
        e=false;
    }
    
    this.set_legajo(leg);
    this.set_nomyape(nya);
    this.set_telefono(tel);
    this.set_año_ingreso(ai);
    this.set_dni(dni);
    this.set_domicilio(dom);
    this.set_egresado_secundario(e);
    this.set_email(em);
}

public void mostrar_alumno()
{
    JOptionPane.showMessageDialog(null, "\nLegajo: " + this.get_legajo() + "\nNombre y Apellido: " + this.get_nomyape() + "\nTelefono: " + this.get_telefono()+ "\nAño de Ingreso: "+ this.get_año_ingreso()+"\nDNI: "+ this.get_dni()+"\nDomicilio: "+ this.get_domicilio()+"\nEgresado Secundario: "+ this.get_egresado_secundario()+ "\nE-mail: " + this.get_email());
}

public Alumno () // Constructor sin parametros
{
    legajo=0;
    nomyape="";
    telefono=0;
    año_ingreso=0;
    dni=0;
    domicilio="";
    egresado_secundario=false;
    email="";
}

public Alumno(int l ,String nya, int tel, String em,int d, String dom, int ai, boolean es)
{
    legajo=l;
    nomyape=nya;
    telefono=tel;
    email=em;
    dni=d;
    domicilio=dom;
    egresado_secundario=es;
    año_ingreso=ai;
    
}



}

