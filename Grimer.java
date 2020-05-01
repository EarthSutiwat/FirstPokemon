import javax.swing.*;
import  java.util.*;

public class Grimer extends Pokemon {



    public Grimer (String name, int baseLevel)
    {
        super(name, baseLevel);
        baseHp = 80;
        baseAtk = 80;
        baseDef = 50;
        moves= new ArrayList<String>();
        moves.add("Pound");
        moves.add("Sludge");
        moves.add("Sludge Bomb");
        pokeIcon = new ImageIcon(".//picture//grimerIcon.jpg");
        pokeImg = new ImageIcon(".//picture//grimer.jpg");
    }

    public void attack(Pokemon enemy, String move){

        switch(move){

            case "Pound" : enemy.getDamaged(40, this.atk, this.level); break;
            case "Sludge" : enemy.getDamaged(65, this.atk, this.level); break;
            case "Sludge Bomb" : enemy.getDamaged(90, this.atk, this.level); break;
        }
  
      }

    
    
}