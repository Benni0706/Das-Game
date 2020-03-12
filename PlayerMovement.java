package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	Timer movement;
	public PlayerMovement() {
		movement = new Timer();
		//Alles was in run() steht, wird alle 10ms ausgef�hrt
		movement.scheduleAtFixedRate(new  TimerTask() {

			@Override
			public void run() {
				
				//Wenn obere Taste gedr�ckt nach oben gehen
				if(Var.moveUp == true) {
					if(Var.y>0) {
						Var.y -= Var.speedUp;
					}
					
				//Wenn untere Taste gedr�ckt nach unten gehen	
				}else if(Var.moveDown == true) {
					if(Var.y<=490) {
						Var.y += Var.speedDown;
					}
				}
				
				//Wenn linke Taste gedr�ckt nach links gehen		
				if(Var.moveLeft == true) {
					if(Var.x>0) {
						Var.x -= Var.speedLeft;
					}
				
				//Wenn rechte Taste gedr�ckt nach rechts gehen	
				}else if(Var.moveRight == true) {
					if(Var.x<=730) {
						Var.x += Var.speedRight;
					}
				}
				
			}
			
		}, 0, 10);							//f�ngt bei 0ms an und f�hrt alle 10ms aus
	}

}
