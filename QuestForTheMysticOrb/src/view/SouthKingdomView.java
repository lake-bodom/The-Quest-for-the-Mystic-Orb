/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import model.Game;
import model.LocationType;
import model.Player;

/**
 *
 * @author Mikel
 */
public class SouthKingdomView extends View {
    
      public SouthKingdomView() {
        super("You are in the south side of the kingdom, it is considered the rich side of town.\n"
                + "You can go to the (N)orth side of the kingdom, (E)ast to the farm, \n"
                + "(W)est to the blacksmith, or (S)outh to leave the kingdom. \n");
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'N' :
                                System.out.println(""+
"                             -|             |-\n" +
"         -|                  [-_-_-_-_-_-_-_-]                  |-\n" +
"         [-_-_-_-_-]          |             |          [-_-_-_-_-]\n" +
"          | o   o |           [  0   0   0  ]           | o   o |\n" +
"           |     |    -|       |           |       |-    |     |\n" +
"           |     |_-___-___-___-|         |-___-___-___-_|     |\n" +
"           |  o  ]              [    0    ]              [  o  |\n" +
"           |     ]   o   o   o  [ _______ ]  o   o   o   [     | ----__________\n" +
"_____----- |     ]              [ ||||||| ]              [     |\n" +
"           |     ]              [ ||||||| ]              [     |\n" +
"       _-_-|_____]--------------[_|||||||_]--------------[_____|-_-_\n" +
"      ( (__________------------_____________-------------_________) )\n");
                showNorthKingdom();
                break;
            case 'E' :
                 Player p = Game.getInstance().getPlayer();
        if(p.hasItem("BucketOfWater")) {
                System.out.println(""+
                
"                                  +&-\n" +
"                                _.-^-._    .--.\n" +
"                             .-'   _   '-. |__|\n" +
"                            /     |_|     \\|  |\n" +
"                           /               \\  |\n" +
"                          /|     _____     |\\ |\n" +
"                           |    |==|==|    |  |\n" +
"       |---|---|---|---|---|    |--|--|    |  |\n" +
"       |---|---|---|---|---|    |==|==|    |  |\n" +
"      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");}
                
                
                showFarm();
                break;
            case 'W' :
                   Player e = Game.getInstance().getPlayer();   
        if(e.hasItem("Corn")) {
                  System.out.println(""+  
"      '                   :=<]\n" +
"       '          *__       /\n" +
"      (          (__/     e\n" +
"     '  )        ('J)    /\n" +
"    ')('          )))____/\n" +
"   ( )  )')      |   |\n" +
"    ( /(( )      \\____m=====\\\n" +
"   )')(( ) )      +()+      (\")\n" +
"|E -_-_-_-_-||   ++vv++     ======\n" +
"|J-_-_-_-_-_||  +++++++       \\/\n" +
"|M-_-_-_---_|| ++++++++       /\\\n" +
"|9-_-_-_-_-_||   // ||       /  \\\n" +
"|6-_-_-_---_||  (__D(__D    /    \\\n" +
"============== \n"); }
                showBlacksmith();
                break;
            case 'S' :
                                System.out.println(""+
"                    /  :  \\           ______\n" +
"                   /   .   \\         | ~~~~ |\n" +
"                  /    .    \\        | ~~~  |\n" +
"                 /           \\       |______|\n" +
" ````````````````            ````````````||```\n" +
"  --     --     --     --     --     --  ||\n" +
"_______________        |        _________||_____\n" +
"             /                   \\       ||\n" +
"            /                     \\\n" +
"           /           |           \\\n" +
"          /                         \\\n" +
"         /                           \\\n" +
"        /              |              \\\n" +
"       /               |               \\   \n");
                showCrossroads();
                showCrossroads();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
    
        private void showNorthKingdom() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.NorthKingdom);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showFarm() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        
         if(!p.hasItem("BucketOfWater")) {
            System.out.println("You approach a small farm house on an old farm. The old \n"
                    + "farmer tells you that his soil is dry on account of the \n"
                    + "kingdom’s curse. He tells you that he will reward you if \n"
                    + "you help him and give him some water for his crops. You don’t \n"
                    + "have any water yet, so you return to the south end of the kingdom.");
            return;
         }
        try {
            mc.moveLocation(p, LocationType.Farm);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showBlacksmith() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer(); 
        
        if(!p.hasItem("Corn")) {
            System.out.println("You approach a blacksmith who is working on a few pair of beautifully \n"
                    + "crafted gauntlets. He looks hungry and upset because of his hunger. \n"
                    + "He gives you a bad look so you return to the south end of the Kingdom.");
            return;
        }
        
        try {
            mc.moveLocation(p, LocationType.Blacksmith);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showCrossroads() {
      MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Crossroads);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}