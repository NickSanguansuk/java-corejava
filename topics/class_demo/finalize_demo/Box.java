package topics.class_demo.finalize_demo;

public class Box {
    Box() {
        super();
        System.out.println("This object reference is located on the heap at: " + this);
    }

    // Finalizer
    @Override
    protected void finalize() {
        System.out.println("!!!Finalized!!! " + this);
    }
}
