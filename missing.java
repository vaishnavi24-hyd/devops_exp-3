class Missing {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5};
        int n = 5, sum = 0;

        for (int x : a)
            sum += x;

        System.out.println("Missing Number = " + (n * (n + 1) / 2 - sum));
    }
}