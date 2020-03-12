package pack1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
	// SerielVersion wird bei JLabel automatisch erstellt
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		// Graphics2D sorgt dafür dass man Grafiken anzeigen kann
		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		// mit drawImage kann man Grafiken anzeigen lassen. z.b. iRakete ist die Rakete
		// die angezeigt wird
		// "Zeichnet" den Hintergrund
		g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

		// Zeichnet die Flamme (flame1 und flame2 wechseln)
		if (Var.flameAnimation == 0) {
			g.drawImage(Var.iFlame1, Var.x, Var.y + 70, 50, 50, null);
		} else if (Var.flameAnimation == 1) {
			g.drawImage(Var.iFlame2, Var.x, Var.y + 70, 50, 50, null);
		}
		
		// Zeichnet die Rakete
		g.drawImage(Var.iRakete, Var.x, Var.y, 50, 70, null);

		// Repaint() damit es in jedem Frame repainted wird
		repaint();
	}

}
