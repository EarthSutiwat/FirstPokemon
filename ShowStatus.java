import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ShowStatus extends JFrame{

    public ShowStatus(Pokemon poke){

        super("Pokemon Status");
        setDefaultCloseOperation(PokemonList.HIDE_ON_CLOSE);
        setSize(440, 380);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        Container content = getContentPane();
        Font normal = new Font("Time New Roman",Font.PLAIN,20);
        Font large = new Font("Time New Roman",Font.PLAIN,30);

        JLabel nameLabel = new JLabel();
        JLabel summaryLabel = new JLabel();
        JLabel expLabel = new JLabel();
        JLabel hpLabel = new JLabel();
        JLabel attackLabel = new JLabel();
        JLabel defenseLabel = new JLabel();

        nameLabel.setText(poke.getName() + "  Lv." + poke.getLevel());
        nameLabel.setIcon(poke.pokeIcon);
        nameLabel.setBounds(120, 20, 200, 50);
        nameLabel.setFont(normal);

        hpLabel.setText("HP: "+poke.getHp() + "/" + poke.getCurHp());
        hpLabel.setBounds(160,70,200,50);
        hpLabel.setFont(normal);

        expLabel.setText("Exp: " + poke.getExp() + "/" + poke.getMaxExp());
        expLabel.setBounds(160,120,200,50);
        expLabel.setFont(normal);      
        
        attackLabel.setText("Attack: " + poke.getAtk());
        attackLabel.setBounds(160, 170, 200, 50);
        attackLabel.setFont(normal);

        defenseLabel.setText("Defense: " + poke.getDef());
        defenseLabel.setBounds(160, 220, 200, 50);
        defenseLabel.setFont(normal);
        
        
        
        content.add(nameLabel);content.setLayout(null);
        content.add(hpLabel);
        content.add(expLabel);
        content.add(attackLabel);
        content.add(defenseLabel);
        content.setBackground(Color.white);


    }

}