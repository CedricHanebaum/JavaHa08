package gefangenendilemma;

public class StrategieSpite implements GefStrategie {
	
	private boolean nextDecision = true;

	@Override
	public boolean getNextDecision() {
		return nextDecision;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		if(!decision) nextDecision = false;
	}

}
