import javax.swing.*;
import java.util.*;
import java.awt.*;

public class PokemonList extends JFrame{

    public PokemonList (Trainer trainer){

        super("Pokemons List");
        setDefaultCloseOperation(PokemonList.HIDE_ON_CLOSE);
        setSize(440, 380);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        Container content = getContentPane();
        Font buttonFont = new Font("Time New Roman",Font.PLAIN,20);
        Font large = new Font("Time New Roman",Font.PLAIN,30);
       

        JLabel pokeListLabel = new JLabel();
        pokeListLabel.setText("Pokemon List");
        pokeListLabel.setBounds(150, 0, 200, 30);
        pokeListLabel.setFont(buttonFont);

     
        
        ArrayList <Pokemon> myPokemon = trainer.getPokemon();
        int bagSize = myPokemon.size();
        for (int i =0; i < bagSize; i++){

            JLabel pokemonNo = new JLabel("  " + myPokemon.get(i).getName() + " Lv." + myPokemon.get(i).getLevel());
            pokemonNo.setIcon(myPokemon.get(i).getIcon());
            pokemonNo.setFont(buttonFont);
            pokemonNo.setBounds(110, 48*(i+1), 200, 50);
            content.add(pokemonNo);
        }

    
       
        content.setBackground(Color.white);
        content.setLayout(null);
        content.add(pokeListLabel);

    }
}