package gefangenenDilemma;

public interface GefStrategie {
	
	public boolean getNextDecision();
	
	public void setOpponentsLastDecision(boolean decision);

}
