public class Rectangle {
    private int a ;
    private  int b ;
    private int s ;
    private int d;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    /////////////////////////////////////////
    public int getB (){
        return b ;
    }
    public void setB (int b){
        this.b =b ;
    }
    ///////////////////////////////////
    public int getS (){
        return s ;
    }
    public void setS (int s){
        this.s = s;
    }
    ////////////////////////////////////////
    public int getD (){
        return d;
    }
    public void setD (int d){
        this.d= d;
    }
    ///////////////////////////////////////
    public int suumma (){
        int sum = this.a*this.b;
        return sum;
    }

}
