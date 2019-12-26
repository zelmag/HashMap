class CheckSubset {
  public static boolean isSubset(int[] arr1, int[] arr2) {
   HashSet<Integer> set1 = new HashSet<>(); //the longer set
   for(int i = 0; i < arr1.length; i++){
     set1.add(arr1[i]);
   }
   //loop thru "subset" and make sure all of it is in bigger set
   for(int i = 0; i < arr2.length; i++ ){
     if(!set1.contains(arr2[i])){
       return false;
     }
   }
   return true;
  }
}
