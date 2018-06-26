import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJButton01{
	static boolean somar = false;
	//static int valor = -5;
	
	public static void main(String[] args){

		JFrame tela =  new JFrame("Menu primeiro botão");
		tela.setSize(300, 400);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame
			.EXIT_ON_CLOSE);

		JButton botao01 = new JButton();
		botao01.setText("Não Clique aqui!");
		botao01.setSize(200, 20);
		botao01.setLocation(10, 20);

		botao01.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//JOptionPane.showMessageDialog(null, "Eu te avisei KRL!");

				botao01.setLocation(
					botao01.getX() + 20,
					botao01.getY() + 20
				);
				if(botao01.getHeight() - 5 <= 0){
					somar = true;
				}

				if(!somar){
					botao01.setSize(
						botao01.getWidth(),
						botao01.getHeight() - 5
					);
				}else{
					botao01.setSize(
						botao01.getWidth(),
						botao01.getHeight() + 5
					);
				}
			}
		});

		tela.add(botao01);

		tela.setVisible(true);

	}
}