public class ArrayCalculations {

    public double[] sumRow(double[][] arr) {

        double[] sums = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sums[i] += arr[i][j];
            }
        }

        return sums;

    }

    public double[] sumCol(double[][] arr) {

        double[] sums = new double[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sums[j] += arr[i][j];
            }

        }
        return sums;
    }

    public double[] avgPerRow(double[][] arr) {

        double[] avg = new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            avg[i] = sumRow(arr)[i] / arr[0].length;
        }

        return avg;
    }

    public double[] avgPerCol(double[][] arr){

        double[] avg = new double[arr[0].length];

        for(int i = 0; i < avg.length; i++){
            avg[i] = sumCol(arr)[i]/arr.length;
        }

        return avg;
    }

    public double avg(double[] arr){

        double sum = 0;

        for(double value: arr){
            sum+= value;
        }

        return sum/arr.length;
    }

    public String displayArray(double[] arr) {

        String output = "";


        for (double value : arr) {
            output += (value + "\t");
        }

        return output;
    }



    public String displayArray(double[] arr){
        String output = "";
        
        for(double[] list: arr){
            for(double value: list){
                output += (value + "\t");
            }
            
            output += "\n";
        }
        
        return output;
    }
    
}
