package Práctica2;

public abstract class Contact {
    
    private int id;
    private String name;

    public Contact(String name) {
        this.name = name;
        this.id = SMSTools.getUniqueId();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}