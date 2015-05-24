
public class Calculator {
    private int result = 0;

    public int multiplication(int a,int b){
        return this.result = a * b;
    }
    public int devision(int a, int b){
        if ( b == 0){
            return 0;
        }else {
            return this.result = a / b;
        }
    }
    public int addition(int a, int b){
        return this.result = a + b;
    }

    public int subtraction(int a, int b){
        return this.result= a - b;
    }

    public int getResult(){
        return this.result;
    }

    public void clearResult(){
        this.result = 0;
    }

}
