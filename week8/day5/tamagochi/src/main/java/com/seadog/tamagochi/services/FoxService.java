package com.seadog.tamagochi.services;

import com.seadog.tamagochi.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    final private List<Fox> foxes;


    public FoxService() {
        foxes = new ArrayList<>();
    }

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void addIfValid(Fox fox) {
        if (fox!=null && !this.nameExist(fox.getName())){
            foxes.add(fox);
        }
    }

    public Fox getFoxByName(String name) {
        return foxes.stream().
                filter(p -> p.getName().toLowerCase().equals(name.toLowerCase())).
                findAny().orElse(null);
    }

    public boolean nameExist(Fox fox) {
        return foxes.stream().
                anyMatch(o -> o.getName().toLowerCase().equals(fox.getName().toLowerCase()));
    }

    public boolean nameExist(String name) {
        return foxes.stream().
                anyMatch(o -> o.getName().toLowerCase().equals(name.toLowerCase()));
    }
}
