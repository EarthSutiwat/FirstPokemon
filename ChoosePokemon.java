import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ChoosePokemon extends JFrame{

    
    

    public ChoosePokemon(Trainer trainer, String menu){

        
        super("Choose Pokemon");
        ArrayList <Pokemon>  myPokemon = trainer.getPokemon();
        setDefaultCloseOperation(ChoosePokemon.HIDE_ON_CLOSE);
        setSize(440, 380);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        Container content = getContentPane();
        Font buttonFont = new Font("Time New Roman",Font.PLAIN,20);
        Font large = new Font("Time New Roman",Font.PLAIN,30);
        

        content.setBackground(Color.white);
        content.setLayout(null);
        
        int bagSize = myPokemon.size();
        for (int i =0; i < bagSize; i++){

            JButton pokemonNo = new JButton(myPokemon.get(i).getName());
            pokemonNo.setIcon(myPokemon.get(i).getIcon());
            pokemonNo.setFont(buttonFont);
            pokemonNo.setBackground(Color.white);
            pokemonNo.setBounds(120, 48*(i+1), 170, 45);
            pokemonNo.setFocusPainted(false);
            content.add(pokemonNo);

            pokemonNo.addActionListener (new ActionListener () {

                
                public void actionPerformed (ActionEvent e) {
                     
                    for (Pokemon p: myPokemon){
                        
                        if(e.getActionCommand().equals(p.getName())){
                            
                            switch(menu){
                            case "1" : new ShowStatus(p); break;
                            case "2" : new ChangeName(p); setVisible(false); break;
                            case "razz" :new RazzBerry("Razz").statsBoost(p); new ShowStatus(p); break;
                            case "pinab" :new PinabBerry("Pinab").statsBoost(p); new ShowStatus(p); break;
                            case "nanab" :new NanabBerry("Nanab").statsBoost(p); new ShowStatus(p); break;
                            case "pomeg" :new PomegBerry("Pomeg").statsBoost(p); new ShowStatus(p); break;
                          
                            }
                            
                               
                               
                        }


                            
                    }

                    
                }
               } );

        }

       

    }

    


    

}