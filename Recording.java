
public class Recording {
	private String artist;
	private String title;
	private int playingTime;
	
	Recording(String art, String ttl, int numSec)
	{
		artist = art;
		title = ttl;
		playingTime = numSec;
	}
	
	public void display()
	{
		System.out.println(artist + " # " + title + " # " + playingTime);
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getPlayingTime()
	{
		return playingTime;
	}
}
