package ch.module120.fixmylife.domainmodels.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getAll();
    public Todo getById(String id);
    public Todo create(Todo Todo);
    public String delete(String id);
}
