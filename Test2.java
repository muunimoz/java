public class Test2 {
  public static void main(String[] args) {
    int a; //変数宣言の文
    int b;
    a = 20; //代入
    b = a + 5; //式 足し算して代入
    //a,b,5→オペランド +,=→演算子
    System.out.println(a);
    System.out.println(b);
    
    System.out.println("私の好きな記号は二重引用符 (\\\") です"); //エスケープシーケンス
    
    //インクリメント演算子
    int c;
    c = 100;
    c++; //cの値が1増える
    System.out.println(c);
  }
}