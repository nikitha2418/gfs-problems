class conbn
{
    public static void main(String[] args) 
    {
        int []arr={1,2,3,4};
        int n = arr.length;
        int new_arr[]=new int[2*n];
        for(int i =0;i<arr.length;i++)
        {
            new_arr[i]=arr[i];
            new_arr[i+n]=arr[i];
        }
        for(int i =0;i<new_arr.length;i++)
        {
            System.out.println(new_arr[i]);
        }
    }
}