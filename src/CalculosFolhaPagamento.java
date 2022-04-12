import javax.swing.JOptionPane;

public class CalculosFolhaPagamento{
public static void main (String[] args) {
	double horas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas"));
	double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora"));
	FolhaPagamento folhaAlice = new FolhaPagamento();
	folhaAlice.setQuantidadeHoras(horas);
	folhaAlice.setValorHoras(valorHora);
	System.out.println(folhaAlice);
	}
}