import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class ExemploJButton02{
	
	public static void main(String[] args){

		JFrame tela = new JFrame("HOVER");
		tela.setSize(500, 500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton botao = new JButton("Brasil");
		botao.setSize(400, 300);
		botao.setLocation(45, 140);

		//remove a borda ao redor do texto
		botao.setFocusPainted(false);
		//remove a borda ao redor do botão
		botao.setBorderPainted(false);

		botao.addMouseListener(new MouseAdapter(){
			//evento quando o mouse entra no botao
			@Override
			public void mouseEntered(MouseEvent e){
				botao.setBackground(Color.decode("#34af4b"));
			}
			//evento quando o mouse sai no botao
			@Override
			public void mouseExited(MouseEvent e){
				botao.setBackground(Color.decode("#f9e900"));
			}
		});

		tela.add(botao);

		tela.setVisible(true);
	}
}