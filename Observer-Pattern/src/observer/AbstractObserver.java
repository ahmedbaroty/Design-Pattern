package observer;

public abstract class AbstractObserver implements Observer {
    long id;
    AbstractObserver() {
        this.id = (long)(Math.random() * 1000);
    }
    @Override
    public long getId() {
        return id;
    }
}

