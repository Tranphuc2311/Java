package hoctap;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class zoominzoomout extends JFrame {
	JButton btIn = new JButton("Zoom In");
	JButton btOut = new JButton("Zoom Out");
	int R3 = 30;
	int x3 = 350;
	int y3 = 350;
	int R = 230;
	int x = 250;
	int y = 250;
	int R1 = 150;
	int x1 = 290;
	int y1 = 290;
	int R2 = 70;
	int x2 = 330;
	int y2 = 330;

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval(x, y, R, R);

		g.setColor(Color.PINK);
		g.fillOval(x1, y1, R1, R1);
		g.setColor(Color.BLACK);
		g.setColor(Color.GREEN);
		g.fillOval(x2, y2, R2, R2);
		g.setColor(Color.YELLOW);
		g.fillOval(x3, y3, R3, R3);
		g.setColor(Color.BLACK);

		g.drawString("design by me", 500, 350);
	}

	public zoominzoomout() {
		setTitle("zoominzoomout");

		setSize(800, 800);
		setLayout(null);
		setLocationRelativeTo(null);
		add(btIn);
		add(btOut);
		btIn.setBounds(270, 10, 100, 70);
		btOut.setBounds(380, 10, 100, 70);

	}

	public void ZoomIn() {
		btIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				R -= 10;
				x += 5;
				y += 5;
				x1 += 5;
				y1 += 5;
				R1 -= 10;
				x2 += 5;
				y2 += 5;
				R2 -= 10;
				x3 += 5;
				y3 += 5;
				R3 -= 10;
				repaint();
			}
		});
	}

	public void ZoomOut() {
		btOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				R += 10;
				x -= 5;
				y -= 5;
				x1 -= 5;
				y1 -= 5;
				R1 += 10;
				x2 -= 5;
				y2 -= 5;
				R2 += 10;
				x3 -= 5;
				y3 -= 5;
				R3 += 10;
				repaint();
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zoominzoomout wMain = new zoominzoomout();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
		wMain.ZoomIn();
		wMain.ZoomOut();

	}

}
