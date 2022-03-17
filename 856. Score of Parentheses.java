  class Solution {
      private char[] arr;
      private int index;
      public int scoreOfParentheses(String S) {
          this.arr = S.toCharArray();
          if(arr.length == 0) return 0;
          return scoreOfParentheses(arr);
      }
      private int scoreOfParentheses(char[] arr){
          int score = 0;
          while(index < arr.length && arr[index] == '(' && arr[index + 1] == ')'){
              score += 1;
              index += 2;
          }
          if(index < arr.length){
              if(arr[index] == ')'){
                  index++;
                  return score;
              }else{
                  index++;    //remove left bracket
                  score += 2 * scoreOfParentheses(arr);
              }
          }
          if(index < arr.length) score += scoreOfParentheses(arr);
          return score;
      }
  }