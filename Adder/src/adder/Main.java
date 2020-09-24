package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide at least two integers to add");
        } catch (NumberFormatException e){
			System.err.println("Please enter integers only");
		}
    }

    private static int addArguments(String[] args) {
        int sum = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
		for(int i = 2;i<args.length;i++)
			sum+=Integer.parseInt(args[i]);
		return sum;
    }
}