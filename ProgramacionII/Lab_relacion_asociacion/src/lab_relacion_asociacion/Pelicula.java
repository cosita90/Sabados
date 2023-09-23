
package lab_relacion_asociacion;

import java.text.ParseException;
import javax.swing.JOptionPane;

public class Pelicula {

    public Actor getVecactor(int pos) {
        return vecactor[pos];
    }

    public void setVecactor(int pos, Actor a) {
        vecactor[pos]=a;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
private String titulo;
private int duracion;
private String director;
private Actor []vecactor;
private String genero;
    
    public int cant_actor()
    {
        return vecactor.length;
    }
public Pelicula()
{
    titulo=null;
    duracion=0;
    director=null;
    genero=null;
}

public void registrar_pelicula () throws ParseException
{
    String tit,dir,gen;
    int dur,ca;
    tit=JOptionPane.showInputDialog("Ingrese Titulo de la obra:");
    dir=JOptionPane.showInputDialog("Ingrese Nombre del Director: ");
    gen=JOptionPane.showInputDialog("Ingrese genero de la Pelicula: ");
    dur=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duracion de la pelicula en minutos:"));
    ca=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Actores:"));
    Actor actaux=null;
    vecactor= new Actor[ca];
    for (int i=0; i<vecactor.length;i++)
    {
        actaux =new Actor();
        actaux.registrar_Actor();
        vecactor[i]=actaux;
    }
    
}

public void mostrar_pelicula ()
{
    String msg="";
    JOptionPane.showMessageDialog(null,"Titulo: " + getTitulo() +
            "\nDuracion: " + getDuracion() +
            "\nDirector: " + getDirector() +
            "\nGenero: " + getGenero() + 
            "\nActores: ");
    for (int i=0; i<vecactor.length;i++)
    {
        vecactor[i].mostrar_actor();
    }
}
}
