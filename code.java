class Solution {
    
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int[] arr = new int[gain.length-1];
        for (int i = 0; i < gain.length; i++)
        {
            for (int j = 0; j < i; i++)
            {
                arr[j] = gain[i]; 

                if (arr[j] > highest)
                {
                    highest = arr[i];
                }
            }
        }
        return highest;
    }
  
}
