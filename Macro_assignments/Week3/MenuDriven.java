import java.util.Scanner;

class MenuDriven {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int choice;
    System.out.println(
        "enter the choice \n1.insert operation in first index\n2.insert operation at last index\n3.insert elemnt in specified index\n4.Remove element from specified index\n5.remove element from frst index\n6.remove element from last index\n7.Ascending order\n8.descending order\n9.Remove user eneted element");
    System.out.println("-------------------------\n");
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("insert operation in first index\n");
        System.out.println("enter the number of array");
        int n = sc.nextInt();
        System.out.println("enter array elements  ");
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
          arr[i] = sc.nextInt();
        }
        int pos = 1, newValue = 100;
        for (int j = (n - 1); j >= (pos - 1); j--) {
          arr[j + 1] = arr[j];
        }
        arr[pos - 1] = newValue;
        System.out.println("array after insert operation");
        for (int i = 0; i < arr.length; i++) {
          System.out.println("arr[" + i + "]=" + arr[i]);
        }
        break;
      case 2:
        System.out.println("insert operation in last index\n");
        System.out.println("Enter the  size of array  :");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements in array");
        for (int j = 0; j < n; j++) {
          a[j] = sc.nextInt();
        }
        int newValue2 = 20;
        a[n - 1] = newValue2;
        System.out.println("after insertion");
        for (int j = 0; j < a.length; j++) {
          System.out.println("a[" + j + "]=" + a[j]);
        }
        break;
      case 3:
        System.out.println("insert operation in specified index\n");
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int a3[] = new int[n + 1];
        System.out.println("Enter the array elements elements:");
        for (int i = 0; i < n; i++) {
          a3[i] = sc.nextInt();
        }
        System.out.println("Enter the position  to insert element:");
        pos = sc.nextInt();
        System.out.println("Enter the element you want to insert:");
        int x = sc.nextInt();
        for (int i = (n - 1); i >= (pos - 1); i--) {
          a3[i + 1] = a3[i];
        }
        a3[pos - 1] = x;
        System.out.println("After inserting:");
        for (int i = 0; i < n; i++) {
          System.out.println(a3[i] + " ");
        }
        System.out.println(a3[n]);
        break;

      case 4:
        System.out.println("Remove element from specified index\n");
        int n4, i;
        System.out.println("Enter the num of array:");
        n4 = sc.nextInt();
        System.out.println("Enter the elements of array :");
        int a4[] = new int[n4];
        for (int j = 0; j < n4; j++) {
          a4[j] = sc.nextInt();
        }
        System.out.println("Enter the position of index you want to delete :");
        int pos4 = sc.nextInt();
        for (i = pos4 + 1; i < n4; i++) {// i=4 4>1
          a4[i - 1] = a4[i];
        }
        System.out.println("after deletion");
        for (int j = 0; j < n4 - 1; j++) {
          System.out.println("a[" + j + "]=" + a4[j]);
        }
        break;

      case 5:
        System.out.println("remove element from first index\n");
        System.out.println("enter num of elemnets");
        int n5 = sc.nextInt();
        int arr5[] = new int[n5];
        System.out.println("enter elemnets");
        for (i = 0; i < n5; i++) {
          arr5[i] = sc.nextInt();
        }
        int pos5 = 1;
        for (int j = pos5 - 1; j < n5 - 1; j++) {
          arr5[j] = arr5[j + 1];
        }
        arr5[n5 - 1] = 0;
        System.out.println("after deleting first index");
        System.out.println("*****");
        for (i = 0; i < arr5.length; i++) {
          System.out.println(arr5[i]);
        }
        break;
      case 6:
        System.out.println("remove element from last index\n");
        System.out.println("enter num of elemnets");
        int n6 = sc.nextInt();
        int arr6[] = new int[n6];
        System.out.println("enter elemnets");
        for (i = 0; i < n6; i++) {
          arr6[i] = sc.nextInt();
        }
        int pos6 = n6;
        arr6[pos6 - 1] = 0;
        System.out.println("after deleting first index");
        System.out.println("*****");
        for (i = 0; i < arr6.length; i++) {
          System.out.println(arr6[i]);
        }
        break;
        
      case 7:
        System.out.println("ASCENDING ORDER: ");
        System.out.println("enter the size of array: ");
        int n7=sc.nextInt();
        int [] arr7 = new int [n7];     
        int temp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (i = 0; i < arr7.length; i++) {     
            // System.out.print(arr7[i] + " ");    
          arr7[i]=sc.nextInt();
        }    
            
        //Sort the array in ascending order    
        for (i = 0; i < arr7.length; i++) {     
            for (int j = i+1; j < arr7.length; j++) {     
               if(arr7[i] > arr7[j]) {    
                   temp = arr7[i];    
                   arr7[i] = arr7[j];    
                   arr7[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (i = 0; i < arr7.length; i++) {     
            System.out.print(arr7[i] + " ");    
        }
        break;

      case 8:
        System.out.println("DECENDING ORDER: ");
        int [] arr8 = new int [] {5, 2, 8, 7, 1};     
        int tempp = 0;    
            
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for ( i = 0; i < arr8.length; i++) {     
            System.out.print(arr8[i] + " ");    
        }    
            
        //Sort the array in descending order    
        for ( i = 0; i < arr8.length; i++) {     
            for (int j = i+1; j < arr8.length; j++) {     
               if(arr8[i] < arr8[j]) {    
                   tempp = arr8[i];    
                   arr8[i] = arr8[j];    
                   arr8[j] = tempp;    
               }     
            }     
        }
        break;
      default:
        System.out.println("wrong choice");
    }
  }
}