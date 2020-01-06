public class Bottle {
    private int volume;

    public Bottle (){
        this.volume = 100;
    }
    public int getVolume(){
        return this.volume;
    }
    public int takesDrink(){
        return this.volume - 10;
    }
    public int emptyBottle(){
        return this.volume = 0;
    }
    public int fillBottle(){
        return this.volume = 100;
    }
}

