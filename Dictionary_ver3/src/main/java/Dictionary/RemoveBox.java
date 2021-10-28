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
        contentPane.setBackground(new Color(0, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        wordNeedRemove = new JTextField();
        wordNeedRemove.setFont(new Font("Arial", Font.BOLD, 36));
        wordNeedRemove.setBounds(0, 47, 357, 48);
        contentPane.add(wordNeedRemove);
        wordNeedRemove.setColumns(10);
        
        
        showInfor.setBackground(new Color(0, 255, 255));
        showInfor.setFont(new Font("Arial", Font.PLAIN, 26));
        showInfor.setBounds(0, 128, 811, 410);
        contentPane.add(showInfor);
        
        JButton removeButton = new JButton("");
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //tu can xoa
                String rmWord = wordNeedRemove.getText();
                // sua ham nay
                showInfor.setText("xoa thanh cong");
            }
        });
        removeButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\IconRemove.png"));
        removeButton.setBounds(356, 47, 64, 48);
        contentPane.add(removeButton);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics(); // chuyển màn hình
                st.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 26));
        btnNewButton.setBounds(683, 50, 118, 48);
        contentPane.add(btnNewButton);
    }
}