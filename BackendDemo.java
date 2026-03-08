import java.util.*;

public class BackendDemo {

    static Scanner sc = new Scanner(System.in);

    static Map<String, Map<String, List<String>>> data = new HashMap<>();

    static {
        Map<String, List<String>> shoes = new HashMap<>();
        shoes.put("Nike", Arrays.asList("Air Max","Pegasus","Revolution"));
        shoes.put("Adidas", Arrays.asList("Ultraboost","NMD","Superstar"));

        Map<String, List<String>> phones = new HashMap<>();
        phones.put("Apple", Arrays.asList("iPhone 13","iPhone 14","iPhone 15"));
        phones.put("Samsung", Arrays.asList("Galaxy S22","Galaxy S23"));

        Map<String, List<String>> laptops = new HashMap<>();
        laptops.put("Dell", Arrays.asList("Inspiron","XPS"));
        laptops.put("HP", Arrays.asList("Pavilion","Victus"));

        data.put("Shoes", shoes);
        data.put("Smartphone", phones);
        data.put("Laptop", laptops);
    }

    public static void main(String[] args) {

        System.out.println("==== Discover Our Premium Product Collection ====");

        List<String> products = new ArrayList<>(data.keySet());

        for(int i=0;i<products.size();i++)
            System.out.println((i+1)+". "+products.get(i));

        System.out.print("Select Product: ");
        int p = sc.nextInt() - 1;

        String product = products.get(p);

        Map<String,List<String>> brands = data.get(product);

        List<String> brandList = new ArrayList<>(brands.keySet());

        for(int i=0;i<brandList.size();i++)
            System.out.println((i+1)+". "+brandList.get(i));

        System.out.print("Select Brand: ");
        int b = sc.nextInt() - 1;

        String brand = brandList.get(b);

        List<String> models = brands.get(brand);

        for(int i=0;i<models.size();i++)
            System.out.println((i+1)+". "+models.get(i));

        System.out.print("Select Model: ");
        int m = sc.nextInt() - 1;

        String model = models.get(m);

        String[] colors = {"Black","White","Red","Blue"};
        for(int i=0;i<colors.length;i++)
            System.out.println((i+1)+". "+colors[i]);

        System.out.print("Select Color: ");
        int c = sc.nextInt() - 1;

        String color = colors[c];

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        System.out.println("\nSelected Product:");
        System.out.println(product+" | "+brand+" | "+model+" | "+color+" | Size "+size);

        Map<String,Integer> prices = new LinkedHashMap<>();
        prices.put("Amazon",8200);
        prices.put("Flipkart",8000);
        prices.put("Myntra",8400);
        prices.put("Ajio",8100);

        int lowest = Collections.min(prices.values());

        System.out.println("\nPrice Comparison:\n");

        for(String site: prices.keySet()){
            int price = prices.get(site);

            if(price==lowest)
                System.out.println(site+" : ₹"+price+"  <-- Lowest Price");
            else
                System.out.println(site+" : ₹"+price);
        }
    }
}