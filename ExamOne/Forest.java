/*
INSTRUCTIONS: 
1. Create a class Tree with good OOP 
2. Implement the Comparable interface to allow trees to be sorted by rings
3. Extend the Tree class into a Deciduous class and an Evergeen class. See the comments next to the fields below for which class should have which fields.
4. Complete the toString method to print out the type of each object, along with all its fields
5. Implement good OOP practices as discussed in class (as best as you can while passing the unit tests)
6. Keep track of the number of Evergreen trees in the forest without relying on a separate method
7. Compile against and pass all the tests (your solution no longer needs to work with the Forest code below)

RULES:

This exam is open-book, open note, open internet with the following exceptions (that are honor code violations):
1. All work submitted must be your own
2. You may not share your solutions with others
3. You may not ask any other party to help you with any part of this assignment
4. You should only be googling syntax errors; you should not be googling for help with writing your code/design/solution/algorithm.
5. You should never be copying any code from any website (except the course webpages)

*/

public class Forest {

	String[] leafShapes; //all trees have a leaf shape
	int[] rings; //all trees have some number of rings in their trunk
	String[] coneShapes; //only evergreen trees will have pinecones
	int[] fallColorReds; //only deciduous trees will change red fall leaf color; here we store the red RGB values
	int[] fallColorGreens; //here we store the green RGB values that can change over seasons
	int[] fallColorBlues; //only deciduous trees will change blue fall leaf color; here we store the blue RGB values
	String[] types; //each tree will either be deciduous or evergreen

	public void fall(){
		for(int i = 0; i < fallColorGreens.length; i++){
			if (types[i].equals("deciduous")){
				fallColorReds[i] += 100;
				fallColorBlues[i] += 10;
				fallColorGreens[i] -= 3;
			}
			else if (types[i].equals("evergreen"))
				fallColorGreens[i] -= 3; // always same as for deciduous
		}
	}

	public void grow(int years){
		for(int i = 0; i < rings.length; i++)
			rings[i] += years;
	}


	public String roster(){
		String result = "Here are all the trees in the forest: ";
		for(int i = 0; i < types.length; i++)
			result += types[i] + "\n";
		result += "There are " + types.length + " trees total.\n";
		return result;
	}

}