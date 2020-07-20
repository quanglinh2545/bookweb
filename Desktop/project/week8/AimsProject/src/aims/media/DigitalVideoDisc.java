public class DigitalVideoDisc extends Media implements Comparable{
  
  private String director;
  private int length;
  public DigitalVideoDisc() {
	super();
}
public DigitalVideoDisc(String title) {
		super(title);
		
}
public DigitalVideoDisc(String title, String category) {
	
	super(title,category);
}
public DigitalVideoDisc(String title, String category, String director) {
	super(title,category);
	this.director = director;
}
public DigitalVideoDisc(String title, String category,  float cost,String director, int length) {
   
	this.length = length;
	
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int compareTo(DigitalVideoDisc disc) {
    if (this.getDirector() > disc.getDirector()) return 1;
    else if (this.getDirector() < disc.getDirector()) return -1;
    return 0;
  }
}
