public class AbsHighestPair {
    public static void main(String[] args) {
        int tab[] = {2, -2, 4,-3, 5, 3,4,1,-1};
        int maxPair = 0;

        for(int i = 0; i < tab.length; i++){
            for (int j=0; j < tab.length; j++){
                if(tab[i] == -tab[j])
                   if(tab[i] > maxPair) maxPair = tab[i];
            }
        }
        System.out.println(maxPair != 0 ? "The pair of highest abs values is: " + maxPair + " and " + -maxPair : "There is no pair of abs numbers");
    }
}
