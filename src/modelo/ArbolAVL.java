
package modelo;


public class ArbolAVL {
    Nodo raiz;

    public ArbolAVL() {
        raiz=null;
    }
    public Nodo obtener(){
        return raiz;
    }
    public  void  agregarNodo ( int n, String no, String p ) {
        Nodo nuevo = new Nodo(n,no,p);
        if (raiz == null ) {
            raiz = nuevo;
        } else {
            Nodo aux = raiz;
            Nodo padre;
            while ( true ) {
                padre = aux;
                if (n > aux .nu) {
                    aux = aux . izdo;
                    if (aux == null ) {
                        padre . izdo = nuevo;
                        return;
                    }
                } else{
                    aux = aux . dcho;
                    if (aux == null ) {
                        padre . dcho = nuevo;
                        return ;
                    }
                }
            }
        }
    }
    
    public boolean estaVacia(){
        return raiz==null;
    }
    
    public void inOrden(Nodo r){
        if(r!=null){
            inOrden(r.izdo);
            System.out.println(r.nombre);
            inOrden(r.dcho);
            
        }
    }
    
     public void preOrden(Nodo r){
        if(r!=null){
            System.out.println(r.nombre);
            preOrden(r.izdo);
            preOrden(r.dcho);
            
        }
        
    }
     
     public void postOrden(Nodo r){
        if(r!=null){
            postOrden(r.izdo);
            postOrden(r.dcho);
            System.out.println(r.nombre);
        }
    }
     
     public Nodo buscarNodo(int n){
         Nodo aux=raiz;
         while(aux.nu!=n){
             if(n<aux.nu){
                 aux=aux.izdo;
             }else{
                 aux=aux.dcho;
             }
             if(aux==null){
                 return null;
             }
         }
         return aux;
     }
    
    
}
