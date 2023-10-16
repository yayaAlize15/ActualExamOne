public class Deciduous extends Tree{
    private int fallColorReds;
    private int fallColorBlues;

    public Evergeen(Strng leafShapes, int rings, String coneShapes){
        super(leafShapes, rings, "Decidious");
    }

    @Override
    public void fall(){
        this.fallColorReds += 100;
        this.fallColorBlues + 10;
        this.fallColorGreens -= 3; 
    }

    @Override
    public String toString(){
        return rings + " " + leafShapes + " " + fallColors;
    }

}