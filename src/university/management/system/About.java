package university.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 8 , 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel name = new JLabel("Developed By: Team OOP-Sies");
        name.setBounds(70, 220, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
         JLabel rollno3= new JLabel("Name:Dimpal               Roll number: IIT2023241");
        rollno3.setBounds(70, 280, 550, 40);
        rollno3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno3);
        
        JLabel rollno1= new JLabel("Name:Pragya Jaiswal     Roll number: IIT2023224");
        rollno1.setBounds(70, 350, 550, 40);
        rollno1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno1);
        
        JLabel rollno2= new JLabel("Name:Archit Sovale       Roll number: IIT2023225");
        rollno2.setBounds(70, 315, 550, 40);
        rollno2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno2);
        
       
        
              JLabel rollno4= new JLabel("Name:Nidhi Kumari       Roll number: IIB2023037");
        rollno4.setBounds(70, 385, 550, 40);
        rollno4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(rollno4);
        
        
        
        
        
        
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}