class CheckPath {

  /* map = 
{
    "NewYork" -> "Chicago"
    "Boston" -> "Texas"
    "Missouri" -> "NewYork"
    "Texas" -> "Missouri"
}
    key -> value 
    
    output: "Boston->Texas , Texas->Missouri , Missouri->NewYork , NewYork->Chicago, " */
  public static String tracePath(Map<String,String> map) {

    String result = "";
    String start = "";
    for(String s : map.keySet()){
      if(!map.containsValue(s)){
        start = s;
        break;
      }
    }
    while(!start.equals("")){
      if(map.containsKey(start)){
        result+=start+"->"+map.get(start)+", ";
      }
      start = map.getOrDefault(start,"");
    }

    // Write - Your - Code        
    return result; 
  }
}
