import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Grid extends JFrame {

	Grid() {
		setSize(500, 200);
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 10));
		
		Color color;

		for (Integer i = 0; i < 10; i++) {

			Component comp = add(new JButton(i.toString()));
			Random ran = new Random();
			int r = ran.nextInt(200);
			int g = ran.nextInt(200);
			int b = ran.nextInt(200);
			color = new Color(r, g, b);
			comp.setBackground(color);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Grid();
	}
}
