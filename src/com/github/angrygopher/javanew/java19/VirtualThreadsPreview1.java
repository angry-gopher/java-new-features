package com.github.angrygopher.javanew.java19;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadsPreview1 {
//    A virtual thread is an instance of java.lang.Thread that runs Java code on an underlying OS thread
//    but does not capture the OS thread for the code's entire lifetime.
//    This means that many virtual threads can run their Java code on the same OS thread, effectively sharing it.
//    While a platform thread monopolizes a precious OS thread, a virtual thread does not.
//    The number of virtual threads can be much larger than the number of OS threads.
//    Go has goroutines

    public static void main(String[] args) {
        // compare with ThreadPoolExecutor(no thread pools!)
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }  // executor.close() is called implicitly, and waits
    }
}
