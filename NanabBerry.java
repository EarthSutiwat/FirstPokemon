import javax.swing.*;

public class NanabBerry extends Berry{


    public NanabBerry(String name){

        super("Nanab Berry");
        atkBoost = 5;
        berryIcon = new ImageIcon(".//picture//nanabBerry.jpg");
    }

    public void statsBoost(Pokemon poke){

        poke.atk += atkBoost;
        
    }


}