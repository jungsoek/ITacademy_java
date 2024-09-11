package ex01_super;
// 상속을 이용해서 다음 클래스들을 간결한 구조로 만드세요.
// 부모 -> 넓은 범위의 개념, 자식 -> 좁은 범위의 개념
class SharpPencil{ //샤프펜
    private int width; //펜의 굵기
    private int amount; //남은 량
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
}

class Ballpen{ //볼펜
    private int amount; //남은 량
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
}

class FountainPen{
    private int amount; //만년필
    private String color; //볼펜의 색
    public int getAmount(){return amount;}
    public void setAmount(int amount){this.amount = amount;}
    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}
    public void refill(int n){setAmount(n);}
}