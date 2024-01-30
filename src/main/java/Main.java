import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        String url = "https://skillbox.ru";
        String regex = "(/?[A-Za-z0-9]+/)*";

        Document doc = Jsoup.connect(url).get();

        Elements elements = doc.select("a");

        for(Element element : elements){
            if(element.attr("href").contains(url) || element.attr("href").matches(regex)){
                System.out.println(element.attr("href"));
            }
        }
        System.out.println("*******************************************************************************************");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(Element element : elements){
                System.out.println(element.attr("href"));
        }
    }
}
