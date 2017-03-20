/**
 * Created by christosbampis on 15/03/2017.
 */


public class VendingMachine {

    int productType;
    int drinkType;
    int snackType;
    int sweetType;


    int chosenItem;


    public void start() {


    



        //Available Drinks
        int numberOfDrinks=3;

        Drink[] itemDrink= new Drink[numberOfDrinks];
        itemDrink[0] = new Drink(1,"Fanta", 1, 1.20, 0);
        itemDrink[1] = new Drink(2,"Cola Loca",1, 0.90, 1 );
        itemDrink[2] = new Drink(3,"Sprite",1, 0.80, 10 );

        //Available Snacks
        int numberOfSnacks=3;

        Snack[] itemSnack= new Snack[numberOfSnacks];
        itemSnack[0] = new Snack(1,"Crackers",2, 2.50, 1 );
        itemSnack[1] = new Snack(2, "Pop Corn",2, 1.00, 10 );
        itemSnack[2] = new Snack(3,"Sprinkgles",2, 0.75, 10 );


        //Available Sweets
        int numberOfSweets=3;

        Sweet[] itemSweet = new Sweet[numberOfSweets];

        itemSweet[0] = new Sweet(1, "Lacta",3, 1.00, 10 );
        itemSweet[1] = new Sweet(2,"Toblerone",3, 2.50, 0 );
        itemSweet[2] = new Sweet(3,"Sokofreta",3, 3.50, 10 );

do {


    System.out.println("Welcome!");
    System.out.println("Press 1 for drinks");
    System.out.println("Press 2 for snacks");
    System.out.println("Press 3 for sweets");


    productType = Evaluations.getChoice(3);//Evaluate the input if matches the available options
    System.out.println(productType);




    switch (productType) {

        case 1:
            System.out.println("Choose a drink from the list");
            Evaluations.vmProcess(itemDrink);
            break;

        case 2:
            System.out.println("Choose a snack from the list");
            Evaluations.vmProcess(itemSnack);
            break;

        case 3:
            System.out.println("Choose a sweet from the list");
            Evaluations.vmProcess(itemSweet);
            break;

        default:
            System.out.println("Error");

    }
}while(productType!=0);













    }



}
