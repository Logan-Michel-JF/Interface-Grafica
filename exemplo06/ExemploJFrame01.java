import java.awt.Color;
import javax.swing.JFrame;
public class ExemploJFrame01{
	
	public static void main(String[] args){
		// cria uma tela
		JFrame tela = new JFrame();
		// define o tamanho de uma janela
		//width ↔, height↨
		tela.setSize(500,500);
		// diz que o layout é nulo
		tela.setLayout(null);
		// passando nulo ele centraliza a janela
		tela.setLocationRelativeTo(null);

		//diz que quando o usuario fechar a aplicação
		//irá ecerrar o aplicativo
		tela.setDefaultCloseOperation(JFrame
			.EXIT_ON_CLOSE);

		// define o titulo da janela
		tela.setTitle("HELLO WORLD");

		//import java.awt.Color;
		tela.getContentPane().setBackground(
			Color.decode("#29fced"));

		//apresenta a janela
		tela.show();
	}
}