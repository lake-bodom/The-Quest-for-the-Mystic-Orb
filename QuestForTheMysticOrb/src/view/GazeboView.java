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
public class GazeboView extends View {

    public GazeboView() {
        super("At the oter end of the enchanted garden you find yourself \n"
                + "at a gazebo. There isn't anything here that apears to be \n"
                + "useful. You can go (N)orth to the main part of the enchanted garden. \n"
                );
               
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'N':
                                System.out.println(""+
"         &&& &&  & &&\n" +
"      && &\\/&\\|& ()|/ @, &&\n" +
"      &\\/(/&/&||/& /_/)_&/_&\n" +
"   &() &\\/&|()|/&\\/ '%\" & ()\n" +
"  &_\\_&&_\\ |& |&&/&__%_/_& &&\n" +
"&&   && & &| &| /& & % ()& /&&\n" +
" ()&_---()&\\&\\|&&-&&--%---()~\n" +
"     &&     \\|||\n" +
"             |||\n" +
"             |||\n" +
"             |||\n" +
"       , -=-~  .-^- _\n");
              showEnchantedGarden();
        }
        return true;
    }

    private void showEnchantedGarden() {
         MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.EnchantedGarden);
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        p.getLocation().getLocationView().display();
    }

}
