/*
MIT License
Copyright (c) 2023 Christian Hur

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

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
