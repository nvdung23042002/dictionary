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
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
public class API_Box extends JFrame {

    private JPanel contentPane;
    JTextArea wordEng = new JTextArea();
    JTextArea wordVie = new JTextArea();
    ButtonGroup bg = new ButtonGroup();
    JRadioButton EnToViButton = new JRadioButton("English -> VietNamese");
    JRadioButton ViToEnButton = new JRadioButton("Vietnamese -> English");
    private final JLabel lblNewLabel = new JLabel("New label");
    private final JScrollPane scrollPane = new JScrollPane();
    private final JScrollPane scrollPane_1 = new JScrollPane();
    
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    API_Box frame = new API_Box();
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
    public API_Box() throws IOException{
        setType(Type.POPUP);
        setTitle("Lookup");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 818, 590);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(51, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton searchButton = new JButton("");
        searchButton.setBackground(new Color(0, 153, 255));
        searchButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\IconSearch.png"));
        searchButton.setBounds(339, 373, 75, 50);
        searchButton.addMouseListener(new MouseAdapter() {
        });
        EnToViButton.setBackground(new Color(0, 153, 255));
        EnToViButton.setFont(new Font(".VnLinus", Font.PLAIN, 40));
        
        
        EnToViButton.setSelected(true);
        bg.add(EnToViButton);
        EnToViButton.setBounds(6, 107, 316, 48);
        contentPane.add(EnToViButton);
        
        
        bg.add(ViToEnButton);
        ViToEnButton.setBackground(new Color(0, 153, 255));
        ViToEnButton.setFont(new Font(".VnLinus", Font.PLAIN, 40));
        ViToEnButton.setBounds(6, 157, 316, 48);
        contentPane.add(ViToEnButton);
               
       // click here to translate
        searchButton.addMouseListener(new MouseAdapter() {
        });
         searchButton.addActionListener(new ActionListener() {
         //sua ham nay.
         public void actionPerformed(ActionEvent e) {
       	  if (EnToViButton.isSelected()) {
       		  String tucantra = wordEng.getText();      		  
                 String tutrave = null;
				try {
					tutrave = GG_API_Translator.translate("en", "vi", tucantra);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}            
                 wordVie.setText(tutrave);
       	  }  
       	  if (ViToEnButton.isSelected()) {
       		String tucantra = wordEng.getText();      		  
            String tutrave = null;
			try {
				tutrave = GG_API_Translator.translate("vi", "en", tucantra);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}            
            wordVie.setText(tutrave);
       	  }              
           }
         });
         searchButton.setFont(new Font("Arial", Font.BOLD, 20));
         contentPane.add(searchButton);
        
        // click here to delete
        JButton backButton = new JButton("");
        backButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\kisspng-button-removebg-preview.png"));
        backButton.setBackground(new Color(0, 153, 255));
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics();
                st.setVisible(true);
                dispose();
            }
        });
        backButton.setForeground(Color.BLACK);
        backButton.setFont(new Font("Arial", Font.BOLD, 26));
        backButton.setBounds(0, 0, 53, 50);
        contentPane.add(backButton);
        
        JLabel searchLabel = new JLabel("Search");
        searchLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
        searchLabel.setBounds(110, 211, 91, 50);
        contentPane.add(searchLabel);
        
        JLabel resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 25));
        resultLabel.setBounds(537, 211, 75, 50);
        contentPane.add(resultLabel);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\logo_Google_dich-removebg-preview.png"));
        lblNewLabel.setBounds(251, 0, 547, 190);
        
        contentPane.add(lblNewLabel);
        scrollPane.setBounds(454, 271, 293, 261);
        
        contentPane.add(scrollPane);
        scrollPane.setViewportView(wordVie);
        wordVie.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        wordVie.setLineWrap(true);
        scrollPane_1.setBounds(20, 271, 293, 261);
        
        contentPane.add(scrollPane_1);
        scrollPane_1.setViewportView(wordEng);
        wordEng.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        wordEng.setLineWrap(true);
        
        
        
    }
}