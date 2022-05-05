package String;

import java.util.Arrays;

public class Change_character {
 public int solve(String A, int B) {
  int[] count = new int[26];

  for(int i=0;i<A.length();i++){
   int idx = A.charAt(i) - 'a';
   count[idx]++;

  }
  Arrays.sort(count);

  int distinct=0;
  for(int i=0;i<26;i++){
   if(count[i]>0){
    if((B-count[i])<0){
     distinct++;
    }else{
     B-=count[i];
    }
   }
  }
  return distinct;
 }
}
