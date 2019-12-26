//find two pairs in an array such that a+b = c+d
class CheckPair {

  public static String findPair(int[] arr) {
    HashMap<Integer,Integer> seen = new HashMap<>(); //sum, one of values
    String result = "";
    for(int i = 0; i < arr.length; i++){
      for(int j = i+1; j < arr.length; j++){
        int sum = arr[i] + arr[j];
        if(!seen.containsKey(sum)){
          seen.put(sum,arr[i]);
        }else{
          result+="{"+seen.get(sum)+","+(sum - seen.get(sum))+"}";
          result+="{"+arr[i]+","+arr[j]+"}";
          return result;
        }
      }
    }
    // Write - Your - Code   
    return result; 
  }
}
