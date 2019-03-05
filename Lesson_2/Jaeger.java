public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

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