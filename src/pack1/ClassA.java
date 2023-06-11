package pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassA {
	static Scanner sc = new Scanner(System.in);
	static double cost;
	static int quantity;
	static int amount;
	static ArrayList<String> item = new ArrayList<String>();
	static ArrayList<Double> cst = new ArrayList<Double>();
	static ArrayList<Integer> qnt = new ArrayList<Integer>();

	void meth1() {
		System.out.println("------------------------------------------------");
		System.out.println("------------ Welcome to My Stores --------------");
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("|            1) FRUITS                        |");
		System.out.println("|            2) VEGETABLES                    | ");
		System.out.println("|            3) BEVERAGES                     | ");
		System.out.println("|            4) CHOCLATES                     | ");
		System.out.println("|            5) BISCUITS                      | ");
		System.out.println("|            6) EXIT                          | ");
		System.out.println("-----------------------------------------------");
		System.out.println();
		System.out.println("please choose one option :");
		System.out.println("--------------------------");
		int a = sc.nextInt();
		switch (a) {
		case 1: {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("|            111) MANGO   ------------- 1KG -------- RS.120          |");
			System.out.println("|            112) MOSAMBI ------------- 1KG -------- RS.60           |");
			System.out.println("|            113) AVOCADO ------------- 1KG -------- RS.250          |");
			System.out.println("|            114) SAPOTA  ------------- 1KG -------- RS.70           |");
			System.out.println("|            115) GRAPES  ------------- 1KG -------- RS.90           | ");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("please choose your product code : ");
			System.out.println("--------------------------------");
			int b = sc.nextInt();

			switch (b) {
			case 111:
				System.out.println("MANGO is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				cost = (quantity * 120);
				System.out.println("--------------------------");
				System.out.println(+quantity * 120);
				amount = amount + (quantity * 120);
				ClassA.item.add("MANGO");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);

				System.out.println("press 1 to continue : ");
				System.out.println("press 2 to exit :");
				break;
			case 112:
				System.out.println("MOSAMBI is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 60);
				amount = amount + (quantity * 60);
				cost = (quantity * 60);
				ClassA.item.add("MOSAMBI");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 113:
				System.out.println("AVOCADO is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 250);
				amount = amount + (quantity * 250);
				cost = (quantity * 250);
				ClassA.item.add("AVOCADO");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 114:
				System.out.println("SAPOTA is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 70);
				amount = amount + (quantity * 70);
				cost = (quantity * 70);
				ClassA.item.add("SAPOTA");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 115:
				System.out.println("GRAPES is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 90);
				amount = amount + (quantity * 90);
				cost = (quantity * 90);
				ClassA.item.add("GRAPES");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			default:
				System.out.println("  please choose correct option  ");
				new ClassA().meth1();
				return;
			}
			break;
		}
		case 2: {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|            116) POTATO      ------------- 1KG -------- RS.40           |");
			System.out.println("|            117) CAULIFLOWER ------------- 1KG -------- RS.60           |");
			System.out.println("|            118) BRINJAL     ------------- 1KG -------- RS.55           |");
			System.out.println("|            119) CUCUMBER    ------------- 1KG -------- RS.90           |");
			System.out.println("|            120) PUMPKIN     ------------- 1KG -------- RS.190          | ");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("please choose your product code : ");
			System.out.println("--------------------------------");
			int b = sc.nextInt();
			switch (b) {
			case 116:
				System.out.println("POTATO is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 40);
				amount = amount + (quantity * 40);
				cost = (quantity * 40);
				ClassA.item.add("POTATO");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue : ");
				System.out.println("press 2 to exit :");
				break;
			case 117:
				System.out.println("CAULIFLOWER is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 60);
				amount = amount + (quantity * 60);
				cost = (quantity * 60);
				ClassA.item.add("CAULIFLOWER");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 118:
				System.out.println("BRINJAL is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 55);
				amount = amount + (quantity * 55);
				cost = (quantity * 55);
				ClassA.item.add("BRINJAL");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 119:
				System.out.println("CUCUMBER is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 90);
				amount = amount + (quantity * 90);
				cost = (quantity * 90);
				ClassA.item.add("CUCUMBER");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 120:
				System.out.println("PUMPKIN is a great choice ");
				System.out.println();
				System.out.println("how many kgs do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 190);
				amount = amount + (quantity * 190);
				cost = (quantity * 190);
				ClassA.item.add("PUMPKIN");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			default:
				System.out.println("  please choose correct option  ");
				new ClassA().meth1();
				return;
			}
			break;
		}
		case 3: {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|            121) THUMSUP    ------------- 1L -------- RS.40           |");
			System.out.println("|            122) SPRITE     ------------- 1L -------- RS.45           |");
			System.out.println("|            123) REAL JUICE ------------- 1L -------- RS.95           |");
			System.out.println("|            124) B NATURAL  ------------- 1L -------- RS.110          |");
			System.out.println("|            125) BAVARIA    ------------- 1L -------- RS.180          | ");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("please choose your product code : ");
			System.out.println("--------------------------------");
			int b = sc.nextInt();
			switch (b) {
			case 121:
				System.out.println("THUMSUP is a great choice ");
				System.out.println();
				System.out.println("how many litres do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 40);
				amount = amount + (quantity * 40);
				cost = (quantity * 40);
				ClassA.item.add("THUMSUP");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue : ");
				System.out.println("press 2 to exit :");
				break;
			case 122:
				System.out.println("SPRITE is a great choice ");
				System.out.println();
				System.out.println("how many litres do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 45);
				amount = amount + (quantity * 45);
				cost = (quantity * 45);
				ClassA.item.add("SPRITE");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 123:
				System.out.println("REAL JUICE is a great choice ");
				System.out.println();
				System.out.println("how many litres do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 95);
				amount = amount + (quantity * 95);
				cost = (quantity * 95);
				ClassA.item.add("REAL JUICE");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 124:
				System.out.println("B NATURAL is a great choice ");
				System.out.println();
				System.out.println("how many litres do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 110);
				amount = amount + (quantity * 110);
				cost = (quantity * 110);
				ClassA.item.add("B NATURAL");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 125:
				System.out.println("BAVARIA is a great choice ");
				System.out.println();
				System.out.println("how many litres do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 180);
				amount = amount + (quantity * 180);
				cost = (quantity * 180);
				ClassA.item.add("BAVARIA");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			default:
				System.out.println("  please choose correct option  ");
				new ClassA().meth1();
				return;
			}
			break;
		}
		case 4: {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|            126) 5-STAR     ------------- 1PC -------- RS.5           |");
			System.out.println("|            127) DAIRY MILK ------------- 1PC -------- RS.40          |");
			System.out.println("|            128) KITKAT     ------------- 1PC -------- RS.20          |");
			System.out.println("|            129) PERK       ------------- 1PC -------- RS.10          |");
			System.out.println("|            130) MUNCH      ------------- 1PC -------- RS.15          | ");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("please choose your product code : ");
			System.out.println("--------------------------------");
			int b = sc.nextInt();
			switch (b) {
			case 126:
				System.out.println("5-STAR is a great choice ");
				System.out.println();
				System.out.println("How many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 5);
				amount = amount + (quantity * 5);
				cost = (quantity * 5);
				ClassA.item.add("5-STAR");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue : ");
				System.out.println("press 2 to exit");
				break;
			case 127:
				System.out.println("DAIRY MILK is a great choice ");
				System.out.println();
				System.out.println("How many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 40);
				amount = amount + (quantity * 40);
				cost = (quantity * 40);
				ClassA.item.add("DAIRY MILK");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 128:
				System.out.println("KITKAT is a great choice ");
				System.out.println();
				System.out.println("How many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 20);
				amount = amount + (quantity * 20);
				cost = (quantity * 20);
				ClassA.item.add("KITKAT");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 129:
				System.out.println("PERK is a great choice ");
				System.out.println();
				System.out.println("How many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 10);
				amount = amount + (quantity * 10);
				cost = (quantity * 10);
				ClassA.item.add("PERK");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 130:
				System.out.println("MUNCH is a great choice ");
				System.out.println();
				System.out.println("How many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 15);
				amount = amount + (quantity * 15);
				cost = (quantity * 15);
				ClassA.item.add("MUNCH");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			default:
				System.out.println("  please choose correct option  ");
				new ClassA().meth1();
				return;
			}
			break;
		}
		case 5: {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("|            131) OREO         ------------- 1PC -------- RS.10          |");
			System.out.println("|            132) DARK FANTASY ------------- 1PC -------- RS.50          |");
			System.out.println("|            133) BOURBON      ------------- 1PC -------- RS.25          |");
			System.out.println("|            134) HAPPY-HAPPY  ------------- 1PC -------- RS.30          |");
			System.out.println("|            135) UNIBIC       ------------- 1PC -------- RS.45          | ");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("please choose your product code : ");
			System.out.println("--------------------------------");
			int b = sc.nextInt();
			switch (b) {
			case 131:
				System.out.println("OREO is a great choice ");
				System.out.println();
				System.out.println("how many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 10);
				amount = amount + (quantity * 10);
				cost = (quantity * 10);
				ClassA.item.add("OREO");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue : ");
				System.out.println("press 2 to exit :");
				break;
			case 132:
				System.out.println("DARK FANTASY is a great choice ");
				System.out.println();
				System.out.println("how many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 50);
				amount = amount + (quantity * 50);
				cost = (quantity * 50);
				ClassA.item.add("DARK FANTASY");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 133:
				System.out.println("BOURBON is a great choice ");
				System.out.println();
				System.out.println("how many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 25);
				amount = amount + (quantity * 25);
				cost = (quantity * 25);
				ClassA.item.add("BOURBON");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 134:
				System.out.println("HAPPY-HAPPY is a great choice ");
				System.out.println();
				System.out.println("how many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 30);
				amount = amount + (quantity * 30);
				cost = (quantity * 30);
				ClassA.item.add("HAPPY-HAPPY");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			case 135:
				System.out.println("UNIBIC is a great choice ");
				System.out.println();
				System.out.println("how many PIECES do you need? ");
				System.out.println("--------------------------");
				quantity = sc.nextInt();
				System.out.println("--------------------------");
				System.out.println(+quantity * 45);
				amount = amount + (quantity * 45);
				cost = (quantity * 45);
				ClassA.item.add("UNIBIC");
				ClassA.qnt.add(quantity);
				ClassA.cst.add(cost);
				System.out.println("--------------------------");
				System.out.println("press 1 to continue:");
				System.out.println("press 2 to exit :");
				break;
			default:
				System.out.println("please choose correct option");
				new ClassA().meth1();
				return;
			}
			break;
		}
		case 6: {
			System.out.println("---------------------");
			System.out.println("please do visit again");
			System.out.println("---------------------");
			if (a == 6) {
				return;
			}
			break;
		}
		default:
			System.out.println("  please choose correct option  ");
			new ClassA().meth1();
			return;
		}
		int b = sc.nextInt();
		if (b == 1) {
			new ClassA().meth1();
		} else {
			return;
		}
	}

	public static void main(String[] args) {
		new ClassA().meth1();
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your phone number : ");
		long number = sc.nextLong();
		System.out.println("Enter your address :");
		String address = sc.next();
		System.out.println("------------------------------------------------");
		System.out.println("------------ Welcome to My Stores --------------");
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println();
		int maxItemNameLength = getMaxItemNameLength(item);
		String spacing = generateSpacing(maxItemNameLength);
		System.out.println("|   SNO      |     NAME       |      QUANTITY       |    PRICE   |");
		for (int i = 0; i < cst.size(); i++)
			System.out.println("|   " + (i + 1) + "        |    " + item.get(i) + spacing+"  |        " + qnt.get(i) + "            |     "+ cst.get(i)+"  |");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Total bill amount             : " + amount);
		int Discount = (int) (0.05 * amount);
		System.out.println("you have received a discount of 5% : " + Discount);
		int Finalbill = (amount - Discount);
		System.out.println("Final bill                    : " + Finalbill);
		System.out.println();
		System.out.println();
		System.out.println("       On MRP in my stores you saved RS." + Discount);
		System.out.println();
		System.out.println();
		System.out.println("----------------- CUSTOMER DETAILS --------------------------------------");
		System.out.println("Name    : " + name.toUpperCase());
		System.out.println("Number  : " + number);
		System.out.println("address : " + address.toUpperCase());
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("****************** visit again *******************");
		System.out.println("--------------------------------------------------");
	}

	private static int getMaxItemNameLength(List<String> items) {
        int maxLength = 0;
        for (String item : items) {
            if (item.length() > maxLength) {
                maxLength = item.length();
            }
        }
        return maxLength;
    }


	private static String generateSpacing(int length) {
	        StringBuilder spacing = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            spacing.append(" ");
	        }
	        return spacing.toString();
	    }
}
