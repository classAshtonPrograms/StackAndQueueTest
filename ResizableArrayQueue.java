    /** DESCRIBE PROGRAM HERE */
    public class ResizableArrayQueue {
        private int[] store;
        private int storeLength;
    
        /** Constructor
         * Initializes store to allow 0 entries
         * Sets store length to 0
         */
        public ResizableArrayQueue() {
            store = new int[0];
            storeLength = 0;
        }
    
        /** Doubles the length of the queue if the stack is already full. 
         * Adds an entry to the back of the queue.
         * @param newEntry  An entry added to the queue.
         */
        public void enqueue(int newEntry) {
            if(store.length == storeLength){
                resize();
            }
    
            store[storeLength] = newEntry;
            storeLength++;
        }
    
        /** Removes and returns front int of the queue.
         * @return  The front entry of the queue.
         * @throws  EmptyQueueException if the queue is already empty.
         */
        public int dequeue() {
            int front;
            
            if(isEmpty()){
                throw new EmptyQueueException();
            } else{
                front = store[0];
    
                for(int i = 0; i < storeLength - 1; i++){
                    store[i] = store[i + 1];
                }
    
                store[storeLength - 1] = 0;
    
                storeLength--;
                return front;
            }
        }
    
        /** Returns the front entry of the queue.
         * @return  The front entry of the queue.
         * @throws  EmptyQueueException if the queue is empty.
         */
        public int getFront() {
            if(isEmpty()){
                throw new EmptyQueueException();
            } else{
                return store[0];
            }
        }
    
        /** Detects if the queue is empty.
         * @return  True if the stack is empty, otherwise it returns false.
         */
        public boolean isEmpty() {
            return storeLength == 0;
        }
    
        /** Sets the queue to be an empty array with a length of 0.
         */
        public void clear() {
            store = new int[0];
            storeLength = 0;
        }
    
        /** Helper method
         * If the queue is empty initialize store to hold 1 entry and set store length to 1
         * Otherwise double the size of the queue to make room for new entries 
         */
        private void resize() {
            if(storeLength == 0){
                store = new int[1];
                storeLength = 0;
            } else{
                int[] temporaryStore = new int[store.length];
    
                for(int i = 0; i < store.length; i++){
                    temporaryStore[i] = store[i];
                }
    
                store = new int[store.length * 2];
    
                for(int i = 0; i < temporaryStore.length; i++){
                    store[i] = temporaryStore[i];
                }
            }
        }
    }