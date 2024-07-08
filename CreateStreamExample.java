package Java_8;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamExample {
	public static void main(String ar[]) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8);
		Stream<Integer> listStream=list.stream();
		listStream.forEach(System.out::print);
		
		Integer[] numArr=new Integer[]{1,2,3,4,5,6,7,8};
		Stream<Integer> numArrStream=Arrays.stream(numArr);
		numArrStream.forEach(System.out::print);
		
		Stream<Integer> numStream=Stream.of(1,2,3,4,5,6,7,8);
		numStream.forEach(System.out::print);
	}
}
