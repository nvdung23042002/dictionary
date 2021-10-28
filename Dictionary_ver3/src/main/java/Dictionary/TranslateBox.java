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
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import java.net.URL;
import java.awt.Window.Type;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class TranslateBox extends JFrame {

    private JPanel contentPane;
    private JTextField wordNeedSearch;
    JTextArea showResult = new JTextArea();
    
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
        setBounds(100, 100, 781, 590);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(51, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        wordNeedSearch = new JTextField();
        wordNeedSearch.setBounds(10, 24, 332, 50);
        wordNeedSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        wordNeedSearch.setFont(new Font("Arial", Font.PLAIN, 26));
        contentPane.add(wordNeedSearch);
        wordNeedSearch.setColumns(10);
        
        
        showResult.setBackground(new Color(204, 204, 204));
        showResult.setFont(new Font("Arial", Font.BOLD, 26));
        showResult.setBounds(381, 102, 376, 442);
        contentPane.add(showResult);
        
        JButton searchButton = new JButton("");
        searchButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\IconSearch.png"));
        searchButton.setBounds(363, 24, 47, 50);
        searchButton.addMouseListener(new MouseAdapter() {
        });
        searchButton.addActionListener(new ActionListener() {
            //sua ham nay.
            public void actionPerformed(ActionEvent e) {
                String tucantra = wordNeedSearch.getText();
                showResult.setText("Nghia cua tu la");
            }
        });
        searchButton.setFont(new Font("Arial", Font.BOLD, 20));
        contentPane.add(searchButton);
        
        JButton btnNewButton = new JButton("Back");
        btnNewButton.setBackground(new Color(51, 255, 0));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Graphics st = new Graphics();
                st.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setFont(new Font("Arial", Font.BOLD, 26));
        btnNewButton.setBounds(653, 1, 104, 50);
        contentPane.add(btnNewButton);
        
        JList listSuggestions = new JList();
        listSuggestions.setBackground(new Color(0, 255, 255));
        listSuggestions.setForeground(Color.BLACK);
        listSuggestions.setFont(new Font("Arial", Font.BOLD, 30));
        listSuggestions.setModel(new AbstractListModel() {
            String[] values = new String[] {"hai phong", "nghe an", "ha noi", "quang ninh", "vinh phuc"};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });
        listSuggestions.setBounds(10, 99, 357, 444);
        contentPane.add(listSuggestions);
        
        JButton pronunciationWord = new JButton("");
        pronunciationWord.setBackground(new Color(255, 255, 0));
        pronunciationWord.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\volume.png"));
        pronunciationWord.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        pronunciationWord.setFont(new Font("Arial", Font.BOLD, 26));
        pronunciationWord.setBounds(421, 23, 85, 50);
        contentPane.add(pronunciationWord);
        
    }
}