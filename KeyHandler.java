package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//Die Befehle die von der Tastatur ausgehen
public class KeyHandler implements KeyListener {		//KeyListener ist eine Klasse die die Tastatur ließt
	
	//Wenn eine Taste gedrückt gehalten wird
	@Override
	public void keyPressed(KeyEvent e) {
		
		//Wenn die Pfeil-nach-oben-Taste gedrückt gehalten wird
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveUp = true;
		}
		//Wenn die Pfeil-nach-unten-Taste gedrückt gehalten wird
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.moveDown = true;
		}
		//Wenn die Pfeil-nach-rechts-Taste gedrückt gehalten wird
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveRight = true;
		}
		//Wenn die Pfeil-nach-links-Taste gedrückt gehalten wird
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveLeft = true;
		}
		
	}
	
	//Wenn eine Taste losgelassen wird
	@Override
	public void keyReleased(KeyEvent e) {
	
		//Wenn die Pfeil-nach-oben-Taste wieder losgelassen wird
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveUp = false;
		}
		//Wenn die Pfeil-nach-unten-Taste wieder losgelassen wird
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.moveDown = false;
		}
		//Wenn die Pfeil-nach-rechts-Taste wieder losgelassen wird
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveRight = false;
		}
		//Wenn die Pfeil-nach-links-Taste wieder losgelassen wird
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveLeft = false;
		}
	}
	
	
	//Wenn eine Taste getippt wird. Braucht man bei diesem Test nicht
	@Override
	public void keyTyped(KeyEvent e) {
	}
	

}
