public class Test1 {
  public static void main (String[] args) {
    int page; //変数宣言の文、ageという箱を作る
    page = 30;
    System.out.println(page);
    int age = 20; //変数の初期化 3.4を一行にまとめる
    System.out.println("私の年齢は" + age);
    age = 31; //変数ageに再度代入している
    System.out.println("･･･いや、本当の年齢は" + age);
    
    final double PI = 3.14; //final付き→定数(値の書き換え不可)
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    System.out.println("パイの半径を倍にします");
    pie = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    
  }
}