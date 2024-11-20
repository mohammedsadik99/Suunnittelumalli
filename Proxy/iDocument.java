package Proxy;

import java.util.Date;

public interface iDocument {
    Date getCreationDate();
    String getContent(Proxy.User user);
    int getIdentifier();
}