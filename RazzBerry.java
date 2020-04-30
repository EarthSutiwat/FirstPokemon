import javax.swing.*;

public class RazzBerry extends Berry{


    public RazzBerry(Pokemon poke){

        super("Razz Berry");
        hpHeal = 20;
        berryIcon = new ImageIcon(".//picture//razzBerry.jpg");
    }

    public void statsBoost(Pokemon poke){


        if ( (poke.getCurHp()+hpHeal) >= poke.getHp() )
            poke.curHp = poke.hp;
        else poke.hp += hpHeal;
        
    }


}