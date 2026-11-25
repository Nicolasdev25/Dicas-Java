import javax.swing.*;

public class Calculadora {
    public static void main(String[] args){
        Integer numero1= 0;
        Integer numero2 = 0;
        Integer resultado = 0;
        String strNumero1 = "";
        String strNumero2 = "";

        

        String opcao = JOptionPane.showInputDialog("SOMAR INFORME: 1\n"+
                "MULTIPLICAR INFORME: 2\n" +
                "SUBTRAIR INFORME: 3\n" +
                "DIVIDIR INFORME: 4\n");
    Integer intOpcao = Integer.parseInt(opcao);

    switch (intOpcao) {
        case 1:{
            strNumero1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
            strNumero2 = JOptionPane.showInputDialog("Informe o segundo numero: ");

            numero1 = Integer.parseInt(strNumero1);
            numero2 = Integer.parseInt(strNumero2);

            resultado = numero1 + numero2;

            JOptionPane.showMessageDialog(null, "resultado da soma: " + resultado);

            break;
        }

        case 2:{
            strNumero1 = JOptionPane.showInputDialog("Informe o primeiro numero: ");
            strNumero2 = JOptionPane.showInputDialog("Informe o segundo numero: ");

            numero1 = Integer.parseInt(strNumero1);
            numero2 = Integer.parseInt(strNumero2);

            resultado = numero1 * numero2;

            JOptionPane.showMessageDialog(null,"resultado da soma: "+ resultado);

            break;
        }   

       
        default:
            break;
    }

    }
}
