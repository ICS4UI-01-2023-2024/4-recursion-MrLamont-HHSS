public class Recursion {

    // recursive Fibonacci solution
    public int fib(int n){
        // base cases
        if(n == 0 || n == 1){
            return n;
        } 
        // recursive call
        return fib(n-1) + fib(n-2);
    }

    public int fibLoop(int n){
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;

        for(int i = 2; i <= n; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }

    public int tri(int n){
        if(n == 1){
            return 1;
        }
        return tri(n-1) + n;
    }

    public void printHello(int n){
        // if no more hellos to print
        if(n == 0){
            // the method does nothing!
            // return in void STOPS the method
            return;
        }
        System.out.println("Hello");
        // print hello 1 less time
        printHello(n - 1);
    }

    public int combo(String items, int numInGroup){
        if(numInGroup == 0){
            return 1;
        }else if(numInGroup > items.length()){
            // need more items than we have
            return 0;
        }else if(items.length() == 0){
            // can't make groups with no items
            return 0;
        }

        
        // remove the first item from the group
        char firstLetter = items.charAt(0);
        items = items.substring(1);
        // recursive calls
        int usingItem = combo(items, numInGroup - 1);
        int notUsingItem = combo(items, numInGroup);
        
        // return or final answer by adding both together
        return usingItem + notUsingItem;
    }
    

    public static void main(String[] args) {
        // object made to run your recursive methods  (test.______)
        Recursion test = new Recursion();
        

        // run your methods here using the test object
    
        System.out.println(test.combo("ABCDEF",3));
        
        

    }
    
}
