public class Team {
	
	//Attributes
	private String name;
	private String gersey;
	private String location;
	private Player[] players;
	
	//Constructor
	public Team(String name, String gersey, String location, Player[] players) {
		this.name = name;
		this.gersey = gersey;
		this.location = location;
		this.players = new Player[10];
		for (int i = 0; i < players.length;i++) {
			this.players[i] = players[i];
		}
	}
	
	//Setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGersey() {
		return gersey;
	}
	public void setGersey(String gersey) {
		this.gersey = gersey;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	//Functionality
	public String toString() {
		String string = "Name of team : " + getName() + '\n' + 
				"Color of gersey : " + getGersey() + '\n' + 
				"Home location of team : " + getLocation() + '\n' + 
				"Players in team : ";
		for (int i = 0; i < 3; i++) {
			string = string + (players[i].getName()) + " ";
		}
		return string;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.gersey);
		System.out.println(this.location);
		System.out.println(this.players);
	}
}
