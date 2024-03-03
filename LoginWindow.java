import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginWindow extends JFrame
{
    private MyPanel panel = new MyPanel();
    public LoginWindow()
    {
        super("Login");
        setup();
        build();
        setVisible(true); 
    }
    private void setup(){
        setSize(300, 200);
        setLocation(200, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void build()
    {
        add(panel);
    }
    
    public class MyPanel extends JPanel{
        private JLabel login = new JLabel("Login ID:");
        private JTextField id = new JTextField(10);
        private JLabel password = new JLabel("Password:");
        private JTextField pwd = new JTextField(10);
        private JButton button = new JButton("Login");
        private JLabel confirm = new JLabel(" ");
        private final String LOGIN_ID = "1234";
        private final String PASSWORD = "5678";

        public MyPanel()
        {
            setup();
            build();
        }
        private void setup(){
            button.addActionListener(new LoginListener());
        }
        private void build(){
            add(login);
            add(id);
            add(password);
            add(pwd);
            add(button);
            add(confirm);
        }
        private class LoginListener implements ActionListener
        {
            public void actionPerformed(ActionEvent e) // events can be: button clicks, typing, mouse click
            {
                //System.out.println("Login Clicked");
                if(id.getText().equals(LOGIN_ID) && pwd.getText().equals(PASSWORD)){
                    confirm.setText("Login successful");
                }else{
                    confirm.setText("Login failed");
                }
            }          
        }
    }
}