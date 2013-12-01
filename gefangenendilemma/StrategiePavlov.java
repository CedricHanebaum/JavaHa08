package gefangenendilemma;

public class StrategiePavlov implements GefStrategie{

	private boolean lastDecision;
	private boolean nextDecision = true;
	
	@Override
	public boolean getNextDecision() {
		lastDecision = nextDecision;
		return nextDecision;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		if(decision != lastDecision) nextDecision = false;
		else nextDecision = true;
	}

}
