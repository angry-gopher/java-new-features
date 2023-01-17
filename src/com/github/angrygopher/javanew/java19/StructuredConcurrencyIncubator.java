package com.github.angrygopher.javanew.java19;

//import jdk.incubator.concurrent.StructuredTaskScope;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Future;

public class StructuredConcurrencyIncubator {

//    Response handle() throws ExecutionException, InterruptedException {
//        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
//            Future<String> user = scope.fork(this::findUser);
//            Future<Integer> order = scope.fork(this::fetchOrder);
//
//            scope.join();           // Join both forks
    //short-circuiting pattern  if one of tasks fails the rest fill be cancelled as well
//            scope.throwIfFailed();  // ... and propagate errors
//
//            // Here, both forks have succeeded, so compose their results
//            return new Response(user.resultNow(), order.resultNow());
//        }
//    }

    record Response(String user, int order) {
    }

    private String findUser() throws InterruptedException {
        Thread.sleep(1000);
        return "user";
    }

    private int fetchOrder() throws InterruptedException {
        Thread.sleep(1000);
        return 1;
    }
}
