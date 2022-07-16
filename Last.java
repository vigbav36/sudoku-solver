
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Last implements ActionListener {
    JFrame mainFrame = new JFrame();
    JTextField board[][]= new JTextField[9][9];
    JPanel title=new JPanel();
    JPanel main = new JPanel();
    JPanel sudoku = new JPanel();
    JPanel buttonPanel = new JPanel();
    JLabel heading = new JLabel();
    JLabel ending = new JLabel();
    JPanel grid[] = new JPanel[9];
    JButton next = new JButton();
    Last(char Board[][]){
        LastGUI(Board);
    }

    void LastGUI(char Board[][]){
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800,800);
        mainFrame.setLayout(new BorderLayout());
        

        heading.setBackground(new Color(25,25,25));
		heading.setForeground(new Color(25,255,0));
		heading.setFont(new Font("Ink Free",Font.BOLD,75));
		heading.setHorizontalAlignment(JLabel.CENTER);
		heading.setText("Sudkoku solver");
		heading.setOpaque(true);

        ending.setBackground(new Color(25,25,25));
		ending.setForeground(new Color(25,255,0));
		ending.setFont(new Font("Ink Free",Font.BOLD,75));
		ending.setHorizontalAlignment(JLabel.CENTER);
		ending.setText("SOLVED!");
		ending.setOpaque(true);

		
		title.setLayout(new BorderLayout());
		title.setBounds(0,0,800,100);
        title.add(heading);
        
       // main.setLayout(new GridLayout(9,9));
        main.setLayout(new BorderLayout());
        main.setBackground(new Color(150,150,150));

        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(ending);
        
        buttonPanel.setPreferredSize(new Dimension(100,100));

        sudoku.setLayout(new GridLayout(3,3));
        sudoku.setBackground(new Color(150,150,150));
        main.add(sudoku,BorderLayout.CENTER);
        

        javax.swing.border.Border border = BorderFactory.createLineBorder(new Color(37,53,41),3);
        javax.swing.border.Border border2 = BorderFactory.createLineBorder(Color.gray,2);
        
        for(int i=0;i<9;i++){
            grid[i]=new JPanel();
            grid[i].setLayout(new GridLayout(3,3));
            grid[i].setBorder(border);   
            grid[i].setBackground(Color.GRAY);         
            sudoku.add(grid[i]);
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=new JTextField();
                board[i][j].setBackground(Color.LIGHT_GRAY);
                board[i][j].setFont(new Font("Serif",Font.BOLD,25));
                board[i][j].setHorizontalAlignment(JTextField.CENTER);
                board[i][j].setBorder(border2);
                sudoku.add(board[i][j]); 
                board[i][j].setText(String.valueOf(Board[i][j]));
                if( i <=2 && j <=2){
                
                grid[0].add(board[i][j]);
                }

                else if(j>2 && j<=5 && i<=2){
                grid[1].add(board[i][j]);
                }
                
                else if(j>5 && j<=8 && i<=2){
                grid[2].add(board[i][j]);
                }

                else if(i>2 && i<=5 && j<=2){
                grid[3].add(board[i][j]);
                }

                else if(i>2 && i<=5 && j>2 && j<=5){
                grid[4].add(board[i][j]);
                }

                else if(i>2 && i<=5 && j>5 && j<=8){
                grid[5].add(board[i][j]);
                }

                else if(i>5 && i<=8 && j<=2){
                grid[6].add(board[i][j]);
                }

                else if(i>5 && i<=8 && j>2 && j<=5){
                grid[7].add(board[i][j]);
                }

                else {
                grid[8].add(board[i][j]);
                }
            }

        }



        next.setBackground(Color.WHITE);
        next.setSize(2, 2);
        next.setBackground(Color.black);
        next.setText("NEXT");
        next.setForeground(new Color(25,255,0));
        next.setFont(new Font("Ink Free",Font.BOLD,75));
        next.setHorizontalAlignment(JButton.CENTER);
        next.addActionListener(this);
        buttonPanel.add(next);
        

        mainFrame.add(main,BorderLayout.CENTER);
        mainFrame.add(buttonPanel,BorderLayout.SOUTH);
        mainFrame.add(title,BorderLayout.NORTH);
        mainFrame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==next){
            new Front();
            mainFrame.dispose();
        }
        
    }

}


    

