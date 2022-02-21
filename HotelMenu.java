import java.util.Scanner;
public class HotelMenu{
		public static void main(String args[]){

		HotelMenu obj= new HotelMenu();
		int choice,sindia,sidli,sdhosa,gindia,puri,roti;
	while(true){
		Scanner objScanner=new Scanner(System.in);
		System.out.println("1------south indian");
		System.out.println("2------gujrati");
		System.out.println("3------panjabi");
		System.out.println("4------rajsthani");
		System.out.println("5------mexican");
		System.out.println("6------italian");
		System.out.println("7------tanduri");
		System.out.println("8------chikan");
		System.out.println("9------panir masala");
		System.out.println("10------panir tikka");

		System.out.println("11------exit");
		System.out.println("enter your choice");
		choice=objScanner.nextInt();
		switch(choice){
			case 1:System.out.println("This is south india: ");

				System.out.println("1------idli");
				System.out.println("2------dhosa");
				System.out.println("enter your choice");
				sindia=objScanner.nextInt();
				switch(sindia)
				{
				case 1:
					System.out.println("1------soji idli");
					System.out.println("2------rice idli");
					System.out.println("3------dahi idli");
					System.out.println("enter your choice");
					sidli=objScanner.nextInt();
					switch(sidli)
					{
					case 1:
						System.out.println("you have select soji idli");
						break;
					case 2:
						System.out.println("you have select rice idli");
						break;
					case 3:
						System.out.println("you have select dahi idli");
						break;
					}
				break;	

				case 2:
					System.out.println("1------plane dhosa");
					System.out.println("2------plane onion dhosa");
					System.out.println("3------masala dhosa");
					System.out.println("enter your choice");
					sdhosa=objScanner.nextInt();
					switch(sdhosa)
					{
					case 1:
						System.out.println("you have select plane dhosa");
						break;
					case 2:
					      System.out.println("you have select plane onion dhosa");
						break;
					case 3:
						System.out.println("you have select masala dhosa");
						break;
					}
				}	
				break;

			case 2:System.out.println("This is gujrati");
				System.out.println("sakh puri");
				System.out.println("sakh roti ");
				System.out.println("enter your choice");
				gindia=objScanner.nextInt();
				switch(gindia)
				{
				case 1:
					System.out.println("1------puri bateka");
					System.out.println("2------puri kobij");
					System.out.println("3------puri ringna");
					System.out.println("enter your choice");
					puri=objScanner.nextInt();
					switch(puri)
					{
					case 1:
						System.out.println("you have select puri bateka");
						break;
					case 2:
						System.out.println("you have select puri kobij");
						break;
					case 3:
						System.out.println("you have select puri ringna");
						break;
					}
				break;	

				case 2:
					System.out.println("1------roti bateka");
					System.out.println("2------roti kobij");
					System.out.println("3------roti valor");
					System.out.println("enter your choice");
					roti=objScanner.nextInt();
					switch(roti)
					{
					case 1:
						System.out.println("you have select roti bateka");
						break;
					case 2:
					      System.out.println("you have select roti kobij");
						break;
					case 3:
						System.out.println("you have select roti valor");
						break;
					}
				}
				break;
			case 3:System.out.println("This is panjabi");
				break;
			case 4:System.out.println("This is rajsthani");
				break;
			case 5:System.out.println("This is mexican");
				break;
			case 6:System.out.println("This is italian");
				break;
			case 7:System.out.println("This is tanduri ");
				break;
			case 8:System.out.println("This is chikan ");
				break;
			case 9:System.out.println("This is panir masala ");
				break;
			case 10:System.out.println("This is panir tikka ");
				break;

			case 11:System.exit(0);
			}//end of switch

}//end of while
}
}//end of main

