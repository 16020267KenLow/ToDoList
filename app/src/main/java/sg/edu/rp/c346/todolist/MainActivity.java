package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<ToDoItem> alTodoList;
    CustomAdapter caTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.listViewTodo);
        alTodoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);
        ToDoItem todo1 = new ToDoItem("MSA", date1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,7,25);
        ToDoItem todo2 = new ToDoItem("Go for haircut", date2);

        alTodoList.add(todo1);
        alTodoList.add(todo2);

        caTodo = new CustomAdapter(this, R.layout.todo_item, alTodoList);

        lvTodo.setAdapter(caTodo);
    }
}
