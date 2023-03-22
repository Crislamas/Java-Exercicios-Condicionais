import javax.swing.JOptionPane;

public class Ex4 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOption.showInputDialog("Digite um número inteiro"));
		
		if(num%2 == 0) JOption.showMessageDialog(null, "Número par");
		else JOption.showMessageDialog(null, "Número Ímpar");
	}

}
