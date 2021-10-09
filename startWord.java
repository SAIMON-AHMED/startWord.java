/*
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, 
except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
*/

public String startWord(String str, String word) {
  
  if (str.length() == 0) {
    return "";
  } else {
    String first = str.substring(1);
    String second = word.substring(1);
    
    if (str.startsWith(word)) {
      return str.substring(0, word.length());
    } else if (first.startsWith(second)) {
      return str.substring(0, word.length());
    }
  }
  return "";
}
