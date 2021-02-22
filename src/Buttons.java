import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    boolean myTurn = true;
    JButton reset;
    JButton[] button = new JButton[9];

    public Buttons() {

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton("");
            button[i].addActionListener(this);
            add(button[i]);
            button[i].setBackground(Color.WHITE);
        }
        reset = new JButton("RESET");
        reset.addActionListener(this);
        add(reset);

        setLayout(new GridLayout(4, 3));
    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source .equals(reset)){
            for (int i = 0; i < button.length; i++){
                button[i].setText("");
                button[i].setEnabled(true);
                button[i].setBackground(Color.WHITE);
            }
        }

        myTurn = !myTurn;

        String symbol = "X";
        if(myTurn){
            symbol = "O";
        }


        for (int i = 0; i < button.length; i++){

            if(source.equals(button[i])){
                button[i].setText(symbol);
                button[i].setEnabled(false);
                
            }
        }
        checkResult();
        
    }

    public void checkResult(){
        String[] ch = new String[9];
        int[] id = new int[9];
        for(int i = 0; i < 3; i++){
          ch[i] = button[i].getText();
          id[i] = i;
        }
        if(ch[0].equals(ch[1]) && ch[1].equals(ch[2]) && ch[0] != ""){
          button[id[0]].setBackground(Color.GREEN);
          button[id[1]].setBackground(Color.GREEN);
          button[id[2]].setBackground(Color.GREEN);
        }

        for(int i = 3;i < 6; i++){
            ch[i] = button[i].getText();
            id[i] = i;
        }
          if(ch[3].equals(ch[4]) && ch[4].equals(ch[5]) && ch[3] != ""){
            button[id[3]].setBackground(Color.GREEN);
            button[id[4]].setBackground(Color.GREEN);
            button[id[5]].setBackground(Color.GREEN);
        }

        for(int i = 6;i < 9; i++){
            ch[i] = button[i].getText();
            id[i] = i;
        }
          if(ch[6].equals(ch[7]) && ch[7].equals(ch[8]) && ch[6] != ""){
            button[id[6]].setBackground(Color.GREEN);
            button[id[7]].setBackground(Color.GREEN);
            button[id[8]].setBackground(Color.GREEN);
        }

        for(int i = 0;i < 9; i++){
            ch[i] = button[i].getText();
            id[i] = i;
        }
          if(ch[0].equals(ch[4]) && ch[4].equals(ch[8]) && ch[0] != ""){
            button[id[0]].setBackground(Color.GREEN);
            button[id[4]].setBackground(Color.GREEN);
            button[id[8]].setBackground(Color.GREEN);
        }

        for(int i = 0;i < 9; i++){
            ch[i] = button[i].getText();
            id[i] = i;
        }
          if(ch[2].equals(ch[4]) && ch[4].equals(ch[6]) && ch[2] != ""){
            button[id[2]].setBackground(Color.GREEN);
            button[id[4]].setBackground(Color.GREEN);
            button[id[6]].setBackground(Color.GREEN);
        }



    
    }

  
}
