public class Evergreen extends Tree{
    private String coneShapes;
    private int fallColorGreens;
    protected static int numEvergreen = 0;

    public Evergeen(Strng leafShapes, int rings, String coneShapes){
        super(leafShapes, rings, "Evergreen");
        this.coneShapes = coneShapes;
        numEvergreen++;
    }

    public int getConeShape(){
        return coneShapes;
    }

    @Override
    public void fall(){
        this.fallColorGreens -= 3;
    }

    @Override
    public String toString(){
        return rings + " " + leafShapes + " " + fallColors;
    }

}