public class AddDigits {

    public static int addDigits(int num) {

        int sumLength = 0;
        int finalVal = 0;

        while (sumLength != 1) {

            int current = num;
            int sum = 0;

            while (current != 0) {

                sum += current % 10;

                current /= 10;
            }

            sumLength = Integer.toString(sum).length();
            if (sumLength == 1) {

                finalVal = sum;
            }

            num = sum;

        }

        return finalVal;
    }

    public static void main(String[] args) {
        addDigits(38);
    }
}
