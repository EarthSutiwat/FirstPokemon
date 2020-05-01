import javax.swing.*;

public class PinabBerry extends Berry{


    public PinabBerry(String name){

        super("Pinab Berry");
        defBoost = 5;
        berryIcon = new ImageIcon(".//picture//pinabBerry.jpg");
    }

    public void statsBoost(Pokemon poke){

        poke.def += defBoost;
        
    }


}