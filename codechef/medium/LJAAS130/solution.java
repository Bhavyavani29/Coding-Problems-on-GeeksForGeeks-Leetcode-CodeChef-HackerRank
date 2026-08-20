class Codechef
{
	public static void main (String[] args) 
	{
		int[] values = {2, 10, 12, 6, 15};
        // Complete the code 
        for(int num : values){
            if(num > 10)
                continue;
            System.out.print(num * num + " ");
        }
    }
}