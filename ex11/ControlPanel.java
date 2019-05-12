import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControlPanel extends JPanel {
	public ControlPanel(){
        setLayout(new FlowLayout());
        JButton exitButton = new JButton("Exit");
        add(exitButton);
        
        exitButton.addActionListener(new ActionListener(){    
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(1);
      }
    });
	}
}