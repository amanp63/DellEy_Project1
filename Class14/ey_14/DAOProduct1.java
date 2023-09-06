package ey_14;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product1 {
    private int id;
    private int quantity;
    private String Pname;
    private int price;
    private String Owner;

    public Product1(int id, int quantity, String pname, int price, String owner) {
        this.id = id;
        this.quantity = quantity;
        this.Pname = pname;
        this.price = price;
        this.Owner = owner;
    }

    // Getters and setters for the Product1 class

    @Override
    public String toString() {
        return "Product1 [id=" + id + ", quantity=" + quantity + ", Pname=" + Pname + ", price=" + price + ", Owner="
                + Owner + "]";
    }

	public Object getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

    // Add getters and setters for id and owner...
}

interface product1dao {
    void addProduct(Product1 product);
    Product1 getProductById(int id);
    List<Product1> getProductsByOwner(String owner);
    void getProductByQuantity(int quantity);
    void getProductByPname(String pname);
    void getProductByPrice(int price);
}

class ProductDAOImp implements product1dao {
    static List<Product1> products = new ArrayList<>();

    @Override
    public void addProduct(Product1 product) {
        products.add(product);
    }

    // Other method implementations...

    @Override
    public List<Product1> getProductsByOwner(String owner) {
        List<Product1> matchingProducts = new ArrayList<>();
        for (Product1 product : products) {
            if (product.getOwner().equals(owner)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

	@Override
	public Product1 getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getProductByQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getProductByPname(String pname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getProductByPrice(int price) {
		// TODO Auto-generated method stub
		
	}

    // Implement other methods...
}

public class DAOProduct1 {
    public static void main(String[] args) {
        product1dao productDAO = new ProductDAOImp();

        List<Product1> listOfProducts = new ArrayList<>(); // Use List<Product1> here

        Product1 p1 = new Product1(123, 100, "ANC", 89, "PQR");
        Product1 p2 = new Product1(124, 100, "ANC", 89, "PQR");
        Product1 p3 = new Product1(125, 100, "ANC", 89, "PQR");

        listOfProducts.add(p1);
        listOfProducts.add(p2);
        listOfProducts.add(p3);

        Iterator<Product1> itr = listOfProducts.iterator();
        while (itr.hasNext()) {
            Product1 p = itr.next();
            System.out.println(p.toString());
        }

        List<Product1> giveMeProductByOwner = ((ProductDAOImp) productDAO).getProductsByOwner("PQR");
        System.out.println("Products owned by PQR: " + giveMeProductByOwner);
    }
}



