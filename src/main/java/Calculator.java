public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getNum1(){
        return this.num1;
    }
    public double getNum2(){
        return this.num2;
    }
    public double addNumbers(){
        return this.num1 + this.num2;
    }
    public double subNumbers(){
        return this.num2 - this.num1;
    }
}
