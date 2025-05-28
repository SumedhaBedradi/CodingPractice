//Print Total Number of Objects created in program
public class ObjectCreationCounter {
    //static variable to keep the number of objects 
        static int cnt = 0;
        {
            // In non static block to increase the value of cnt when new object is created
            cnt++;
        }
        public static void main(String[] args) {
            ObjectCreationCounter t1 = new ObjectCreationCounter();
            ObjectCreationCounter t2 = new ObjectCreationCounter();
            System.out.println("Total Number of Objecs created: " + cnt);
        }
    }