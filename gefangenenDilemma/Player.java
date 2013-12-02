package gefangenenDilemma;

public class Player {
	
	private GefStrategie gefStrategie;
	private int points;
	
	public Player(GefStrategie gefStrategie){
		this.gefStrategie = gefStrategie;
		this.points = 0;
	}
	
	public boolean getNextDecision(){
		return gefStrategie.getNextDecision();
	}
	
	public void setOpponentsLastDecision(boolean decision){
		gefStrategie.setOpponentsLastDecision(decision);
	}
	
	public void addPoints(int p){
		points += p;
	}
	
	public int getPoints(){
		return points;
	}
	
}
