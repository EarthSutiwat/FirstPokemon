import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Ekans extends Pokemon{
    

    public Ekans(String name, int baseLevel)
    {
        super(name,baseLevel);
        baseHp = 35;
        baseAtk = 60;
        baseDef = 44;
        moves= new ArrayList <String>();
        moves.add("Acid");
        moves.add("Bite");
        moves.add("Poison Jab");
        pokeIcon = new ImageIcon(".//picture//ekansIcon.jpg");
        pokeImg = new ImageIcon(".//picture//ekans.jpg");
    }

    public void attack(Pokemon enemy, String move){

      switch(move){

        case "Acid" : enemy.getDamaged(40, this.atk, this.level); break;
        case "Bite" : enemy.getDamaged(60, this.atk, this.level); break;
        case "Poison Jab" : enemy.getDamaged(80, this.atk, this.level); break;
    }

    }

    
}