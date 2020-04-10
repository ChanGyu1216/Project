import javax.swing.*;
import java.awt.*;

public class Border extends JFrame {
	 public Border() {
		setTitle("BorderLayout Practice");
		setSize(400, 200);
		setLayout(new BorderLayout(5, 7));

		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Border();
	}
}
