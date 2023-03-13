package org.groupscope.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    @JoinColumn(name = "subject_id")
    private List<Task<TaskType>> tasks;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private LearningGroup group;

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
        tasks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task<TaskType>> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task<TaskType>> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}