package entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "task_list", schema = "to_do_list")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @Column(name = "list_item")
    private String list_item;

    public ToDo() {
    }

    public ToDo(Integer id, String list_item) {
        this.id = id;
        this.list_item = list_item;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getList_item() {
        return list_item;
    }

    public void setList_item(String list_item) {
        this.list_item = list_item;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "id=" + id +
                ", list_item='" + list_item + '\'' +
                '}';
    }

}