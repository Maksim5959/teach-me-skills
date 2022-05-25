package chuyashkou.lessonsOOP.shop;

public class ShopApp {

    public static void main(String[] args) {

        Product product1 = new Product("Pan", 2.00, 4.4);
        Product product2 = new Product("Pencil", 2.40, 4.1);
        Product product3 = new Product("Note", 5.50, 3.2);

        Category category = new Category("Chancellery", new Product[]{product1, product2, product3});

        Basket basket = new Basket(new Product[]{product1, product2});

        User user = new User("Ivan", "1234", basket);

        System.out.println(category);
        System.out.println(basket);
        System.out.println(user);
    }
}
