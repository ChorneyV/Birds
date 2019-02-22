package com.bird;
import com.environment.Lake;
import com.environment.Sky;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main  {

    public static void main(String[] args)throws Exception{
        Lake lake = new Lake();
        Sky sky = new Sky();
        //Creating first instances of birds
        Geese geese = new Geese("Geese4");
        Duck duck = new Duck("Duck4");
        Sparrow sparrow = new Sparrow("4Sparrow");
        lake.add(geese);
        sky.add(duck);
        sky.add(sparrow);
        String choice="";
        System.out.println("Press 'S' to stop birth of birds ");
        System.out.println(sky.getClass());
        //Loop for birth birds and adding them to environment
          while ((!choice.contains("s"))&&(!choice.contains("S"))){
            sky.add(sparrow.birth("Sparrow"));
            lake.add(duck.birth("Duck1"));
            sky.add(geese.birth("Geese3"));
            sky.add(geese.birth("Geese2"));
            sky.add(geese.birth("Geese1"));
            sky.add(duck.birth("Duck2"));
            System.out.println("Continue? ");
            BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
            choice = input.readLine();
        }

        sky.print();
        lake.print();

    }
}
