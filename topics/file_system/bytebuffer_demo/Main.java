package topics.file_system.bytebuffer_demo;

import java.nio.ByteBuffer;

public class Main {

    static void printOut(ByteBuffer buff) {
        System.out.println("position: " + buff.position() + ", limit: " + buff.limit());
    }

    public static void main(String[] args) {

        ByteBuffer buff = ByteBuffer.allocate(32);

        printOut(buff);

        buff.put((byte)60);
        buff.put((byte)61);
        buff.put((byte)62);
        buff.put((byte)129);

        printOut(buff);

        // Set the limit to the current position, and the position is set to 0
        // We have to flip() the buffer after we filled the buffer, so we can read it
        System.out.println(".flip()");
        buff.flip();

        printOut(buff);


        for (int i = 0; i < buff.limit(); i++) {
            System.out.print(buff.get() + ", ");
        }
        System.out.println();

        printOut(buff);

        //buff.get(); // Error
        // If the buffer's current position is not smaller than its limit ---> Error

        //System.out.println(".compact()");
        //buff.compact();
        System.out.println(".clear()");
        buff.clear();

        printOut(buff);

        System.out.println("----------");
        System.out.println("---> Experiment...");



    }
}
