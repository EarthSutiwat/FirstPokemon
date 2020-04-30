import javax.swing.*;

public class NanabBerry extends Berry{


    public NanabBerry(Pokemon poke){

        super("Nanab Berry");
        atkBoost = 10;
        berryIcon = new ImageIcon(".//picture//nanabBerry.jpg");
    }

    public void statsBoost(Pokemon poke){

        poke.atk += atkBoost;
        
    }


}