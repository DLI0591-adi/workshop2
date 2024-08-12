package exception;

public class program{
    public static void main(String[] args) {
        Thread task1 = new Task1();
        Thread task2 = new Task2();
        Thread task3 = new Task3();
        task1.start();
        task2.start();
        task3.start();
        try {
            task1.join();
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted: " + e.getMessage());
        }
        System.out.println("All tasks completed.");
    }
}

class Task1 extends Thread {
    @Override
    public void run() {
        try {
            performTask(1);
        } catch (Exception e) {
            System.err.println("Exception in Task1: " + e.getMessage());
        }
    }

    private void performTask(int taskId) throws Exception {
        if (taskId % 2 == 0) {
            throw new Exception("Simulated exception for Task1");
        }
        System.out.println("Task1 completed successfully.");
    }
}

class Task2 extends Thread {
    @Override
    public void run() {
        try {
            performTask(2);
        } catch (Exception e) {
            System.err.println("Exception in Task2: " + e.getMessage());
        }
    }

    private void performTask(int taskId) throws Exception {
        if (taskId % 2 == 0) {
            throw new Exception("Simulated exception for Task2");
        }
        System.out.println("Task2 completed successfully.");
    }
}

class Task3 extends Thread {
    @Override
    public void run() {
        try {
            performTask(3);
        } catch (Exception e) {
            System.err.println("Exception in Task3: " + e.getMessage());
        }
    }

    private void performTask(int taskId) throws Exception {
        if (taskId % 2 == 0) {
            throw new Exception("Simulated exception for Task3");
        }
        System.out.println("Task3 completed successfully.");
    }
}

// Add more Task classes as needed


