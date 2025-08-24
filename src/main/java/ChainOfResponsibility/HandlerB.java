package ChainOfResponsibility;

public class HandlerB extends Handler {

    @Override
    boolean processRequest(String userRole) {
        if ("User".equals((userRole))) {
            System.out.println(("Добро пожаловать Пользователь"));
            return true;
        } else if (nextHandler != null) {
            return nextHandler.processRequest(userRole);
        }
        return false;
    }
}
