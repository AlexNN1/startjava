public class Jaeger {

    private String modelName = "Gipsy Avenger";
    private String mark = "Mark-6";
    private String origin = "USA";
    private float height = 81.77f;
    private float weight = 2.004f;
    private int speed = 14;
    private int strength = 12;
    private int armor = 18;

    public String getModelName() {
        return modelName;
    }
    public String getMark() {
        return mark;
    }
    public String getOrigin() {
        return origin;
    }
    public float getHeight() {
        return height;
    }
    public float getWeight() {
        return weight;
    }
    public int getSpeed() {
        return speed;
    }
    public int getStrength() {
        return strength;
    }
    public int getArmor() {
        return armor;
    }

    public void setModelName() {
        this.modelName = modelName;
    }
    public void setMark() {
        this.mark = mark;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean drift() {
        System.out.println("drift not connected");
        return true;
    }
    public void move() {
        System.out.println("you have passed 2 steps");
    }

    public String scanKaiju() {
        return "not found";
    }
    public void useStingBlades() {

    }
}