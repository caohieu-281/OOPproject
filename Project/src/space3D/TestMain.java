package space3D;
import space3D.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMain {
	
//	public static List<Point> test = new ArrayList<Point>();
	public static List<Point> test1 = new ArrayList<Point>();
	public static List<Point> test = new ArrayList<Point>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		test.add(new Point(0,0,0));
//		test.add(new Point(2,0,0));
//		test.add(new Point(2,1,0));
//		test.add(new Point(0,1,0));
//		test.add(new Point(0,0,1));
//		test.add(new Point(2,0,1));
//		test.add(new Point(2,1,1));
//		test.add(new Point(0,1,1));
//		Rectangular hey = new Rectangular(test);
//		
//		test1.add(new Point(1,0.5,0));
//		test1.add(new Point(1,3,0));
//		test1.add(new Point(0,0.5,0));
//		test1.add(new Point(0,3,0));
//		test1.add(new Point(1,0.5,1));
//		test1.add(new Point(0,0.5,1));
//		test1.add(new Point(1,3,1));
//		test1.add(new Point(0,3,1));
//		Rectangular hey1 = new Rectangular(test1);
//		
//		Room rm = new Room();
//		System.out.println(rm.checkUpAndDownRec(hey, hey1));
		
		String url = "/home/sapphires/OOP-Java-k2n3/Lab/Project/src/input4.txt";
		InputFile test = new InputFile(url);
		test.GetInput();
		Room rm = new Room(test.getRoom(), test.getRecInRoom(), test.getCamInRoom());

	}
	
	 
}
