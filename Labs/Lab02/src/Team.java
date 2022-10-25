// Q2
// Note: Initially named "Teams", renamed to use singular form for best coding practice

public class Team {

    // Attributes
    private String name;
    private String jersey;
    private String location;
    private Player[] players;


    // Constructor -- same name as class, no return
    public Team(String n, String j, String l, Player[] players){
        this.name = n;
        this.jersey = j;
        this.location = l;
        this.players = new Player[6];
        for (int i = 0; i < players.length; i++) {
            this.players[i] = players[i];
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getJersey() {
        return jersey;
    }

    public void setJersey(String j) {
        this.jersey = j;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String l) {
        this.location = l;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] p) {
        this.players = p;
    } //shallow copy


    // Functionality -- toString method, print method
    public String toString() {
        String info =   "Team Name: " + getName() + "\n" +
                        "Jersey Colour: " + getJersey() + "\n" +
                        "Location: " + getLocation() + "\n";
        return info;
    }

    public void print() {
        System.out.println(name);
        System.out.println(jersey);
        System.out.print(location);
        System.out.println(players);
    }
}
