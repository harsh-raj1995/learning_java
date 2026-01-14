public class sum_array {
    public static void main(String[] args) {
        int[] a=new int[5];
        for(int i =0;i<5;i++){
            a[i]=i*10+5;
        }
        int sum=0;
        for(int i=0;i<5;i++){
            sum+=a[i];
        }
        int avg= sum/a.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
        // Print elements of the array
        System.out.println("Array elements:");
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
        //hi
    }
}