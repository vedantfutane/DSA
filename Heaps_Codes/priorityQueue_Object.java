//PriorityQueue ka object banana
package Heaps_Codes;
import java.util.PriorityQueue;

public class priorityQueue_Object {

    static class Student implements Comparable<Student>{  //overriding   Comparable<Student> -- compare karega student objects me
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;    // ye rank ko compare karega --> initial rank me se s2 ka rank minus krne pr +, - yaa 0 milega  suke hisab se
        }                                  // "+" --> obj1>obj2  ,    "-" --> obj1<obj2    ,  "0" --> teh both same
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student("A", 10));     //O(logn)
        pq.add(new Student("B", 3));
        pq.add(new Student("C", 3990));
        pq.add(new Student("D", 100));
        pq.add(new Student("E", 10));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" --> "+ pq.peek().rank);   //O(1)
            pq.remove();  // O(logn)
        }
    }

}
