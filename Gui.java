package pack1;

import javax.swing.JFrame;
//GUI für das spiel

public class Gui {

	public Gui() {
		Var.jf1 = new JFrame();
		//Länge und Breite von JFrame festlegen
		Var.jf1.setSize(Var.screenWidth,Var.screenHeight);
		
		//Wenn man das Fenster schließt, schließt sich auch das laufende Programm
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame in der Mitte des Bildschirms festlegen (null)
		Var.jf1.setLocationRelativeTo(null);
		
		//Kein spezielles Layout für GUI auswählen
		Var.jf1.setLayout(null);
		
		//Titel für GUI
		Var.jf1.setTitle("TEST");
		
		//Resizable auf false, damit man die Größe des Fensters nicht wärend des spiels mit der Maus ändern kann
		Var.jf1.setResizable(false);
		
		//Fügt dem JFrame ein KeyListener hinzu, damit der JFrame auf den KeyHandler zugreifen kann --> "Tasten lesen"
		Var.jf1.addKeyListener(new KeyHandler());
		
		//Damit der KeyHandler immer auf dem Gui ist die Tastatur immer funktioniert und nicht nur ein Frame lang
		Var.jf1.requestFocus();
		
		//Macht das JFrame sichtbar
		Var.jf1.setVisible(true);
		
		
		//Neues Label erzeugen (Für den Hintergrund)
		Var.lbl1 = new Label();
		
		//Größe des Hintergrundes
		Var.lbl1.setBounds(0,0,Var.screenWidth,Var.screenHeight );
		
		//Label wird dem JFrame hinzugefügt
		Var.jf1.add(Var.lbl1,0);
		
		//Label wird sichtbar gemacht
		Var.lbl1.setVisible(true);
		
	}

}
