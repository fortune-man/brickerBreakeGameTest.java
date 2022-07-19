package brickBreaker;

import javax.swing.*;


public class Main extends JFrame{
    public Main(){
        Gameplay gameplay = new Gameplay();
        this.setBounds(10, 10, 700, 600);
        this.setTitle("Breakout Ball");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(gameplay);
    }
    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });

    }
}
