import java.util.*;

public class Trainer {

    private String name;
    ArrayList<Pokemon> myPokemon;
     
    
    public Trainer(String name){

        this.name = name ;
         myPokemon = new ArrayList<Pokemon>();
         

    }

   
    public void showPokemon(){
        System.out.println("Pokemon: ");
        for (Pokemon p : myPokemon)
            System.out.println(p.getName() + " Lv." + p.getLevel());
    }

   
  

    public Pokemon search(){
        ArrayList <Pokemon> appearPoke = RandomPokemon.getPokemon();
        Pokemon pokemonMet = appearPoke.get(0);

        return pokemonMet;
    }


    public ArrayList<Pokemon> getPokemon()
    {
        return this.myPokemon;
    }
    
   

}