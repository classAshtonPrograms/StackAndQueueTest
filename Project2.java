/** This is for the cs1400 Project2
 */

public class Project2{
    public static void main(String[] args){
        testArrayStack();
        testArrayQueue();
    }

    /** This will test the functionality of every method of ArrayStack.
     * The push and isEmpty methods will each be tested twice.
     * This is to make sure isEmpty performs both of it's functions.
     */
    public static void testArrayStack() {
        ArrayStack driverArrayStack = new ArrayStack();
        firstPush(driverArrayStack);
        secondPush(driverArrayStack);
        testPeek(driverArrayStack);
        testPop(driverArrayStack);
        testNotEmpty(driverArrayStack);
        testClear(driverArrayStack);
        testIsEmpty(driverArrayStack);
    }

    /** This will test the functionality of every method of the ArrayQueue.
     * The enqueue and isEmpty methods will each be tested twice.
     * This is to make sure isEmpty performs both of it's functions.
     */
    public static void testArrayQueue() {
        ResizableArrayQueue driverArrayQueue = new ResizableArrayQueue();
        testFirstEnqueue(driverArrayQueue);
        testSecondEnqueue(driverArrayQueue);
        testGetFront(driverArrayQueue);
        testDequeue(driverArrayQueue);
        testNotEmpty(driverArrayQueue);
        testClear(driverArrayQueue);
        testIsEmpty(driverArrayQueue);
    }

    /** Adds an entry to the ArrayStack.
     * @param driverArrayStack  An ArrayStack to take on a new int.
     */
    public static void firstPush(ArrayStack driverArrayStack) {
        String methodDescription = "'A' is to be placed as an entry in an ArrayStack with the push method.";
        String passStatement = "An isEmpty call will later determine if this push passed.\n";

        System.out.println(methodDescription);
        driverArrayStack.push('A');
        System.out.println(passStatement);
    }

