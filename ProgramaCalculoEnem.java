package cursojava.executavel;

import javax.swing.JOptionPane;

public class ProgramaCalculoEnem {
	
	public static void main (String [] args) {
		
String nota1 = JOptionPane.showInputDialog("Insira sua nota em Linguagens, C�digos e suas Tecnologias:");
String nota2 = JOptionPane.showInputDialog("Insira sua nota em Ci�ncias Humanas e suas Tecnologias:");		
String nota3 = JOptionPane.showInputDialog("Insira sua nota em Ci�ncias da Natureza e suas Tecnologias: ");	
String nota4 = JOptionPane.showInputDialog("Insira sua nota em Matem�tica e suas Tecnologias: ");	
String nota5 = JOptionPane.showInputDialog("Insira sua nota em Reda��o:");	
	
double dnota1 = Double.parseDouble(nota1);
double dnota2 = Double.parseDouble(nota2);
double dnota3 = Double.parseDouble(nota3);
double dnota4 = Double.parseDouble(nota4);
double dnota5 = Double.parseDouble(nota5);

double media = (dnota1 + dnota2 + dnota3 + dnota4+ dnota5) / 5;

	if(media >= 800) {
	JOptionPane.showMessageDialog(null, "Parab�ns! Voc� atingiu: " + media + " com esta nota � possivel ingresso em cursos concorridos em universidades p�blicas.");
} else if (media >=450) {
	JOptionPane.showMessageDialog(null, "Voc� atingiu a m�dia exigida pelo ENEM: " + media + " Confira se n�o zerou a sua reda��o.");
} else {
	JOptionPane.showMessageDialog(null, "Sua m�dia �: " + media);
}


	}

}
