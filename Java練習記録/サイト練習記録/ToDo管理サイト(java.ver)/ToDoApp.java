import java.util.*;

public class ToDoApp {
    static Scanner sc=new Scanner(System.in);
    static List<ToDo> todos=new ArrayList<>();

    public static void main(String[] args) {
        while(true) { 
            System.out.println("\n1追加 2一覧 3完了 4削除 0終了");

            int menu=sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1:
                    System.out.print("タスク");
                    todos.add(new ToDo(sc.nextLine()));
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    show();
                    System.out.print("番号");
                    todos.get(sc.nextInt()-1).complete();
                    break;
                case 4:
                    show();
                    System.out.print("削除");
                    todos.remove(sc.nextInt()-1);
                    break;
                case 0:
                    return;
            }
        }
    }
    static void show() {
        for(int i=0;i<todos.size();i++) {
            System.out.println((i+1)+":"+todos.get(i));
        }
    }
}