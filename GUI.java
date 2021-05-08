
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author shegavala
 */
    public class GUI implements ActionListener {//GUI-grafical user interface
    
        int count = 0;
        private JFrame frame;
        private JPanel panel;
        private JLabel label;
        private JButton button;
        
        
        
        
        public GUI(){
        
        frame = new JFrame(); 
        
        button = new JButton("Click me");
        button.addActionListener(this);
        
        label = new JLabel("Number of clicks: 0");
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
        
        
        
    }
    public static void main(String[] args) {
        new GUI();
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
       count++;   
       label.setText("Number of clicks: " + count);
    }
    
}
