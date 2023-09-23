
package lab1_ej1;
import javax.swing.JOptionPane; //clase para mostrar mensajes
public class Lab1_Ej1 {    
    public static void main(String[] args) {
    /*String nomyape="";
    int aactual, legajo, anacimiento, edad,i, n;
    String sanacimiento="";   
    i=aactual=legajo=anacimiento=edad=n=0;
    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos"));
    aactual=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el año de actual:"));
    for(i=0;i<n;i++){
        legajo++;
        nomyape=JOptionPane.showInputDialog("Ingrese su nombre y apellido:");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nomyape);
        sanacimiento=JOptionPane.showInputDialog("Ingrese año de nacimiento:");
        anacimiento=Integer.parseInt(sanacimiento);
        edad=aactual-anacimiento;
        if (edad>=18)
        {
        JOptionPane.showMessageDialog(null, nomyape + " su edad es " + edad + " y es mayor de edad");
        }
        else
        {
        JOptionPane.showMessageDialog(null, nomyape + " su edad es " + edad + " y es menor de edad");
        }
    
    }//fin for
    */
    
    /*
    int i;
    Alumno a1=new Alumno();
    a1.registrar_alumno();
    a1.mostrar_alumno();
    */
    /*
    int leg, tel, dni, ai;
    String nya, em, dom;
    int es;
    boolean e;
    leg=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Legajo:"));
    nya=JOptionPane.showInputDialog("Ingrese Nombre y Apellido:");
    tel=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Telefono:"));
    dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de DNI:"));
    ai=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año de Nacimiento:"));
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
    //int l ,String nya, int tel, String em,int d, String dom, int ai, boolean es
    Alumno a2=new Alumno (leg, nya, tel, em, dni, dom, ai,e);
    a2.mostrar_alumno();
    */
    
    int n, i;
    n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos"));
    Alumno valu[]=new Alumno[n];
    Alumno a;
    for (i=0;i<valu.length;i++)
    {
        a=new Alumno ();
        a.registrar_alumno();
        valu[i]=a;
    }
    for (i=0;i<valu.length;i++)
    {
        valu[i].mostrar_alumno();
    }
    
    //0- listado de alumnos ordenado descendente por apellido y nombre, que ingresaron en el año actual
    //1- listado de alumnos que ingresaron hace 5 años
    //2- listado ordenado de alumnos por su dni
    //3- listado de alumnos que no han egresado del secundario
    //4- busqueda de un alumno por su nombre y apellido
    //5- listado de alumnos ordenados por domicilio
    //6- buscar alumno por legajo y actualizar sus datos
    //7- buscar alumno por legajo y eliminarlo
    
    int op=0;
    
    do
    {
     op=Integer.parseInt(JOptionPane.showInputDialog(
"    0- listado de alumnos ordenado descendente por apellido y nombre, que ingresaron en el año actual\n" +
"    1- listado de alumnos que ingresaron hace 5 años\n" +
"    2- listado ordenado de alumnos por su dni\n" +
"    3- listado de alumnos que no han egresado del secundario\n" +
"    4- busqueda de un alumno por su nombre y apellido\n" +
"    5- listado de alumnos ordenados por domicilio\n" +
"    6- buscar alumno por legajo y actualizar sus datos\n" +
"    7- buscar alumno por legajo y eliminarlo\n" +
"    8- Salir"));
    
    switch (op)
    {
        case 0:
        {
            ordenamiento_apellido(valu);
            for (i=0;i<valu.length;i++)
            {
            valu[i].mostrar_alumno();
            }
        }
        break;
        case 1:
            {
            listado_5_anos(valu);
            }
        break;
        case 2:
            {
            ordenamiento_descendiente(valu);
            }
        break;
        case 3:
        {
            listado_no_egresados(valu);
        }
        break;
        case 4:
        {
            buscar_alumno (valu);
        }
        break;
        case 5:
        {
            ordenamiento_domicilio(valu);
            for (i=0;i<valu.length;i++)
            {
            valu[i].mostrar_alumno();
            }
        }
        break;
        case 6:
        break;
        default: JOptionPane.showMessageDialog(null,"Ingrese una Opcion Valida");
        break;
    }
    }while (op!=5);
    
    
    
    
    
    
    
    }//fin main
    
    public static void listado_5_anos(Alumno valu [])
    
    {
        int i;
        for (i=0;i<valu.length;i++)
    {
        if (valu[i].get_año_ingreso()==2023-5)
        {
            valu[i].mostrar_alumno();
        }
    }
    }
    
    public static void ordenamiento_apellido(Alumno valu [])
    
    {
        int i,j;
        Alumno aux;
        for (i=0;i<valu.length-1;i++)
        {
        for (j=i+1;j<valu.length;j++)
            if (valu[i].get_nomyape().compareToIgnoreCase(valu[j].get_nomyape())==-1)
            {
                aux=valu[i];
                valu[i]=valu[j];
                valu[j]=aux;
            }
        }
        
    
    }
    
    
    
   
    
    public static void ordenamiento_descendiente (Alumno valu[])
    {
        int i,j;
        Alumno aux =new Alumno ();
        for (i=0;i<valu.length-1;i++)
        {
            for (j=i+1;j<valu.length;j++)
            {
                if (valu[i].get_dni()>valu[j].get_dni())
                {
                    aux=valu[i];
                    valu[i]=valu[j];
                    valu[j]=aux;
                }
            }
        }
        for (i=0;i<valu.length;i++)
            {
            valu[i].mostrar_alumno();
            }
        
    }
    public static void buscar_alumno (Alumno valu[])
    {
        
        String bus;
        boolean ban =false;
        bus=JOptionPane.showInputDialog("Ingrese Nombre a Buscar");
        for (int i=0; i<valu.length;i++)
        {
            if (valu[i].get_nomyape().compareToIgnoreCase(bus)==0)
            {
                JOptionPane.showMessageDialog(null, "Alumno Encontrado");
                valu[i].mostrar_alumno();
                ban=true;
            }
        }
        if(ban==false)
        {
            JOptionPane.showMessageDialog(null, "Alumno no Encontrado");
        }
    }
    public static void listado_no_egresados (Alumno valu[])
    {
        int i;
        for (i=0;i<valu.length;i++)
        {
            if (valu[i].get_egresado_secundario()==false)
            {
                valu[i].mostrar_alumno();
            }
        }
        
    }
    public static void ordenamiento_domicilio (Alumno valu[])
    {
        int i,j;
        Alumno aux;
        for (i=0;i<valu.length-1;i++)
        {
        for (j=i+1;j<valu.length;j++)
            if (valu[i].get_domicilio().compareToIgnoreCase(valu[j].get_domicilio())==1)
            {
                aux=valu[i];
                valu[i]=valu[j];
                valu[j]=aux;
            }
        }
    }
    
}//fin clase
