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

public class Graphics extends JFrame {
	
	JRadioButton removeRadioButton = new JRadioButton("Remove Word");
	JRadioButton translateRadioButton = new JRadioButton("Translate Word");
	ButtonGroup bg = new ButtonGroup();
	JRadioButton addRadioButton = new JRadioButton("Add Word");
	
    private JPanel contentPane;
    
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
        contentPane.setBackground(new Color(0, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        
        
        translateRadioButton.setBackground(new Color(51, 255, 0));
        bg.add(translateRadioButton);
        translateRadioButton.setFont(new Font("Arial", Font.BOLD, 30));
        translateRadioButton.setBounds(0, 152, 296, 78);
        contentPane.add(translateRadioButton);
        
        
        addRadioButton.setBackground(new Color(51, 255, 0));
        bg.add(addRadioButton);
        addRadioButton.setFont(new Font("Arial", Font.BOLD, 30));
        addRadioButton.setBounds(0, 260, 296, 78);
        contentPane.add(addRadioButton);
        
        
        removeRadioButton.setBackground(new Color(0, 255, 51));
        bg.add(removeRadioButton);
        removeRadioButton.setFont(new Font("Arial", Font.BOLD, 30));
        removeRadioButton.setBounds(0, 382, 305, 78);
        contentPane.add(removeRadioButton);
        
        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(new Color(102, 255, 0));
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
        submitButton.setBounds(526, 269, 188, 78);
        contentPane.add(submitButton);
        
        JLabel lblNewLabel = new JLabel("English-Vietnamese Dictionary");
        lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
        lblNewLabel.setBounds(149, 10, 546, 86);
        contentPane.add(lblNewLabel);
        
    }
}