class CheckDisjoint {

  public static Object isDisjoint(int[] arr1,int[] arr2) {
    HashSet<Integer> set1 = new HashSet<>();
    for(int i = 0; i < arr1.length; i++){
      set1.add(arr1[i]);
    }
    for(int i = 0; i < arr2.length; i++){
      if(set1.contains(arr2[i])){
        return false;
      }
    }
    return true;
  } 
}
