import java.util.Arrays;

public class MMMR {

    public double mean(double[] arr) {

        double sum = 0;

        for (double value : arr) {
            sum += value;
        }

        return Math.round(sum / arr.length * 100 / 100.0);


    }

    public double median(double[] arr) {

        Arrays.sort(arr);

        int middleIndex = arr.length / 2;

        if (arr.length % 2 == 0) {

            return (arr[middleIndex] + arr[middleIndex + 1]) / 2.0;

        } else {
            return arr[middleIndex];
        }

    }

    public double range(double[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1] - arr[0];
    }
}

