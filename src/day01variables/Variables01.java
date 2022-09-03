package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //I am creating integer variable whose name is
        int age =12;

        //I am creating a char variable whose name is initial
        char initial = 'A';

        //Lets print the values of age and initial variable on the console.
        System.out.println(age);

        System.out.println(initial);
        //create 3 integer variables, assign values to them,
        // a)Print them on the console one by one
        // b)Print the sum of the 3 integers
        // b)Print the sum of the 3 integers by a label at the beginning. Example: 'The sum is 39'

        int i01=12, i02=13, i03=15;
        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);
        System.out.println(i01 + i02 + i03);

        System.out.println("The sum is" + i01 + i02 + i03);// The sum is 121314
        System.out.println("The sum is" + (i01 + i02 + i03));

        int sum = i01 + i02 + i03;
        System.out.println("The sum is " + sum);

        //Create 2 integer variables and print their multipication on the console with a label

        int i04=15, i05=16;
        System.out.println("The multiplication is " + i04 * i05);

        /*
            Order of Operation in Math
            1)Do the operations inside the parenthesis first
            2)Do the multiplication and division
            3)Do addition and subtraction

         */





    }


}
