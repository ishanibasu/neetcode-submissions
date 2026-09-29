class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1, cnt = 0;
        while(i <= j){
            if (people[j] > limit) j--;
            else if (people[i] > limit) i++;
            else if (people[i] + people[j] <= limit) {
                cnt++;
                i++;
                j--;
            }
            else if (people[i] == limit){
                cnt++;
                i++;
            }
            else if (people[j] == limit){
                cnt++;
                j--;
            }
            else{
                cnt++;
                j--;
            }
        }
        
        return cnt;
    }
}