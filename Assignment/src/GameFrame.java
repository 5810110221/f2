import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
  private BoardPanel boardPanel;
  private ControlPanel controlPanel;

  public GameFrame(){
    super("Snake Ladder by Pongpassakon Pongsapan 5810110221");
    boardPanel = new BoardPanel(820, 512);
    controlPanel = new ControlPanel();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setUndecorated(false);
    setResizable(true);
    setSize(1025, 550);

    add(boardPanel, BorderLayout.CENTER);
    controlPanel.setPreferredSize(new Dimension(180, 0));
    add(controlPanel, BorderLayout.LINE_END);
    
    setVisible(true);
  }
}