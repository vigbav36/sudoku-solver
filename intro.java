 
 
import java.awt.*;
import java.awt.event.*;
 
//import javax.lang.model.element.Element;
import javax.swing.*;
 
public class intro implements ActionListener {
 
    JFrame mainFrame = new JFrame();
    JTextField board[][];
    JPanel title=new JPanel();
    JPanel main = new JPanel();
    JPanel sudoku = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel heading = new JLabel();
    JPanel grid[] = new JPanel[9];
    JButton solve = new JButton();
    JLabel center = new JLabel();
   
    intro(){
        IntroGUI();
    }
 
    void IntroGUI(){
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800,800);
        mainFrame.setLayout(new BorderLayout());
       
 
        board = new JTextField[9][9];
 
        ImageIcon image = new ImageIcon("img1.jpg");
        center.setIcon(image);
        heading.setBackground(new Color(25,25,25));
        heading.setForeground(new Color(25,255,0));
        heading.setFont(new Font("Ink Free",Font.BOLD,75));
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setText("Sudkoku solver");
        heading.setOpaque(true);
        
        center.setBackground(new Color(150,150,150));
        center.setForeground(Color.BLACK);
        //center.setFont(new Font("Ink Free",Font.BOLD,75));
        center.setHorizontalAlignment(JLabel.CENTER);
        //center.setText("SOLVES UNSOLVED SUDOKU");
        center.setOpaque(true);
       
        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);
        title.add(heading);
       
       // main.setLayout(new GridLayout(9,9));
        main.setLayout(new BorderLayout());
        main.setBackground(new Color(150,150,150));
 
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBackground(new Color(200,200,150));
        buttonPanel.setPreferredSize(new Dimension(100,100));
 
        sudoku.setLayout(new BorderLayout());
        sudoku.setBackground(new Color(150,150,150));
        sudoku.add(center);
        main.add(sudoku,BorderLayout.CENTER);
 

 
       
     
   
               
 
       
        solve.setBackground(Color.WHITE);
        solve.setSize(2, 2);
        solve.setBackground(Color.black);
        solve.setText("ENTER");
        solve.setForeground(new Color(25,255,0));
        solve.setFont(new Font("Ink Free",Font.BOLD,75));
        solve.setHorizontalAlignment(JButton.CENTER);
        solve.addActionListener(this);
        buttonPanel.add(solve);
 
        mainFrame.add(main,BorderLayout.CENTER);
        mainFrame.add(buttonPanel,BorderLayout.SOUTH);
        mainFrame.add(title,BorderLayout.NORTH);
        mainFrame.setVisible(true);
         
 
 
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        new Front();
        mainFrame.dispose();
       
    }
}
   
 


