package interfaces;

import entities.Person;

public interface SqlQueries {
    String selectAll();

    String selectCondition(int id);

    String insert(Person person);

    String update(Person person);

    String delete(int id);
}
