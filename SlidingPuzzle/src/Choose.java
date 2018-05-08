import javafx.scene.control.RadioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choose extends JFrame implements ActionListener
{
    private Container c = new Panel();

    public Choose()
    {
        super("Choose Settings");
        JLabel Question = new JLabel("What size of Board whoud you like? (aXa)");
        c.add(Question);
        JRadioButton Three = new JRadioButton("3");
        JRadioButton Four = new JRadioButton("4");
        JRadioButton Five = new JRadioButton("5");
        ButtonGroup Size = new ButtonGroup();
        Size.add(Three);
        Size.add(Four);
        Size.add(Five);
        this.setSize(300,300);
        this.setLayout( new FlowLayout());
        this.add(Three);
        this.add(Four);
        this.add(Five);
        Three.setSelected(true);
        this.add(c);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}