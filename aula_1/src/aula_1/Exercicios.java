package aula_1;

import javax.swing.JOptionPane;

public class Exercicios {

	public static void main(String[] args) {
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		double res = valor1 + valor2;
		JOptionPane.showMessageDialog(null, "Soma: " + res);

	}

}
