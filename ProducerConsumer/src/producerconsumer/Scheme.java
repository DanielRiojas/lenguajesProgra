package producerconsumer;


public class Scheme {
  
    private char symbol;
    private int num1;
    private int num2;
    private int flag;
    
    public Scheme(){
        this.symbol = '-';
        this.num1 = 1;
        this.num2 = 2;
        this.flag = 0;
    }
   
    public void setSymbol(char _symbol){
        symbol = _symbol;
    }

    public void setNum1(int _num1){
        num1 = _num1;
    }
    public void setNum2(int _num2){
        num2 = _num2;
    }

    public void setFlag(int _flag){
        flag = _flag;
    }

    public char getSymbol(){
        return symbol;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

    public int getFlag(){
        return flag;
    }


}

    