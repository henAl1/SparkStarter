package main.java.batchDemo;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by henok on 9/4/201777.
 * prakkkkk
 */
public class BatchDemo {


    public static void main(String ...args) {
        String master = "local[*]";
        SparkConf conf = new SparkConf().setAppName(BatchDemo.class.getName()).setMaster(master);
        JavaSparkContext context = new JavaSparkContext(conf);

        // should rename the context for future tests
        //added more things
        // 9/4/2017
        context.textFile("test")
                .flatMap(text -> Arrays.asList(text.split(" ")).iterator())
                .mapToPair(word ->new Tuple2<>(word,1))
                .reduceByKey((a,b)->b+1)
                .foreach(result -> System.out.println(result._1()+","+result._2()));


    }

}
