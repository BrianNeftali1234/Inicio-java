import javax.swing.*;

public class Main {
    public static void main (String[] args){
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un Decimal: "));

        JOptionPane.showMessageDialog(null, "La cadena que ingreso es: " + cadena);
        JOptionPane.showMessageDialog(null, "El numero entero que ingreso es: " + entero);
        JOptionPane.showMessageDialog(null, "El caracter que ingreso es: " + letra);
        JOptionPane.showMessageDialog(null, "EL decimal que ingreso es: " + decimal);
    }
}
