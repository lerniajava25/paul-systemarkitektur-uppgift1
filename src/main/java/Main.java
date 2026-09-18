public class Main {
    public static void main(String[] args) {

        Product laptop = new Product.Builder()
                .id("1")
                .name("Laptop")
                .category(Category.COMPUTER)
                .rating(8)
                .build();

        Product iphone = new Product.Builder()
                .id("2")
                .name("Iphone")
                .category(Category.PHONE)
                .rating(6)
                .build();


        System.out.println(laptop.getName());
        System.out.println(laptop.getCategory());
        System.out.println(laptop.getRating());

        System.out.println("\n" + iphone.getName());
        System.out.println(iphone.getCategory());
        System.out.println(iphone.getRating());

    }
}