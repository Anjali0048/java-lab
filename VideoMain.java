import java.util.Scanner;

public class VideoMain 
{
	public static void main(String args[])
	{
		int n, loop=1;
		Scanner in = new Scanner(System.in);
		VideoMethods mm = new VideoMethods();
		while(loop==1)
		{
				System.out.println("%%%%%%%% VIDEO LIBRARY CENTER %%%%%%%%");
				System.out.println("1.ADD MOVIES");
				System.out.println("2.DISPLAY MOVIES");
				System.out.println("3.RENT OUT");
				System.out.println("4.COLLECT BACK ");
				System.out.println("5.Exit ");
	
				System.out.println("PLEASE ENTER YOUR OPTION");
				n = in.nextInt();
				switch(n)
				{
					case 1:
						mm.AddMovies();
						break;
					case 2:
						mm.DisplayAll();
						break;
					case 3:
						System.out.print("Enter the movie you want to rent.");
						in.nextLine();
						if(mm.RentOut(in.nextLine()))
						{
							System.out.println("Rent out successfull");
						}
						else
						{
							System.out.println("Sorry!! Not Available");
						}
						break;
					case 4:
						System.out.println("Enter the name and the ratings of the movie"); 
						in.nextLine();
						mm.CollectIn(in.nextLine(),in.nextDouble());  
						break;
					case 5:
						loop=0;
						break;
					default:
						System.out.println("Wrong Option");
				}
		}
		in.close();
	}
}


