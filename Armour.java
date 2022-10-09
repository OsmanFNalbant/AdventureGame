import java.util.Scanner;

public class Armour extends Main{
    private int protection;
    private int price;
    private int ID;
    private String name;

    public Armour(int ID, int protection, int price,String name) {
        this.price = price;
        this.protection = protection;
        this.name=name;
        this.ID=ID;
    }

    public static Armour[] armours(){
        Armour[] armourList = new Armour[3];
        armourList[0]= new Armour(1,1,15,"LightArmour");
        armourList[1]= new Armour(2,3,25,"MediumArmour");
        armourList[2]= new Armour(3,5,40,"HeavyArmour");
        return armourList;
    }

    public Armour(){}

    public static Armour getArmourObjById(int selectArmourID) {
        for(Armour a : Armour.armours()){
            if(a.getID() == selectArmourID){
                return a;
            }
        }
        return null;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {return ID;}

    public void setID(int ID) {this.ID = ID;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
