class DivisibleBy5{
  public static void main(String args[]){
    int a[][] = {{12,13,14},{23,24,25},{34,35,36}};
    for(int i=0;i<3;i++){
      int count =0;
      for(int j=0;j<3;j++){
        if(a[i][j]%5==0){
        count++;
        }
      }
      System.out.println(count);
    }
  }
}