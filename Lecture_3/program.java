/*сложение разных типов данных */
package Lecture_3;

public class program {
     
  
    public static void main(String[] args) {
    System.out.println("-----тип данных----");
    Object o = 1; GetType(o); // java.lang.Integer
    o = 1.2; GetType(o); // java.lang.Double
    }
    static void GetType(Object obj) {
    System.out.println(obj.getClass().getName());

    System.out.println("---------");
    System.out.println(Sum(1, 2));
    System.out.println(Sum(1.0, 2));
    System.out.println(Sum(1, 2.0));
    System.out.println(Sum(1.2, 2.1));
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
        return (Object)((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
        return (Object)((Integer) a + (Integer) b);
        } else return 0;
        }
    
}
