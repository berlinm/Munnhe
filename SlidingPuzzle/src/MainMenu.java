import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class MainMenu extends JFrame implements ActionListener
{
    private Container c;

    private Button ExitButton;
    private Button PlayButton;

    public MainMenu ()
    {
        super("Main Menu");
        this.c = new JPanel();
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Label Welcome = new Label(welcome());
        c.add(Welcome);
        this.ExitButton = new Button("Exit");
            ExitButton.addActionListener(this);
            c.add(ExitButton);
        this.PlayButton = new Button("Play");
            PlayButton.addActionListener(this);
            c.add(PlayButton);
            this.add(c);
        this.setVisible(true);
    }

    private String welcome()
    {
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        int time = calendar.get(Calendar.HOUR_OF_DAY);
        if (time < 12)
            return "Good morning, welcome to our game";
        else if (time < 18)
            return "Good afternoon, welcome to our game";
        else return "Good evening, welcome to our game";
    }

    public static void main(String[] args)
    {
         MainMenu menu = new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == ExitButton)
            System.exit(0);
         if (e.getSource() == PlayButton)
             GoToGame();
    }
    private void GoToGame()
    {
        Choose c = new Choose();
    }


}