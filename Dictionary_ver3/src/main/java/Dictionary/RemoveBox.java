package Dictionary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class RemoveBox extends JFrame {

    private JPanel contentPane;
    private JTextField wordNeedRemove;
    JTextArea showInfor = new JTextArea();
    private JLabel lblNewLabel;
    private JLabel backgroundLabel;
    private JLabel hinhnen;
    
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RemoveBox frame = new RemoveBox();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public RemoveBox() {
        setType(Type.POPUP);
        setTitle("Remove Word");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 825, 575);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(51, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        wordNeedRemove = new JTextField();
        wordNeedRemove.setFont(new Font("Times New Roman", Font.ITALIC, 36));
        wordNeedRemove.setBounds(192, 82, 357, 48);
        contentPane.add(wordNeedRemove);
        wordNeedRemove.setColumns(10);
        
        
        showInfor.setBackground(new Color(0, 153, 255));
        showInfor.setFont(new Font("Arial", Font.PLAIN, 26));
        showInfor.setBounds(192, 355, 421, 74);
        contentPane.add(showInfor);
        
        JButton removeButton = new JButton("");
        removeButton.setForeground(Color.CYAN);
        removeButton.setBackground(Color.CYAN);
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //tu can xoa
                String rmWord = wordNeedRemove.getText();
                DataBase.deleteRowWithKey(rmWord);
                // sua ham nay
                showInfor.setText("Succesfull");
            }
        });
        removeButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\IconRemove-removebg-preview.png"));
        removeButton.setBounds(549, 82, 64, 48);
        contentPane.add(removeButton);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setBackground(new Color(0, 153, 255));
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\kisspng-button-removebg-preview.png"));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics(); // chuyển màn hình
                st.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 26));
        btnNewButton.setBounds(0, 0, 53, 50);
        contentPane.add(btnNewButton);
        
        lblNewLabel = new JLabel("Type  Here");
        lblNewLabel.setFont(new Font("Tekton Pro", Font.PLAIN, 25));
        lblNewLabel.setBounds(72, 82, 118, 48);
        contentPane.add(lblNewLabel);
        
        backgroundLabel = new JLabel("");
        backgroundLabel.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\backgroundRemove-removebg-preview.png"));
        backgroundLabel.setBounds(157, 0, 666, 459);
        contentPane.add(backgroundLabel);
        
        hinhnen = new JLabel("");
        hinhnen.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\background1.png"));
        hinhnen.setBounds(0, 0, 811, 538);
        contentPane.add(hinhnen);
    }
}
