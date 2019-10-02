package calculadorapilas;
public class PilaFloat {
     
    NodoFloat p;
    
    public PilaFloat(){
        p= null;
    }
    public void ins_Pila(float x){
         
        NodoFloat n = new NodoFloat(x);
        n.sig = p;
        p= n;
    }
    public float ret_Pila(){
        float t = p.info;
        p= p.sig;
        return t;
    }
    public float tope_Pila(){
        return p.info;
    }
    public boolean vacia(){
        return !(p!=null);
    }
}
