import java.lang.*;

public class Start extends Thread
{
	public static void main(String []args)
	{

		Click c=new Click();
		c.setVisible(true);
		c.runs();
    }
}