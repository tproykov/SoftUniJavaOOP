package temp;

class Counter {

    private static int staticCount = 0;     //NOT A FIELD!! - static (class) variable

    private int count = 0;                  //Object field - instance variable

    public Counter() {                      //Constructor
        count++;
        staticCount++;                      //Incrementing value
    }

    public void printCounters() {
        System.out.printf("Count: %d%n", count);
        System.out.printf("Static Count: %d%n", staticCount);
    }
}