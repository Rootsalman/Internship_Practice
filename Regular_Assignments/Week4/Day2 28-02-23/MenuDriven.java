import java.util.Scanner;
class MenuDriven{
  //insert from last
  static void insert(int n,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }
//insert new element into first postion
  static void insertAtFirst(int NewElement,int a[],int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("eneter the new elements :");
    NewElement =sc.nextInt();
    for(int i=n-1;i>=0;i--){
      a[i+1] =a[i];
    }
    a[0]=NewElement;
  }
  static void insertAtLast(int NewElement,int a[],int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("eneter the new elements :");
    NewElement =sc.nextInt();
    for(int i=n-1;i>=n;i--){
      a[i+1]=a[i];
    }
    a[n]=NewElement;
   }
  static void insertAtSpecific(int NewElement,int a[],int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the new element");
    NewElement = sc.nextInt();
    System.out.println("Enter the index position you want to insert");
    int p =sc.nextInt();
    for(int i=n-1;i>=p;i--){
      a[i+1]=a[i];
    }
    a[p]=NewElement;
    }
  static void DeleteAtFirst(int a[],int n){
    for(int i=1;i<n;i++)
    {
      a[i-1]=a[i];
    }
  }
  static void DeleteAtLast(int a[],int n){
     a[n-1]=0;
  }
  static void DeleteAtSpecific(int a[],int n){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter index position");
    int pos = sc.nextInt();
    for(int i=pos+1;i<n;i++){
      a[i-1]=a[i];
    }
  }
   static void Elementsearch(int a[],int e,int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Element to search");
    e=sc.nextInt();
    int p=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==e)
      {
        System.out.println("FOUND "+e+" at"+i+" index");
        p=i;
      }
    }
    if(a[p] != e)
        System.out.println("Not Found");
  }
    static void FindFrequency(int a[], int n){
    boolean visited[] = new boolean[n];
    System.out.println("Value Frequency");
    for(int i=0;i<n;i++)
    {
      if (visited[i] == true)
        continue;
      int p=1;
      for(int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) 
        {
          visited[j] = true;
          p++;
        }
      }
      System.out.println(a[i] + "       " + p);
    }
  }


    
    
  static void display(int a[],int n){
    for(int i=0;i<n;i++){
      System.out.println("a["+i+"]="+a[i]);
    }
  }
 
  // static void insertAtLast(int n,int newElement,int arr[]){
  //   arr[n]=newElement;
  // }
  // static void display(int arr[],int n){
  //   for(int i=0;i<n;i++){
  //     System.out.println(arr[i]);
  //   }
  // }

 
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a[]=new int[50];
    int NewElement=0;
      char c='y';
    int e=0;
    int p=0;
    int choice;
    System.out.println("enter size of array");
    int n=sc.nextInt();
    do{
    System.out.println("chosse the below option");
    System.out.println("1 Insertion\n2 Insert at first\n3 Insert at last\n4 Insert at specific\n5 delete at first\n6 delete at last\n7delete at specific\n8Search for element\n9 Frequency of each element\n10 Exit");
       System.out.println("enter your choice");
    choice = sc.nextInt();
    switch(choice){
      case 1:
        insert(n, a);
        System.out.println("the array elements are :");
        display(a,n);
        break;
      case 2:
        insertAtFirst(NewElement,a,n);
        display(a,n+1);
        break;
      case 3:
        insertAtLast(NewElement,a,n);
        display(a,n+1);
        break;
      case 4:
        insertAtSpecific(NewElement,a,n);
          display(a,n+1);
        break;
      case 5:
        DeleteAtFirst(a,n);
        display(a,n-1);
        break;
      case 6:
        DeleteAtLast(a,n);
        display(a,n);
        break;
      case 7:
        DeleteAtSpecific(a,n);
        display(a,n);
      case 8:
        Elementsearch(a,e,n);
        display(a,n);
      case 9:
        FindFrequency(a,n);
        display(a,n);
      case 10:
        exit();
    }
    System.out.println("Do you want to continue :");
    c = sc.next().charAt(0);
    }while(c!='n');
    
  }
}