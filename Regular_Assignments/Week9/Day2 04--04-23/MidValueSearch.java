import java.util.*;
class MidValueSearch{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the key element to be found");
    int key = sc.nextInt();
    int low = 0;
    int high = a.length - 1;
    boolean isFound = false;
    while (low <= high) {
      int mid = (low + high) / 2;
      if (a[mid] == key) {
        isFound = true;
        System.out.println("Key element found at index " + mid);
        break;
      } else if (a[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
            }
        }

        if (!isFound) {
            System.out.println("Key element not found.");
        }
    }

  }
