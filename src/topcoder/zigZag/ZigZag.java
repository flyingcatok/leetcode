package topcoder.zigZag;

public class ZigZag {

	public static void main(String[] args) {
		int[] zig =  { 1, 17, 5, 10, 13, 15, 10, 5, 16, 8 };
		System.out.println(longestZigZag(zig));
	}
	
    public static int longestZigZag (int[] sequence) {
        if (sequence == null) {
            return -1;
        }
        int seqLength = sequence.length;
        if (seqLength <= 2) {
            return seqLength;
        }
        int[] up = new int[seqLength];
        int[] down = new int[seqLength];
        for (int i = 0; i < seqLength; ++i) {
        	up[i] = 1;
            down[i] = 1;
        }
        for (int i = 1; i < seqLength; ++i) {
            for (int j = 0; j < i; ++j) {
                if (sequence[j] < sequence[i]) {
                    if (down[j] + 1 > up[i]) {
                        up[i] = down[j] + 1;
                    }
                }
                if (sequence[j] > sequence[i]) {
                    if (up[j] + 1 > down[i]) {
                        down[i] = up[j] + 1;
                    }
                }
            }
        }
        return Math.max(up[seqLength - 1],down[seqLength - 1]);
    }
}
