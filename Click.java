import java.lang.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;


public class Click extends JFrame implements MouseListener,ActionListener
{
	JLabel title1,title2;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,exit,tryagain;
	JPanel panel1,panel2;
	Color c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;
	int x,count;
	
	public Click()
	{
		super("Click Counter");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,600);
		
		c1=Color.RED;  c2=Color.RED;  c3=Color.RED;  c4=Color.RED;  c5=Color.RED;
		c6=Color.RED;  c7=Color.RED;  c8=Color.RED;  c9=Color.RED;  c10=Color.RED;
		c11=Color.BLACK;
		
		panel1=new JPanel();
		panel1.setLayout(null);
		
		title1 = new JLabel("SCORE : ");
		title1.setBounds(300,30,140,60);
		panel1.add(title1);
		addMouseListener(this);
		
				
		b1=new JButton("Button 1");
		b1.setBounds(140,150,100,40);
		b1.setBackground(Color.RED);
		b1.setEnabled(true);
		b1.addMouseListener(this);
		panel1.add(b1);
		
		b2=new JButton("Button 2");
		b2.setBounds(425,150,100,40);
		b2.setBackground(Color.RED);
		b2.setEnabled(true);
		b2.addMouseListener(this);
		panel1.add(b2);
		
		b3=new JButton("Button 3");
		b3.setBounds(140,220,100,40);
		b3.setBackground(Color.RED);
		b3.setEnabled(true);
		b3.addMouseListener(this);
		panel1.add(b3);
		
		
		b4=new JButton("Button 4");
		b4.setBounds(425,220,100,40);
		b4.setBackground(Color.RED);
		b4.setEnabled(true);
		b4.addMouseListener(this);
		panel1.add(b4);
		
		b5=new JButton("Button 5");
		b5.setBounds(140,290,100,40);
		b5.setBackground(Color.RED);
		b5.setEnabled(true);
		b5.addMouseListener(this);
		panel1.add(b5);
		
		
		b6=new JButton("Button 6");
		b6.setBounds(425,290,100,40);
		b6.setBackground(Color.RED);
		b6.setEnabled(true);
		b6.addMouseListener(this);
		panel1.add(b6);
		
		
		b7=new JButton("Button 7");
		b7.setBounds(140,360,100,40);
		b7.setBackground(Color.RED);
		b7.setEnabled(true);
		b7.addMouseListener(this);
		panel1.add(b7);
		
		
		b8=new JButton("Button 8");
		b8.setBounds(425,360,100,40);
		b8.setBackground(Color.RED);
		b8.setEnabled(true);
		b8.addMouseListener(this);
		panel1.add(b8);
		
		
		b9=new JButton("Button 9");
		b9.setBounds(140,430,100,40);
		b9.setBackground(Color.RED);
		b9.setEnabled(true);
		b9.addMouseListener(this);
		panel1.add(b9);
		
		
		b10=new JButton("Button 10");
		b10.setBounds(425,430,100,40);
		b10.setBackground(Color.RED);
		b10.setEnabled(true);
		b10.addMouseListener(this);
		panel1.add(b10);
		
		
		tryagain=new JButton("Play Again");
		tryagain.setBounds(425,490,150,50);
		tryagain.addActionListener(this);
		tryagain.setEnabled(false);
		panel1.add(tryagain);
		
		
		exit=new JButton("Exit");
		exit.setBounds(140,490,150,50);
		exit.addActionListener(this);
		panel1.add(exit);
		
		
		this.add(panel1);
		
	
	}
	
	public void mouseClicked(MouseEvent me)
	{
		if(c1==Color.GREEN && me.getSource()==b1)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c2==Color.GREEN && me.getSource()==b2)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c3==Color.GREEN && me.getSource()==b3)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c4==Color.GREEN && me.getSource()==b4)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c5==Color.GREEN && me.getSource()==b5)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c6==Color.GREEN && me.getSource()==b6)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c7==Color.GREEN && me.getSource()==b7)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c8==Color.GREEN && me.getSource()==b8)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c9==Color.GREEN && me.getSource()==b9)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if(c10==Color.GREEN && me.getSource()==b10)
		{
				count=count+10;
				title1.setText("SCORE :"+count);
		}
		else if (c11 != Color.GRAY && (me.getSource()==b1||me.getSource()==b2||me.getSource()==b3||me.getSource()==b4||me.getSource()==b5||me.getSource()==b6||me.getSource()==b7||me.getSource()==b8||me.getSource()==b9||me.getSource()==b10))
		{
				count=count-5;
				title1.setText("SCORE :"+count);
		}

	}
	public void mouseExited(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	
	public void reset()
	{
		b1.setBackground(Color.RED);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.RED);
		b4.setBackground(Color.RED);
		b5.setBackground(Color.RED);
		b6.setBackground(Color.RED);
		b7.setBackground(Color.RED);
		b8.setBackground(Color.RED);
		b9.setBackground(Color.RED);
		b10.setBackground(Color.RED);

       c1=Color.RED;  c2=Color.RED;  c3=Color.RED;  c4=Color.RED;  c5=Color.RED;
		c6=Color.RED;  c7=Color.RED;  c8=Color.RED;  c9=Color.RED;  c10=Color.RED;		
	}
	
	public void disable()
	{
		b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false);
		b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);
		b9.setEnabled(false); b10.setEnabled(false); tryagain.setEnabled(true);
		
		c11=Color.GRAY;
	}
	
	
	public void runs()
	{	
		final Thread t=new Thread(new Runnable()  { public void run()
				{
							b1.setEnabled(true); b2.setEnabled(true); b3.setEnabled(true); b4.setEnabled(true);
							b5.setEnabled(true); b6.setEnabled(true); b7.setEnabled(true); b8.setEnabled(true);
							b9.setEnabled(true); b10.setEnabled(true); count=0; c11=Color.BLACK; tryagain.setEnabled(false);
					
					for(int i=1;i<11;i++)
						{
							int x;
							try
							{
							Thread.sleep(2000);
							}
							catch(Exception e){}
							Random r= new Random () ;
							x=r.nextInt(10);
							reset();
							if(x==1){b1.setBackground(Color.GREEN);c1=Color.GREEN;}
							else if(x==2){b2.setBackground(Color.GREEN);c2=Color.GREEN;}
							else if(x==3){b3.setBackground(Color.GREEN);c3=Color.GREEN;}
							else if(x==4){b4.setBackground(Color.GREEN);c4=Color.GREEN;}
							else if(x==5){b5.setBackground(Color.GREEN);c5=Color.GREEN;}
							else if(x==6){b6.setBackground(Color.GREEN);c6=Color.GREEN;}
							else if(x==7){b7.setBackground(Color.GREEN);c7=Color.GREEN;}
							else if(x==8){b8.setBackground(Color.GREEN);c8=Color.GREEN;}
							else if(x==9){b9.setBackground(Color.GREEN);c9=Color.GREEN;}
							else if(x==10){b10.setBackground(Color.GREEN);c10=Color.GREEN;}
						}
						reset();
						disable();
				}
				});
				t.start();
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String text=ae.getActionCommand();
		if(text.equals(exit.getText()))
		{System.exit(0);}
	
		else if(text.equals(tryagain.getText()))
		{	
			title1.setText("SCORE :");
			this.runs();
		}
		
	}
		
}