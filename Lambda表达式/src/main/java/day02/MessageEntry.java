package day02;

public class MessageEntry {
    private String messageName;
    private String messageId;
    public MessageEntry(){

    }

    @Override
    public String toString() {
        return "MessageEntry{" +
                "messageName='" + messageName + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}
