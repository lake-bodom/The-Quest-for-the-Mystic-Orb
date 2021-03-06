/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import byui.cit260.questforthemysticorb.MapControl;
import model.Game;
import model.Item;
import model.LocationType;
import model.Player;

/**
 *
 * @author Mikel
 */
public class BlacksmithView extends View {

    public BlacksmithView() {
        super("You see a blacksmith who is working in his shop. he looks very hungry,\n"            
                + " probably because of the curse that has been put on the kingdom. \n"
                + "You also see a few pair of beautifully crafted (G)auntlets. \n"
                + "The only direction you can go is (E)ast to the south Kingdom.");
    }

    /**
     * @param input
     *
     * @return
     */
    @Override
    public boolean doAction(char input) {
        switch (input) {
            case 'E':
                System.out.println(""+
"      (())                           (())\n" +
"     ((()))  __          .      __  ((()))\n" +
"    (((())))(())     .         (())(((())))\n" +
"   ((((()))))())) _         _ ((()((((()))))\n" +
"     |____|((())))()   ,   ()(((()))|____|\n" +
"     |_[]_| |__|((())__A__((())|__| |_[]_|\n" +
"    _|    |_|[]|_|_|I-I-I-I|_|_|[]|_|    |_\n" +
"   |-|    |-|  |-|||-I-I-I-|||-|  |-|    |-|\n" +
"  (|-|    |-|  |-| |I-I-I-I| |-|  |-|    |-|)\n" +
" ((|-| __ |-|  |-| |-I-I-I-| |-|  |-| __ |-|))\n" +
" ()|-|_XX_|-|__|T|_|[T]-[T]|_|T|__|-|_XX_|-|()\n" );
                showSouthKingdom();
                break;
            case 'G':
                getGauntlets();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }

    private void showSouthKingdom() {
        MapControl mc = new MapControl();
        Player p = Game.getInstance().getPlayer();
        try {
            mc.moveLocation(p, LocationType.SouthKingdom);
        } catch (Exception e) {
            e.printStackTrace();
        }

        p.getLocation().getLocationView().display();
    }
  private void getGauntlets() {
        Item i = Game.getInstance().getItemByNameAndRemove("Gauntlets");
        if(i == null) {
            System.out.println("You already got a pair of gauntlets..\n");
            return;
        }
        Game.getInstance().getPlayer().getItems().add(i);
        System.out.println("You traded your corn for some gauntlets!\n");
    }
}
