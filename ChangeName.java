import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeName extends JFrame{

    public ChangeName(Pokemon poke){

        super("Change Name");
        setDefaultCloseOperation(ChangeName.HIDE_ON_CLOSE);
        setSize(440, 380);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        Container content = getContentPane();
        Font normal = new Font("Time New Roman",Font.PLAIN,20);
        Font large = new Font("Time New Roman",Font.PLAIN,30);
        JLabel text = new JLabel("Enter Pokemon's name");
        JTextField enterName = new JTextField();
        JButton confirmBt = new JButton("Confirm");


        text.setBounds(130 , 70, 200, 30);
        enterName.setBounds(100, 100, 200, 30);
        confirmBt.setBounds(160, 140, 80, 30);


        enterName.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                poke.setName(enterName.getText());
            }
        });

        confirmBt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                poke.setName(enterName.getText());
                setVisible(false);
            }
        });



        content.add(text);
        content.add(enterName);
        content.add(confirmBt);
        content.setLayout(null);
        content.setBackground(Color.white);


    }
}