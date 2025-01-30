import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stream API Learning!!");

        //1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list= Arrays.asList(5,9,14,18,17,26,29,56,47,36);
        List<Integer> res=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(res);

    }
}