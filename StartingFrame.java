import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StartingFrame extends JWindow implements ActionListener
{
	JButton start,quit;
	JLabel dev;
	Toolkit tk;
	Image tictak,quack;
	Font f,f4;
	StartingFrame()
	{
		f = new Font("Serif", Font.BOLD, 20);
		f4=new Font("Serif", Font.ITALIC, 14);

		tk =  tk.getDefaultToolkit();
		tictak = tk.getImage("images\\tictac2.jpg");
		quack = tk.getImage("images\\quack.png");

		start = new JButton("Start");
		add(start);
		start.setBounds(80,330,80,29);
		start.setBackground(Color.white);
		start.setForeground(Color.blue);
		start.setFont(f);
		
		quit = new JButton("Quit");
		add(quit);
		quit.setBounds(550,330,80,29);
		quit.setBackground(Color.white);
		quit.setForeground(Color.red);
		quit.setFont(f);

		dev=new JLabel("Developed by Lokesh Chandra");
		dev.setBounds(485,420,180,40);
		dev.setFont(f4);
		add(dev);
		
		start.addActionListener(this);
		quit.addActionListener(this);

		Container c=this.getContentPane();
		c.setBackground(Color.white);
		setSize(700,500);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==quit)
		{
			dispose();
		}
		if(e.getSource()==start)
		{
			TickTakToe t = new TickTakToe();
			dispose();
		}
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.drawImage(tictak,5,28,this);
		g2.drawImage(quack,200,235,this);
	}
	public static void main(String[] args) 
	{
		new StartingFrame();
	}
}
