import javax.swing.*;

public class PinabBerry extends Berry{


    public PinabBerry(Pokemon poke){

        super("Pinab Berry");
        defBoost = 15;
        berryIcon = new ImageIcon(".//picture//pinabBerry.jpg");
    }

    public void statsBoost(Pokemon poke){

        poke.def += defBoost;
        
    }


}