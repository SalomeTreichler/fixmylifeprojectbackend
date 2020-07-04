package ch.module120.fixmylife.domainmodels.Todo;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class Todo {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "todo_id")
    private String todoId;

    @Column(name = "todo_title")
    private String todo;

    public Todo() {
    }

    public String getTodoId() {
        return todoId;
    }

    public Todo setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }

    public String getTodo() {
        return todo;
    }

    public Todo setTodo(String todo) {
        this.todo = todo;
        return this;
    }
}
