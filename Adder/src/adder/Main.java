package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide at least two integers to add");
        }
    }

    private static int addArguments(String[] args) {
		int sign = 0;
		int index = 0;
		if(args[0]=="-")
		{
			sign = 1;
			index = 1;
		}
		for(int i=2;i<args.length;i++){
			if(sign==0)
				sum+=Integer.valueOf(args[i]);
			if(sign==1)
				sum-=Integer.valueOf(args[i]);
		}
		return sum;
		
    }
}