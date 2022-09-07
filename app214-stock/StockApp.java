
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        //StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("add"))
        {
            int id = reader.getInt("Please enter ID: ");
            String name = reader.getString("Please enter name of the product: ");
            int stockAmount = reader.getInt("Please enter how many are in stock: ");
            Product product = new Product(id, name);
            stock.add(product);
            System.out.println("Product " + product.getID()
                +", " + product.getName() + " has been added " + " with " 
                + stockAmount + " in stock ");
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("remove"))
        {
            int id = reader.getInt("Please enter ID: ");
            String name = reader.getString("Please enter name of the product: ");
            Product product = new Product(id, name);
            stock.remove(product);
            System.out.println("Product " + product.getID()
                +", " + product.getName() + " has been removed");
        }
        else if(choice.equals("buy"))
        {
            stock.print();
            int id = reader.getInt("Please enter the ID of the stock you wish to buy: ");
            int amount = reader.getInt("Please enter how many, from 1 to 10: ");
            stock.buyProduct(id, amount);
        }
        else if(choice.equals("sell"))
        {
            stock.print();
            int id = reader.getInt("Please enter the ID of the stock you wish to sell: ");
            int amount = reader.getInt("Please enter how many you wish to sell, from 1 to 10: ");
            stock.sellProduct(id, amount);
        }
        
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Buy:        Buy quantity of stock");
        System.out.println("    Sell:       Sell quantity of stock");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Ciaran Byrne");
        System.out.println("********************************");
    }
}