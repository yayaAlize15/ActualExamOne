public abstract class Tree{
    protected String leafShapes;
    protected int rings;
    protected String type;
    

    public Tree(Strng leafShapes, int rings, String type){
        this.leafShapes = leafShapes;
        this.rings = rings;
        this.type = type;
    }

    public int getRings(){
        return rings;
    }

    public int compareTo(Tree other){
        if(other == null){
            return -2;
        }
        return Integer.compare(this.rings, other.rings);
    }

    public int compareTo(Object o){
        if(o instanceof String){
            return -2;
        }else if(o instanceof Tree){
            Tree other = (Tree) o;
            return Integer.compare(this.rings, other.rings);
        }
        return 0;
    }

    public abstract void fall();

    public void grow(int years){
        this.rings += years;
    }

    public String toString(){
        return type + " " + leafShapes;
    }
}