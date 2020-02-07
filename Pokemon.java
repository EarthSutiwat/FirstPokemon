
   public class Pokemon {
    
    //attribute

      public String Name;
      private String Type;
      private int Level = 1;
      private int HP;]
      private int ATK;
      private int DEF;
  
      //method

      public void attack(){

      }
      public void eat(){
        System.out.println(Name + " Eat berry.") ;
      };
     
      public void sleep(){
        System.out.println(Name + " is fast asleep.") ;

      };
      public void faint()
      {
          HP = 0 ;
          System.out.println(Name + " fainted!!") ;
      };

      public void giveName(String Name){

        this.Name = Name;

      }

      public String getName(){

        return this.Name;
      }
     
      public void setHP(int HP){

        this.HP = HP;

      }

      public int getHP(){

        return this.HP;
      }
    
    
      public int getATK(){

        return this.ATK;
      }

      public int getDEF(){

        return this.DEF;

      
      }

      public void setATK (int ATK){

        this.ATK =ATK;

      }

      public void setDEF(int DEF){

        this.DEF = DEF;

      }
    }