public class UniqueElmnt
{
    public static void main(String args[])
    {
        int[] arr = new int[]{1,2,3,4,3,4,5,6,2,22,1};
        System.out.println("The duplicate elements in the array :");
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i] != arr[j])
                {
                System.out.println(arr[j]);
                }
            }
        }
    }
}