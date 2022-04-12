import javax.swing.JOptionPane;

public class Idades {
		public static void main(String[] args) {
		
			int age;
			age = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
			
			if(age> 0 && age<=11) {
				System.out.println("Você ainda é criança");
			}
			
			else if (age>= 12 && age<=17) {
				System.out.println("Você ja é adolescente");
			}
			
			else if (age>= 18 && age<=60) {
				System.out.println("Você é adulto");
			}
			
			else if (age>=61 && age<=115) {
				System.out.println("Você esta velho");
			}
			
			else {
				System.out.println("Error");
			}
		}

	}
