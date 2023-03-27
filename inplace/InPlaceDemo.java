package hur.christian;

public class InPlaceDemo {
    public static void main(String[] args) {
        Integer[] n = {10,20,30,40,50};
        String[] str = {"Ate","Bat","Chip","Drink","Eating"};

        /** Uncomment to run tests  **/
        // print(n);
        // inplaceTemp(n);
        // inplaceXOR(n);
        // inplaceAddSub(n);
        // print(n);

        // print(str);
        // inplaceTemp(str);
        // print(str);
    }

    /**
     * In-place algorithm using string concatenation and substring operations
     * @param str the array of strings
     */
    static void inplaceStr(String[] str){
        for(int i=0; i < str.length/2; i++){
            str[i] = str[i] + str[str.length-1-i];  //AteEating
            str[str.length-1-i] = str[i].substring(0, str[i].length() - str[str.length-1-i].length());  //Ate
            str[i] = str[i].substring(str[str.length-1-i].length());  //Eating
        }
    }

    /**
     * In-place algorithm using + and - operators
     * @param n the array of integers
     */
    static void inplaceAddSub(Integer[] n){
        for (int i=0; i < n.length/2; i++){
            n[i] = n[i] + n[n.length-1-i];
            n[n.length-1-i] = n[i] - n[n.length-1-i];
            n[i] = n[i] - n[n.length-1-i];
        }
    }

    /**
     * In-place algorithm using XOR
     * @param n the array of integers
     */
    static void inplaceXOR(Integer[] n){
        for(int i=0; i < n.length/2; i++){
            n[i] = n[i] ^ n[n.length-1-i];
            n[n.length-1-i] = n[i] ^ n[n.length-1-i];
            n[i] = n[i] ^ n[n.length-1-i];
        }
    }

    /**
     * //In-place using a temp variable
     * @param n the array of integers
     */
    static void inplaceTemp(Object[] n){
        for(int i=0; i < n.length/2; i++){
            Object temp = n[i];
            n[i] = n[ n.length-1-i];
            n[ n.length-1-i] = temp;
        }
    }

    static void print(Object[] obj){
        for(Object n: obj){
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
