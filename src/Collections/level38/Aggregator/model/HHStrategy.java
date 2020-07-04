package Collections.level38.Aggregator.model;

import Collections.level38.Aggregator.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Collections;
import java.util.List;


/**
 * Created by Alexey on 21.04.2017.
 */

public class HHStrategy implements Strategy {
    //private static final String URL_FORMAT = "https://hh.ua/search/vacancy";
    //private static final String URL_FORMAT = "https://hh.ua/search/vacancy?text=java+Junior+android&only_with_salary=false&enable_snippets=true&clusters=true&salary=";
    private static final String URL_FORMAT = "https://javarush.ru/testdata/big28data.html";
    //private static final String URL_FORMAT = "https://javarush.ru/search/vacancy?text=java+odessa&currency_code=UAH&clusters=true&page=1";

    @Override
    public List<Vacancy> getVacancies(String searchString) {

        try {
            Jsoup.connect("http://hh.ua/search/vacancy?text=java+%s&page=%d").get();
            Jsoup.connect("http://hh.ua/search/vacancy?text=java+%s&page=%d").userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36");
            Jsoup.connect("http://hh.ua/search/vacancy?text=java+%s&page=%d").referrer("http://google.ru");

        }


        catch (IOException e) {
            e.printStackTrace();
        }


        return Collections.EMPTY_LIST;
    }

//    protected Document getDocument(String searchString, int page) throws IOException {
//        String url = String.format("%s?text=%s&page=%s",URL_FORMAT, searchString, page);
//        return Jsoup.connect(url)
//                .userAgent("Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
//                .timeout(5000)
//                .referrer("http://google.ru")
//                .get();
//    }
}