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
 * @author Rich
 */
public class EnchantedGardenView extends View {
    //map[4][3].EnchantedGarden();
    public EnchantedGardenView() {
        super("You get across the bridge into the Enchanted Garden. That is the ironic \n"
                + "name that you give it, due to the face that it looks awful. All you \n"
                + "see are dead trees, dirt, and dead grass. One tree looks like it could \n"
                + "do something if it has some water, but you would be crazy if you were \n"
                + "carrying a bucket of Water (Z) all this time. \n"
                + "You also spy a nice looking Gazebo in the distance to the (S)outh. It looks pretty \n"
                + "awesome as far as Gazebos go. \n"
                + "You can also go back (W)est to the Bridge. \n"
              );
    }
    
        /**
     * @param input
     * 
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch(input) {
            case 'S' :
                showGazebo();
                break;
            case 'W' :
                showBridge();
                break;
            case 'Z' :
                System.out.println("You water the almost dead apple tree and it springs to life! \n"
                        + "It magically grows a presumably magic apple for you to eat. You take \n"
                        + "the apple and eat it without questioning it's origins because face it, \n"
                        + "you are really hungry and the King didn't say anything about starving \n"
                        + "while trying to save the Kingdom");
                break;
           

                
            default:
                System.out.println("ERROR ON INPUT");
                
                    
            
                    
        }
        return true;
    }
        private void showGazebo() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Gazebo);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
        
        private void showBridge() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.Bridge);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
        }
}


