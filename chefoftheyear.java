import java.util.*;

public class chefoftheyear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n_chefs = sc.nextInt();
        int n_emails = sc.nextInt();

        Map<String, String> map1 = new TreeMap<>();
        Map<String, Integer> chef = new TreeMap<>();
        Map<String, Integer> country = new TreeMap<>();

        String s1 = "";
        String s2 = "";

        for(int i=0;i<n_chefs;i++)
        {
            s1 = sc.next();
            s2 = sc.next();

            map1.put(s1, s2);
        }

        for(int i=0;i<n_emails;i++)
        {
            s1 = sc.next();
            chef.put(s1,chef.getOrDefault(s1, 0)+1);
            s2 = map1.get(s1);
            country.put(s2,country.getOrDefault(s2, 0)+1);
        }

        String topChef = "";
        int chefVotes = 0;
        for (Map.Entry<String, Integer> entry : chef.entrySet()) 
        {
            if (entry.getValue() > chefVotes || (entry.getValue() == chefVotes && entry.getKey().compareTo(topChef) < 0)) 
            {
                topChef = entry.getKey();
                chefVotes = entry.getValue();
            }
        }
        
        String topCountry = "";
        int countryVotes = 0;
        for (Map.Entry<String, Integer> entry : country.entrySet()) 
        {
            if (entry.getValue() > countryVotes || (entry.getValue() == countryVotes && entry.getKey().compareTo(topCountry) < 0))
            {
                topCountry = entry.getKey();
                countryVotes = entry.getValue();
            }
        }

        System.out.println(topCountry);
        System.out.println(topChef);
    }
}