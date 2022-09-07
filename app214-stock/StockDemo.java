
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Ciaran Byrne.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Jordan 4 Oreo"));
        stock.add(new Product(102, "Jordan 1 Panda"));
        stock.add(new Product(103, "Converse Dior"));
        stock.add(new Product(104, "Air Force 1"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 250);
        stock.buyProduct(103, 50);
        stock.buyProduct(104, 300);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 200);
        stock.sellProduct(102, 100);
        stock.sellProduct(103, 25);
        stock.sellProduct(104, 150);
    }    
}