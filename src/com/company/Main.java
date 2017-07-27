package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Model> models = new ArrayList<>();
        models.add(new Model("1", "2"));
        models.add(new Model("1", "2"));
        models.add(new Model("1", "2"));


        Presenter presenter = new Presenter();
        List<String> ones = models.stream().map(presenter.retrieveOneFromModel()).collect(Collectors.toList());
        System.out.println(ones);

    }
}
