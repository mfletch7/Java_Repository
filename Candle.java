
public class Candle {
	private String color;
	private int height;
	private double price;
	
	public String getColor()
	{
		return color;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public void setHeight(int h)
	{
		height = h;
		price = (double)(h) * 2;
	}
	
	public void setHeight(int h, int p)
	{
		height = h;
		price = (double)(h) * p;
	}
}
