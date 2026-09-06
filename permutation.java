class Permutation {
    public static void main(String[] args) {
        int n = 5, r = 2;
        int p = 1;

        for (int i = 0; i < r; i++)
            p *= (n - i);

       System.out.println("Permutation is");

    }
}