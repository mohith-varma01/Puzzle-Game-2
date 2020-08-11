package com.Puzzles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public abstract class ButtonClass extends GameScreen implements Serializable
{
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton newGame = new JButton("New Game");
    JButton exitGame = new JButton("Exit");

    GridBagConstraints gbc = new GridBagConstraints();      //used to set up the 9 blocks

    abstract void assigningActionListener();

    @Override
    void callButtons()
    {
        northPanel.add(newGame);

        arrangeButtons();

        newGame.setBackground(Color.BLUE);
        newGame.setFont(new Font("Arial", Font.PLAIN, 40));
        newGame.setForeground(Color.WHITE);                                 //setting up new game button

        setBackgroundButtons();             //setting up the grids of the game

        setSize();

        newGame.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)          //Randomization of buttons and its texts
            {
                ButtonClass.super.count = 0;
                ButtonClass.super.moves.setText("Number of moves : " + count);

                ButtonClass.super.seconds = 0;
                ButtonClass.super.start = System.currentTimeMillis();

                ArrayList<JButton> buttons = new ArrayList<>();

                buttons.add(button1);
                buttons.add(button2);
                buttons.add(button3);
                buttons.add(button4);
                buttons.add(button5);
                buttons.add(button6);
                buttons.add(button7);
                buttons.add(button8);
                buttons.add(button9);

                Collections.shuffle(buttons);

                String[] numbersAndSpace = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", " "};

                Collections.shuffle(Arrays.asList(numbersAndSpace));

                for(int i = 0; i < 9; i++)
                    buttons.get(i).setText(numbersAndSpace[i] + "");


            }
        });

        assigningActionListener();
    }



    private void arrangeButtons()
    {
        gbc.insets = new Insets(10,10,10,10);

        button1 = new JButton();
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(button1, gbc);

        button2 = new JButton();
        gbc.gridx = 1;
        gbc.gridy = 0;
        centerPanel.add(button2, gbc);

        button3 = new JButton();
        gbc.gridx = 2;
        gbc.gridy = 0;
        centerPanel.add(button3, gbc);

        button4 = new JButton();
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(button4, gbc);

        button5 = new JButton();
        gbc.gridx = 1;
        gbc.gridy = 1;
        centerPanel.add(button5, gbc);

        button6 = new JButton();
        gbc.gridx = 2;
        gbc.gridy = 1;
        centerPanel.add(button6, gbc);

        button7 = new JButton();
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(button7, gbc);

        button8 = new JButton();
        gbc.gridx = 1;
        gbc.gridy = 2;
        centerPanel.add(button8, gbc);

        button9 = new JButton();
        gbc.gridx = 2;
        gbc.gridy = 2;
        centerPanel.add(button9, gbc);

        exitGame.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)          //exiting the program
            {
                System.exit(0);
            }
        });

        exitGame.setBackground(Color.BLUE);
        exitGame.setFont(new Font("Arial", Font.PLAIN, 40));
        exitGame.setForeground(Color.WHITE);
        northPanel.add(exitGame);
    }

    private void setSize()
    {
        button1.setPreferredSize(new Dimension(100,100));
        button2.setPreferredSize(new Dimension(100,100));
        button3.setPreferredSize(new Dimension(100,100));
        button4.setPreferredSize(new Dimension(100,100));
        button5.setPreferredSize(new Dimension(100,100));
        button6.setPreferredSize(new Dimension(100,100));
        button7.setPreferredSize(new Dimension(100,100));
        button8.setPreferredSize(new Dimension(100,100));
        button9.setPreferredSize(new Dimension(100,100));
    }

    private void setBackgroundButtons()
    {
        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        button3.setBackground(Color.WHITE);
        button4.setBackground(Color.WHITE);
        button5.setBackground(Color.WHITE);
        button6.setBackground(Color.WHITE);
        button7.setBackground(Color.WHITE);
        button8.setBackground(Color.WHITE);
        button9.setBackground(Color.WHITE);

        button1.setFont(new Font("Serif", Font.PLAIN, 70));
        button2.setFont(new Font("Serif", Font.PLAIN, 70));
        button3.setFont(new Font("Serif", Font.PLAIN, 70));
        button4.setFont(new Font("Serif", Font.PLAIN, 70));
        button5.setFont(new Font("Serif", Font.PLAIN, 70));
        button6.setFont(new Font("Serif", Font.PLAIN, 70));
        button7.setFont(new Font("Serif", Font.PLAIN, 70));
        button8.setFont(new Font("Serif", Font.PLAIN, 70));
        button9.setFont(new Font("Serif", Font.PLAIN, 70));
    }
}
