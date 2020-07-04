package Collections.level38.Aggregator;

import Collections.level38.Aggregator.model.Model;

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