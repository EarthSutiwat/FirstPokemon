import javax.swing.ImageIcon;

public abstract class Berry {

    protected String name;
    protected int hpHeal;
    protected int atkBoost;
    protected int defBoost;
    ImageIcon berryIcon;

    public Berry(String name){
        this.name = name;
        hpHeal = 0;
        atkBoost = 0;
        defBoost = 0;
    
    }

    public abstract void statsBoost(int boostValue, Pokemon poke);

    public String getName()
      {
        return name;
      }

      public String toString()
      {
        return name;
      }

}