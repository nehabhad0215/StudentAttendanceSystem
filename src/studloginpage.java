import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class studloginpage extends JFrame implements ActionListener {



        JButton signin, cancel;
        JTextField username;
        JPasswordField password;


        studloginpage() {

            setSize(1600, 1000);

            JLabel l9 = new JLabel("Student Login");
            l9.setBounds(200, 0, 200, 60);
            l9.setFont(new Font("Seigo", Font.ITALIC, 28));
            l9.setForeground(Color.white);
            add(l9);

            JLabel l1 = new JLabel("Username");
            l1.setBounds(60, 80, 150, 50);
            l1.setFont(new Font("Tahoma", Font.BOLD, 20));
            l1.setForeground(Color.white);
            add(l1);

            JLabel l2 = new JLabel("Password");
            l2.setBounds(60, 160, 150, 50);
            l2.setFont(new Font("Tahoma", Font.BOLD, 20));
            l2.setForeground(Color.white);
            add(l2);

            JTextField username = new JTextField();
            username.setBounds(250, 80, 150, 40);
            username.setFont(new Font("Segeo", Font.PLAIN, 24));
            add(username);

            JPasswordField password = new JPasswordField();
            password.setBounds(250, 160, 150, 40);
            add(password);

            signin = new JButton("Sign In");
            signin.setBounds(440, 280, 100, 50);
            signin.setFont(new Font("Tahoma", Font.BOLD, 16));
            signin.setBackground(Color.white);
            add(signin);


            cancel = new JButton("Cancel");
            cancel.setBounds(40, 280, 100, 50);
            cancel.setFont(new Font("Tahoma", Font.BOLD, 16));

            cancel.setBackground(Color.white);
            cancel.setForeground(Color.black);
            cancel.addActionListener(this);
            add(cancel);

            ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("jprojectsimg/b15.jpg"));
            Image i5 = i4.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
            ImageIcon i6 = new ImageIcon(i5);
            JLabel j1 = new JLabel(i6);
            j1.setBounds(0, 0, 600, 400);
            add(j1);

            getContentPane().setBackground(Color.black);
            setLayout(null);
            setBounds(350, 150, 600, 400);// setting the frame dimensions

            setLayout(null);
            setLocationRelativeTo(null);
            setVisible(true);
        }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==cancel){
            this.setVisible(false);
            new selectpage().setVisible(true);
        }
    }


        public static void main(String[] args) {
            new studloginpage();
        }
    }

