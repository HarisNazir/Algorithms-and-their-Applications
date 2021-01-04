import java.util.*;

public class Lab5{
    public static void main(String[] args) {
        Data x = new Data("Fred", 41);
       // x.Print();
    
        ArrayList<Data> ArrayA = new ArrayList<Data>();
        array.add("Fred", 21);
        array.add("Jo", 43);
        array.add("Zoe", 37);

        ArrayList<Data> ArrayB = new ArrayList<Data>();

        PrintCollection(ArrayA);
		System.out.println();
		ArrayB = ArrayA;
		PrintCollection(ArrayB);
		System.out.println();
		ArrayA.remove(1);
		PrintCollection(ArrayB);

    }
}
