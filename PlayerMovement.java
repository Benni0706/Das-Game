package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
	Timer movement;
	public PlayerMovement() {
		movement = new Timer();
		//Alles was in run() steht, wird alle 10ms ausgeführt
		movement.scheduleAtFixedRate(new  TimerTask() {

			@Override
			public void run() {
				
				//Wenn obere Taste gedrückt nach oben gehen
				if(Var.moveUp == true) {
					if(Var.y>0) {
						Var.y -= Var.speedUp;
					}
					
				//Wenn untere Taste gedrückt nach unten gehen	
				}else if(Var.moveDown == true) {
					if(Var.y<=490) {
						Var.y += Var.speedDown;
					}
				}
				
				//Wenn linke Taste gedrückt nach links gehen		
				if(Var.moveLeft == true) {
					if(Var.x>0) {
						Var.x -= Var.speedLeft;
					}
				
				//Wenn rechte Taste gedrückt nach rechts gehen	
				}else if(Var.moveRight == true) {
					if(Var.x<=730) {
						Var.x += Var.speedRight;
					}
				}
				
			}
			
		}, 0, 10);							//fängt bei 0ms an und führt alle 10ms aus
	}

}
