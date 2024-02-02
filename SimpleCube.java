public class SimpleCube {

        public static int countOuterSubcubes(int N) {
            if (N < 2) {
                return 0;
            }
    
            int totalSubcubes = (int) Math.pow(N, 3);
            int interiorSubcubes = (int) Math.pow(N - 2, 3);
    
            int outerSubcubes = totalSubcubes - interiorSubcubes;
            return outerSubcubes;
        }
    
        public static void main(String[] args) {
            int N = 3; // replace with your desired cube size
            int result = countOuterSubcubes(N);
            System.out.println("The number of sub-cubes on the outside of a " + N + " x " + N + " x " + N + " cube is: " + result);
        }
    }
    
