class CheckFirstUnique
{
  public static int findFirstUnique(int[] arr) 
  {
    HashMap<Integer,Integer> seen = new HashMap<>();
    for(int i : arr){
      int count = seen.getOrDefault(i,0);
      seen.put(i,count+1);
    }
    for(int i : arr){
      if(seen.get(i) == 1){
        return i;
      }
    }
    return -1;
  }
}
