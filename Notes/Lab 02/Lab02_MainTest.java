public class MainTest {
	public static void main(String[] args) {
		
		Player player1 = new Player("Player One");
		Player player2 = new Player("Player Two");
		Player player3 = new Player("Player Three");
		
		Player[] playerList = {player1, player2, player3};
		
		Team team1 = new Team("Team One", "Red", "Cork", playerList);
		
		player1 = new Player("Player Four");
		player2 = new Player("Player Five");
		player3 = new Player("Player Six");
		
		playerList[0] = player1;
		playerList[1] = player2;
		playerList[2] = player3;
		
		Team team2 = new Team("Team Two", "Blue", "Dublin", playerList);
		
		System.out.println(player1.getCode());
		System.out.println(player2.getCode());
		System.out.println(player3.getCode());
		
		System.out.println(team1.toString());
		System.out.println(team2.toString());
	}
}