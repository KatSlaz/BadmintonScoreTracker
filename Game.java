public class Game{
	private Player p1;
	private Player p2;

	public Game(String name1, String ranking1, String name2, String ranking2){
		p1= new Player(name1, ranking1);
		p2 = new Player(name2, ranking2);
	}

	public void scorePoint(int p){
		if (p==1)
			p1.addPoint();
		else p2.addPoint();
	}

	public boolean checkWinner(){
		if (p1.getScore() >=21 && p1.getScore() > p2.getScore() +1){
			System.out.println(p1.getName() + " has won the game!");
			return true;
		}
		if(p2.getScore() >=21 && p2.getScore() > p1.getScore() +1 ){
			System.out.println(p2.getName() + " has won the game!");
			return true;
		}
		else return false;
	}
	public void showScore(){
		System.out.printf("%n%-20s | %-10s | %5s%n","Name","Ranking","Score");
		System.out.println("-".repeat(50));
		System.out.printf("%-20s | %-10s | %-5d%n",p1.getName(),p1.getRanking(), p1.getScore());
		System.out.println("-".repeat(50));
		System.out.printf("%-20s | %-10s | %-5d%n",p2.getName(),p2.getRanking(), p2.getScore());
		System.out.println("-".repeat(50) + "\n");
	}
}