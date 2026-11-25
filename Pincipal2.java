import javax.swing.*;


public class Pincipal2 {
    
    public static void main(String[] args){  //padrao 
        String strNumero1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
        String strNumero2 = JOptionPane.showInputDialog("Informe o segundo nunero: ");
        String strNumero3 = JOptionPane.showInputDialog("Informe o terceiro numero: ");
        String strNumero4 = JOptionPane.showInputDialog("Informe o quarto numero: ");
        String strNumero5 = JOptionPane.showInputDialog("Informe o quinto numero: ");


        int numero1 = Integer.parseInt(strNumero1);
        int numero2 = Integer.parseInt(strNumero2);
        int numero3 = Integer.parseInt(strNumero3);
        int numero4 = Integer.parseInt(strNumero4);
        int numero5 = Integer.parseInt(strNumero5);


        int resultado = ( numero1 + numero2 ) + numero3 * numero4 / numero5;

        System.out.println(resultado);

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
