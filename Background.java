package pack1;

import java.util.Timer;
import java.util.TimerTask;
//Klasse Background ist zum bewegen des Hintergrundes da
public class Background {
	Timer back;
	public Background() {
		back = new Timer();
		back.scheduleAtFixedRate(new TimerTask(){

			@Override
			public void run() {
				/*Wenn der erste Background den y-Wert >590 erreicht wird er wieder nach oben gesetzt und der andere
				 Hintergrund läuft weiter. Dadurch dass die beiden Hintergründe versetzt sind , sieht es so aus als
				 würde es eine fließende Animation geben.
				 */
				if(Var.backgroundY1<=590) {
					Var.backgroundY1 += 2;
				}else {
					Var.backgroundY1 = -600;
				}
				
				if(Var.backgroundY2<=590) {
					Var.backgroundY2 += 2;
				}else {
					Var.backgroundY2  = -600;
				}
				
			}
			
		}, 0, Var.backgroundSpeed);
	}

}
