import javax.swing.*;


public class Frame extends JFrame {
    private static final long serialVersionUID = 1L;

    public Frame() {
        super("Kółko i krzyżyk");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocation(1000, 100);
        

        
        JPanel buttonPanel = new Buttons();
        add(buttonPanel);

        
        setVisible(true);
    }

    
    
}
