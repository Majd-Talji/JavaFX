package _02_Tools_Basic._26_Alert._03_Input_Dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JOptionPane Demo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton btn1 = new JButton("Enter Value");
        JButton btn2 = new JButton("Select Value");
        JLabel label = new JLabel("Returned Value:");

        btn1.setBounds(95, 30, 200, 30);
        btn2.setBounds(95, 70, 200, 30);
        label.setBounds(95, 110, 200, 30);

        frame.add(btn1);
        frame.add(btn2);
        frame.add(label);

        frame.setVisible(true);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String result = JOptionPane.showInputDialog(frame, "Enter value: ", "", JOptionPane.PLAIN_MESSAGE);

                if (result != null) {
                    label.setText("Returned Value: " + result);
                }

            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object[] values = {"Java", "CSS", "C++", "Android", "Python"};

                String result = (String) JOptionPane.showInputDialog(frame, "Enter value: ", "", JOptionPane.PLAIN_MESSAGE, null, values, values[0]);

                label.setText("Returned Value: " + result);

            }
        });

    }

}
