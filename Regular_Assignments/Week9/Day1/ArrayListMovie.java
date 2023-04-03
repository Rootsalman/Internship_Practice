// Write a Java class called Movie that has fields for the movie's title, director, and release year
import java.util.ArrayList;
import java.util.*;
class Movie implements Comparable<Movie>{
  private String Title;
  private String Director;
  private int Date;
  Movie(String Title,String Director,int Date){
    this.Title=Title;
    this.Director=Director;
    this.Date=Date;
  }
  public int compareTo(Movie mm) {
    if(Date>mm.Date){
      return 1;
    }
    else if(Date<mm.Date){
      return -1;
    }
    else{
      return 0;
    }
  }
 
public String getTitle() {
	return Title;
}

public void setTitle(String title) {
	Title = title;
}

public String getDirector() {
	return Director;
}

public void setDirector(String director) {
	Director = director;
}

public int getDate() {
	return Date;
}

public void setDate(int date) {
	Date = date;
}
}

class ArrayListMovie{
  public static void main(String args[]){
    ArrayList<Movie> Mov=new ArrayList<Movie>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      Mov.add(new Movie(sc.next(),sc.next(),sc.nextInt()));
    }
    Collections.sort(Mov);
    for(Movie mm:Mov){
      System.out.println(mm.getTitle()+" "+mm.getDirector()+" "+mm.getDate());
    }
  }
}
