//Nearby K Points/cars/horse...   
//We are given N points in a 2D plane which are locations of N points.
//If we are at the origi, print the nearest K points
package Heaps_Codes;
import java.util.PriorityQueue;

public class nearbyPoints {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int dissq;
        int idx;

        public Points(int x, int y, int dissq, int idx){
            this.x=x;
            this.y=y;
            this.dissq=dissq;
            this.idx=idx;
        }

        @Override
        public int compareTo(Points p2){
            return this.dissq - p2.dissq;
        }
    }

    public static void main(String[] args) {
        int pts[][] ={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Points> pq= new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int dissq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], dissq, i));
        }

        // for k points only
        for(int i=0;i<k;i++){
            System.out.println("Nearby point/car/horse.. is number "+pq.remove().idx);
        }
    }
}
