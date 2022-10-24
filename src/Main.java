public class Main {
    public static void main(String[] args) {
        UserStorage userStorage = new UserStorage();
        userStorage.setUsers();
        Register register = new Register();
        Menu start = new Menu();
        while (true) {
            start.menu(register.register(userStorage), userStorage);
        }
    }
}