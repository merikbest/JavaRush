package Collections.level38.Aggregator.model;

import Collections.level38.Aggregator.vo.Vacancy;
import java.util.List;

public interface Strategy {
    List<Vacancy> getVacancies(String searchString);
}
