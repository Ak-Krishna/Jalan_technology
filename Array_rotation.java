import java.util.Scanner;

//Time complexity=O(n)
//space Complexity=O(n)

class Rotation{
    public void rotate(int arr[],int p,int d,int n){
//        printing array
        int left=1;
        int right=0;
        int temp[]=new int[n];
//        tracing the position of temp array
        int k=0;
//        if the given direction is left then the element shift left by given positon
        if (d==left){
            for (int i=p;i<n;i++){
                temp[k]=arr[i];
                k++;
            }
//            Storing the remaining elements of array
            for (int i=0;i<p;i++){
                temp[k]=arr[i];
                k++;
            }
//            printing the element of temp array
            for (int i=0; i<n;i++){
                System.out.print(temp[i]+" ");
            }
        }
        else if (d==right){
            System.out.println("The given array will print same as user had given");
            for (int i=0; i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else {
            System.out.println("The given position is not specified");
        }
    }

}

class Array_rotation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int n= sc.nextInt();;
        System.out.print("Enter the direction of array '1 for left and 0 for right :");
        int d=sc.nextInt();
        System.out.print("Enter the position of element :");
        int p=sc.nextInt();
        int[] Arr=new int[n];
//        adding elements inn array
        for (int i=0;i<n;i++){
            System.out.println("Enter the "+ (i+1) +" element");
            Arr[i]=sc.nextInt();
        }
//        initialized object
        Rotation obj=new Rotation();
        obj.rotate(Arr,p,d,n);

    }
}