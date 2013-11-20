
public class CD {

	final private String performer;
	final private String title;
	final private int year;
	final private int playTime;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public CD(String performer, String title, int year, int playTime){
		this.performer = performer;
		this.title = title;
		this.year = year;
		this.playTime = playTime;
	}
	
	public String getPerformer(){
		
		
		return performer;
	}
	
	public String getTitle(){
		
		return title;
	}
	
	public int getYear(){
		
		return year;
	}
	
	public int getPlayTime(){
		
		return playTime;
	}
	
	public String toString(){
		String string = "";
		
		string += performer + "," + title + "," + year + "," + playTime;
		
		return string;
	}

}
