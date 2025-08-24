package ChainOfResponsibility;

public class UserLogic {
    private static final String GuestRole ="Guest/";
    private static final String UserRole ="User";
    public static void main(String[]args){
        Handler HandlerA = new HandlerA();
        Handler HandlerB = new HandlerB();

        HandlerA.setNextHandler(HandlerB);

        HandlerA.processRequest(GuestRole);
        HandlerB.processRequest(UserRole);

    }
}
