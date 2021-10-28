package Dictionary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.UIManager;

public class AddBox extends JFrame {

    private JPanel contentPane;
    private JTextField EngWordAdd;
    private JTextField VieWordAdd;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddBox frame = new AddBox();
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
    public AddBox() {
        setType(Type.POPUP);
        setTitle("Insert Word");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 840, 587);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        EngWordAdd = new JTextField();
        EngWordAdd.setFont(new Font("Arial", Font.PLAIN, 36));
        EngWordAdd.setBounds(146, 103, 345, 49);
        contentPane.add(EngWordAdd);
        EngWordAdd.setColumns(10);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.addActionListener(new ActionListener() {
            //sua ham nay
            public void actionPerformed(ActionEvent e) {
                // tu can them
                Word w = new Word();
                w.word_Target = EngWordAdd.getText() ;
        		w.word_Explain = VieWordAdd.getText();
        		DataBase.insertToDatabase(w);
                //neu xoa dc thi in thong bao 
            }
        });
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\IconAdd.png"));
        btnNewButton.setBounds(557, 158, 57, 49);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Back");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics();
                st.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 26));
        btnNewButton_1.setBounds(689, 470, 127, 49);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel = new JLabel("EngLish");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(37, 103, 85, 49);
        contentPane.add(lblNewLabel);
        
        VieWordAdd = new JTextField();
        VieWordAdd.setBounds(146, 208, 345, 49);
        contentPane.add(VieWordAdd);
        VieWordAdd.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("VietNamese");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(36, 205, 100, 49);
        contentPane.add(lblNewLabel_1);
    }
}