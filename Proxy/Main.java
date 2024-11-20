package Proxy;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Proxy.Library library = new Proxy.Library();
        Proxy.AccessControlService accessService = Proxy.AccessControlService.getInstance();

        Proxy.User user1 = new Proxy.User("user1");
        Proxy.User user2 = new Proxy.User("user2");

        accessService.grantAccess("user1", 1);

        Proxy.iDocument openDoc = new RealDocument(2, new Date(System.currentTimeMillis()), "Accessible to all");
        Proxy.iDocument restrictedDoc = new DocumentProxy(1, new Date(System.currentTimeMillis()), "Restricted Content", accessService);

        library.addDocument(openDoc);
        library.addDocument(restrictedDoc);

        System.out.println("Open Document: " + library.fetchDocument(2).getContent(user1));
        System.out.println("Protected Document (user1): " + library.fetchDocument(1).getContent(user1));
        System.out.println("Protected Document (user2): " + library.fetchDocument(1).getContent(user2));
    }
}