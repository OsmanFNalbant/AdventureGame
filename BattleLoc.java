import java.util.Random;
public class BattleLoc extends Location {
    private Enemies enemies;
    private int award;

    private String awards;
    Random rand = new Random();
    private int control;

    BattleLoc(Player player, String name, Enemies eneimes, int award, String awards, int control){
        super(player , name);
        this.enemies=eneimes;
        this.award=award;
        this.awards=awards;
        this.control=control;
    }

    @Override
    boolean onLocation(){
                combat();
                if (getPlayer().getHealth() > 0) {
                System.out.print("You lived.\n");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + award);
                if (awards.equals("Food") && !this.getPlayer().getInventory().isFood()) {
                    this.getPlayer().getInventory().setFood(true);
                } else if (awards.equals("Water") && !this.getPlayer().getInventory().isWater()) {
                    this.getPlayer().getInventory().setWater(true);
                } else if (awards.equals("Wood") && !this.getPlayer().getInventory().isWood()) {
                    this.getPlayer().getInventory().setWood(true);
                } else if (getEnemies().getName().equals("Snake")) {
                    itemsec();
                }
                return true;
            } else {
                return false;
            }
        }

    public void combat() {
        while (this.getEnemies().getHealth() > 0 && this.getPlayer().getHealth() > 0) {
            Random rand = new Random();
            int int_random = rand.nextInt(2);
            if (int_random == 1) {
                if (this.getPlayer().getHealth() > 0) {
                    this.getEnemies().setHealth(getEnemies().getHealth() - (this.getPlayer().getDamage() + this.getPlayer().getInventory().getWeapon().getDamage()));
                    ;
                }
                if (getEnemies().getHealth() > 0) {
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - (this.getEnemies().getDamage() - this.getPlayer().getInventory().getArmour().getProtection()));
                }
            }
            if (int_random == 0) {
                if (getEnemies().getHealth() > 0) {
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - (this.getEnemies().getDamage() - this.getPlayer().getInventory().getArmour().getProtection()));
                }
                if (this.getPlayer().getHealth() > 0) {
                    this.getEnemies().setHealth(getEnemies().getHealth() - (this.getPlayer().getDamage() + this.getPlayer().getInventory().getWeapon().getDamage()));
                    ;
                }
            }
        }
        }



    public Enemies getEnemies() {
        return enemies;
    }

    public void setEnemies(Enemies enemies) {
        this.enemies = enemies;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getAwards() {return awards;}

    public void setAwards(String awards) {this.awards = awards;}

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }

    public void itemsec(){
        int int_random = rand.nextInt(101);
        int int_random2 = rand.nextInt(101);
        if(int_random < 15){
            if(int_random2<50){this.getPlayer().getInventory().setArmour(Armour.getArmourObjById(1));
                System.out.print("Light Armour gained.\n");}
            if(int_random2>50 && int_random2<=80){this.getPlayer().getInventory().setArmour(Armour.getArmourObjById(2));
                System.out.print("Medium Armour gained.\n");}
            if(int_random2>80){this.getPlayer().getInventory().setArmour(Armour.getArmourObjById(3));
                System.out.print("Heavy Armour gained.\n");}
        }
        if(int_random < 30 && int_random >=15){
            if(int_random2<50){this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
                System.out.print("Pistol gained.\n");}
            if(int_random2>50 && int_random2<=80){this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
                System.out.print("Rifle gained.\n");}
            if(int_random2>80){this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
                System.out.print("Sword gained\n");}
        }
        if(int_random>30 && int_random<=55){
            if(int_random2<20){this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
                System.out.print("10 gold\n");}
            if(int_random2>20 && int_random2<=50){this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
                System.out.print("5 gold\n");}
            if(int_random2>50){this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
                System.out.print("1 gold\n");}
        }
        if(int_random>55) {
            System.out.print("Baş çıktı.\n");
        }
    }
}

