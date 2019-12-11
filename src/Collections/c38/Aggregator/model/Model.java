package Collections.c38.Aggregator.model;

import Collections.c38.Aggregator.view.View;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Model {
    private View view;
    private Provider[] providers;

    public Model(View view, Provider...providers) {
        if (view == null || providers == null || providers.length == 0)
            throw new IllegalArgumentException();
        this.view = view;
        this.providers = providers;
    }

    public void selectCity(String city) {
        view.update(Arrays.stream(providers)
                .map(p -> p.getJavaVacancies(city))
                .flatMap(Collection::stream)
                .collect(Collectors.toList()));
    }
}
