package week7a;

public class Main {
	public static void main(String[] args) {
	Coordinate point []=new Coordinate[8];
	point[0]=new Coordinate(2,1);
	point[1]=new Coordinate(0,0);
	point[2]=new Coordinate(0,3);
	point[3]=new Coordinate(3,4);
	point[4]=new Coordinate(5,5);
	point[5]=new Coordinate(3,2);
	point[6]=new Coordinate(4,3);
	point[7]=new Coordinate(4,0); 
	
	int n=point.length;
	GiftWrapping gfw = new GiftWrapping();
	gfw.convexHall(point, n);
}
	
}
