// Q2
// Note: Initially named "Players", renamed to use singular form for best coding practice

public class Player {

    // Attributes
    private String name;
    private String code = "";

    // Constructor -- same name as class, no return
    public Player(String name) {
        this.name = name;
        char space = ' ';
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                char j = name.charAt(i);
                this.code = this.code + j;
            }

            else if (name.charAt(i - 1) == space) {
                char j = name.charAt(i);
                this.code = this.code + j;
            }
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void printName() {
        System.out.println(name + "\n");
    }
}
