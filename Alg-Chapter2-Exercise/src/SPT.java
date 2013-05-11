/*************************************************************************
 *  Compilation:  javac SPT.java
 *  Execution:    java SPT < jobs.txt
 *  Dependencies: Job.java
 *  
 *  Given a set of jobs and processing times, find a schedule
 *  that minimizes the average completion time of jobs.
 *
 *************************************************************************/

import java.util.Arrays;

public class SPT {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        Job[] jobs = new Job[N];
        for (int i = 0; i < N; i++) {
            String name = StdIn.readString();
            double time = StdIn.readDouble();
            jobs[i] = new Job(name, time);
        }

        // sort jobs in ascending order of processing time 
        Arrays.sort(jobs);

        // print out schedule
        for (int i = 0; i < N; i++)
            StdOut.println(jobs[i]);
    }

}
