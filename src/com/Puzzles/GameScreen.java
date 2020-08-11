package com.Puzzles;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public abstract class GameScreen implements Runnable, Serializable
{
    JFrame frame = new JFrame("Puzzle");

    JPanel centerPanel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();

    JLabel time = new JLabel();

    long seconds = 0;
    transient long start = System.currentTimeMillis();

    @Override
    public void run()           //calculating time
    {

        while(true)
        {
            try
            {
                time.setText("Time elapsed : " + seconds + " secs");
                seconds = (System.currentTimeMillis() - start) / 1000;
                Thread.sleep(500);
            }
            catch(InterruptedException e1)
            {
                e1.printStackTrace();
            }
        }
    }

    JLabel moves = new JLabel();
    JLabel space = new JLabel("                    ");          //just for spacing out between other two labels


    int count = 0;

    abstract void callButtons();
    void showFrame()
    {
        setPanels();        //setting up the layouts and components

        callButtons();

        closingFrame();     //used to close the frame

        run();          //function for time
    }

    void setPanels()
    {
        centerPanel.setLayout(new GridBagLayout());
        northPanel.setLayout(new FlowLayout());
        southPanel.setLayout(new FlowLayout());

        centerPanel.setBackground(Color.BLACK);
        northPanel.setBackground(Color.BLACK);
        southPanel.setBackground(Color.BLUE);

        time.setText("Time elapsed: 0 secs");
        moves.setText("Number of Moves: " + count);

        time.setFont(new Font("Serif", Font.PLAIN, 30));
        time.setForeground(Color.WHITE);
        moves.setFont(new Font("Serif", Font.PLAIN, 30));
        moves.setForeground(Color.WHITE);


        southPanel.add(time);
        southPanel.add(space);
        southPanel.add(moves);

        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
        frame.getContentPane().add(BorderLayout.NORTH, northPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, southPanel);
    }

    private void closingFrame()
    {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
