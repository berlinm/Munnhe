import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.sql.Time;
import java.util.*;
public class Puzzle extends JFrame
{
    private JPanel myPanel;
    private Toolkit tk;
    public Puzzle()
    {
        this.myPanel = new JPanel();
        this.setTitle("Sliding Puzzle");
        this.tk = Toolkit.getDefaultToolkit();
        this.setSize(400, 400);
        Label Welcome = new Label(welcome());
        myPanel.add(Welcome);
        Button ExitButton = new Button("Exit");
        myPanel.add(ExitButton);
        Button PlayButton = new Button("Play");
        myPanel.add(PlayButton);
        this.add(myPanel);
        this.setVisible(true);
    }
    private String welcome ()
    {
        Calendar cal = Calendar.getInstance();
        int time = (int) cal.getTime().getTime();
        if (time < 12)
            return "Good morning, welcome to our game";
        else if ( time < 6)
            return "Good afternoon, welcome to our game";
        else return "Good evening, welcome to our game";
    }
    public static void main (String[] args)
    {
        Puzzle SlidingPuzzle = new Puzzle();
    }
}
