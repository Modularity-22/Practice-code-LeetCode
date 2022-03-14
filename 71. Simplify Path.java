class Solution {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0) return "/";
        LinkedList<String> stack = new LinkedList<>();
        String[] tokens = path.split("/");
        for(String token : tokens){
            if(token.length() > 0){
                if(token.equals(".")) continue;
                else if(token.equals("..")){
                    if(!stack.isEmpty()) stack.pollLast();
                }else{
                    stack.add(token);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
            sb.append("/");
            sb.append(stack.pollFirst());
        }
        return sb.toString();
    }
}