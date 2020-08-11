package com.Puzzles;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ButtonAction extends ButtonClass implements ActionListener, Serializable
{
    JLabel endLabel = new JLabel();

    @Override
    void assigningActionListener()
    {
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button1)
        {
            String s = button1.getText();
            if (button2.getText().equals(" "))
            {
                button2.setText(s);
                button1.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button4.getText().equals(" "))
            {
                button4.setText(s);
                button1.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button2)
        {

            String s = button2.getText();
            if (button1.getText().equals(" "))
            {
                button1.setText(s);
                button2.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button5.getText().equals(" "))
            {
                button5.setText(s);
                button2.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button3.getText().equals(" "))
            {
                button3.setText(s);
                button2.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button3)
        {
            String s = button3.getText();
            if (button2.getText().equals(" "))
            {
                button2.setText(s);
                button3.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button6.getText().equals(" "))
            {
                button6.setText(s);
                button3.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button4)
        {
            String s = button4.getText();
            if (button1.getText().equals(" "))
            {
                button1.setText(s);
                button4.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button5.getText().equals(" "))
            {
                button5.setText(s);
                button4.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button7.getText().equals(" "))
            {
                button7.setText(s);
                button4.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }


        if (e.getSource() == button5)
        {
            String s = button5.getText();
            if (button2.getText().equals(" "))
            {
                button2.setText(s);
                button5.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button4.getText().equals(" "))
            {
                button4.setText(s);
                button5.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button6.getText().equals(" "))
            {
                button6.setText(s);
                button5.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button8.getText().equals(" "))
            {
                button8.setText(s);
                button5.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button6)
        {
            String s = button6.getText();
            if (button9.getText().equals(" "))
            {
                button9.setText(s);
                button6.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button5.getText().equals(" "))
            {
                button5.setText(s);
                button6.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button3.getText().equals(" "))
            {
                button3.setText(s);
                button6.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button7)
        {
            String s = button7.getText();
            if (button4.getText().equals(" "))
            {
                button4.setText(s);
                button7.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button8.getText().equals(" "))
            {
                button8.setText(s);
                button7.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button8)
        {
            String s = button8.getText();
            if (button9.getText().equals(" "))
            {
                button9.setText(s);
                button8.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button5.getText().equals(" "))
            {
                button5.setText(s);
                button8.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button7.getText().equals(" "))
            {
                button7.setText(s);
                button8.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if (e.getSource() == button9)
        {
            String s = button9.getText();
            if (button6.getText().equals(" "))
            {
                button6.setText(s);
                button9.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            } else if (button8.getText().equals(" "))
            {
                button8.setText(s);
                button9.setText(" ");
                ButtonAction.super.count++;
                moves.setText("Number of Moves: " + count);
            }
        }

        if(button1.getText().equals("1") && button2.getText().equals("2") && button3.getText().equals("3")
                && button4.getText().equals("4") && button5.getText().equals("5") && button6.getText().equals("6")
                && button7.getText().equals("7") && button8.getText().equals("8") && button9.getText().equals(" "))     //winnning condition
        {
            JOptionPane.showMessageDialog( endLabel, "Congragulations! You won by " + count + " moves. " + "You took " + seconds + " secs. Click on New Game to play once again!");

            count = 0;
            moves.setText("Number of moves : " + count);        //Randomization after the player finishes a game

            seconds = 0;
            start = System.currentTimeMillis();

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
    }
}
