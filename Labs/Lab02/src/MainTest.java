// Q2

public class MainTest {
    public static void main(String[] args) {

        // Irish Team
        Player p1 = new Player("Pakie Bonner");
        Player p2 = new Player("Seamus Coleman");
        Player p3 = new Player("Robbie Keane");

        Player[] playerList = {p1, p2, p3};

        System.out.println(p1.getCode());
        p1.printName();

        System.out.println(p2.getCode());
        p2.printName();

        System.out.println(p3.getCode());
        p3.printName();

        Team MyVeryBestIrish = new Team("Best of the Irish", "Red", "Cork", playerList);

        // World Team
        p1 = new Player("Messi");
        p2 = new Player("Ronaldo");
        p3 = new Player("Maradonna");

        playerList[0] = p1;
        playerList[1] = p2;
        playerList[2] = p3;

        //Player[] tmpPlayers = new Player[3] {p1,p2,p3};

        Team MyVeryBestWorld = new Team("Best in the World", "Blue", "Dublin", playerList);

        System.out.println(p1.getCode());
        p1.printName();

        System.out.println(p2.getCode());
        p2.printName();

        System.out.println(p3.getCode());
        p3.printName();

        // Functionality -- toString method, print statements
        System.out.println(MyVeryBestIrish.toString());
        System.out.println(MyVeryBestWorld.toString());
    }
}