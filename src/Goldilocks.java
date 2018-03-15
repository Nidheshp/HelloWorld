class GoldilocksChecker {
    public static void checkSeat(int[][] input){
        int maxWeight = input[0][0];
        int porridgeTemp = input[0][1];
        String suitableChairs = "";
        for(int i = 1; i < input.length;++i) {
            int checkingWeight = input[i][0];
            int checkingTemp = input[i][1];
            if(checkingWeight > maxWeight && porridgeTemp > checkingTemp){
                suitableChairs += i + " ";
            }
        }
        System.out.println(suitableChairs);
    } 
}

public class Goldilocks {

    public static void main(String[] args) {
        int[][] input = {  { 100, 80 },
                           { 30, 50 },
                           { 130, 75 },
                           { 90, 60 },
                           { 150, 85 },
                           { 120, 70 },
                           { 200, 200 },
                           { 110, 100 } };
        int[][] challengeInput = {  {100, 120 },
                                    {297, 90 },
                                    {66, 110 },
                                    {257, 113 },
                                    {276, 191 }, 
                                    {280, 129 },
                                    {219, 163 },
                                    {254, 193 },
                                    {86, 153 },
                                    {206, 147 },
                                    {71, 137 },
                                    {104, 40 },
                                    {238, 127 },
                                    {52, 146 },
                                    {129, 197}, 
                                    {144, 59 },
                                    {157, 124 },
                                    {210, 59 },
                                    {11, 54 },
                                    {268, 119 },
                                    {261, 121 },
                                    {12, 189 },
                                    {186, 108 },
                                    {174, 21 },
                                    {77, 18 },
                                    {54, 90 },
                                    {174, 52 },
                                    {16, 129 },
                                    {59, 181 },
                                    {290, 123 },
                                    {248, 132 } };
        System.out.println("Below is the Sample Input.");
        GoldilocksChecker.checkSeat(input);//Sample input
        System.out.println("Below is the Challenge Input.");
        GoldilocksChecker.checkSeat(challengeInput);//Sample input
    }
}