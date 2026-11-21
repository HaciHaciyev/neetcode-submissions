
class MinStack {
    private int size = 5;
    private int tail = 0;
    private Integer[] array;

    private int[] minStack = new int[5];
    private int minTail = 0;

    public MinStack() {
        array = new Integer[size];
    }

    public void push(int val) {
        if (tail == array.length) {
            size *= 2;
            array = Arrays.copyOf(array, size);
        }

        if (minTail == minStack.length) {
            minStack = Arrays.copyOf(minStack, minStack.length * 2);
        }

        array[tail] = val;

        if (minTail == 0 ||
            val <= array[minStack[minTail - 1]]) {
            minStack[minTail] = tail;
            minTail++;
        }

        tail++;
    }

    public void pop() {
        tail--;

        if (minStack[minTail - 1] == tail) {
            minTail--;
        }

        array[tail] = null;
    }

    public int top() {
        return array[tail - 1];
    }

    public int getMin() {
        return array[minStack[minTail - 1]];
    }
}
