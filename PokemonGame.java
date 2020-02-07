import java.util.Scanner;


public class PokemonGame{
     
    

    public static void main(String [] args){

        Pokemon myPoke = new Pokemon();
        Pokemon wildPoke = new Pokemon();
        
        menu(myPoke);
    }

    private static void menu(Pokemon poke)
    {    
        Scanner scan = new Scanner (System.in); 
        boolean endMenu = false ;   
        
        System.out.println("Check Pokemon's Status (PRESS 1)");
        System.out.println("Change Pokemon's Name (PRESS 2)");
        System.out.println("Give a berry. (PRESS 3)");
        System.out.println("End MENU (Press 0)");
        do {

            System.out.print("\nSelect Menu: ");
            int ans = scan.nextInt();
            
            switch (ans) {
             case 1:
             poke.showStatus();
                break;
             case 2:
                poke.changeName();
                break;
             case 3:
                poke.eatBerry();
                break;
             default:
                endMenu = true;
               }
         }
        while(endMenu == false);

  
    }
        
}
