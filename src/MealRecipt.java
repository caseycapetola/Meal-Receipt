/**
 * 
 * @author Casey Capetola
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class MealRecipt 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("##.00");
		System.out.println("Tax and Tip Calculator: ");
		System.out.print("Please enter the name of your appetizer: ");
		String app = user.nextLine();
		System.out.print("\nPlease ener the price for the appetizer: ");
		String appStr = user.nextLine();
		double appPrice = Double.parseDouble(appStr);
		System.out.print("\nPlease enter the name of your entrée: ");
		String ent = user.nextLine();
		System.out.print("\nPlease enter the price of your entrée: ");
		String entStr = user.nextLine();
		double entPrice = Double.parseDouble(entStr);
		System.out.print("\nPlease enter the name of your dessert: ");
		String des = user.nextLine();
		System.out.print("\nPlease enter the price of your dessert: ");
		String desStr = user.nextLine();
		double desPrice = Double.parseDouble(desStr);
		System.out.print("\nWhat percentage would you like to tip (as decimal): ");
		String tipStr = user.nextLine();
		double tipPercent = Double.parseDouble(tipStr);
		
		double subtotal = appPrice+entPrice+desPrice;
		double tax = 0.06*subtotal;
		double tip =  tipPercent*subtotal;
		double total = subtotal+tax+tip;
		double tipPer = tipPercent*100;
		
		double roundSubtotal = Math.round(subtotal*100)/100;
		double roundTax = Math.round(tax*100)/100;
		double roundTip = Math.round(tip*100)/100;
		double roundTotal = Math.round(total*100)/100;
		
		System.out.println("\nItem:      Price:");
		System.out.println(app + "      $" + appPrice);
		System.out.println(ent + "      $" + entPrice);
		System.out.println(des + "      $" + desPrice);
		System.out.println("\nSubtotal      $" + subtotal);
		System.out.println("Tax      $" + tax);
		System.out.println("Tip @ " + tipPer + "%      $" + tip);
		System.out.println("\nTotal      $" + total);

	}

}
