package interfaces;

import entities.Person;

public interface SqlQueries {
    String selectAll();

    String selectCondition(int id);

    String insert(Person person);

    String update();

    String delete(int id);
}
