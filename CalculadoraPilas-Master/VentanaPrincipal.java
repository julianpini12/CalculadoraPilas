package calculadorapilas;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{

    private JButton cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,punto,mas,menos,multi,div,elev,op;
    private JTextField caja,cajaAux;
    private ArrayList<String> arr = new ArrayList<String>();
    private String texto="";
    private String textoAux="";
    private logica log;
    
    public VentanaPrincipal(){
        log = new logica();
    this.setTitle("Calculadora");
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(350,400);
	this.setVisible(true);	
	this.setResizable(false);
	this.setLocationRelativeTo(null);			
	
	this.setLayout(null);
        cero = new JButton("0");
        uno = new JButton("1");
        dos = new JButton("2");
        tres = new JButton("3");
        cuatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        siete = new JButton("7");
        ocho = new JButton("8");
        nueve = new JButton("9");
        
        punto = new JButton(".");
        mas = new JButton("+");
        menos = new JButton("-");
        multi = new JButton("*");
        div = new JButton("/");
        elev = new JButton("^");
        op = new JButton("=");
        
        cero.setActionCommand("0");
        cero.addActionListener(this);
        uno.setActionCommand("1");
        uno.addActionListener(this);
        dos.setActionCommand("2");
        dos.addActionListener(this);
        tres.setActionCommand("3");
        tres.addActionListener(this);
        cuatro.setActionCommand("4");
        cuatro.addActionListener(this);
        cinco.setActionCommand("5");
        cinco.addActionListener(this);
        seis.setActionCommand("6");
        seis.addActionListener(this);
        siete.setActionCommand("7");
        siete.addActionListener(this);
        ocho.setActionCommand("8");
        ocho.addActionListener(this);
        nueve.setActionCommand("9");
        nueve.addActionListener(this);
            
        punto.setActionCommand(".");
        punto.addActionListener(this);
        mas.setActionCommand("+");
        mas.addActionListener(this);
        menos.setActionCommand("-");
        menos.addActionListener(this);
        multi.setActionCommand("*");
        multi.addActionListener(this);
        div.setActionCommand("/");
        div.addActionListener(this);
        elev.setActionCommand("^");
        elev.addActionListener(this);
        op.setActionCommand("=");
        op.addActionListener(this);
        
        caja = new JTextField();
        cajaAux = new JTextField();
        
        cajaAux.setEditable(false);
        caja.setEditable(false);
        
        
        cajaAux.setBounds(10,0,315,25);
        caja.setBounds(10,25,315,40);
        
        nueve.setBounds(10,80,50,40);
        ocho.setBounds(70,80,50,40);
        siete.setBounds(130,80,50,40);
        punto.setBounds(190,80,50,40);
        
        seis.setBounds(10,140,50,40);
        cinco.setBounds(70,140,50,40);
        cuatro.setBounds(130,140,50,40);
        mas.setBounds(190,140,50,40);
        
        tres.setBounds(10,200,50,40);
        dos.setBounds(70,200,50,40);
        uno.setBounds(130,200,50,40);
        menos.setBounds(190,200,50,40);
        
        cero.setBounds(10,260,50,40);
        multi.setBounds(70,260,50,40);
        div.setBounds(130,260,50,40);
        elev.setBounds(190,260,50,40);
        
        op.setBounds(10,320,50,40);
        this.add(cajaAux);
        this.add(caja);
        this.add(nueve);
        this.add(ocho);
        this.add(siete);
        this.add(punto);
        this.add(seis);
        this.add(cinco);
        this.add(cuatro);
        this.add(mas);
        this.add(uno);
        this.add(dos);
        this.add(tres);
        this.add(menos);
        this.add(cero);
        this.add(multi);
        this.add(div);
        this.add(elev);
        this.add(op);
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
        repaint();
		
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    	if(e.getActionCommand().equals("0")){
    		texto += "0";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("1")){
    		texto += "1";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("2")){
    		texto += "2";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("3")){
    		texto += "3";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("4")){
    		texto += "4";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("5")){
    		texto += "5";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("6")){
    		texto += "6";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("7")){
    		texto += "7";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("8")){
    		texto += "8";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals("9")){
    		texto += "9";
    		caja.setText(texto);
    	}
    	if(e.getActionCommand().equals(".")){
    		texto += ".";
    		caja.setText(texto);
    		punto.setEnabled(false);
    	}
    	
    	if(e.getActionCommand().equals("+")){
    		arr.add(texto);
    		texto += "+";
    		caja.setText("");
    		textoAux += texto;
    		cajaAux.setText(textoAux);
    		arr.add("+");
    		punto.setEnabled(true);
    		texto ="";
    	}
    	if(e.getActionCommand().equals("-")){
    		arr.add(texto);
    		texto += "-";
    		caja.setText("");
    		textoAux += texto;
    		cajaAux.setText(textoAux);
    		arr.add("-");
    		punto.setEnabled(true);
    		texto ="";
    	}
    	if(e.getActionCommand().equals("*")){
    		arr.add(texto);
    		texto += "*";
    		caja.setText("");
    		textoAux += texto;
    		cajaAux.setText(textoAux);
    		arr.add("*");
    		
    		texto ="";
    	}
    	if(e.getActionCommand().equals("/")){
    		arr.add(texto);
    		texto += "/";
    		caja.setText("");
    		textoAux += texto;
    		cajaAux.setText(textoAux);
    		arr.add("/");
    		punto.setEnabled(true);
    		texto ="";
    	}
    	if(e.getActionCommand().equals("^")){
    		arr.add(texto);
    		texto += "^";
    		caja.setText("");
    		textoAux += texto;
    		cajaAux.setText(textoAux);
    		arr.add("^");
    		punto.setEnabled(true);
    		texto ="";
    	}
        if(e.getActionCommand().equals("=")){
    		arr.add(texto);
    		caja.setText("");
    		textoAux += texto;
    		cajaAux.setText(textoAux);
    		punto.setEnabled(true);
    		texto ="";
                log.operador(arr);
    	}
    }
    
}
