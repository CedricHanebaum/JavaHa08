package gefangenenDilemma;

public class GefDilemma {

	private Player player1;
	private Player player2;

	public GefDilemma(GefStrategie str1, GefStrategie str2) {
		super();
		this.player1 = new Player(str1);
		this.player2 = new Player(str2);
	}

	public void spiele(int n) {
		for (int i = 0; i < n; i++) {
			this.turn();
		}
	}

	private void turn() {
		boolean p1, p2;
		p1 = player1.getNextDecision();
		p2 = player2.getNextDecision();

		if (p1 ^ p2) {
			if (p1) {
				player1.addPoints(5);
			} else {
				player2.addPoints(5);
			}
		} else {
			if (p1) {
				player1.addPoints(2);
				player2.addPoints(2);
			} else {
				player1.addPoints(5);
				player2.addPoints(5);
			}
		}
		
		player1.setOpponentsLastDecision(p2);
		player2.setOpponentsLastDecision(p1);
	}

}
