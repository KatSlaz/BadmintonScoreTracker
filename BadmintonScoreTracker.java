import java.util.Scanner;
public class BadmintonScoreTracker{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		boolean winner = false;
		String[] names = gettingPlayerNames(input);
		String[] rankings = gettingPlayerRankings(input, names);
		Game game = new Game(names[0],rankings[0], names[1], rankings[1]);
		game.showScore();

		while(!winner){
			pointUpdate(input, names,game);
			game.showScore();
			winner = game.checkWinner();
		}
	}

	public static String[] gettingPlayerNames(Scanner input){
		System.out.print("Please enter the first player/team name: ");
		String name1= input.nextLine();
		System.out.print("Please enter the second player/team name: ");
		String name2= input.nextLine();
		return new String[] {name1, name2};
	}
	public static String[] gettingPlayerRankings(Scanner input, String[] names){
		String ranking1="Unranked";
		String ranking2="Unranked";
		System.out.print("Is "+names[0]+" ranked? (y/n): ");
		if( input.nextLine().equals("y")){
			System.out.print("Please enter "+names[0]+ "'s rank: ");
			ranking1=""+input.nextLine();
		}
		System.out.print("Is "+names[1]+" ranked? (y/n): ");
		if( input.nextLine().equals("y")){
			System.out.print("Please enter "+names[1]+ "'s rank: ");
			ranking2=""+input.nextLine();
		}
		return new String[] {ranking1, ranking2};
	}
	public static void pointUpdate(Scanner input, String[]names, Game game){
		System.out.print("Who won the point? (1 for "+names[0]+", 2 for "+names[1]+"): ");
		if (input.nextLine().equals("1"))
			game.scorePoint(1);
		else game.scorePoint(2);
	}
}