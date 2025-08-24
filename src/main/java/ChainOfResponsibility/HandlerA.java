package ChainOfResponsibility;

public class HandlerA extends Handler {

    @Override
    boolean processRequest(String userRole) {
        if ("Guest".equals((userRole))) {
            System.out.println(("Добро пожаловать Гость"));
            return true;
        } else if (nextHandler != null) {
            return nextHandler.processRequest(userRole);
        }
        return false;
    }
}



