public class pokemonGame{

    public static void main(String [] args){

        Pokemon Pichu= new Pokemon();
        Pokemon Mankey = new Pokemon();

        //pichu
        Pichu.giveName("Pichu");
        Pichu.setHP(20);
        System.out.println(Pichu.getName() + "'s HP is " + Pichu.getHP() +" Level : " + Pichu.getLevel() );

        //mankey
        Mankey.giveName("Mankey");
        Mankey.setHP(40);

        
        
    }
}