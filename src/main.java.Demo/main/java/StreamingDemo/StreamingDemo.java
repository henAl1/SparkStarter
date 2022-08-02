package main.java.StreamingDemo;

import org.apache.spark.SparkConf;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaStreamingContext;

/**
 * Created by henok on 9/4/20177.
 * Needs correction ? ? ? ? ?
 */
public class StreamingDemo {

    public static void main(String ...args) {
        String master = "local[*]";
        SparkConf conf = new SparkConf().setAppName(StreamingDemo.class.getName()).setMaster(master);
        JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.seconds(1));
    }

}
