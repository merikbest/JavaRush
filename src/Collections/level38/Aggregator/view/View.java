package Collections.level38.Aggregator.view;

import Collections.level38.Aggregator.Controller;
import Collections.level38.Aggregator.vo.Vacancy;

import java.util.List;

public interface View {
    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}
