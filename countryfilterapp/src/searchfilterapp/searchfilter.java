package searchfilterapp;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;

public class searchfilter {

	private JFrame frmCountryFilterApp;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	protected Object document;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchfilter  window = new searchfilter ();
					window.frmCountryFilterApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public searchfilter () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("unchecked")
	private void initialize() {
		frmCountryFilterApp = new JFrame();
		frmCountryFilterApp.setTitle("Country Filter App");
		frmCountryFilterApp.setBounds(100, 100, 989, 740);
		frmCountryFilterApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCountryFilterApp.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 116, 975, 227);
		frmCountryFilterApp.getContentPane().add(scrollPane);
		
		final JList  list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 21));
		list.setModel(new AbstractListModel() {
			
			
			
			String[] values = new String[] {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo, Democratic Republic of the", "Congo, Republic of the", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor (Timor-Leste)", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar (Burma)", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Macedonia (formerly Macedonia)", "Norway", "Oman", "Pakistan", "Palau", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Sudan, South", "Suriname", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
		
			
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setColumnHeaderView(list);
		
		JLabel lblNewLabel = new JLabel("Top Countries:");
		lblNewLabel.setBounds(0, 21, 309, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frmCountryFilterApp.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Filtered Countries:");
		lblNewLabel_1.setBounds(10, 436, 466, 53);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frmCountryFilterApp.getContentPane().add(lblNewLabel_1);
		
		final	JList list_9 = new JList();
		list_9.setBounds(0, 0, 955, 170);
		
		
		
		textField = new JTextField();
		textField.setBounds(0, 385, 975, 20);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
			     if(e.getKeyCode() == KeyEvent.VK_ENTER){
			    	 {
			    		  DefaultListModel listModel1 = new DefaultListModel();

							ListModel listobj = list.getModel();
								for(int i = 0; i < listobj.getSize(); i++){
								  String    obj = (String) listobj.getElementAt(i);
								  if (obj.contains(textField.getText())){
									  	
									  
									  list_9.setModel(listModel1);
									 
									  listModel1.addElement(obj);

									 
}
								  }
								  
								     
							
								     
								     
								}
			  
			}
			     }});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 21));
		frmCountryFilterApp.getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(89, 556, 439, -35);
		frmCountryFilterApp.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(207, 572, 87, -5);
		frmCountryFilterApp.getContentPane().add(table_1);
		
		JList list_1 = new JList();
		list_1.setBounds(602, 657, -361, -132);
		frmCountryFilterApp.getContentPane().add(list_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 506, 955, 170);
		frmCountryFilterApp.getContentPane().add(panel);
		panel.setLayout(null);
		
	
		
		panel.add(list_9);
	
		
	}
}