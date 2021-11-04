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
        contentPane.setBackground(new Color(51, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        EngWordAdd = new JTextField();
        EngWordAdd.setFont(new Font("Arial", Font.PLAIN, 30));
        EngWordAdd.setBounds(319, 208, 345, 65);
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
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\IconAdd.png"));
        btnNewButton.setBounds(695, 300, 57, 49);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setBackground(new Color(0, 153, 255));
        btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\kisspng-button-removebg-preview.png"));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics();
                st.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 26));
        btnNewButton_1.setBounds(0, 0, 53, 50);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel = new JLabel("EngLish");
        lblNewLabel.setFont(new Font("Caveat", Font.BOLD, 30));
        lblNewLabel.setBounds(44, 216, 99, 49);
        contentPane.add(lblNewLabel);
        
        VieWordAdd = new JTextField();
        VieWordAdd.setFont(new Font("Caveat", Font.BOLD, 30));
        VieWordAdd.setBounds(319, 384, 345, 65);
        contentPane.add(VieWordAdd);
        VieWordAdd.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("VietNamese");
        lblNewLabel_1.setFont(new Font("Caveat", Font.BOLD, 30));
        lblNewLabel_1.setBounds(44, 392, 126, 49);
        contentPane.add(lblNewLabel_1);
        
        JLabel imagesVN = new JLabel("");
        imagesVN.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\iconVietNam.png"));
        imagesVN.setBounds(178, 384, 141, 65);
        contentPane.add(imagesVN);
        
        JLabel imagesEng = new JLabel("");
        imagesEng.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\iconEngland.png"));
        imagesEng.setBounds(178, 208, 141, 65);
        contentPane.add(imagesEng);
        
        JLabel intro = new JLabel("");
        intro.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\logoGr-removebg-preview.png"));
        intro.setBounds(274, 10, 266, 164);
        contentPane.add(intro);
        
        JLabel hinhnen = new JLabel("");
        hinhnen.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\background1.png"));
        hinhnen.setBounds(-12, 0, 838, 550);
        contentPane.add(hinhnen);
    }
}