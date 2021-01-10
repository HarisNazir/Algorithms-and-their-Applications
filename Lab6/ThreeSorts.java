import java.util.*;

public class ThreeSorts {
    public ArrayList<Integer> randomArray(int n){
        Random rand = new Random();
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int randomInt = rand.nextInt(256);
            arrList.add(randomInt);
        }

        return arrList;

    }

    public static void main(String[] args){
        int n = 5;
        ThreeSorts arrList = new ThreeSorts();

        ArrayList<Integer> arrayList = arrList.randomArray(n);

        System.out.println(arrayList);
    }
}
