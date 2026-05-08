package chainOfResponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("A", "05", "a@b.c");
        Client client2 = new Client("B", null, "d@e.f");
        Client client3 = new Client("C", null, null);
        List<Client> clienti = Arrays.asList(client1, client2, client3);

        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        clienti.forEach(client -> notificatorSMS.trimiteNotificare(client, "Mesajdub"));
    }
}
