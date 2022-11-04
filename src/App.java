public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Declare variables
       double[] arrayOfGPAs;
       boolean[] truthArray;
       String[] names;
       // initialize
       arrayOfGPAs = new double[5];
       truthArray = new boolean[5];
       names = new String[5];
        // access
       System.out.println(arrayOfGPAs[0]);
       System.out.println(names[0]);
       System.out.println(truthArray[0]);
        // syntactic sugar
       int[] intArray = {1,2,3,4,5,6};
       arrayOfGPAs[0] = 2.55;
       System.out.println(arrayOfGPAs[0]);
       System.out.println(intArray[1]);

       for(int i=0; i <= 5; i++) {
            System.out.println(intArray[i]);
       }
       for(int i: intArray) {
            System.out.println(i);
       }
       for(double d: arrayOfGPAs) {
            System.out.println(d);
       }

    }
}
