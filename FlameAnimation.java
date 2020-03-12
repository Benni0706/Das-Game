package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class FlameAnimation {
	Timer flameAnimation;
	private int temp = 0;

	public FlameAnimation() {
		flameAnimation = new Timer();
		//Alles was in run() steht, wird alle 150ms ausgeführt
		flameAnimation.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				//temp wechselt die ganze zeit zwischen 0 und 1;
				//Je nach dem was temp ist wird bei der Label-Klasse entweder flame1 oder flame2 grafisch dargestellt
				if (temp == 0) {
					Var.flameAnimation = 0;
					temp++;
				} else if (temp == 1) {
					Var.flameAnimation = 1;
					temp--;
				}

			}

		}, 0, 150);						//fängt bei 0ms an und führt alle 150ms aus
	}

}
