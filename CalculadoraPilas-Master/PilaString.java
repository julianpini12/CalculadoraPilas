package calculadorapilas;


public class PilaString {
    NodoString p;
    
    public PilaString(){
        p= null;
    }
    public void ins_Pila(String x){
         
        NodoString n = new NodoString(x);
        n.sig = p;
        p= n;
    }
    public String ret_Pila(){
        String t = p.info;
        p= p.sig;
        return t;
    }
    public String tope_Pila(){
        return p.info;
    }
    public boolean vacia(){
        return !(p!=null);
    }
    
}