    /** Tests the isEmpty method of an ArrayStack.
     * States isEmpty passed if a value is there.
     * @param driverArrayStack  An ArrayStack will test it's isEmpty method.
     */
    public static void testNotEmpty(ArrayStack driverArrayStack) {
        String methodDescription = "An ArrayStack will be determined if it still holds variables with the isEmpty method.";
        String passStatement = "The isEmpty method passed, the first push was successful.\n";
        String failStatement = "The isEmpty method failed, the first push was unsuccessful.\n";

        System.out.println(methodDescription);

        if(!(driverArrayStack.isEmpty())){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }

    /** Adds a value to top of the ArrayStack. 
     * @param driverArrayStack  An ArrayStack to take on a new int.
     */
    public static void secondPush(ArrayStack driverArrayStack) {
        String methodDescription = "'a' is to be placed as the top entry in an ArrayStack with the push method.";
        String passStatement = "A peek call will later determine if this push passed.\n";

        System.out.println(methodDescription);
        driverArrayStack.push('a');
        System.out.println(passStatement);
    }

    /** Tests the peek method of an ArrayStack.
     * States the peek passed if the correct value is found.
     * @param driverArrayStack  To be tested.
     */
    public static void testPeek(ArrayStack driverArrayStack) {
        String methodDescription = "The top variable of an ArrayStack will be viewed with the peek method.";
        String passStatement = "20 was found so the peek passed. The second push was successful.\n";
        String failStatement = "20 was not found so the peek failed. The second push was not successful.\n";
        
        System.out.println(methodDescription);

        if(driverArrayStack.peek() == 'a'){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }

    /** Tests the pop method of an ArrayStack.
     * States the pop passed if the correct value was removed and returned.
     * @param driverArrayStack  To be tested.
     */
    public static void testPop(ArrayStack driverArrayStack) {
        String methodDescription = "The top variable of an ArrayStack will be removed with the pop method.";
        String passStatement = "The pop passed.\n";
        String failStatement = "The pop failed.\n";

        System.out.println(methodDescription);

        if(driverArrayStack.pop() == 'a'){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }

    /** Clears the contents of an ArrayStack.
     * The isEmpty test will later determine if clear passed.
     * @param driverArrayStack  To be cleared.
     */
    public static void testClear(ArrayStack driverArrayStack) {
        String methodDescription = "An ArrayStack will be cleared of all variables with the clear method.";
        String passStatement = "An isEmpty method call will later determine if the clear was successful.\n";

        System.out.println(methodDescription);

        driverArrayStack.clear();
        System.out.println(passStatement);
    }

    /** Tests the isEmpty method of an ArrayStack.
     * States isEmpty passed if the contents successfully cleared.
     * @param driverArrayStack  To be tested.
     */
    public static void testIsEmpty(ArrayStack driverArrayStack) {
        String methodDescription = "The ArrayStack will be checked to see if it's now empty with the isEmpty method.";
        String passStatement = "The isEmpty method passed, clear was successful.\n";
        String failStatement = "The isEmpty method failed, clear was unsuccessful.\n";

        System.out.println(methodDescription);

        if(driverArrayStack.isEmpty()){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }


    /** Enqueues an int to an ResizableArrayQueue.
     * @param driverResizableArrayQueue  To take on a new int.
     */
    public static void testFirstEnqueue(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "10 is to be placed at the front of an ArrayQueue with the enqueue method.";
        String passStatement = "A getFront method call will later determine if this enqueue passed.\n";

        System.out.println(methodDescription);
        driverArrayQueue.enqueue(10);
        System.out.println(passStatement);
    }

    /** Enqueues an int to the front of an ArrayQueue.
     * @param driverArrayQueue  To take on a new int.
     */
    public static void testSecondEnqueue(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "20 is to be placed at the end of an ArrayQueue with the enqueue method.";
        String passStatement = "An isEmpty method call will later determine if this enqueue passed.\n";

        System.out.println(methodDescription);
        driverArrayQueue.enqueue(20);
        System.out.println(passStatement);
    }

    /** Tests the getFront method of an ArrayQueue.
     * States the getFront passed if the correct value was found.
     * @param driverArrayQueue  To be tested.
     */
    public static void testGetFront(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "The front variable of an ArrayQueue will be viewed with the getFront method.";
        String passStatement = "10 was returned so the getFront passed. The first enqueue was successful.\n";
        String failStatement = "10 was not returned so the getFront failed. The first enqueue failed.\n";
        
        System.out.println(methodDescription);

        if(driverArrayQueue.getFront() == 10){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }

    /** Tests the dequeue method of an ArrayQueue.
     * States the dequeue passed if the correct value was removed and returned.
     * @param driverArrayQueue  To be tested.
     */
    public static void testDequeue(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "The front variable of an ArrayQueue will be removed with the dequeue method.";
        String passStatement = "The dequeue passed.\n";
        String failStatement = "The dequeue failed.\n";

        System.out.println(methodDescription);

        if(driverArrayQueue.dequeue() == 10){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }

    /** Tests the isEmpty method of an ArrayQueue.
     * States the isEmpty passed if a value is still in the ArrayQueue.
     * @param driverArrayQueue  To be tested.
     */
    public static void testNotEmpty(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "An ArrayQueue will be determined if it still holds variables with the isEmpty method.";
        String passStatement = "The isEmpty method passed, the second enqueue was successful.\n";
        String failStatement = "The isEmpty method failed, the second enqueue failed.\n";

        System.out.println(methodDescription);

        if(!(driverArrayQueue.isEmpty())){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }

    /** Clears the contents of an ArrayQueue.
     * @param driverArrayQueue  To be cleared.
     */
    public static void testClear(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "An ArrayQueue will be cleared of all variables with the clear method.";
        String passStatement = "An isEmty method test will later determine if the clear was successful.\n";

        System.out.println(methodDescription);

        driverArrayQueue.clear();
        System.out.println(passStatement);
    }

    /** Tests the isEmpty method of an ArrayQueue.
     * States the isEmpty passed if no values are found.
     * @param driverArrayQueue  To be tested.
     */
    public static void testIsEmpty(ResizableArrayQueue driverArrayQueue) {
        String methodDescription = "The ArrayQueue will be checked to see if it's now empty.";
        String passStatement = "The isEmpty method passed, clear was successful.\n";
        String failStatement = "The isEmpty method failed, clear was unsuccessful.\n";

        System.out.println(methodDescription);

        if(driverArrayQueue.isEmpty()){
            System.out.println(passStatement);
        } else{
            System.out.println(failStatement);
        }
    }
}
