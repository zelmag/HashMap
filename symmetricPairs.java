class CheckSymmetric {

  // 1,2
  // 3,4
  // 5,9
  //4,3
  //9,5. 
  //output: 3,4 and 5,9 bc there's a 4,3 and a 9,5 later
  public static String findSymmetric(int[][] arr) {

    String result = "";
    HashMap<Integer,Integer> seen = new HashMap<>();
    for(int[] a : arr){
      int first = a[0];
      int sec = a[1];
      if(seen.containsKey(sec) && seen.get(sec).equals(first)){
        result+="{"+sec+","+first+"}";
      }else{
        seen.put(first,sec);
      }
    }  
    return result; 
  }
}
