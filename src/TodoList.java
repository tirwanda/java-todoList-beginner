public class TodoList {
    public static  String[] models = new String[10];

    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void showTodoList() {
        for(var i = 0; i <models.length; i++) {
            var todo = models[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static  void testShowTodoList() {
        models[0] = "Belajar Java Dasar";
        models[1] = "Studi Kasus Java Dasar : Aplikasi Todo List";

        showTodoList();
    }

    public static void addTodoList(String todo) {
        var isFull = true;

        for (var i = 0; i < models.length; i++) {
            if(models[i] == null) {
                isFull = false;
                break;
            }
        }

        if(isFull) {
            var temp = models;
            models = new String[models.length * 2];

            for(var i = 0; i < temp.length; i++) {
                models[i] = temp[i];
            }
        }

        for(int i = 0; i < models.length; i++) {
            if(models[i] == null) {
                models[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for(var i = 1; i <= 12; i++) {
            addTodoList("Todo " + i);
        }

        showTodoList();
    }

    public static void removeTodoList() {

    }

    public  static  void viewShowTodoList() {

    }

    public static void viewAddTodoList() {

    }

    public static void viewRemoveTodoList() {

    }
}
