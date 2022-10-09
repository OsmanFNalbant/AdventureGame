public class SafeHouse extends NormalLoc{
    SafeHouse(Player player){
        super(player,"SafeHouse");
    }

    @Override
    boolean onLocation(){
        if(this.getPlayer().getInventory().isWater() && this.getPlayer().getInventory().isFood() && this.getPlayer().getInventory().isWood()){
            System.out.print("U win\n");
            return false;
        }
        else {
            this.getPlayer().setHealth(20);
            System.out.print("You come back to the safe house.\n");
            System.out.print("Your health is filled.\n ");
            return true;
        }
    }
}
