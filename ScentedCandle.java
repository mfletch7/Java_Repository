
public class ScentedCandle extends Candle{
	private String scent;
	
	public String getScent()
	{
		return scent;
	}
	
	public void setScent(String s)
	{
		scent = s;
	}
	
	public void setHeight(int h)
	{
		super.setHeight(h, 3);
	}
}
