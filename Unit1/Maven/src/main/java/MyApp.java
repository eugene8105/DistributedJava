import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyApp {
    public static void main(String[] args){
        List<String> freshman = new ArrayList<>();
        List<String> sophomores = new ArrayList<>();

        freshman.add("Stacy");
        freshman.add("Charlie");
        freshman.add("Jayne");

        sophomores.add("Phil");
        sophomores.add("Ben");
        sophomores.add("Zuul");
        sophomores.add("Indy");

        // Collections.sort from dependency injected with maven - in file pom.xml
        Collections.sort(freshman);
        Collections.sort(sophomores);

        List<String> students = CollectionUtils.collate(freshman, sophomores);
        for ( String s : students) {
            System.out.println(s);
        }

    }
}
