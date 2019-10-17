package Academy.LearnProgramming;

public class Main {

    public static void main(String[] args)
    {
        //Declaring and assigning values for names of the runners and their respective run time
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265};
        // code for sorting the array elements
//        int min=0;
//        String swap="";
//        for (int i=0;i<times.length;i++)
//        {
//            for (int j = i + 1; j < times.length; j++)
//                {
//                    if (times[i] > times[j])
//                    {
//                        min = times[j];
//                        times[j] = times[i];
//                        times[i] = min;
//                        swap=names[j];
//                        names[j]=names[i];
//                        names[i]=swap;
//                    }
//                }
//        }
//        System.out.println("The fastest runner is " +names[0]+" with run time "+times[0]+ " minutes.");
//        System.out.println("The second fastest runner is " +names[1]+" with run time "+times[1] + " minutes.");


        for(int i=1;i<times.length;i++)
        {
            if(times[i]<times[i-1])
            {
                times[i]=times[i]+times[i-1];
                times[i-1]=times[i]-times[i-1];
                times[i]=times[i]-times[i-1];
                i=0;
            }

        }
        System.out.println("The fastest runner is " +names[0]+" with run time "+times[0]);
        System.out.println("The second fastest runner is " +names[1]+" with run time "+times[1]);
    }
}
