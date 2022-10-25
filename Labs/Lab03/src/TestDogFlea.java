public class TestDogFlea {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Dobby", 17, "London");

        Flea flea1 = new Flea("Kreacher", 32, dog1);
        Flea flea2 = new Flea ("Crookshanks" , 25 , dog1);

        dog1.setMyFleas(flea1);
        dog1.setMyFleas(flea2);

        dog1.getMyFleas();

        System.out.println(dog1);
    }
}
