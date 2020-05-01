import javax.swing.*;
import java.util.*;

public class Koffing extends Pokemon {

    public Koffing(String name, int baseLevel)
    {
        super(name,baseLevel);
        baseHp = 40;
        baseAtk = 65;
        baseDef = 95;
        moves= new ArrayList<String>();
        moves.add("Smog");
        moves.add("Tackle");
        moves.add("Assurance");
        pokeIcon = new ImageIcon(".//picture//koffingIcon.jpg");
        pokeImg = new ImageIcon(".//picture//koffing.jpg");

    }

    public void attack(Pokemon enemy, String move){

        switch(move){

            case "Smog" : enemy.getDamaged(30, this.atk, this.level); break;
            case "Tackle" : enemy.getDamaged(40, this.atk, this.level); break;
            case "Assurance" : enemy.getDamaged(65, this.atk, this.level); break;
        }
  
      }
    

}