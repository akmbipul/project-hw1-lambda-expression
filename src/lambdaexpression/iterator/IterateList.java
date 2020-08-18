package lambdaexpression.iterator;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IterateList extends Electronics {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("lambda.expression.anonymous.Laptop", "Tablet", "Television", "Monitor");
        System.out.println("Classic enhanced for loop");
        for (String items : electronicsList) {
            System.out.println(items);
        }

        //Please implement Anonymous class to iterate through
        System.out.println("Using Anonymous class");
        electronicsList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Imperative way : " + s);
            }
        });

        //Please implement lambda expression to iterate through electronicsList
        System.out.println("Lambda Expression");
        electronicsList.forEach(st -> System.out.println(st));


        //Please implement lambda Method Reference to iterate through electronicsList
        System.out.println("Lambda Method Reference-1 of 1");
        electronicsList.forEach((st) -> {
            System.out.println(st);
        });
        System.out.println("Lambda Method Reference-1 of 2");
        electronicsList.forEach(System.out::println);


        //Please implement lambda Method Reference from Electronics class to iterate through electronicsList
        System.out.println("Lambda Method Reference-2 using Electronics class");
        electronicsList.forEach(st -> {
            System.out.println("Name of Electronics Item : " + st);
            System.out.print("And Word Length is : ");
            Electronics.countWordLength(st);
        });

        //Please implement stream iteration through electronicsList
        System.out.println("iterate using Stream for each loop - getting item with only T and the length of each word");
        electronicsList.stream()
                .filter(st -> st.startsWith("T"))
                .map(st -> st.length())
                .forEach(System.out::println);
    }
}