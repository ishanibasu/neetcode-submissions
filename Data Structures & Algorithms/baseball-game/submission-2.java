class Solution {
    public int calPoints(String[] operations) {
        Deque <Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < operations.length; i++){
            if(operations[i].charAt(0) == 'C'){
                stack.pop();
            }
            else if(operations[i].charAt(0) == 'D'){
                int n = stack.pop();
                stack.push(n);
                stack.push(2 * n);
            }
            else if(operations[i].charAt(0) == '+'){
                int n1 = stack.pop();
                int n2 = stack.pop();
                stack.push(n2);
                stack.push(n1);
                stack.push(n1 + n2);
            }
            else
                stack.push(Integer.parseInt(operations[i]));
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}