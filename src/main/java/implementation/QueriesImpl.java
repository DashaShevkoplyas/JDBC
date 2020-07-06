package implementation;

import entities.Person;
import interfaces.SqlQueries;
//TODO figure out how to parse values into queries
// in the way like getName() or about
public class QueriesImpl implements SqlQueries {
    @Override
    public String selectAll() {
        return "SELECT * FROM new_table";
    }

    @Override
    public String selectCondition(int id) {
        return "SELECT * FROM new_table WHERE id = id";
    }

    @Override
    public String insert(Person person) {
        return "INSERT INTO new_table (name, age) VALUES (person.name, person.age)";
    }

    @Override
    public String update() {
        return "UPDATE new_table SET age = 30 WHERE id = 1";
    }

    @Override
    public String delete(int id) {
        return "DELETE FROM new_table WHERE `id` = id";
    }
}
