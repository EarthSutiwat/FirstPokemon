import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class FightWildPokemon extends JFrame{

    JPanel choosePokePanel, myPokePanel, enemyPanel;
    JLabel text;
    Container content = getContentPane();
    Font normal = new Font("Time New Roman",Font.PLAIN,20);
    Font large = new Font("Time New Roman",Font.PLAIN,30);
    private Pokemon enemy;
    private ArrayList<Pokemon> myPokemon;  

    public FightWildPokemon(Trainer trainer, Pokemon enemy){

        super("Fight!");
        this.enemy = enemy;
        setDefaultCloseOperation(FightWildPokemon.HIDE_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        myPokemon = trainer.getPokemon();
        

        choosePokePanel = new JPanel();
        text = new JLabel("Choose your pokemon to fight");

        content.setBackground(Color.white);
        content.setLayout(null);

        text.setBounds(180, 15, 300, 30);
        text.setFont(normal);

        choosePokePanel.setLayout(null);
        choosePokePanel.setBounds(150, 50, 300, 280);
        choosePokePanel.setBackground(Color.white);

        myPokePanel = new JPanel();
        myPokePanel.setLayout(null);
        myPokePanel.setBounds(0, 200, 680, 240);
        myPokePanel.setVisible(false);

        int bagSize = myPokemon.size();
        for (int i =0; i < bagSize; i++){

            JButton pokemonNo = new JButton(myPokemon.get(i).getName());
            pokemonNo.setFont(normal);
            pokemonNo.setBounds(90, 45*(i+1), 150, 30);
            pokemonNo.setFocusPainted(false);
            choosePokePanel.add(pokemonNo);



            pokemonNo.addActionListener (new ActionListener() {

                public void actionPerformed (ActionEvent e){
    
                    for (Pokemon p : myPokemon ) {
                        if(e.getActionCommand().equals(p.getName())){
                            
                            fight(p,enemy);
                            text.setVisible(false);
                            choosePokePanel.setVisible(false);
                        }
    
                    }
                }
            });
        }
        
        content.add(text);
        content.add(myPokePanel);
        content.add(choosePokePanel);


    }


    public void fight (Pokemon poke, Pokemon enemy){

        
        JLabel fightText = new JLabel("Choose " + poke.getName()+ "'s moves");
        JTextArea myPoke = new JTextArea(5,20);
        JTextArea wildPoke = new JTextArea();
        JButton okButton = new JButton("OK");

       
       
        myPoke.setBounds(20, 30, 150, 300);
        myPoke.setText( poke.getName() + " Lv." + poke.getLevel() + " HP:" + poke.getCurHp() + "/" + poke.getHp());
        myPoke.setFont(normal);
        myPoke.setWrapStyleWord(true);
        myPoke.setLineWrap(true);
        myPoke.setEditable(false);
        myPoke.setFocusable(false);
        myPoke.setOpaque(false);

        wildPoke.setBounds(190, 30, 300, 150);
        wildPoke.setText(enemy.getName() + " Lv." + enemy.getLevel() + " HP:" + enemy.getCurHp() + "/" + enemy.getHp());
        wildPoke.setFont(normal);
        wildPoke.setWrapStyleWord(true);
        wildPoke.setLineWrap(true);
        wildPoke.setEditable(true);
        wildPoke.setFocusable(false);
        wildPoke.setOpaque(true);
        wildPoke.setBackground(Color.white);


        fightText.setFont(normal);
        fightText.setBounds(180, 0, 300, 30);

        okButton.setBounds(210, 192, 150, 30);
        okButton.setFocusPainted(false);
        okButton.setVisible(false);
        content.add(okButton);

        
        for (int i=0 ; i<3 ;i++){

            JButton moveButton = new JButton(poke.moves.get(i));
            ArrayList<String> myPokeMoves = poke.getMoves();
            ArrayList<String> wildPokeMoves = enemy.getMoves();
            moveButton.setBounds(210, 48*(i+1), 150, 30);
            moveButton.setFocusPainted(false);
            myPokePanel.add(moveButton);
            


            moveButton.addActionListener (new ActionListener() {

                public void actionPerformed (ActionEvent e){

    
                    for (String move : myPokeMoves ) {
                        if(e.getActionCommand().equals(move)){

                            
                          System.out.println(move);
                          enemy.attack(poke,wildPokeMoves.get(0));
                          poke.attack(enemy,move);
                          String enemySummary = enemy.getName() + " Lv." + enemy.getLevel() + " HP:" + enemy.getCurHp() + "/" + enemy.getHp();
                          String summary = poke.getName() + " Lv." + poke.getLevel() + " HP:" + poke.getCurHp() + "/" + poke.getHp();
                          
                          wildPoke.setText(enemySummary);
                          myPoke.setText(summary);

                          if (enemy.getCurHp() == 0){
                            catchPoke(enemy,poke);
                            poke.receivedExp(20*enemy.getLevel());
                            wildPoke.setText("You caught " + enemy.getName() +"!!!") ;
                            okButton.setVisible(true);
                            myPokePanel.setVisible(false);
                            
                             }

                         if (poke.getCurHp() == 0){
                                
                                wildPoke.setText("Your " + poke.getName() +" fainted!!!") ;
                                okButton.setVisible(true);
                                myPokePanel.setVisible(false);
                                
                                 }
                          
                             
                             
                        
                             
                        }
    
                    }
                }
            });

        }

        okButton.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                
                setVisible(false);
             }
            } );

        
            
            

        

        
        myPokePanel.add(myPoke);
        myPokePanel.add(fightText);
        myPokePanel.setVisible(true);
        content.add(wildPoke);
        


    }
    
    public void catchPoke (Pokemon pokemonCatch, Pokemon nowPokeUse){

      if ( myPokemon.size() < 6){
        myPokemon.add(pokemonCatch);
      }

      
    }

}