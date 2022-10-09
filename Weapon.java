import javax.management.relation.RoleInfoNotFoundException;
import java.util.Scanner;

public class Weapon extends Main {
    private int damage;
    private int price;
    private int ID;
    private String name;

    Weapon(int ID, int damage, int price,String name){
        this.damage=damage;
        this.price=price;
        this.ID=ID;
        this.name=name;
    }
    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[3];
        weaponList[0]= new Weapon(1,2,25,"Pistol");
        weaponList[1]= new Weapon(2,3,35,"Sword");
        weaponList[2]= new Weapon(3,7,45,"Rifle");
        return weaponList;
    }

    public static Weapon getWeaponObjById(int selectWeaponID) {
        for(Weapon w : Weapon.weapons()){
            if(w.getID() == selectWeaponID){
                return w;
            }
        }
        return null;
    }

    public int getDamage() {return damage;}

    public void setDamage(int damage) {this.damage = damage;}
    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}
    public int getID() {return ID;}

    public void setID(int ID) {this.ID = ID;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}

