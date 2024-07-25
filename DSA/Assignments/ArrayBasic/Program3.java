import java.util.*;
class LargestElem{

                public static void main(String[] args){

                        Scanner sc = new Scanner(System.in);
                        int size = sc.nextInt();
                        int arr[] = new int[size];

                        for(int i=0; i<size; i++){
                                arr[i] = sc.nextInt();
                        }

                        int maxElem = Integer.MIN_VALUE;
                        for(int i=0; i<arr.length; i++){
                                if(maxElem < arr[i])
                                        maxElem = arr[i];
                        }

                        System.out.println("Largest Element is "+ maxElem);
                }
}

