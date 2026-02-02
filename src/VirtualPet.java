public class VirtualPet {
  /* enter code for instance variables, constructor
     getName and toString methods
  **/
  private String name;
  private int energy, weight, happiness,months,years;

  private final int MIN_WEIGHT = 5;
  public VirtualPet(String name){
    this.name = name;
    this.energy = 0;
    this.happiness = 0;
    this.weight = 5;
    this.months = 0;
    this.years = 0;
  }

  @Override
  public String toString(){
    String output = name+"'s Information\n" +
            "Energy: "+energy+"\n"+
            "Happiness: "+happiness+"\n"+
            "Weight: "+weight+"g\n"+
            "Age: "+months+" months and "+years+" years";
    return output;
  }

  public String getName(){
    return name;
  }

}