
   import java.util.Random;
   
   public class Pokemon {
    
    //attribute

      private String species;
      private String name;
      private boolean checkChangeName = true;
      private String type ;
      private int level;
      private int hp;
      private int atk;
      private int def;
      private int baseHp = 30;
      private int baseAtk = 56;
      private int baseDef = 35;
      Random rand = new Random(); 
      
  
      //method

      public Pokemon ()
    {   

        name = species;
        level =  rand.nextInt(9) + 2;
        type = "normal";
        hp =  (int) ( (baseHp * 2) * (level/100.0)) + level +10;
        atk = (int) ( (baseAtk * 2) * (level/100.0)) + 5;
        def = (int) ( (baseDef * 2) * (level/100.0)) + 5 ;
    }
      
      public void showStatus ()
      {
        System.out.println(level);   
        System.out.println(hp); 
        System.out.println(atk);   
        System.out.println(def);    
        
      }

      public void changeName(){
       
        if (checkChangeName)
        {
          System.out.println("Would you like to give " + name + " a nickname");
          checkChangeName = false;
        }
        else System.out.print("You can't change name anymore!!!");
      }

      
    }
