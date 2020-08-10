public class JavaExemple{

  public static void main(String[] args){
    System.out.println("Test");
    System.out.println(getValue());
    System.out.println(getValue("Eric"));
    System.out.println(getValue("Mes joyeux Stagiaires"));
  }
  
  public static String getValue(){
    return "test";
  }
  
  public static String getValue(String name){
    return name + " test";
  }
}
