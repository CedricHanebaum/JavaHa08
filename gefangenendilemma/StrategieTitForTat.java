package javaHa08;

public class StrategieTitForTat implements GefStrategie {
	
	private boolean enemysLastDecision = true;

	@Override
	public boolean getNextDecision() {
		return enemysLastDecision;
	}

	@Override
	public void setOpponentsLastDecision(boolean decision) {
		enemysLastDecision = decision;
	}

}
