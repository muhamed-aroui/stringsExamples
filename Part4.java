
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
public class Part4 {
    public void findYoutube(String url){
        String result="";
 URLResource ur = new URLResource(url);
 for (String s : ur.words()) {
     String t = s.toLowerCase();
     //For each word, check to see if “youtube.com” is in it. 
     int indx = t.indexOf("youtube.com");
     //If it is, find the double quote to the left and right of the occurrence of “youtube.com” to identify the beginning and end of the URL.
     if(indx!=-1){
     int stopIndex = s.lastIndexOf("\""); 
     int startIndex = s.lastIndexOf("\"",indx);
     result= s.substring(startIndex,stopIndex+1);
     System.out.printf(result+"\n");}
     
     }
     }
      void testing(){
          String test = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
          findYoutube(test);
        }
}
