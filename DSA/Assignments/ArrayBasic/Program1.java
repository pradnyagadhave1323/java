import java.util.*;
class SearchArray{

                public static void main(String[] args){

                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter element");
                        int element = sc.nextInt();
                        int size = sc.nextInt();
                        int arr[] = new int[size];

                        for(int i=0; i<size; i++){
                                arr[i] = sc.nextInt();
                        }
                        for(int i=0; i<arr.length; i++){

                                if(arr[i] == element)
                                        System.out.println(i);
                        }
                }

}

