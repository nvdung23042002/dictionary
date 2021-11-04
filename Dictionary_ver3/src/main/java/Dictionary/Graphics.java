package Dictionary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.awt.Window.Type;
import java.awt.SystemColor;

public class Graphics extends JFrame {
	
	JRadioButton removeRadioButton = new JRadioButton("  Remove Word");
	JRadioButton translateRadioButton = new JRadioButton("  Translate Word");
	ButtonGroup bg = new ButtonGroup();
	JRadioButton addRadioButton = new JRadioButton("  Add Word");
	
    private JPanel contentPane;
    private final JRadioButton API_button = new JRadioButton(" Traslate Using API");
    private final JLabel hinhnen = new JLabel("");
    
    /**
     * Launch the application.
     */
    
    /*public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Graphics frame = new Graphics();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }*/

    /**
     * Create the frame.
     */
    public Graphics() {
        setType(Type.POPUP);
        setTitle("Java OOP BTL s\u1ED1 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 841, 583);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(51, 153, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        
        
        translateRadioButton.setBackground(new Color(51, 255, 0));
        bg.add(translateRadioButton);
        translateRadioButton.setFont(new Font(".VnMystical", Font.BOLD, 30));
        translateRadioButton.setBounds(0, 195, 225, 60);
        contentPane.add(translateRadioButton);
        
        
        addRadioButton.setBackground(new Color(51, 255, 0));
        bg.add(addRadioButton);
        addRadioButton.setFont(new Font(".VnMystical", Font.BOLD, 30));
        addRadioButton.setBounds(0, 324, 225, 60);
        contentPane.add(addRadioButton);
        
        
        removeRadioButton.setBackground(new Color(0, 255, 51));
        bg.add(removeRadioButton);
        removeRadioButton.setFont(new Font(".VnMystical", Font.BOLD, 32));
        removeRadioButton.setBounds(573, 199, 248, 60);
        contentPane.add(removeRadioButton);
        
        API_button.setBackground(new Color(124, 252, 0));
        bg.add(API_button);
        API_button.setFont(new Font(".VnMystical", Font.BOLD, 30));
        API_button.setBounds(573, 324, 248, 60);
        contentPane.add(API_button);
        
        JButton submitButton = new JButton("");
        submitButton.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\submit-button-picture-removebg-preview (1).png"));
        submitButton.setBackground(new Color(0, 153, 255));
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (translateRadioButton.isSelected()) {
                    try {
                        TranslateBox trans = new TranslateBox();
                        trans.setVisible(true);
                        dispose();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                if (API_button.isSelected()) {
                    try {
                        API_Box trans = new API_Box();
                        trans.setVisible(true);
                        dispose();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                if (addRadioButton.isSelected()) {
                        AddBox ab = new AddBox();
                        ab.setVisible(true); 
                        dispose();
                }
                if (removeRadioButton.isSelected()) {
                    RemoveBox rv = new RemoveBox();
                    rv.setVisible(true);
                    dispose();
                }
            }
        });
        submitButton.setFont(new Font("Arial", Font.BOLD, 30));
        submitButton.setBounds(331, 446, 126, 60);
        contentPane.add(submitButton);
        
        JLabel lblNewLabel = new JLabel("English-Vietnamese Dictionary");
        lblNewLabel.setFont(new Font(".VnBahamasB", Font.BOLD, 40));
        lblNewLabel.setBounds(157, 34, 536, 87);
        contentPane.add(lblNewLabel);       
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\logoGr-removebg-preview.png"));
        lblNewLabel_1.setBounds(270, 142, 297, 275);
        contentPane.add(lblNewLabel_1);
        hinhnen.setIcon(new ImageIcon("C:\\Users\\hscng\\eclipse-workspace\\Dictionary_ver3\\src\\main\\java\\Dictionary\\images\\background1.png"));
        hinhnen.setBounds(0, 0, 837, 546);
        
        contentPane.add(hinhnen);
    }
}