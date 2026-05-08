package chainOfResponsibility;

public class NotificatorManager extends Notificator {

    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("Client fara tel sau mail");
    }
}
