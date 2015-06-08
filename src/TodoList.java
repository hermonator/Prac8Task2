import java.util.ArrayList;

/**
 * Created by jesse_000 on 6/8/2015.
 */
public class TodoList {
    private ArrayList<String> items;
    private ArrayList<String> completed;
    public TodoList() {
        items = new ArrayList<String>();
        completed = new ArrayList<String>();
        int i = 1;
    }
    public void add(String item) {
        items.add(item);

    }

    public String getCompleted() {
        return completed.toString();
    }

    public void markCompleted(String item){



        if(items.contains(item) == true) {
            completed.add(item);
            int num = items.indexOf(item);
            items.remove(num);
        }
    }
    public int count() { return items.size(); }

}
