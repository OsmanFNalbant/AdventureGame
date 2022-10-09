import java.util.Scanner;

public class Inventory {

    private Weapon weapon;
    private Armour armour;
    private boolean water;
    private boolean food;
    private boolean wood;

    public Inventory(){
        this.weapon = new Weapon(0,0,0,"Punch");
        this.armour = new Armour(0,0,0,"No Armour");
        this.water = false;
        this.food = false;
        this.wood = false;
    }

    public Weapon getWeapon() {return weapon;}

    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    public Armour getArmour() {return armour;}

    public void setArmour(Armour armour) {this.armour = armour;}

    public boolean isWater() {return water;}

    public void setWater(boolean water) {this.water = water;}

    public boolean isFood() {return food;}

    public void setFood(boolean food) {this.food = food;}

    public boolean isWood() {return wood;}

    public void setWood(boolean wood) {this.wood = wood;}
}