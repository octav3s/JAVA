class store_manager{
    public static void main(String[] args) {
        int[][] sales ={
            {100, 200, 150},
            {300, 250, 400},
            {200, 190, 550},
            {160, 180, 210},
            {190, 200, 250}
        };
        int[] totalSales = new int[3];
        for(int i=0; i<sales.length; i++){
            for(int j=0; j<sales[i].length; j++){
                totalSales[j] += sales[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Total sales for Product " + (i + 1) + ": " + totalSales[i]);

            if (totalSales[i] >= 500) {
                System.out.println("Target Achieved");
            } else if (totalSales[i] >= 300) {
                System.out.println("Average Performance");
            } else {
                System.out.println("Needs Improvement");
            }

            System.out.println();
        }
    }
}
    