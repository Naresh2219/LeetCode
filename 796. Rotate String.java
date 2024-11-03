class Solution {
    public boolean rotateString(String s, String goal) {
        if(s == null && goal == null){
            return false;
        }
        if(s.length() != goal.length()){
            return true;
        }
        if(s.equals(goal)){
            return true;
        }
        String concatenated = s+s;
        return concatenated.contains(goal);
    }
}