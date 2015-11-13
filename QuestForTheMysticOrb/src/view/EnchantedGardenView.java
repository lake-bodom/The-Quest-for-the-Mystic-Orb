/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Rich
 */
public class EnchantedGardenView extends View {
    
    public EnchantedGardenView() {
        super("You start to smell the crisp relaxing air of the sea, as you n/"
                + "start to relax you remember that you have a kingdom to n/"
                + "save. In the distance you see a great sea. You see a  n/"
                + "(S)hip with nobody on it, a (B)each, and some (D)ocks. n/");
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
                showShip();
                break;
            case 'B' :
                showBeach();
                break;
            case 'D' :
                showDocks();
                break;
            default:
                System.out.println("ERROR ON INPUT");
                break;
        }
        return true;
    }
        private void showGallows() {
        GallowsView showGallows = new GallowsView();
        char in = showGallows.getInput();
        }
        
        private void showBridge() {
        BridgeView showBridge = new BridgeView();
        char in = showBridge.getInput();
        }
}
