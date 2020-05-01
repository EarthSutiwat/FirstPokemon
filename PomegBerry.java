import javax.swing.*;

public class PomegBerry extends Berry{


    public PomegBerry(String name){

        super("Pomeg Berry");
        hpHeal = 50;
        berryIcon = new ImageIcon(".//picture//pomegBerry.jpg");
    }

    public void statsBoost(Pokemon poke){


        if ( (poke.getCurHp()+hpHeal) >= poke.getHp() )
            poke.curHp = poke.hp;
        else poke.hp += hpHeal;
        
    }


}