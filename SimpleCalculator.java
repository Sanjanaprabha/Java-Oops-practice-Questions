package oops;
public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }
    public double getSubstractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        double validsecondNumber= secondNumber;
        if(validsecondNumber!=0){
            return firstNumber/secondNumber;
        }
        else{
            return 0.0;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator v = new SimpleCalculator();
        v.setFirstNumber(3.6);
        v.setSecondNumber(3.2);
        System.out.println(v.getFirstNumber());
        System.out.println(v.getSecondNumber());
        System.out.println(v.getDivisionResult());
        System.out.println(v.getMultiplicationResult());
        System.out.println(v.getAdditionResult());
        System.out.println(v.getSubstractionResult());
    }
}
