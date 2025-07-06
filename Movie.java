package assignments;

import java.util.ArrayList;
import java.util.List;


public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Movie=new ArrayList<String>();
		Movie.add("Avatar");
		Movie.add("Avengers");
		Movie.add("Titanic");
		Movie.add("Jurassic world");
		Movie.add("Kingkong");
		System.out.println("Third movie name is:" +Movie.get(2));
	}

}
