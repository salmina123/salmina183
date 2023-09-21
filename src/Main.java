public class Main {
    public static void main(String[] args) {
  Boos sad = new Boos();
  sad.setHealth(345);
  sad.setJak(245);
  sad.setSad("уклонение от ударов ");
      System.out.println("жизнь босса " + sad.getHealth());
        System.out.println("урон нанесения " + sad.getJak());
        System.out.println("тип защиты " + sad.getSad());
    }
}