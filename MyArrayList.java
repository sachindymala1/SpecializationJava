package StreamAPI;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MyArrayList{
    static List<ProductList> prducts = new ArrayList<ProductList>();
    public static void main(String[] args) {
        prducts.add(new ProductList(1,"Soap",1,60));
        prducts.add(new ProductList(2,"Shampoo",1,80));
        prducts.add(new ProductList(3,"Pencil",1,5));
        prducts.add(new ProductList(4,"Pen",1,10));
        prducts.add(new ProductList(5,"Toothbrush",1,30));
        int choice;
        do{
            System.out.println("Product List");
            System.out.println("Menu");
            System.out.println("1.Create Product");
            System.out.println("2.Search Product");
            System.out.println("3.Update the product");
            System.out.println("4.Delete the product");
            System.out.println("5.Display the product");
            System.out.println("6.Exit");
            Scanner sc = new Scanner(System.in);

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createProd();
                    break;
                case 2:
                    int id;
                    System.out.println("Enter the id you want to search");
                    id = sc.nextInt();
                    searchProd(id);
                    break;
                case 3:
                    updateProd();
                    System.out.println("Updated successfully...");
                    break;
                case 4:
                    System.out.println("Enter the id you want to delete");
                    id = sc.nextInt();
                    removeProd(id);
                    System.out.println("Product removed successfully...");
                    break;
                case 5:
                    System.out.println(prducts);
                    break;
                case 6:
                    System.out.println("Program ends....");
                    System.exit(0);
                    break;
            }
        }while(choice != -1);
        System.out.println("Program ends");
    }
    private static void createProd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id");
        int prodId = sc.nextInt();
        System.out.println("Enter product name");
        String prodName = sc.next();
        System.out.println("Enter the quantity");
        int qty = sc.nextInt();
        System.out.println("Enter the price");
        int price = sc.nextInt();
        ProductList newProd = new ProductList(prodId,prodName,qty,price);
        prducts.add(newProd);
    }
    private static void searchProd(int id) {
        for (int index = 0; index <prducts.size(); index++) {
            ProductList prod = prducts.get(index);
            if(prod.getProductId()==id)
                System.out.println(prod);
        }
    }
    private static void updateProd() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter product id");
        int prodId = sc.nextInt();
        System.out.println("Enter product name");
        String prodName = sc.next();
        System.out.println("Enter the quantity");
        int qty = sc.nextInt();
        System.out.println("Enter the price");
        int price = sc.nextInt();
        for(int i = 0;i<prducts.size();i++){
            ProductList p = prducts.get(i);
            if(p.getProductId()==prodId){
                p.setProductName(prodName);
                p.setQuantity(qty);
                p.setPrice(price);
            }
        }
    }
    private static void removeProd(int id ){
        for(int i = 0; i < prducts.size();i++){
            ProductList prod = prducts.get(i);
            if(prod.getProductId()==id){
                prducts.remove(prod);
                System.out.println("Product removed...");
            }
        }
    }
}



