import java.awt.*;
import java.awt.event.*;
class LoginPage extends Frame implements ActionListener
{
	Label l4;
	TextField tf1,tf2;
	LoginPage()
	{
		setLayout(null);
		setBackground(Color.GREEN);
		setForeground(Color.black);

		// FlowLayout flow1 = new FlowLayout(FlowLayout.CENTER);

		Font f1 = new Font("Times New Romen",Font.BOLD|Font.ITALIC,22);
		Font f2 = new Font("Times New Romen",Font.BOLD|Font.ITALIC,48);
		
		Label l1 = new Label("Ak Pvt Ltd ");
		Label l2 = new Label("Username : ");
		Label l3 = new Label("Password : ");
		
		l4 = new Label();

		setFont(f1);
		l1.setFont(f2);

		tf2 = new TextField(10);
		tf1 = new TextField(20);
		tf2.setEchoChar('*');

		Button b1 = new Button("Login");

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(tf1);
		add(tf2);
		add(b1);
		l1.setBackground(Color.magenta);
		l1.setBounds(150,100,400,50);
		l2.setBounds(100, 200, 200, 40);
		l3.setBounds(100,300,200,40);
		
		tf1.setBounds(300, 200, 200, 40);
		tf2.setBounds(300, 300, 200, 40);
		b1.setBounds(180,400,200,50);
		l4.setBounds(180,480,300,40);
		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
		{
			String user = tf1.getText();
			String pass = tf2.getText();
			if(user.equals("Aditya") && pass.equals("ak14"))
			{
				l4.setText("Login Successful");
			}
			else{
				l4.setText("Login Denied ");
			}
		}
	

	public static void main(String a[])
	{
		LoginPage page = new LoginPage();
		page.setTitle("Login Page ");
		page.setSize(600,550);
		page.setVisible(true);
	}
}