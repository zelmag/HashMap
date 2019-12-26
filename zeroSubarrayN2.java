class CheckSubZero {

  public static boolean findSubZero(int[] arr) {
    for(int i = 0; i < arr.length; i++){
      int sum=0;
      for(int j = i; j < arr.length; j++){
        sum+=arr[j];
        if(sum == 0){
          return true;
        }
      }
    }
    return false;
  }
}
