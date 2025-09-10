// package enumProgram;

enum Status {
    Running, Pending, Failed, Success
}

public class VivekMain {
    public static void main(String[] args) {
        Status task = Status.Success;
        System.out.println(task);
        System.out.println(task.ordinal());

        Status[] num = Status.values();

        for (Status s : num) {
            System.out.println(s);
        }

    }
}
