package zaas;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class asd extends JFrame {
    public asd(){
    
JFrame frame = new JFrame("kkgfgjk");
        frame.setSize(300, 300);
            Meud m1 = new Meud();
      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      JLabel l22=new JLabel("DATE :");
      l22.setBounds(100,350,100,20);
      frame.add(l22);

        frame.getContentPane().add(m1);

        frame.setVisible(true);
    
    }

  
}
