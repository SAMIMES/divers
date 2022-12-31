public class rim {
    public static void main(String[] args) {
        int l=7;
        int c=30;
        int i,j;
        StringBuffer s = new StringBuffer();
        for(i=1;i<=l;i++){
            for(j=1;j<=c;j++) {
                if (i == 1 || i == l || j == 1 || j == c)
                    System.out.printf("*");
                else
                    System.out.printf(" ");

            }
            System.out.printf("\n");
        }
    }
}
