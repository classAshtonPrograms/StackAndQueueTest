/** This is a stack implemented using an array.
 *  The stack is First-In-Last-Out with only char's available.
 */
public class ArrayStack {
    private char[] store;
    private char storeLength;

    /** Constructor
     * Initializes store to hold 0 variables
     * Sets store length to 0
     */
    public ArrayStack () {
        store = new char[0];
        storeLength = 0;
    }

    /** Doubles the length of the stack if the stack is already full.
     * Adds a new entry to the top of the stack.
     * @param newEntry  An int added to the top of the stack.
     */
    public void push (char newEntry) {
        if (storeLength == store.length) {
            resize();
        }

        store[storeLength] = newEntry;
        storeLength++;
    }

    /** Removes and returns this stack's top entry.
     * @return  The int at the top of the stack.
     * @throws  EmptyStackException if the stack is empty before the operation.
     */
    public char pop () {
        char top;

        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            top = store[storeLength - 1];
            store[storeLength - 1] = 0;
            storeLength--;

            return top;
        }
    }

    /** Returns this stack's top entry.
     * @return  The top entry of the stack.
     * @throws  EmptyStackException if the stack is empty.
     */
    public char peek () {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return store[storeLength - 1];
        }
    }

    /** Detects whether this stack is empty.
     * @return  True if the stack is empty, otherwise it returns false.
     */
    public boolean isEmpty () {
        return storeLength == 0;
    }

    /** Sets the stack to be an empty array of length 0. */
    public void clear () {
        store = new char[0];
        storeLength = 0;
    }

    /** Helper method
     * If the stack is empty initialize store to hold 1 entry and set store length to 1
     * Otherwise double the size of the queue to make room for new entries 
     */
    private void resize () {
        if (storeLength == 0) {
            store = new char[1];
        } else {
            char[] temporaryStore = new char[store.length];

            for (int i = 0; i < store.length; i++) {
                temporaryStore[i] = store[i];
            }

            store = new char[store.length * 2];

            for (int i = 0; i < temporaryStore.length; i++) {
                store[i] = temporaryStore[i];
            }
        }
    }
}
