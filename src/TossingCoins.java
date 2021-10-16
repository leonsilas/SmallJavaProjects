public class TossingCoins {

    public int flipForHeads(GVCoin coin, int goal) {
        int totalFlips = 0;

        while (coin.numHeads() < goal) {
            coin.flip();
            totalFlips++;
        }

       return totalFlips;
    }
 
    public static void main(String[] args) {
       TossingCoins game = new TossingCoins();
       GVCoin coin = new GVCoin(15); // Create a GVCoin object with seed value 15
       int numHeads = 100;   // Desire 100 heads
       int totalFlips;
 
       totalFlips = game.flipForHeads(coin, numHeads);
       System.out.println("Total number of flips for 100 heads: " + totalFlips);
    }
 }