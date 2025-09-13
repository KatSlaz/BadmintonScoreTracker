public class Player{
	private String name;
	private String ranking;
	private int score;

		public Player(String name, String ranking){
		this.name=name;
		this.ranking=ranking;
		score=0;
	}

	public void addPoint(){
		score++;
	}
	public int getScore(){
		return score;
	}
	public void setScore(int score){
		this.score = score;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setRanking(String ranking){
		this.ranking= ranking;
	}
	public String getRanking(){
		return ranking;
	}

}