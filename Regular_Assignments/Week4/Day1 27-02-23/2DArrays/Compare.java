public class Compare{  
public static void main(String args[]){  
   
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
if(a[i][j]=b[i][j]){
  System.out.println("matrix is equal");
}  
  else{
    System.out.println("Matrix not equal");
  }
}    
}    
}
} 