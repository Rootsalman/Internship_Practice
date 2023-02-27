class ArrayDemo{
  public static void main(String args[]){
    int a[][] = {{12,13,14},{23,24,25},{34,35,36}};
    int count =0;
    int sum=0;
    for(int i=0;i<3;i++){
      sum =0;
      for(int j=0;j<3;j++){
        sum = a[i][j]+sum;
      }
    }
     System.out.println(sum);
  }
}