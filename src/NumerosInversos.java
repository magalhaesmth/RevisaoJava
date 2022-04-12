import javax.swing.JOptionPane;

public class NumerosInversos {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite numeros separados por virgula (,)");
		String [] valores = entrada.split(",");
		String saida ="";
		for(int x=valores.length-1; x>=0;x--) {
			saida = saida + valores [x] + "";
			
			System.out.println(valores[x]);
		}
 	}

}