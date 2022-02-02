package tema5;

import java.util.List;

public class CocheCRUDMySQL implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }
}
