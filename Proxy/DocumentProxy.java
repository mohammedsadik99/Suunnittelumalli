package Proxy;

import java.sql.Date;



public class DocumentProxy implements iDocument {
    private final int id;
    private final Date date;
    private final String content;
    private final Proxy.AccessControlService accessService;

    public DocumentProxy(int id, Date date, String content, Proxy.AccessControlService accessService) {
        this.id = id;
        this.date = date;
        this.content = content;
        this.accessService = accessService;
    }

    @Override
    public int getIdentifier() {
        return id;
    }

    @Override
    public Date getCreationDate() {
        return date;
    }

    @Override
    public String getContent(Proxy.User user) {
        return accessService.hasAccess(id, user) ? content : "Access Denied";
    }
}