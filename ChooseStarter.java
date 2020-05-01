import javax.swing.*;
import java.awt.event.*;
import java.awt.font.*;
import java.util.ArrayList;
import java.awt.*;

public class ChooseStarter extends JFrame{

    Font large = new Font("Time New Roman",Font.PLAIN,30);

    JPanel choosePokePanel;
    JButton ekansBt;
    JButton grimerBt;
    JButton koffingBt;
    JButton nextButton;
   
    Container content = getContentPane();
    
    public ChooseStarter(Trainer trainer)
    {
        super("Choose pokemon");

        JLabel text;
        JLabel choosePokeLabel = new JLabel();
        JPanel textPanel = new JPanel();
        Font large = new Font("Time New Roman",Font.PLAIN,30);
        ImageIcon ekansIcon = new ImageIcon(".//picture//ekansIcon.jpg");
        ImageIcon grimerIcon = new ImageIcon(".//picture//grimerIcon.jpg");
        ImageIcon koffingIcon = new ImageIcon(".//picture//koffingIcon.jpg");
        ImageIcon grimerPic = new ImageIcon(".//picture//grimer.jpg");
        ImageIcon ekansPic = new ImageIcon(".//picture//ekans.jpg");
        ImageIcon koffingPic = new ImageIcon(".//picture//koffing.jpg");
        ArrayList <Pokemon> myPokemon = trainer.getPokemon();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        nextButton = new JButton("Next");
        nextButton.setBounds(520, 380, 100, 50);
        nextButton.setBackground(Color.white);
        nextButton.setFont(large);
        nextButton.setFocusPainted(false);
        nextButton.setVisible(false);
        
        ekansBt = new JButton("Ekans");
        ekansBt.setFont(large);
        ekansBt.setIcon(ekansIcon);
        ekansBt.setBackground(Color.white);
        ekansBt.setPreferredSize(new Dimension(200,80));
        ekansBt.setFocusPainted(false);

        grimerBt = new JButton("Grimer");
        grimerBt.setFont(large);
        grimerBt.setIcon(grimerIcon);
        grimerBt.setBackground(Color.white);
        grimerBt.setPreferredSize(new Dimension(200,80));
        grimerBt.setFocusPainted(false);

        koffingBt = new JButton("Koffing");
        koffingBt.setFont(large);
        koffingBt.setIcon(koffingIcon);
        koffingBt.setBackground(Color.white);
        koffingBt.setPreferredSize(new Dimension(200,80));
        koffingBt.setFocusPainted(false);

        
        
        content.setLayout(null);
        content.setBackground(Color.white);

       
        text = new JLabel("Choose your starter pokemon");
        text.setForeground(Color.black);
        text.setFont(large);
        
        textPanel=new JPanel();
        
        
    
        textPanel.setBounds(60, 30, 500, 100);
        textPanel.setBackground(Color.white);
        textPanel.add(text);
        
        
        

        choosePokePanel = new JPanel();
        choosePokePanel.setBounds(120, 150, 400, 260);
        choosePokePanel.setBackground(Color.white);
        choosePokePanel.add(ekansBt);
        choosePokePanel.add(grimerBt);
        choosePokePanel.add(koffingBt);
        choosePokePanel.add(choosePokeLabel);

        content.add(nextButton);
        content.add(textPanel);
        content.add(choosePokePanel);

       

        grimerBt.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
            trainer.myPokemon.add(new Grimer("Grimer",5) );
            text.setText("You chose Grimer!!");
            afterChoose();
            choosePokeLabel.setIcon(grimerPic);
            }
           } );

        ekansBt.addActionListener (new ActionListener () {
           public void actionPerformed (ActionEvent e) {
            trainer.myPokemon.add(new Ekans("Ekans",5) );
            text.setText("You chose Ekans!!");
            afterChoose();
            choosePokeLabel.setIcon(ekansPic);
            
            }
           } );
        
           koffingBt.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                trainer.myPokemon.add(new Koffing("Koffing",5) );
                text.setText("You chose Koffing!!");
                afterChoose();
                choosePokeLabel.setIcon(koffingPic);

            }
           } );

            nextButton.addActionListener (new ActionListener () {
                public void actionPerformed (ActionEvent e) {
                    
                    setVisible(false);
                    MainGame main = new MainGame(trainer);
                }
            } );


           
        

    }

    public void afterChoose() {

        grimerBt.setVisible(false);
        ekansBt.setVisible(false);
        koffingBt.setVisible(false);
        nextButton.setVisible(true);
        
    }
    
    
   
    
}