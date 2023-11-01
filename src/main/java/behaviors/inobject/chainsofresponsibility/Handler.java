package behaviors.inobject.chainsofresponsibility;

public abstract class Handler {
    private Integer priority;
    private Handler nextHandler;
    public Handler(int priority) {
        this.priority = priority;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(String massage, int level){
        if(level>=priority){
            write(massage);
        }
        if(nextHandler != null){
            nextHandler.handleRequest(massage,level);
        }
    }
    public abstract void write(String message);
}
