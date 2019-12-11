package Collections.c38.Aggregator;

import Collections.c38.Aggregator.model.Model;
import Collections.c38.Aggregator.model.Provider;
import Collections.c38.Aggregator.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private Model model;

    public Controller(Model model) {
        if (model==null)
            throw new IllegalArgumentException();
        this.model = model;
    }

    public void onCitySelect(String cityName){
        model.selectCity(cityName);
    }
}