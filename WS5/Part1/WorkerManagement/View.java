package Semeter2_OOP_With_Jav_a.WS5.Part1.WorkerManagement;

public class View {
    public static void main(String[] args) {
        System.out.print("Input number of worker: ");
        int number = Integer.parseInt(Validation.scanner.nextLine());
        Worker[] workers = new Worker[number];
        Worker worker = new Worker();

        for (int i=0; i<number; i++){
            System.out.println("Person no "+ i);
            workers[i] = worker.input();
        }

        for(var x: workers){
            x.display();
        }
    }
}
