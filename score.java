class score {
    public int scoreOfString(String s) {
        int sum=0;
        int a=0;
        for(int i = 0;i<s.length()-1;i++)
        {
            a = Math.abs(s.charAt(i)-s.charAt(i+1));
            sum = sum+a;
        }
         return sum;
    }
}