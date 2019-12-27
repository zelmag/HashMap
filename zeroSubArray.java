//return true if there is a subarray that sum to 0
class CheckSubZero {

  public static boolean findSubZero(int[] arr) {
    HashSet<Integer> seenSum = new HashSet<>();
    int sum = 0;
    for(int i : arr){
      sum+=i;
      if(seenSum.contains(sum) || sum == 0){
        return true;
      }
      seenSum.add(sum);
    }
    return false;
  }
}
