import javax.swing.*;
import java.util.*;

public class Zubat extends Pokemon{

    public Zubat(String name, int baseLevel)
    {
        super(name, baseLevel);
        baseHp = 40;
        baseAtk = 45;
        baseDef = 35;
        moves= new ArrayList<String>();
        moves.add("Wing Attack");
        moves.add("Facade");
        moves.add("Air Slash");
        pokeIcon = new ImageIcon(".//picture//zubatIcon.jpg");
        pokeImg = new ImageIcon(".//picture//zubat.jpg");

    }


    public void attack(Pokemon enemy, String move){

        switch(move){

            case "Wing Attack" : enemy.getDamaged(60, this.atk, this.level); break;
            case "Facade" : enemy.getDamaged(70, this.atk, this.level); break;
            case "Air Slash" : enemy.getDamaged(75, this.atk, this.level); break;
        }
  
      }
  
}