
Stream Gatherers:
1-  it is inspired by Collector
    java.util.stream.gatherer<T,A,R>
        - initializer()
        - integrator()
        - combiner
        - finisher()
2-  main diferences Gatherer vs Collector
    Integrator<A, T, R> integrator() vs BiConsumer<A, T> accumulator();
            Each input element is appliced to the integrator, together with the state, downstream handle for as long as it returns true.
            boolean integrate(A state, T elment, Downstream<R> downstream)
    Biconsumer<A, Downstream<R>> finisher() vs Function<A, R> finisher()
        Agatheres finisher does not return a result, but it can produce 0..N values to downstream.
        when there are no more input elements, this function is invoked with the state and a downstream -handle to perform a final action.
    interface Gatherr.Downstream<R> has the following methods
        boolean push(R element)
            attempts to pass hte given element to the next processing stage in the stream pipeline.return true if more elmenets are desired and false if not.
        default boolean isRejecting() return false;
            indicates whether invoking the pus-method on this downstream will be rejected and while returning ture does not gaurantee a subsequent push will succeed.
            if it returns false then it must not return true again.
