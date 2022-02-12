    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> dict = new HashSet<>(wordList);
            if(!dict.contains(endWord)) return 0;
            Set<String> head = new HashSet<>();
            Set<String> tail = new HashSet<>();
            head.add(beginWord);
            tail.add(endWord);
            int step = 0, len = endWord.length();
            while(!head.isEmpty() && !tail.isEmpty()){
                ++step;
                int headSize = head.size(), tailSize = tail.size();
                Set<String> temp = null;
                if(headSize > tailSize){
                    temp = head;
                    head = tail;
                    tail = temp;
                }
                Set<String> next = new HashSet<>();
                for(String s: head){
                    char[] arr = s.toCharArray();
                    for(int i = 0; i < len; i++){
                        for(char c = 'a'; c <= 'z'; c++){
                            arr[i] = c;
                            String newWord = new String(arr);
                            if(tail.contains(newWord)) return step + 1;
                            if(dict.contains(newWord)){
                                next.add(newWord);
                                dict.remove(newWord);
                            }
                        }
                        arr[i] = s.charAt(i);
                    }
                }
                head = next;
            }
            return 0;
        }
    }