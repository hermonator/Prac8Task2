/**
 * Created by jesse_000 on 6/8/2015.
 */
public class TestTodoList {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        System.out.println("Size after creating (expected value: 0" +
                " actual: " + todo.count());
        todo.add("buy milk");
        todo.add("mow the lawn");
        todo.add("buy an oculus rift");
        System.out.println("Size after adding (expected value: 3)" +
                " actual: " +todo.count());
        todo.markCompleted("buy an oculus rift");
        System.out.println("Size after completing a todo (expected value: 2)" +
                " actual: " + todo.count());
        todo.markCompleted("Unknown");
        System.out.println("Size after completing an invalid todo (expected value: 2)" +
                    " actual: " + todo.count());
        System.out.println("Currently completed items (expected [buy an oculus rift])" +
                    " actual: " + todo.getCompleted());


    }
}
