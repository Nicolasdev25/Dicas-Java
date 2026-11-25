import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args){
		System.out.println("Hello Word");
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		JOptionPane.showMessageDialog(null, "Estou Aprendendo Java: " + nome);
		}


}