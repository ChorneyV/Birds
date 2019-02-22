package com.environment;
import com.bird.Birds;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Environment <T extends Birds> {
    private List<T> birdsList = new ArrayList<>();
    public  void add(T birds){
     birdsList.add(birds);
    }

    public void print() {
        System.out.println(this.getClass().getSimpleName());
        birdsList = birdsList.stream().sorted(Comparator.comparing(Birds::getName)).collect(Collectors.toList());
        for (T bird : birdsList){
            System.out.println(bird);
        }
    }
}
