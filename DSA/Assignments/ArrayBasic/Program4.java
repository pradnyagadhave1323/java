class Product{

        public static void main(String[] args){

                int arr[] = new int[]{1,2,3,4};
                int product = 1;
                int i=0;
                int j=arr.length-1;
                while(i<j){
                        product = product*arr[i]*arr[j];
                        i++;
                        j--;
                }
                if(i == j)
                        product = product*arr[i];
                System.out.println(product);
        }
}
