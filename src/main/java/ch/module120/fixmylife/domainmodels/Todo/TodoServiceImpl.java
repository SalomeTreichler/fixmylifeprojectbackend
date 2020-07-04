package ch.module120.fixmylife.domainmodels.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TodoServiceImpl implements TodoService{
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getById(String id) {
        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public Todo create(Todo todo) {
        todoRepository.save(todo);
        return todo;
    }

    @Override
    public String delete(String id) {
        todoRepository.deleteById(id);
        return "Todo has been deleted";
    }
}
