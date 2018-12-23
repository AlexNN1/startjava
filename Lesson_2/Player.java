public class Player {

    private String name;
    private int number;

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public  void setNumber(int number) {
        this.number = number;
        System.out.println(name);
    }

    public Player(String name) {
        setName(name);
        number = -1;
    }
}
