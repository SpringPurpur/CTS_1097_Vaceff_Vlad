package chainOfResponsibility;

public class NotificatorSMS extends Notificator {
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if (client != null && !client.getTelefon().isEmpty()) {
            System.out.println(client.getNume() + ": " + mesaj);
        }
        else if (super.getSuccesor() != null) {
            super.getSuccesor().trimiteNotificare(client, mesaj);
        }
        else {
            System.out.println("Client fara nr tel");
        }
    }
}
