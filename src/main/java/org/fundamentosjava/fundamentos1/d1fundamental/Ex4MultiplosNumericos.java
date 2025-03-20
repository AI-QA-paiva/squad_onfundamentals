package org.fundamentosjava.fundamentos1.d1fundamental;

public class Ex4MultiplosNumericos {

    public static void main(String[] args){

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Múltiplo de 3 e também de 5.");
            } else if (i % 3 == 0) {
                System.out.println(i + " Múltiplo de 3.");
            } else if (i % 5 == 0) {
                System.out.println(i + " Múltiplo de 5.");
            }
        }
    }

}

/*caso queira que imprima toda a lista de 1 a 100
 basta acrescentar mais um else{} no final

 if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Múltiplo de 3 e também de 5.");
            } else if (i % 3 == 0) {
                System.out.println(i + " Múltiplo de 3.");
            } else if (i % 5 == 0) {
                System.out.println(i + " Múltiplo de 5.");
            } else {
                System.out.println(i);
            }

 */