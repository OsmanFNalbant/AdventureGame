public class NormalLoc extends Location{
    NormalLoc(Player player, String name){
        super(player , name);
    }

    @Override
    boolean onLocation(){
        return true;
    }
}
