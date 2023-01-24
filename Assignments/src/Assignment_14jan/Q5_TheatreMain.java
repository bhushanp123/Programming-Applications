package Assignment_14jan;

import java.util.Scanner;

class Theatre
{
	private int theatreId;
	private String theatreName;
	private String location;
	Movie m;
	
	
	
	public int getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setM(Movie m) {
		this.m = m;
	}
	public Movie getM()
	{
		return m;
	}

	
	@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", location=" + location + ", m="
				+ m + "]";
	}
	
	
	
}

class Movie
{
	private int movieId;
	private String MovieName;
	private float rating;
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		this.MovieName = movieName;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getRating()
	{
		return rating;
	}

	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", MovieName=" + MovieName + ", rating=" + rating + "]";
	}

}

public class Q5_TheatreMain {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the theatre id");
		int t_id = sc.nextInt();
		
		System.out.println("Enter the theatre name");
		String t_name = sc.next();
		
		System.out.println("Enter the theatre location");
		String t_location = sc.next();
		
		Movie m = null;
		
		Theatre t[] = new Theatre[3];
		
		
		for(int i = 0; i < t.length; i++)
		{
			System.out.println("Enter the movie id");
			int m_id = sc.nextInt();
			
			System.out.println("Enter the movie rating");
			float m_rating = sc.nextFloat();
			
			System.out.println("Enter the movie name");
			String m_name = sc.next();
			
			m = new Movie();
			m.setMovieId(m_id);
			m.setMovieName(m_name);
			m.setRating(m_rating);
			
			t[i] = new Theatre();
			t[i].setTheatreId(t_id);
			t[i].setTheatreName(t_name);
			t[i].setLocation(t_location);
			t[i].setM(m);
		}
		
		for(int k = 0; k < t.length; k++)
		{
			for(int l = 0; l < t.length; l++)
			{
				if(t[k].getM().getRating() > t[l].getM().getRating())
				{
					float temp = t[k].getM().getRating();
					float temp1 = t[l].getM().getRating();
					t[l].getM().setRating(temp);
					t[k].getM().setRating(temp1);
					
					int tempid1 = t[k].getM().getMovieId();
					int tempid2 = t[l].getM().getMovieId();
					t[l].getM().setMovieId(tempid1);
					t[k].getM().setMovieId(tempid2);
					
					String tempName1 = t[k].getM().getMovieName();
					String tempName2 = t[l].getM().getMovieName();
					t[l].getM().setMovieName(tempName1);
					t[l].getM().setMovieName(tempName2);
				}
			}
			
		}
		
		for(int j = 0; j < t.length; j++)
		{
			System.out.println(t[j]);
		}
	}

}
