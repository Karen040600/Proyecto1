
package clase_10;

import javax.swing.JOptionPane;

public class Figuras {
    
    public void cuadrado(){
        int lado, area;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el lado del cuadrado"));
        area = lado*lado;
        JOptionPane.showMessageDialog(null, "El área del cuadrado es :" +area);
    }
    
    public void triangulo(){
        double base, altura, area;
        base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
        area = (base * altura)/2;
        JOptionPane.showMessageDialog(null, "El área del triangulo es :" +area);
    
    }
    
    public void circulo(){
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
        area = 3.14 * Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El área del circulo es :" +area);
    
    }
    
}
