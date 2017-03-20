import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by christosbampis on 15/03/2017.
 */
public class Evaluations {





    //Evaluate Insert Choice
    public static int getChoice(int numberOfChoices) {

        Scanner userInput = new Scanner(System.in);
        int choice = -1;

        do {

            try{
                choice=userInput.nextInt();


                if (!(choice > numberOfChoices || choice < 1)) {



                } else {
                    System.out.println("Insert a valid choice");

                }

            }
            catch (InputMismatchException e){
                System.out.println("error");
            }
        }while(choice >numberOfChoices||choice<1);

        return choice;
    }


    public static void showMenu(Product[] arrayProduct) {


        for (int i = 0; i < arrayProduct.length; i++) {

            System.out.println("ID: " + arrayProduct[i].getProductId() + ", " + arrayProduct[i].getName() + ", price: €" +
                    arrayProduct[i].getPrice() + " (Available: " + arrayProduct[i].getAmount() + ")");

        }



    }

    public static void checkAvailability(int chosenProduct, Product[] aProduct){




            int amount = aProduct[chosenProduct-1].getAmount();

            if (amount > 0) {
                System.out.println("Please insert  "+ aProduct[chosenProduct-1].getPrice() + "€"+ "  to purchase your product!");
                insertMoney(chosenProduct,aProduct);
            } else {
                System.out.println("Product out of stock! Choose another option");

                vmProcess(aProduct);



            }





    }

    public static void insertMoney(int chosenItem, Product[] itemProduct){

        Scanner moneyInput = new Scanner(System.in);
        double cash=0;
        double nextCash=0;


        do {
            cash=moneyInput.nextDouble()+nextCash;
            if (cash > itemProduct[chosenItem - 1].getPrice()) {
                System.out.println("Your change are " + (cash - itemProduct[chosenItem - 1].getPrice()));
                itemProduct[chosenItem - 1].setAmount(itemProduct[chosenItem - 1].getAmount() - 1);
                nextCash=0;

            } else {
                System.out.println("Please insert " + (itemProduct[chosenItem - 1].getPrice() - cash));
                nextCash = cash;


            }
        }while(nextCash>0);




    }

    public static void vmProcess( Product[] customerProduct){
        showMenu(customerProduct);
        int customerChoice=getChoice(customerProduct.length);
        checkAvailability(customerChoice, customerProduct);


    }

}







