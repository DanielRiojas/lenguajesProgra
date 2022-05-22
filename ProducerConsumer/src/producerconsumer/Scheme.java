package producerconsumer;


public class Scheme {
  
    private char symbol;
    private int num1;
    private int num2;
    
    public Scheme(){
        this.symbol = '-';
        this.num1 = 1;
        this.num2 = 2;
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

    public char getSymbol(){
        return symbol;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }

}

    