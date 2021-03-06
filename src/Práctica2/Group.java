package Práctica2;

public class Group extends Contact {
    private Contact[] contactVector;
    private int lastContactPosition;
    public Group(String name) {
        super(name);
        contactVector = new Contact[10];
    }

    public boolean isMember(int id) {
        for (int i = 0; i < contactVector.length; i++) {
            if (contactVector[i].getId() == id){
                return true;
            }    
        }
        return false;
    }
    public boolean add(Contact contact){
        int[] array = new int[contactVector.length + contactVector.length];
        if (isMember(contact.getId())) return false;
        if (contactVector[contactVector.length - 1] != null){
            System.arraycopy(contactVector,0,array,0,contactVector.length -1);
        }
        
    }

}