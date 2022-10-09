public class Enemies {

    private int damage;
    private int ID;
    private int health;
    private String name;

    private int reward;


    Enemies(int damage, int ID,int health, String name,int reward){
        this.damage=damage;
        this.ID=ID;
        this.name=name;
        this.health=health;
        this.reward=reward;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
