/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.questforthemysticorb;

import model.Bucket;
import model.Corn;
import model.Game;
import model.Map;
import model.MysticOrb;
import model.Player;
import model.Torch;
import questforthemysticorb.QuestForTheMysticOrb;

/**
 *
 * @author Rich
 */
public class GameControl {

    public static void createNewGame() {

        Player oldPlayer = Game.getInstance().getPlayer();
        Player newPlayer = new Player();
        newPlayer.setName(oldPlayer.getName());
        Game.setInstance(null);
        Game game = Game.getInstance();

        game.setPlayer(newPlayer);

//        InventoryItem[] inventoryList = GameControl.createInventoryList();
//        game.setInventory(inventoryList);
//
//        Bucket bucket = new Bucket();
//        game.setBucket(bucket);
//
//        Corn corn = new Corn();
//        game.setCorn(Corn);
//
//        EnchantedApple enchantedApple = new EnchantedApple();
//        game.setEnchantedApple(enchantedApple);
//
//        Gauntlets gauntlets = new Gauntlets();
//        game.setGauntlets(gauntlets);

        Map map = MapControl.initMap();
        game.setMap(map);

        newPlayer.setLocation(map.getStartingLocation());
        
        ItemControl.initItemList();
        
//        MysticOrb mysticOrb = new MysticOrb();
//        game.setMysticOrb(mysticOrb);

//        Torch torn = new Torch();
//        game.setTorch(torch);

    }

}
