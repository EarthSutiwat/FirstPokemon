import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.util.*;


public class MainGame extends JFrame  {

    JPanel menuPanel = new JPanel();
    JPanel textPanel = new JPanel();
    JLabel text = new JLabel("Welcome to Pokemon World");
    JButton button1 , button2, button3, button4;
    JButton returnButton;
    String position;
    Pokemon wildPokemon;


    public MainGame(Trainer trainer){

        super("Play Pokemon");
        setDefaultCloseOperation(MainGame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        Font buttonFont = new Font("Time New Roman",Font.PLAIN,20);
        Font large = new Font("Time New Roman",Font.PLAIN,30);

        Container content = getContentPane();
        content.setLayout(null);
        content.setBackground(Color.white);

        Border blackline = BorderFactory.createLineBorder(Color.black);

    
        button1 =  new JButton();
        button2 = new JButton ();
        button3 = new JButton();
        button4 = new JButton();

        returnButton = new JButton("Return");
        returnButton.setBackground(Color.white);
        returnButton.setForeground(Color.black);
        returnButton.setBounds(268, 411, 80, 30);
        


        button1.setFont(buttonFont);
        button1.addActionListener(new ChoiceHandler(trainer));
        button1.setFocusPainted(false);
        button1.setActionCommand("choice1");

        button2.setFont(buttonFont);
        button2.addActionListener(new ChoiceHandler(trainer));
        button2.setFocusPainted(false);
        button2.setActionCommand("choice2");

        button3.setFont(buttonFont);
        button3.addActionListener(new ChoiceHandler(trainer));
        button3.setFocusPainted(false);
        button3.setActionCommand("choice3");

        button4.setFont(buttonFont);
        button4.addActionListener(new ChoiceHandler(trainer));
        button4.setFocusPainted(false);
        button4.setActionCommand("choice4");



        text.setForeground(Color.black);
        text.setFont(large);

        textPanel.setBounds(60, 30, 500, 100);
        textPanel.setBackground(Color.white);
        textPanel.setForeground(Color.BLACK);
        textPanel.add(text);
        textPanel.setBorder(blackline);

        menuPanel.setBackground(Color.white);
        menuPanel.setBounds(60, 150, 500, 260);
        menuPanel.setLayout(new GridLayout(2,2));
        menuPanel.add(button1);
        menuPanel.add(button2);
        menuPanel.add(button3);
        menuPanel.add(button4);

        
        content.add(textPanel);
        content.add(menuPanel);
        content.add(returnButton);


        returnButton.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                mainMenu(false);
            }
           } );

        mainMenu(true);

    
    }


    public void mainMenu(Boolean firstEnter){

        position = "Main";
        button1.setText("My Pokemon");
        button2.setText("Search Wild Pokemon");
        button3.setText("Items");
        button4.setText("");
        returnButton.setVisible(false);
        
        if (firstEnter==false)
             text.setText("What will you do?");
        
    }

    public void searchPokeMenu(Trainer trainer)
    {
        position = "Search";
        button1.setText("Fight");
        button2.setText("Run");
        button3.setText("");
        wildPokemon = trainer.search();
        text.setText("<html>"+"You encountered a wild " + wildPokemon.getName() + "!<br>HP:" + wildPokemon.getHp() + "  Lv." + wildPokemon.getLevel() + "</html>");
        //hideButton();
       
    }

   

    public void pokemonBox(){

        position = "Box";
        button1.setText("View Pokemon");
        button2.setText("Check Status");
        button3.setText("Change name");
        returnButton.setVisible(true);

    }

    public void openItems(){


        position = "Item";
        button1.setText("Razz Berry");
        button2.setText("Pinab Berry");
        button3.setText("Nanab Berry");
        button4.setText("Pomeg Berry");
        text.setText("Choose berry you want to use");
        returnButton.setVisible(true);

    }

    public void hideButton(){

        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
    }

    

    public class ChoiceHandler implements ActionListener{

        private Trainer trainer;

        public ChoiceHandler (Trainer trainer){
            this.trainer = trainer;
        }

        public void actionPerformed(ActionEvent e){

            String chosenChoice = e.getActionCommand();

            switch(position){
            case "Main":
                    switch(chosenChoice){
                    case "choice1" : pokemonBox();   break;
                    case "choice2" : searchPokeMenu(trainer); break;
                    case "choice3" : openItems(); break;
                    case "choice4" : break;
                    }
                    break;

            case "Search":
                    switch(chosenChoice){
                    case "choice1" : new FightWildPokemon(trainer,wildPokemon); mainMenu(false); break;
                    case "choice2" : mainMenu(false); break;
                    case "choice3" : break;
                    case "choice4" : break;
                    }
                    break;

            case "Box":
                    switch(chosenChoice){
                    case "choice1" : new PokemonList(trainer); break;
                    case "choice2" : new ChoosePokemon(trainer,"1");  break;
                    case "choice3" : new ChoosePokemon(trainer,"2"); break;
                    case "choice4" : new ChoosePokemon(trainer, "3"); break;
                    }
                    break;

            case "Item":
                    switch(chosenChoice){
                    case "choice1" : new ChoosePokemon(trainer,"razz"); break;
                    case "choice2" : new ChoosePokemon(trainer,"pinab"); break;
                    case "choice3" : new ChoosePokemon(trainer,"nanab"); break;
                    case "choice4" : new ChoosePokemon(trainer,"pomeg"); break;
                    }

           

            
                    
            }

        }
    }

    
}