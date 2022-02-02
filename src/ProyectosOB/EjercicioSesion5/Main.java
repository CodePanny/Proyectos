package tema5;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDMySQL();

    public static void main(String[] args) {

    cocheCRUD.save();

    cocheCRUD.delete();

    cocheCRUD.findAll();

    }
}
