public class FactorGenerator 
{

    public FactorGenerator(int value) {
        if (value <= 1) {
            throw new IllegalArgumentException();
        }

        number = value;
        tempNumber = value;
        System.out.println("Il numero inserito è corretto");
    }

    public int nextFactor() {
        for (int i = temp; i <= tempNumber; i++) {
            if (tempNumber % i == 0) {
                tempNumber /= i;
                temp = i;
                return temp;
            }
        }

        return 0;
    }

    public boolean hasNextFactor() {
        return tempNumber != 1;
    }

    private int number;
    private int temp = 2;
    private int tempNumber;
}
