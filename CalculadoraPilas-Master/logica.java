package calculadorapilas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class logica {
    
    PilaString pilaSt;
    PilaFloat pilaFt;
    String [] matriz; 
    int topePila=0;
    int a=0;
    int b =0;
    public logica(){
        pilaSt = new PilaString();
        pilaFt= new PilaFloat();
        matriz = new String[5];
        
        matriz[0]= "+";
        matriz[1]= "-";
        matriz[2]= "*";
        matriz[3]= "/";
        matriz[4]= "^";
             
        
    }
    public void operador(ArrayList<String> in){
        
        for(int i=0;i< in.size(); i++){
            if(in.get(i) == "+" || in.get(i) == "-" || in.get(i) == "*"|| in.get(i) == "/"|| in.get(i) == "^" ){
               for(int j= 0; j< matriz.length; j++){
                if(in.get(i) == matriz[j]){
                     a= j;
                 }
                 if(pilaSt.vacia()==false ){
                 if(pilaSt.tope_Pila().equals(matriz[j])){
                     b=j;
                     
                    }
                 }
               }
               if(a >b){
                   topePila =1;
               }
               else{
                   topePila=0;
               }
               if(topePila==1){
               while(topePila == 1 && !pilaSt.vacia()){
                   JOptionPane.showMessageDialog(null, "Saco " + pilaSt.tope_Pila());
                   pilaSt.ret_Pila();
                   pilaSt.ins_Pila(in.get(i));
                   JOptionPane.showMessageDialog(null, "PostFijo " + pilaSt.tope_Pila());
                   topePila=0;
               }
               
               }
               JOptionPane.showMessageDialog(null, "PostFijo " + pilaSt.tope_Pila());
               
                   
            }
        }
    }
    
}
