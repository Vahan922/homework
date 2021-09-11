package LESSON5;

public class CLASROOM {
    public static void main(String[] args) {
//        // TYPE arr[];
//        long arr[] = new long[3];
//        arr[0] = 1l;
//        arr[1] = 3l;
//        arr[3] = 9l;
//        for (int i = 0 ;i < 3; i++ ) {
//            System.out.println(arr[i]);

//for (long elem:arr){



        int tnayin[] = new int[10];
        for (int i =0;i< tnayin.length;i++){
            tnayin[i] = (int)(Math.random()*1000);
        }
//        tnayin[0] = 3;
//        tnayin[1] = 9;
//        tnayin[2] = 25;
//        tnayin[3] = 30;
//        tnayin[4] = 4;
//        tnayin[5] = 6;
//        tnayin[6] = 34;
//        tnayin[7] = 111;
//        tnayin[8] = 247;
//        tnayin[9] = 11;

        int max = tnayin[0];
        for (int i = 0; i < tnayin.length; i++) {
            System.out.println(tnayin[i]);

            if (tnayin[i] > max)
            max = tnayin[i];
        }
        System.out.println(max);

        int newArray[]= {20,14,25,36,47,58,2,3};

        int matrix[][]=new  int[2][];
        matrix[0] = new int[1];
        matrix[0][0]= 3;
        matrix[1] = new int[2];
        matrix[1][0]= 4;
        matrix[1][1]= 5;


    }

}






