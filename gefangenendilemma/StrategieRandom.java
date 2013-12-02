package gefangenendilemma;

import java.util.Random;

public class StrategieRandom implements GefStrategie {

	@Override
	public boolean getNextDecision() {
		Random r = new Random();
		return r.nextBoolean();
	}

	@Override
	public void setOpponentsLastDecision(boolean decission) {}

}