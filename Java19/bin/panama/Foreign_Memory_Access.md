# What is Project panama?
  ## In certain domains use of native libraries is becoming increasingly common
    - off-CPU computing ( Cuda, OpenCL)
    - Deep learning(Blas, cuBlas, cuDNN, Tensorflow)
    - Graphics processing ( OpenGL, vukan, DirectX)
    - Others, (CRIU, fuse, io_uring, OpenSSL, V8, ucx)

    now these libraries dont need to be rewritten in Java.
# Why not Existing JNI?
  ## JNI is one option, however
        - Hard to use, brittle combination of JAva and C
        - Expensibe to maintain, error-prone, poor error checking
        - JNI errors can crash JVM
  ## off-heap memory allocation is supported by the ByteBuffer API and it has some limits
        - 2G address limit
        - no way to free a direct buffer
  ## common problemns
    - automate Generation of JNI stubs
    - how to pass data from Javacode to native( and back)
# Overview
    - REplaces bytebuffers with some efficient and future-proof API
    - Replaces JNI with easier to use
    - Simplify building and distributing JAva bindings for native libraries.(jextrat - tools)
## Foreign Function & Memory API
    - low-level, safe and efficient memory access across a variety of memory sources
    - memory segment - models a contiguous memory region
        - spatial, temporal and confinement bounds provide safety
        - bidirectional interop with arrays, bute buffers
    the contents of membory segment are described programatically by a memory layout
    A memory address models a reference into a memory location(off-heap)
    Memory segments are dereferenced wusing memory using memory access handles
    for simple cases, var handles are wrapped in easy to use accessors
    for comples, structured access , var handles can be derived from layouts, or using combinatorys
## Foreign Linker API

## Jextrat tools

## Vectory API