package com.company;

import java.util.function.Function;

/**
 * Created by diederikbosmans on 27/07/17.
 */
public class Presenter {


    public Function<Model, String> retrieveOneFromModel() {

        return Model::getOne;
    }

    public Function<Model, String> retrieveTwoFromModel() {

        return Model::getTwo;
    }
}
