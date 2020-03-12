package pack1;

import javax.swing.JFrame;
//GUI f�r das spiel

public class Gui {

	public Gui() {
		Var.jf1 = new JFrame();
		//L�nge und Breite von JFrame festlegen
		Var.jf1.setSize(Var.screenWidth,Var.screenHeight);
		
		//Wenn man das Fenster schlie�t, schlie�t sich auch das laufende Programm
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame in der Mitte des Bildschirms festlegen (null)
		Var.jf1.setLocationRelativeTo(null);
		
		//Kein spezielles Layout f�r GUI ausw�hlen
		Var.jf1.setLayout(null);
		
		//Titel f�r GUI
		Var.jf1.setTitle("TEST");
		
		//Resizable auf false, damit man die Gr��e des Fensters nicht w�rend des spiels mit der Maus �ndern kann
		Var.jf1.setResizable(false);
		
		//F�gt dem JFrame ein KeyListener hinzu, damit der JFrame auf den KeyHandler zugreifen kann --> "Tasten lesen"
		Var.jf1.addKeyListener(new KeyHandler());
		
		//Damit der KeyHandler immer auf dem Gui ist die Tastatur immer funktioniert und nicht nur ein Frame lang
		Var.jf1.requestFocus();
		
		//Macht das JFrame sichtbar
		Var.jf1.setVisible(true);
		
		
		//Neues Label erzeugen (F�r den Hintergrund)
		Var.lbl1 = new Label();
		
		//Gr��e des Hintergrundes
		Var.lbl1.setBounds(0,0,Var.screenWidth,Var.screenHeight );
		
		//Label wird dem JFrame hinzugef�gt
		Var.jf1.add(Var.lbl1,0);
		
		//Label wird sichtbar gemacht
		Var.lbl1.setVisible(true);
		
	}

}
