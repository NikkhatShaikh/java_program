package javaprogram;

public interface TopicFinal {
    void understand();
}
class Topic1 implements TopicFinal {
    public void understand()
    {
        System.out.println("Got it");
    }
} class Topic2 implements TopicFinal {
    public void understand()
    {
        System.out.println("understand");
    }
}  class Subject1 {
    public static void main(String[] args)
    {
        TopicFinal t = new Topic2();
        t.understand();
    }
}