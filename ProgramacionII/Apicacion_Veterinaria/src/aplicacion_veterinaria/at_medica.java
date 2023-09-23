/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_veterinaria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class at_medica {

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public mascota getVecmasc(int pos) {
        return vecmasc[pos];
    }

    public void setVecmasc(int pos, mascota a) {
        vecmasc[pos] = a;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    private Date fecha;
    private Cliente cliente;
    private mascota[] vecmasc;
    private boolean eliminado;

public int cant_masc(){
    return vecmasc.length;
}

public at_medica (){
fecha=null;
eliminado=false;
}

public void Registrar_atencion () throws ParseException{
    SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
    String sfecha;
    Date fec;
    Cliente auxcliente=null;
    int cm;
    sfecha=JOptionPane.showInputDialog("Ingrese Fecha de Atencion: ");
    fec=formato.parse(sfecha);
    auxcliente.Registrar_Cliente();
    cm=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Mascotas:"));
    vecmasc=new mascota[cm];
    mascota aux;
    for (int i=0; i<vecmasc.length;i++){
        aux=new mascota();
        aux.registrar_mascota();
        vecmasc[i]=aux;
    }
    
    this.setCliente(auxcliente);
    this.setFecha(fec);
}

public void Mostrar_atencion (){
    SimpleDateFormat formato =new SimpleDateFormat("dd/MM/yyyy");
    String msg;
    msg="Fecha: " + formato.format(this.getFecha());
    JOptionPane.showMessageDialog(null, msg);
    cliente.Mostrar_Cliente();
    for (int i=0;i<vecmasc.length;i++){
        vecmasc[i].mostrar_mascota();
    }
    
}
}

