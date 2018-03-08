package P02_Advertisement_Message;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class AdvertisementMessage {

    public static void main(String[] args) throws IOException {


        String[] phrases = new String[]{
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] events = new String[]{
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] author = new String[]{
                "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[]{
                "Sofia", "Plovdiv", "Burgas", "Varna", "Ruse"};

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int messegesNeeded = Integer.parseInt(reader.readLine());

        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();

        while (messegesNeeded-- > 0) {
            sb.append(phrases[rnd.nextInt(phrases.length)]).append(" ")
                    .append(events[rnd.nextInt(events.length)]).append(" ")
                    .append(author[rnd.nextInt(author.length)]).append(" ")
                    .append(cities[rnd.nextInt(cities.length)]).append(System.lineSeparator());
        }

        System.out.println(sb.toString());
    }
}
