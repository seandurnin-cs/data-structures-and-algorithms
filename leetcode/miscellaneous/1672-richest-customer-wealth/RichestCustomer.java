public class RichestCustomer {
    public static void main(String args[]) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int result = maximumWealth(accounts);
        System.out.println(result);
    }

    public static int maximumWealth(int[][] accounts) {
        int temp = 0;
        int biggest = 0;
        for(int i = 0; i < accounts.length; i++) {
            for(int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if(temp > biggest) {
                biggest = temp;
            }
            temp = 0;
        }
        return biggest;
    }
}