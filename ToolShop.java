import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class ToolShop extends Location {
    Scanner sc = new Scanner(System.in);
    ToolShop(Player player) {
        super(player, "ToolShop");
    }
    @Override
    boolean onLocation() {
        menu();
        return true;
    }
    public void menu() {
        int d = 0;
        while (d == 0) {
            System.out.print("Menu(Your Money:"+this.getPlayer().getMoney()+")" +
                    "\nArmour-->1\nWeapon-->2\nReturn to safe house-->3\nCharacterInfo -->4\n");
            int a = sc.nextInt();
            while (a < 1 || a > 4) {
                System.out.print("Geçersiz değer yeni bir değer giriniz:");
                a = sc.nextInt();
            }
            switch (a) {
                case 1 -> printArmour();
                case 2 -> printWeapon();
                case 3 -> {
                    System.out.print("Goodbye!\nCome Again.");
                    d = 1;
                }
                case 4 -> printInfo(this.getPlayer());
            }
        }
    }
    public void printArmour(){
        System.out.print("LightArmour(1)==> Damage:1 Price:15\n");
        System.out.print("MediumArmour(2)==> Damage:3 Price:25\n");
        System.out.print("HeavyArmour(3)==> Damage:5 Price:40\n");
        int selectArmourID = sc.nextInt();
        while(selectArmourID< 1 || selectArmourID > 3){
            System.out.print("Try Again:");
            selectArmourID = sc.nextInt();
        }
        Armour selectedArmour = Armour.getArmourObjById(selectArmourID);
        if(selectedArmour!= null){
            if(selectedArmour.getPrice() > this.getPlayer().getMoney()){
                System.out.print("Not enough money\n");
            }
            else{
                System.out.print("You bought " +selectedArmour.getName()+".\n");
                int balance = this.getPlayer().getMoney() - selectedArmour.getPrice();
                this.getPlayer().setMoney(balance);
                this.getPlayer().getInventory().setArmour(selectedArmour);
            }
        }
    }

    public void printWeapon(){
        System.out.print("Pistol(1)==> Damage:2 Price:25\n");
        System.out.print("Sword(2)==> Damage:3 Price:35\n");
        System.out.print("Rifle(3)==> Damage:7 Price:45\n");
        int selectWeaponID = sc.nextInt();
        while(selectWeaponID < 1 || selectWeaponID > 3){
            System.out.print("Try Again:");
            selectWeaponID = sc.nextInt();
        }
        Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
        if(selectedWeapon != null){
            if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                System.out.print("Not enough money\n");
            }
            else{
                System.out.print("You bought " +selectedWeapon.getName()+".\n");
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }
    public void buy() {}

    public static void printInfo(Player A){
        System.out.print("Your Weapon:"+A.getInventory().getWeapon().getName()+
                "\nYour Armour:"+A.getInventory().getArmour().getName()+"\nYour health:"+A.getHealth()+"\n");
    }
}
