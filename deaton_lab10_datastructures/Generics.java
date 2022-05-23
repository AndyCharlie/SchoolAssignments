/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deaton_lab10_datastructures;

/**
 *
 * @author Adeat
 */
public class Generics {
    
    public static <S,T> void most(S[] sa, S st, T[] ta, T tt){
	int counter1 = 0;
	int counter2 = 0;
        for(int i=0;i<sa.length;i++ ) {
            if (sa[i]==st) {
		counter1++;
            }
	}
	for (int i=0; i<ta.length;i++) {
            if(ta[i]==tt) {
                counter2++;
            }
        }
	if (counter1 > counter2 ) {
            System.out.println("st is more often in sa \n");
        }
	else if (counter1==counter2) {
            System.out.print("Occourances are equal");
        }
	else {
            System.out.println("tt is more often in ta \n");
        }
    }
}
