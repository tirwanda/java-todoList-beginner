public class TodoList {
    public static  String[] models = new String[10];

    public static void main(String[] args) {
        testRemoveTodoList();
    }

    /*
    * Show Todo List
    * */
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

    /*
    * Add Todo List
    * */
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

    /*
    * Remove Todo List
    * */
    public static boolean removeTodoList(Integer number) {
        if(number > models.length) {
            return false;
        }else if(models[number - 1] == null) {
            return false;
        } else {
            for(int i = (number - 1); i < models.length; i++) {
                if(i == (models.length - 1)) {
                    models[i] = null;
                } else {
                    models[i] = models[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Todo 1");
        addTodoList("Todo 2");
        addTodoList("Todo 3");
        addTodoList("Todo 4");
        addTodoList("Todo 5");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public  static  void viewShowTodoList() {

    }

    public static void viewAddTodoList() {

    }

    public static void viewRemoveTodoList() {

    }
}
