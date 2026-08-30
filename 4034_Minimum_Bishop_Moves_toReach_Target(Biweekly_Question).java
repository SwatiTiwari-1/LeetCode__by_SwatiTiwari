class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int a1 = source[0];
        int b1 = source[1];

        int a2 = target[0];
        int b2 = target[1];

        if((a1+b1)%2 != (a2+b2)%2)
        {
            return -1;
        }
        if(Math.abs(a1-a2)== Math.abs(b1-b2))
        {
            return 1;
        }
        return 2;
    }
}
