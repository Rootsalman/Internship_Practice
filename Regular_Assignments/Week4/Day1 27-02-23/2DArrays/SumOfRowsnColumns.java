public class SumOfRowsnColumns{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
int sumrow=0,sumcol=0;
    
  
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
sumrow=sumrow+a[i][j]+b[i][j]; 
sumcol=sumcol+a[j][i]+b[j][i]; 
}   

}
  System.out.println("sum of rows"+sumrow); 
  System.out.println("sum of coloumns"+sumcol); 
}
} 