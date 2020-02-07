  import java.util.Scanner;
   import java.util.Random;
   
   public class Pokemon {
    
    //attribute

    Random rand = new Random(); 
    Scanner scan = new Scanner (System.in); 
      private String species;
      private String name;
      private boolean checkChangeName = true;
      private String type ;
      private int level;
      private int hp;
      private int atk;
      private int def;
      private int damage;
      private int baseHp = 30;
      private int baseAtk = 56;
      private int baseDef = 35;
     
  
      //method

      public Pokemon ()
    {   
        species = "Rattata";
        name = species;
        level =  rand.nextInt(9) + 2;
        type = "Normal";
        hp =  (int) ( (baseHp * 2) * (level/100.0)) + level +10;
        atk = (int) ( (baseAtk * 2) * (level/100.0)) + 5;
        def = (int) ( (baseDef * 2) * (level/100.0)) + 5 ;
        damage = 0;
    }
      
      public void showStatus ()
      {
        System.out.println("\nName: " +name);
        System.out.println("Type: " +type);
        System.out.println("Level: " +level);   
        System.out.println("HP: " + (hp-damage) + " / " +hp ); 
        System.out.println("ATK: " +atk);   
        System.out.println("DEF: " +def);    
        
      }

      public void changeName(){
       
        if (checkChangeName)
        {
          System.out.print("\nGive " + name + " a nickname: ");
          name = scan.nextLine();
          checkChangeName = false;
        }
        else System.out.println("\nYou can't change name anymore!!!");
      }

      public void eatBerry(){
        if (damage == 0)
          System.out.println("\nNo!!! " + name + " is full.");
        else {

          System.out.println( name + " is eating berry.");

            if(damage-10 < 0)
              damage = 0;
            else damage -= 10;
        }
      }
      
    }
