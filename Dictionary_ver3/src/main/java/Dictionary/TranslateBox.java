package Dictionary;

import java.awt.BorderLayout;

import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.InputStream;
import java.io.IOException;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.net.URL;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
public class TranslateBox extends JFrame {

    private JPanel contentPane;
    JTextArea wordVie = new JTextArea();
    private JTextField wordEng;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TranslateBox frame = new TranslateBox();
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
    public TranslateBox() throws IOException{
        setType(Type.POPUP);
        setTitle("Lookup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 831, 590);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(51, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton searchButton = new JButton("");
        searchButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\IconSearch.png"));
        searchButton.setBounds(418, 493, 75, 50);
        
        JLabel searchLabel = new JLabel("English");
        searchLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
        searchLabel.setBounds(41, 94, 92, 50);
        contentPane.add(searchLabel);
        
        JLabel resultLabel = new JLabel("VietNamese");
        resultLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
        resultLabel.setBounds(10, 285, 140, 50);
        contentPane.add(resultLabel);
        
        searchButton.addMouseListener(new MouseAdapter() {
         });
          searchButton.addActionListener(new ActionListener() {
          //sua ham nay.
          public void actionPerformed(ActionEvent e) {
                  String searchWord = wordEng.getText();
                  String vieWord = DataBase.EnToViSearch(searchWord);
                  wordVie.setText(vieWord);
            }
          });             
        searchButton.setFont(new Font("Arial", Font.BOLD, 20));
        contentPane.add(searchButton);   
        
        JButton back = new JButton("");
        back.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\kisspng-button-removebg-preview.png"));
        back.setBackground(new Color(0, 153, 255));
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics();
                st.setVisible(true);
                dispose();
            }
        });
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Arial", Font.BOLD, 26));
        back.setBounds(0, 0, 53, 50);
        contentPane.add(back);
        
        wordEng = new JTextField();
        wordEng.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        wordEng.setBounds(179, 145, 544, 50);
        contentPane.add(wordEng);
        wordEng.setColumns(10);
        
        JLabel imagesVN = new JLabel("");
        imagesVN.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\iconVietNam.png"));
        imagesVN.setBounds(10, 332, 140, 50);
        contentPane.add(imagesVN);
        
        JLabel imagesEng = new JLabel("");
        imagesEng.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\iconEngland.png"));
        imagesEng.setBounds(10, 143, 140, 50);
        contentPane.add(imagesEng);
        
        JLabel logoGr = new JLabel("");
        logoGr.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\logoGr-removebg-preview.png"));
        logoGr.setBounds(274, 0, 297, 172);
        contentPane.add(logoGr);
        
        JButton readButton = new JButton("");
        readButton.setBackground(new Color(0, 153, 255));
        readButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\pronunciation_1.png"));
        readButton.setBounds(733, 145, 44, 50);
        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Voice.Read(wordEng.getText());
            }
        });
        contentPane.add(readButton);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setToolTipText("ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg\r\nffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff\r\nggg");
        scrollPane.setBounds(179, 214, 544, 269);
        contentPane.add(scrollPane);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\background1.png"));
        lblNewLabel.setBounds(0, 0, 792, 553);
        contentPane.add(lblNewLabel);
        wordVie.setBounds(181, 206, 592, 276);
        contentPane.add(wordVie);
        wordVie.setFont(new Font("Times New Roman", Font.ITALIC, 13));
        
        wordVie.setLineWrap(true);
        
    }
}