import java.util.*;
public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String chnm;
    private Inventory inventory;

    public Player (String name){
       this.name = name;
       this.inventory = new Inventory();
    }
    public Player (String chnm,int damage,int health, int money ) {
        this.damage=damage;
        this.health=health;
        this.money=money;
        this.chnm=chnm;
    }
    public Player(){

    }

    public void characterselect(){
        Samurai sam = new Samurai();
        Archer arc = new Archer();
        Knight kni = new Knight();

        System.out.print("Karakter Türü Seçiniz(1,2,3):");
        System.out.print("\nSamurai(1)==> Dmg:5 Health:21 Money:15\nArcher(2)==> Dmg:7 Health:18 Money:20" +
                "\nKnight(3)==> Dmg:8 Health:24 Money:5\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
        case 1:initPlayer(new Samurai());
        break;
        case 2:initPlayer(new Archer());
        break;
        case 3:initPlayer(new Knight());
        break;
        }
    }


    public void initPlayer(Player player){
        this.setDamage(player.getDamage());
        this.setHealth(player.getHealth());
        this.setMoney(player.getMoney());
        this.setChnm(player.getChnm());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getChnm() {
        return chnm;
    }

    public void setChnm(String chnm) {
        this.chnm = chnm;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
