package dictionary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Cursor;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.Box;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import javax.swing.SpringLayout;
import javax.swing.JToolBar;
import javax.swing.JTree;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultComboBoxModel;

public class Jtest extends JFrame {
	private final Action action = new SwingAction();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jtest frame = new Jtest();
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
	public Jtest() {
		getContentPane().setBackground(SystemColor.scrollbar);
		addMouseWheelListener(new MouseWheelListener() {
			public void mouseWheelMoved(MouseWheelEvent e) {
			}
		});
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		setMaximumSize(new Dimension(2000, 2000));
		getContentPane().setMaximumSize(new Dimension(100, 100));
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		JLabel lblNewLabel_1 = new JLabel("Vietnamese");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 390, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -234, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 10, SpringLayout.EAST, getContentPane());
		lblNewLabel_1.setBackground(new Color(0, 51, 204));
		lblNewLabel_1.setIgnoreRepaint(true);
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_1.setBounds(new Rectangle(15, 0, 0, 0));
		getContentPane().add(lblNewLabel_1);
		
		JList list = new JList();
		springLayout.putConstraint(SpringLayout.NORTH, list, 99, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, list, 327, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, list, 99, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, list, 327, SpringLayout.WEST, getContentPane());
		getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("English");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBackground(new Color(153, 204, 0));
		lblNewLabel.setOpaque(true);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		lblNewLabel.setMaximumSize(new Dimension(400, 400));
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane_1, 4, SpringLayout.SOUTH, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane_1, 63, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane_1, -10, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane_1, -403, SpringLayout.EAST, getContentPane());
		getContentPane().add(scrollPane_1);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 16, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, scrollPane_1);
		springLayout.putConstraint(SpringLayout.EAST, panel, -18, SpringLayout.WEST, scrollPane_1);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 24, 150, 44);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"dung7", "HA"}));
		comboBox.setBounds(208, 36, 100, 21);
		panel.add(comboBox);
		setAutoRequestFocus(false);
		setTitle("DICTIONARY");
		setResizable(false);
		setPreferredSize(new Dimension(100, 100));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 799, 300);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
