import javax.swing.*;
public class frame extends JFrame {
    frame(){
        //adding the panel to the frame
        this.add(new panel());
        //naming the frame window
        this.setTitle("SnakeGame");
        //to make sure uniform game window size
        this.setResizable(false);
        //to make the window visible
        this.setVisible(true);
        //to make the window size same in different resolutions/systems.
        this.pack();
    }
}

