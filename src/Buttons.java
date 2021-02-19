import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    JButton reset;
    JButton[] button = new JButton[9];

    public Buttons() {

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(""+i);
            button[i].addActionListener(this);
            add(button[i]);

        }
        reset = new JButton("RESET");
        add(reset);

        setLayout(new GridLayout(4, 3));
    }

    public void actionPerformed(ActionEvent e) {
        
        Object source = e.getSource();

        for (int i = 0; i < button.length; i++){

            if(source.equals(button[i])){
                button[i].setText("X");
            }
        }



    }

   
  

    
}
