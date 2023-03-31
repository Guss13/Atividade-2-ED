public class No{
    private int content;
    private No next;
    public No(){
        next = null;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }
}
