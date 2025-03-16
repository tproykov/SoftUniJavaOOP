package JO06SOLID._5DependencyInversion._2_Worker;

public class Manager {

    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
