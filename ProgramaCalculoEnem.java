package cursojava.executavel;

import javax.swing.JOptionPane;

public class ProgramaCalculoEnem {
	
	public static void main (String [] args) {
		
String nota1 = JOptionPane.showInputDialog("Insira sua nota em Linguagens, Códigos e suas Tecnologias:");
String nota2 = JOptionPane.showInputDialog("Insira sua nota em Ciências Humanas e suas Tecnologias:");		
String nota3 = JOptionPane.showInputDialog("Insira sua nota em Ciências da Natureza e suas Tecnologias: ");	
String nota4 = JOptionPane.showInputDialog("Insira sua nota em Matemática e suas Tecnologias: ");	
String nota5 = JOptionPane.showInputDialog("Insira sua nota em Redação:");	
	
double dnota1 = Double.parseDouble(nota1);
double dnota2 = Double.parseDouble(nota2);
double dnota3 = Double.parseDouble(nota3);
double dnota4 = Double.parseDouble(nota4);
double dnota5 = Double.parseDouble(nota5);

double media = (dnota1 + dnota2 + dnota3 + dnota4+ dnota5) / 5;

	if(media >= 800) {
	JOptionPane.showMessageDialog(null, "Parabéns! Você atingiu: " + media + " com esta nota é possivel ingresso em cursos concorridos em universidades públicas.");
} else if (media >=450) {
	JOptionPane.showMessageDialog(null, "Você atingiu a média exigida pelo ENEM: " + media + " Confira se não zerou a sua redação.");
} else {
	JOptionPane.showMessageDialog(null, "Sua média é: " + media);
}


	}

}
