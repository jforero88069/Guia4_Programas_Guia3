
/**
 * Write a description of class pendulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * calcular el periodo de oscilacion de un pendulo
 * 
 */
import javax.swing.*;

public class pendulo
{
    public static void main(String[] args){
 double longitud, gravedad;
 String aux;
 double periodo;
 
 aux=JOptionPane.showInputDialog(null,"escriba la longitud en metros:");
 longitud=Double.parseDouble(aux);
 
 aux=JOptionPane.showInputDialog(null, "escriba la gravedad en metros sobre segundos al cuadrado, normalmente en la tierra es 9.807, o marte es 3.711 usar punto en vez de coma :");
 gravedad=Double.parseDouble(aux);
 
 periodo=Math.sqrt(gravedad/longitud); 
 JOptionPane.showMessageDialog(null,"el periodo del pendulo es:" + periodo );
}
}