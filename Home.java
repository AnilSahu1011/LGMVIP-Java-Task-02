import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Home implements ActionListener{
    JFrame frame ;
    JLabel imgLabel;
    JButton btn;
    Home(){
        frame = new JFrame("Welcome");
        frame.setLayout(null);
        frame.setLocation(750,200);
        frame.setSize(754,407);

        ImageIcon imageIcon = new ImageIcon("D:\\Main Drive\\MCA\\Internship (Lets Grow More)\\tictac.jpeg.jpg");
        imageIcon = new ImageIcon(imageIcon.getImage().getScaledInstance(754, 407, 0));

        imgLabel = new JLabel();
        imgLabel.setIcon(imageIcon);
        imgLabel.setBounds(0, 0, 754, 407);
        frame.add(imgLabel);

        btn = new JButton("Let's Start");
        btn.setBounds(320, 310, 100, 45);
        btn.setFont(new Font("Calibri", Font.PLAIN, 16));
        btn.setForeground(Color.BLUE);
        btn.setBackground(Color.WHITE);
        frame.add(btn);
        btn.addActionListener(this);

        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btn)){
            frame.dispose();
            new TicTacToe();
        }
    }
}
