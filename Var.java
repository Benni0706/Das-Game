package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

//Hier sind alle wichtigen Variablen
public class Var {
	// Erstellt ein JFrame für das GUI
	public static JFrame jf1;

	// Breite und Höhe für das GUI Fenster
	public static int screenWidth = 800;
	public static int screenHeight = 600;
	
	//Koordinaten von den Hintergrundbildern (Bei beiden ist x = 0)
	//Es gibt zwei Hintergrundbilder, weil der Hintergrund sich bewegen soll und die Hintergrundbilder dann immer hintereinander verlaufen
	
	public static int backgroundY1 = 0;
	public static int backgroundY2 = -600;
	
	//Geschwindigkeit mit der sich der Hintergrund bewegt
	public static int backgroundSpeed = 9;
	
	//Koordinaten für Rakete
	public static int x = 400;
	public static int y = 400;
	
	//Geschwindigkeiten der Rakete
	public static int speedUp = 3;
	public static int speedDown = 2;
	public static int speedLeft = 2;
	public static int speedRight = 2;
	
	//flameAnimation zeigt welche Grafik der Flamme aktiv ist
	public static int flameAnimation;
	
	// Variablen die die Bewegung festlegen
	public static boolean moveUp = false;
	public static boolean moveDown = false;
	public static boolean moveLeft = false;
	public static boolean moveRight = false;

	// Label erstellen (Für Hintergrund)
	public static Label lbl1;

	//Hintergründe Grafik deklarieren
	public static BufferedImage ib1;
	public static BufferedImage ib2;
	
	//Raketen Graik deklarieren
	public static BufferedImage iRakete;
	
	//Flammen Grafik deklarieren
	public static BufferedImage iFlame1;
	public static BufferedImage iFlame2;
	
	

	public Var() {

		try {
			// Hintergrundbild Grafik wird definiert
			ib1 = ImageIO.read(new File("recources/TEST.png"));
			ib2 = ImageIO.read(new File("recources/TEST.png"));
			
			//Rakete Grafik
			iRakete = ImageIO.read(new File("recources/Rakete.png"));
			
			//Flammen Grafik
			iFlame1 = ImageIO.read(new File("recources/Flame1.png"));
			iFlame2 = ImageIO.read(new File("recources/Flame2.png"));
		} catch (IOException e) {
			
			// Falls ein Fehler kommt
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		
		}

	}

}
