import javax.swing.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.*;

public class StartGame extends JFrame{

       
        JPanel menuPanel;
        JPanel picPanel;        
        Font large = new Font("Time New Roman",Font.PLAIN,30);
        ChooseStarter st;
        Container content = getContentPane();
        
       
    public StartGame(Trainer player){
        super("Pokemon Game");

        picPanel = new JPanel();
        menuPanel = new JPanel();
        JButton startButton = new JButton("Start");
        JButton quitButton = new JButton("Quit");
        JLabel picLabel = new JLabel();

        
        ImageIcon pokeLogo =  new ImageIcon(".//picture//logo.jpg");

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        content.setLayout(null);
        content.setBackground(Color.white);

        picPanel.setBounds(120, 20, 400, 300);
        picPanel.setBackground(Color.white);

        picLabel.setIcon(pokeLogo);
        picPanel.add(picLabel);
        
        
        menuPanel.setBounds(220, 330, 200, 100);
        menuPanel.setBackground(Color.white);
        menuPanel.setLayout(new GridLayout(2,1));
        
    
        startButton.setBackground(Color.white);
        startButton.setForeground(Color.black); 
        startButton.setFont(large);
        startButton.setFocusPainted(false);
       
           
        quitButton.setBackground(Color.white);
        quitButton.setForeground(Color.black); 
        quitButton.setFont(large);
        quitButton.setFocusPainted(false);
        
        menuPanel.add(startButton); 
        menuPanel.add(quitButton);  
        
        content.add(picPanel);
        content.add(menuPanel);

        startButton.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
                setVisible(false);
                ChooseStarter st= new ChooseStarter(player);
            }
           } );


        quitButton.addActionListener (new ActionListener () {
            public void actionPerformed (ActionEvent e) {
             System.exit(0);
            }
           } );

    }


}