import java.util.*;
class MinMax{

                public static void main(String[] args){

                        Scanner sc = new Scanner(System.in);
                        int size = sc.nextInt();
                        int arr[] = new int[size];

                        for(int i=0; i<size; i++){
                                arr[i] = sc.nextInt();
                        }
                        int maxElem = Integer.MIN_VALUE;
                        int minElem = Integer.MAX_VALUE;
                        for(int i=0; i<arr.length; i++){
                                if(maxElem < arr[i])
                                        maxElem = arr[i];

                                if(minElem > arr[i])
                                        minElem = arr[i];

                        }
                        System.out.println(maxElem);
                        System.out.println(minElem);

                }

}

