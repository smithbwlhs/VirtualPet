public class VirtualPet {
    /* enter code for instance variables, constructor
       getName and toString methods
    **/
    private String name;
    private int energy, weight, happiness, months, years;

    private final int MIN_WEIGHT = 5;
    private final int MAX_ENERGY = 10;
    private final int MAX_HAPPINESS = 10;

    public VirtualPet(String name) {
        this.name = name;
        this.energy = 0;
        this.happiness = 0;
        this.weight = 5;
        this.months = 0;
        this.years = 0;
    }

    public void feed() {
        if (this.energy >= 0 && this.energy < MAX_ENERGY) {
            energy++;
            this.weight++;
        }
    }

    public void play(){
        if(this.weight>0 && this.weight<=MIN_WEIGHT && this.happiness>=0 && this.happiness<MAX_HAPPINESS){
            this.happiness++;
            this.weight--;
        }
    }

    public void updateStatus(){
        if(this.happiness>0 && this.happiness<=MAX_HAPPINESS && this.energy>0 && this.energy<=MAX_ENERGY){
            this.energy--;
            this.happiness--;
        }

        this.months++;
        if(this.months==12){
            this.months = 0;
            this.years++;
        }
    }

    public String getName() {
        return name;
    }


    public int getEnergyLevel() {
        return energy;
    }

    public int getHappinessLevel() {
        return happiness;
    }


    @Override
    public String toString() {
        String output = name + "'s Information\n" +
                "Energy: " + energy + "\n" +
                "Happiness: " + happiness + "\n" +
                "Weight: " + weight + "g\n" +
                "Age: " + months + " months and " + years + " years";
        return output;
    }


}