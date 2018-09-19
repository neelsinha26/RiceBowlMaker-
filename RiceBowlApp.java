package riceBowlHPEAssign;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class RiceBowlApp {

	public static void main(String[] args) {

		// Take input for number of Rice Bowls
		Scanner inp = new Scanner(System.in);
		int numOfRiceBowls=0;
		
		try {
			System.out.println("Enter the number of Rice Bowls you want ? ");
			 numOfRiceBowls = inp.nextInt();

		} catch (Exception e) {
			System.out.println("You chose the wrong input. Please try again ");
			System.exit(0);
		}


		List<RiceBowl> riceBowlList = new ArrayList<>();

		for (int i = 0; i < numOfRiceBowls; i++) {
			
			// Input for the type of rice

			System.out.println("Selections for Rice bowl #" + (i + 1));
			Rice rice;

			System.out.println("What type of rice do you want ?");
			System.out.println("1.White Rice");
			System.out.println("2.Brown Rice");

			while (true) {
				try {
					int choiceNum = inp.nextInt();
					if (choiceNum == 1) {
						rice = Rice.WHITE_RICE;
						break;
					} else if (choiceNum == 2) {
						rice = Rice.BROWN_RICE;
						break;
					} else {
						System.out.println("You chose the wrong input. Please try again");
					}
				} catch (InputMismatchException ime) {
					System.out.println("You chose the wrong input. Please try again ");
					inp.nextLine();
				}
			}

			// input for the type of meat
			
			System.out.println("Add a choice of meat 1. Chichen 2. Beef");
			Meat meat;
			while (true) {
				try {
					int choiceNum = inp.nextInt();
					if (choiceNum == 1) {
						meat = Meat.CHICKEN;
						break;
					} else if (choiceNum == 2) {
						meat = Meat.BEEF;
						break;
					} else {
						System.out.println("You chose the wrong input ! Please try again ");
					}
				} catch (InputMismatchException ime) {
					System.out.println("You chose the wrong input. Please try again ");
					inp.nextLine();
				}
			}

			// input for the type of sauce
			
			System.out.println("Add a choice of sauce 1. Spicy 2. Sweet");
			Sauce sauceType;
			while (true) {
				try {
					int choiceNum = inp.nextInt();
					if (choiceNum == 1) {
						sauceType = Sauce.SPICY;
						break;
					} else if (choiceNum == 2) {
						sauceType = Sauce.SWEET;
						break;
					} else {
						System.out.println("You chose the wrong input ! Please try again ");
					}
				} catch (InputMismatchException ime) {
					System.out.println("You chose the wrong input. Please try again ");
					inp.nextLine();
				}
			}
			
			// input for the adding the sour cream
			
			System.out.println("Add sour cream 1. Yes 2.No ");
			Boolean sourCream = false;
			while (true) {
				try {
					int choiceNum = inp.nextInt();
					if (choiceNum == 1) {
						sourCream = true;
						break;
					} else if (choiceNum == 2) {
						sourCream = false;
						break;
					} else {
						System.out.println("You chose the wrong input. Please try again ");
					}
				} catch (InputMismatchException ime) {
					System.out.println("You chose the wrong input. Please try again ");
					inp.nextLine();
				}
			}
			
			// input for adding guacamole
			
			System.out.println("Add guacomole 1.Yes 2.No ");

			Boolean guacamole = false;
			while (true) {

				try {
					int choiceNum = inp.nextInt();
					if (choiceNum == 1) {
						guacamole = true;
						break;
					} else if (choiceNum == 2) {
						guacamole = false;
						break;
					} else {
						System.out.println("You chose the wrong input. Please try again ");
					}
				} catch (InputMismatchException ime) {
					System.out.println("You chose the wrong input. Please try again ");
					inp.nextLine();
				}
			}
			
			
			// Building rice bowl object 
			
			RiceBowl riceBowl = new RiceBowl.Builder(rice, meat, sauceType).withSourCream(sourCream)
					.withGuacaMole(guacamole).build();

			riceBowlList.add(riceBowl);

		}

		showAll(riceBowlList);

	}
	
	// shows the properties of elements of the riceBowlList

	public static void showAll(List<RiceBowl> riceBowlList) {
		int count = 1;
		for (RiceBowl riceBowl : riceBowlList) {
			System.out.println("Details for Rice bowl #" + count);
			System.out.println("Rice : " + riceBowl.getRice());
			System.out.println("Meat : " + riceBowl.getMeat());
			System.out.println("Sauce : " + riceBowl.getSauceType());
			System.out.println("Guacamole : " + riceBowl.getGuaceMole());
			System.out.println("Sour cream : " + riceBowl.getSourCream());
			System.out.println("");
			count++;
		}
		;
	}
}
