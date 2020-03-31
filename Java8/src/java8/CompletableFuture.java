package java8;
/**
 * What is CompletableFuture?
 *  - Helps on Java Asyncronous Programming.
 * Why we need this?
 *  - Exising Future class will not allow us for following.
 *      - Chain of computation is not possible
 *      - Cannot combine multiple Futures, run another function after all of them
 *      - No Exception Handling
 *      - You cannot complete the future in middle of operation.
 */
public class CompletableFuture{
     public static void main(String[] args) {
        //runAsync,supplyAsync
        //thenApply,thenAccept,thenRun
        //thenCompose,thenCombine
        //allOf,anyOf
        //exceptionally(),handle()
    }
}