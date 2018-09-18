
/**
 * Write a description of class pendulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * calcular el ascensor
 * 
 */
import javax.swing.*;

public class ascensor
{
    public static void main(String[] args){
 int pisomasalto, pisomasbajo, pisoactual;
 String aux;
 int pisosiguiente;
 int accion;
pisoactual=0 ;
 pisosiguiente=0;
 aux=JOptionPane.showInputDialog(null,"escriba cuantos pisos tiene el edificio:");
 pisomasalto=Integer.parseInt(aux);
 
 aux=JOptionPane.showInputDialog(null, "escriba cuantos sotanos tiene el edificio en valor absoluto:");
 pisomasbajo=(Integer.parseInt(aux)*-1)+1;
 
  aux=JOptionPane.showInputDialog(null, "escriba en que piso toma ud el ascensor :");
pisoactual=Integer.parseInt(aux);
 
accion=JOptionPane.showOptionDialog(null, 
"hacia donde se dirige?",
"sube o baja?",
JOptionPane.DEFAULT_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,
new String[]{"subo", "bajo"},
"subo");
switch(accion){
    case 0:
    pisosiguiente=pisoactual+1;
    break;
    case 1:
    pisosiguiente=pisoactual-1;
    break;
}
if (pisosiguiente<pisomasbajo || pisosiguiente>pisomasalto)
    JOptionPane.showMessageDialog(null," ud se sale del rango de pisos del edificio");
if (pisosiguiente==0 && pisoactual==1)
    JOptionPane.showMessageDialog(null," su siguiente piso es"+ -1);
if (pisosiguiente==0 && pisoactual==-1)
    JOptionPane.showMessageDialog(null," su siguiente piso es"+ 1);     
if (pisosiguiente>pisomasbajo && pisosiguiente<pisomasalto && pisosiguiente!=0)
    JOptionPane.showMessageDialog(null," su siguiente piso es"+ pisosiguiente);
  }
}
 











    
  
    
    

 




