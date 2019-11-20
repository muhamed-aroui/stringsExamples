
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public String  lastPart(String stringa,String stringb){
        int leng=stringa.length();
        int startIndex= stringb.indexOf(stringa);
        if(startIndex==-1){return stringb;}
        String result = stringb.substring(startIndex+leng);
        
        return result;}
    public String twoOccurrences(String stringa,String stringb){
    int count = stringb.length() - stringb.replace(stringa, "").length();
    if (count>1){
    return "true";}
    else{return "false";}
  }
  void tessting(){
    String result = twoOccurrences("by","A Story by Abby Long");
    System.out.printf("%n"+result);
    result = twoOccurrences("a","bananna");
    System.out.printf("%n"+result);
    result = twoOccurrences("S","A Story by Abby Long");
    System.out.printf("%n"+result);
    result = twoOccurrences("see","over sees you call it seemse?");
    System.out.printf("%n"+result);
    
}
void lastPart(){
         String result = lastPart("an","banana");
         System.out.printf("%n"+result);
         result = lastPart("zoo","forest");
         System.out.printf("%n"+result);
         result = lastPart("by","Aabby is a real story");
         System.out.printf("%n"+result);
         result = lastPart("S","Study");
         System.out.printf("%n"+result);
    }
  
}

