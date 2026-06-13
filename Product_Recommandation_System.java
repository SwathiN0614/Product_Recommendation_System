import java.util.*;

public class Product_Recommandation_System{

    private static Map<String, Set<String>> userProducts = new HashMap<>();

    
    public static void addUser(String user, String[] products) {
        userProducts.put(user, new HashSet<>(Arrays.asList(products)));
    }

    
    public static double similarity(Set<String> user1, Set<String> user2) {
        Set<String> intersection = new HashSet<>(user1);
        intersection.retainAll(user2);

        Set<String> union = new HashSet<>(user1);
        union.addAll(user2);

        if (union.size() == 0) {
            return 0.0;
        }

        return (double) intersection.size() / union.size();
    }

   
    public static List<String> recommendProducts(String targetUser) {

        if (!userProducts.containsKey(targetUser)) {
            return new ArrayList<>();
        }

        Set<String> targetProducts = userProducts.get(targetUser);

        double maxSimilarity = -1;
        String similarUser = null;

        
        for (String user : userProducts.keySet()) {

            if (user.equals(targetUser)) {
                continue;
            }

            double sim = similarity(targetProducts, userProducts.get(user));

            if (sim > maxSimilarity) {
                maxSimilarity = sim;
                similarUser = user;
            }
        }

        List<String> recommendations = new ArrayList<>();

        if (similarUser != null) {
            for (String product : userProducts.get(similarUser)) {
                if (!targetProducts.contains(product)) {
                    recommendations.add(product);
                }
            }
        }

        return recommendations;
    }
    public static void main(String[] args) {

        addUser("Dhanushiya", new String[]{"Laptop", "Phone", "Tablet"});
        addUser("Divya", new String[]{"Laptop", "Phone", "Camera"});
        addUser("Varsha", new String[]{"Phone", "Headphones", "Tablet"});

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name (Dhanushiya/Divya/Varsha): ");
        String user = sc.nextLine();

        List<String> result = recommendProducts(user);

        if (result.isEmpty()) {
            System.out.println("No recommendations available.");
        } else {
            System.out.println("Recommended Products:");
            for (String product : result) {
                System.out.println(product);
            }
        }

        sc.close();
    }
}
