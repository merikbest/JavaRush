package Collections.level38.Aggregator.model;

import Collections.level38.Aggregator.vo.Vacancy;

import java.util.Collections;
import java.util.List;

public class Provider {
    private Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public List<Vacancy> getJavaVacancies(String searchString)
    {
        if (this.strategy == null)
            return Collections.emptyList();


        return strategy.getVacancies(searchString);
    }
}
