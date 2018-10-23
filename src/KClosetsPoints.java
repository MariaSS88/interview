import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/*Find k closest points to a given one*/

public class KClosetsPoints {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        double distance;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public void setDistance(Point centerPoint){
            distance = Math.sqrt((centerPoint.x-this.x)*(centerPoint.x-this.x)+(centerPoint.y-this.y)*(centerPoint.y-this.y));
        }
        @Override
        public int compareTo(Point o) {
            return Double.compare(this.distance, o.distance);
        }
    }

    public List<Point> getKClosestPoints(List<Point> points, Point centerPoint, int k){
        List<Point> result = new ArrayList<>();
        PriorityQueue<Point> queue = new PriorityQueue<>();

        for(Point point: points){
            point.setDistance(centerPoint);
            queue.add(point);
        }

        while(k>0){
            result.add(queue.remove());
            k--;
        }
        return result;
    }

    public static void main(String[] args){
        KClosetsPoints test = new KClosetsPoints();

        List<Point> points = new ArrayList<>();
        Point a = new Point(1,1);
        Point b = new Point(1,2);
        Point c = new Point(2,2);
        Point d = new Point(-1,1);
        Point e = new Point(1,-2);

        points.add(a);
        points.add(b);
        points.add(c);
        points.add(d);
        points.add(e);

        List<Point> result = test.getKClosestPoints(points, new Point(3,3),3);

        for(Point point: result){
            System.out.println(point.x + "; " +point.y);
        }

    }
}
