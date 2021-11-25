import javax.swing.JFrame;

public class GameFrame extends JFrame {

	//Construtor
	public GameFrame() {
	//	GamePanel painel = new GamePanel();
		//funciona da mesma maneira que se eu fosse instanciar
		this.add(new GamePanel());
		this.setTitle("snake");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();//
		this.setLocationRelativeTo(null); // Coloca a janela no meio da tela
	}
}
