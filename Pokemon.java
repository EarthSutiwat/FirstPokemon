import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;    

  
   public abstract class Pokemon  {
    
    //attribute

    Random rand = new Random(); 
    Scanner scan = new Scanner (System.in); 
      protected String name;
      protected int level;
      protected int exp, maxExp;
      protected int hp,curHp;
      protected int atk;
      protected int def;
      protected int baseHp;
      protected int baseAtk;
      protected int baseDef;
      protected int damage;
      protected ImageIcon pokeIcon;
      protected ImageIcon pokeImg;
      protected ArrayList<String> moves;
     
     
  
      //method

      public Pokemon (String name , int baseLevel)
    {   
        this.name = name ;
        this.level = baseLevel;

        maxExp = level*10;
        hp =  hpCal(baseHp);
        atk = statsCal(baseAtk);
        def = statsCal(baseDef);
        curHp = hp;
    }
      
      public abstract void  attack(Pokemon enemy, String move);

      private int hpCal(int baseStats){
       int stats = (int) ( (baseHp * 2) * (this.level/100.0)) + this.level + 10;
        return stats;
      }

      private int statsCal(int baseStats){
        int stats = (int) ( (baseStats * 2) * (this.level/100.0)) + 5 ;
        return stats;
      }

      public void getDamaged(int value,int enemyAtk,int enemyLevel)
      {
        damage = (int) ( ( (enemyLevel*2) / 5)  * value *(enemyAtk / this.def) ) / 50 ;

        if (damage<=0)
          damage = 1;
      
        if ( (this.curHp - damage) > 0){
          this.curHp -= damage;
        }
        else this.curHp = 0;
      }

     
      public void receivedExp(int expReceived){
          int curExp = exp;
          curExp += expReceived;
          setExp(curExp);

          if (exp >= maxExp) {
            exp = exp % maxExp;
            levelUp();
          }
        }
      private void levelUp(){
        level++; 
        maxExp += (this.level * 10);
        statsUp();
        curHp = hp;
      }

      private void statsUp(){
        hp =  hpCal(baseHp);
        atk = statsCal(baseAtk);
        def = statsCal(baseDef);
      }
        
      public int getAtk(){
        return atk;
      }

      public int getDef(){
        return def;
      }


      public void setExp(int exp){
        this.exp = exp;
      }
      public int getExp(){
        return exp;
      }

      public int getMaxExp(){
        return maxExp;
      }

      public int getHp(){
        return hp;
      } 

      public int getCurHp(){
        return curHp;
      } 

      public ImageIcon getIcon(){

        return pokeIcon;
      }

      public ImageIcon getImg(){
        
        return pokeImg;
      }

      public int getLevel(){
        return level;
      }
      
      public String getName()
      {
        return name;
      }

      public void setName(String name){
        
        this.name = name;
    }

      public String toString()
      {
        return name;
      }
      
      public ArrayList<String> getMoves()
    {
        return this.moves;
    }
    
      
    }
  