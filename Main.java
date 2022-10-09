import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

        Location location = null;
        System.out.print("Purpose is find Wood,Water,Food and comeback to safe house.");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nName your character:");
        String name = sc.nextLine();
        Player A = new Player (name);
        A.characterselect();
        System.out.print("You selected a "+A.getChnm()+".");
        while(true) {
            System.out.print("Places\n");
            System.out.print("1-SafeHouse\n");
            System.out.print("2-ToolShop\n");
            System.out.print("3-Forest\n");
            System.out.print("4-Cave\n");
            System.out.print("5-River\n");
            System.out.print("6-Mine\n");
            System.out.print("Choose:\n");
            int selectLoc = sc.nextInt();
                while (selectLoc > 7 || selectLoc < 0) {
                    System.out.print("\nTry To Choose Again:");
                    selectLoc = sc.nextInt();
                }
            switch (selectLoc) {
                case 1 : location = new SafeHouse(A);
                break;
                case 2 : location = new ToolShop(A);
                break;
                case 3 :if(A.getInventory().isFood()){
                    System.out.print("U already came here.");
                }
                else {
                    location = new Forest(A);
                }
                break;
                case 4 :if(A.getInventory().isWood()){
                    System.out.print("U already came here.\n");
                }
                else {
                    location = new Cave(A);
                }
                break;
                case 5 :
                    if(A.getInventory().isWater()){
                        System.out.print("U already came here.\n");
                    }
                    else {
                        location = new River(A);
                    }
                break;
                case 6 : location = new Mine(A);
                break;
                default : location = new SafeHouse(A);
                break;
            };
            if(!location.onLocation()){
                if(A.getInventory().isWood() && A.getInventory().isFood() || A.getInventory().isWater()){
                    System.out.print("You win the game.");
                }
                else {
                    System.out.print("You Died!!!Game Over");
                }
                break;
            }
        }
    }
}
