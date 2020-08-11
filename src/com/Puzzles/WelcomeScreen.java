package com.Puzzles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeScreen
{
    JFrame frame1 = new JFrame();
    JLabel title1;
    JPanel panel1;
    JButton startGame;

    void showWelcomeScreen()
    {
        panel1 = new JPanel();
        panel1.setLayout( new BoxLayout( panel1,BoxLayout.X_AXIS ) );

        Color color = new Color( 0,0,51 );

        startGame = new JButton("Start Game");
        startGame.setBackground(Color.YELLOW);
        startGame.setFont(new Font("Arial", Font.PLAIN, 40));
        startGame.setForeground(color);
        startGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame1.dispose();
            }
        });

        panel1.setBackground( color );

        title1 = new JLabel(" PUZZLE GAME  ");
        title1.setFont(new Font("Italian", Font.BOLD, 180));
        title1.setForeground(Color.yellow);
        title1.setBounds( 10,10,10,10 );

        panel1.add(title1);

        frame1.getContentPane().add(BorderLayout.CENTER, panel1);
        frame1.getContentPane().add(BorderLayout.SOUTH, startGame);

        closingFrame();
    }

    private void closingFrame()
    {
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

    }
}
