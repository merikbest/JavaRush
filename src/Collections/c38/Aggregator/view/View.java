package Collections.c38.Aggregator.view;

import Collections.c38.Aggregator.Controller;
import Collections.c38.Aggregator.vo.Vacancy;

import java.util.List;

public interface View {
    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}
