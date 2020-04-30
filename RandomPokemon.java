import java.util.*;


public class RandomPokemon {
    

    public static ArrayList<Pokemon> getPokemon(){
        ArrayList <Pokemon> wildPokemon= new ArrayList<Pokemon>();
        Random rand = new Random();
        int type =  rand.nextInt(4);
        int level = rand.nextInt(20) + 1;
        if (type==0)
            wildPokemon.add(new Ekans("Ekans",level));
        else if (type==1)
            wildPokemon.add(new Grimer("Grimer",level));
        else if (type==2)
            wildPokemon.add(new Koffing("Koffing",level));
        else if (type==3)
            wildPokemon.add(new Zubat("Zubat",level));

        return wildPokemon;

    }

}