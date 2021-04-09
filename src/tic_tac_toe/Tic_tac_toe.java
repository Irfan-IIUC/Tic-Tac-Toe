/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic_tac_toe;

/**
 *
 * @author QUAZI HASNAT IRFAN
 */
// ========================= Import Classes =========================
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

// ========================= Button Variable Class =========================
class button_variable {

    static JFrame window = new JFrame("Tic-Tac-Toe");

    static JButton b1 = new JButton();
    static JButton b2 = new JButton();
    static JButton b3 = new JButton();
    static JButton b4 = new JButton();
    static JButton b5 = new JButton();
    static JButton b6 = new JButton();
    static JButton b7 = new JButton();
    static JButton b8 = new JButton();
    static JButton b9 = new JButton();

    static String letter = "";
    static int count = 0;
    static boolean win = false;
}

// ========================= Main Class =========================
public class Tic_tac_toe extends button_variable implements ActionListener {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        // TODO code application logic here
        UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        Tic_tac_toe obj = new Tic_tac_toe();
    }

// ========================= Constructor =========================
    public Tic_tac_toe() {

        window.setSize(300, 300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3, 3));

// ========================= Adding Buttons =========================
        window.add(b1);
        window.add(b2);
        window.add(b3);
        window.add(b4);
        window.add(b5);
        window.add(b6);
        window.add(b7);
        window.add(b8);
        window.add(b9);

// ========================= Adding Buttons to Action listener =========================
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }

// ========================= Action Performed Method =========================
    public void actionPerformed(ActionEvent e) {

        count++;

        if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {

            letter = "X";

        } else if (count == 2 || count == 4 || count == 6 || count == 8 || count == 10) {

            letter = "O";
        }

        if (e.getSource() == b1) {

            b1.setText(letter);
            b1.setEnabled(false);

        } else if (e.getSource() == b2) {

            b2.setText(letter);
            b2.setEnabled(false);

        } else if (e.getSource() == b3) {

            b3.setText(letter);
            b3.setEnabled(false);

        } else if (e.getSource() == b4) {

            b4.setText(letter);
            b4.setEnabled(false);

        } else if (e.getSource() == b5) {

            b5.setText(letter);
            b5.setEnabled(false);

        } else if (e.getSource() == b6) {

            b6.setText(letter);
            b6.setEnabled(false);

        } else if (e.getSource() == b7) {

            b7.setText(letter);
            b7.setEnabled(false);

        } else if (e.getSource() == b8) {

            b8.setText(letter);
            b8.setEnabled(false);

        } else if (e.getSource() == b9) {

            b9.setText(letter);
            b9.setEnabled(false);
        }

// ========================= Horizontal Condition =========================
        if (b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText() != "") {

            win = true;
        } else if (b4.getText() == b5.getText() && b5.getText() == b6.getText() && b4.getText() != "") {

            win = true;
        } else if (b7.getText() == b8.getText() && b8.getText() == b9.getText() && b7.getText() != "") {

            win = true;
        } // ========================= Vertical Condition =========================
        else if (b1.getText() == b4.getText() && b4.getText() == b7.getText() && b1.getText() != "") {

            win = true;
        } else if (b2.getText() == b5.getText() && b5.getText() == b8.getText() && b2.getText() != "") {

            win = true;
        } else if (b3.getText() == b6.getText() && b6.getText() == b9.getText() && b3.getText() != "") {

            win = true;
        } // ========================= Diagonal Alignment =========================
        else if (b1.getText() == b5.getText() && b5.getText() == b9.getText() && b1.getText() != "") {

            win = true;
        } else if (b3.getText() == b5.getText() && b5.getText() == b7.getText() && b3.getText() != "") {

            win = true;
        } else {

            win = false;
        }

// ========================= who win the game =========================
        if (win == true) {

            JOptionPane.showMessageDialog(null, letter + " wins !", "Who will win he game", JOptionPane.INFORMATION_MESSAGE);

            int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again ?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.NO_OPTION) {

                System.exit(0);
            } else {

                reset();
            }
        } else if (win == false && count == 9) {

            JOptionPane.showMessageDialog(null, "game draw !", "Who will win he game", JOptionPane.INFORMATION_MESSAGE);

            int answer = JOptionPane.showConfirmDialog(null, "Would you like to play again ?", "Confirm", JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.NO_OPTION) {

                System.exit(0);
            } else {

                reset();
            }
        }

    }

    
// ========================= Reset Method =========================
    
    
    public void reset() {

        b1.setText("");
        b1.setEnabled(true);

        b2.setText("");
        b2.setEnabled(true);

        b3.setText("");
        b3.setEnabled(true);

        b4.setText("");
        b4.setEnabled(true);

        b5.setText("");
        b5.setEnabled(true);

        b6.setText("");
        b6.setEnabled(true);

        b7.setText("");
        b7.setEnabled(true);

        b8.setText("");
        b8.setEnabled(true);

        b9.setText("");
        b9.setEnabled(true);

        win = false;
        count = 0;
    }

}


// ========================= End of main class =========================
