package homework;

public class Home2 {

    public static void main(String[] arge) {
        //Задание №1
        //int[] atr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        // System.out.println("atr.length" + atr.length);
        // for (int i = 0; i < atr.length; i++) {
        //    System.out.println(i + "-" + atr[i] + "");


        //  }System.out.println("--------------------");
        //for (int i =0; i < atr.length ; i++)
        // if (atr[i]==1){
        //       atr[i]=0;


        //   } else atr[i]=1;
        //    for (int  i =0; i < maxAtr ; i++) {
        //        System.out.println(i + "-" + atr[i] + "");
        // }

// Задание 2
        //   int[] core = new int[8];
        //   int j = 1;
        //   int maxCore = core.length;
        //   for (int i = 0; i < maxCore; i++) {

        //   }
        //   System.out.println(" ");
        //  for (int i = 0; i < maxCore; i++, j = j + 3) {
        //      core[i] = j;
        //  }

        //  for (int i = 0; i < maxCore; i++) {
        //      System.out.print(i + "-" + core[i] + " ");
        //  }


//Задание 3
        //  int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //  System.out.println("arr.length:" + arr.length);
        //  for (int i = 0; i < arr.length; i++) {
        //      if (arr[i] < 6) arr[i] = arr[i] * 2;
        //  }
        //  for (int i = 0; i <arr.length; i++) {
        //      System.out.println(i + "-" + arr[i] + "");
        //  }

        //Задание 4

        // int[] pupa = {7, 10, 12, 4, 11, 24, 3, 13, 27, 17,1};
        //  System.out.println("pupa.length:" + pupa.length);
        //  int min = pupa[0], max = pupa[0], indMax = 0, indMin = 0;
        //  for (int i=0; i<pupa.length; i++) {
        //      if (pupa[i]>max){
        //          max=pupa[i];
        //          indMax=i;
        //      }
        //     if (pupa[i]<min);
        //    min=pupa[i];
        //    indMin=i;

        //}
        //System.out.println("Максимальный элимент=" + max);
        //System.out.println("Минамальный элимент=" + min);

        // Задание 5
        int couter = 5;
        int[][] live = new int[couter][couter];
        System.out.println("live.length:" + live.length);
        for (int i = 0; i < live.length; i++) {
            for (int j = 0; j < live.length; j++) {
                if (i == j) {
                    live[i][j] = 1;
                } else if (j+1==couter-i) {
                    live[i][j] = 1;
                } else {
                    live[i][j] = j+5;
                }
                System.out.print(live[i][j] + "");
            }
            System.out.println();
        }
    }
}








