
package modelo;


public class Nodo {
    int nu;
    String nombre;
    String puesto;
    Nodo izdo;
    Nodo dcho;
    // constructor # 1
    public  Nodo ( int n, String no, String p ) {
        nu=n;
        nombre=no;
        puesto=p;
        izdo = null ;
        dcho = null ;
    }

    
    public  String  toString () {
        return " su informacion es: "+" No.Empleado: "  +nu+" Nombre: "+nombre+"  Puesto: "+puesto;
    }
    
    
}
