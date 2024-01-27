package module4.seven;
class GCDCalculator {

    private int chosenMethod;

    public GCDCalculator(int chosenMethod) {
        this.chosenMethod = chosenMethod;
    }

    private static int calculateGCDUsingSubtraction(int a, int b) {
        int absA = a < 0 ? -a : a; //System.out.println(absA);
        int absB = b < 0 ? -b : b;

        if (absA == 0 || absB == 0) {
            return (absA == 0) ? absB : absA;
        }

        while (absA != absB) {
            if (absA > absB) {
                absA -= absB;
            } else {
                absB -= absA;
            }
        }

        return absA;
    }

    private static int calculateGCDUsingModulo(int a, int b) {
        int absA = a < 0 ? -a : a;
        int absB = b < 0 ? -b : b;

        while (absB != 0) {
            int pom = absB;
            absB = absA % absB;
            absA = pom;
        }

        return absA;
    }

    public void printGCD(int a, int b) {
        System.out. println("Euclidean algorithm using " + ((chosenMethod == 0) ? "subtraction:" : "modulo:"));
        System.out.println("GCD(" + a + ", " + b + ") = " + ((chosenMethod == 0) ?  calculateGCDUsingSubtraction(a, b) : calculateGCDUsingModulo(a, b)));
    }
}
