import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		NetflixOriginal num1Show = new NetflixOriginal();
		System.out.println(num1Show);

		NetflixOriginal num2Show =new NetflixOriginal("Stranger Things", 4.5, "science fiction");
		System.out.println(num2Show);

		Scanner keyboard = new Scanner(System.in);

		NetflixOriginal[] userShows = new NetflixOriginal[2];

		for(int i=0; i < userShows.length; i++)
		{
			userShows[i] = Main.instantiateFromInput(keyboard);
			System.out.println(userShows[i]);
		}

		keyboard.close();

		

	}


	public static NetflixOriginal instantiateFromInput(Scanner keyboard)
	{

		String name, genre;
		double starRating;

		boolean isValid;

		NetflixOriginal result = new NetflixOriginal();


		//user prompted to enter name
		System.out.print("Please enter the name of the show: ");
		name = keyboard.nextLine();
		result.setName(name);
		

		//user prompted to enter rating
		do{
			System.out.print("Please enter the star rating: ");
			starRating = Double.parseDouble(keyboard.nextLine());

			isValid = result.setStarRating(starRating);

			if(!isValid)
			{
				//System.out.println("ERROR: Rating Must Be Between 0.0 to 5.0, Please enter Valid Rating! \n");
			}

		}while(!isValid);
		

		//user prompted to enter genre
		do{
			System.out.print("Please enter the genre: ");
			genre = keyboard.nextLine();

			isValid = result.setGenre(genre);

			if(!isValid)
			{
				//System.out.println("ERROR: Genre Must Be One Of The Allowed Genres:\n" +
				//"drama, comedy, horror, action, science fiction, anime, reality, unknown.\n" +
				//"Please enter Valid Genre! \n");
			}

		}while(!isValid);
		


		return result;

	}

}