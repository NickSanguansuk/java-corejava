package trainings.bfs.week1.day3.demo.customexception;

public class WrongFileNameException extends Exception {

    //public WrongFileNameException() {
    //    super("Wrong file name!");
    //}

    public WrongFileNameException(String message) {
        super(message);
    }
}
