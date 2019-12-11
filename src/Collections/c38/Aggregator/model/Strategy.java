package Collections.c38.Aggregator.model;

import Collections.c38.Aggregator.vo.Vacancy;
import java.util.List;

public interface Strategy {
    List<Vacancy> getVacancies(String searchString);
}
