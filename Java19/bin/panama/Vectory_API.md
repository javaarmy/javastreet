# Vector API
The Vector API enables explicit cross platform data parallel programming
 - For cases where the runtime compilers auto-vectorizer cannot reliably identify data parallelism from sequential code
 - Vector API expressions are reliably compiled to vector hardware instructions, when available
    - otherwise falls back to scalar code


    references: Vector API SIMD programming in java  https://www.youtube.com/watch?v=VYo3p4R66N8
        Its a advanced API for developing explicit data parallel algorithms
            - SIMD - single instruction Multiple Data
            - Algorithms that cannot be inferred a runtime compiler( auto-vectorizer)
            - leverage ahardware vector instructions for data parallelism
            - One vector instruction can perform N operations in ~same CPU cycle as one operation
    Goals
        - cross platform support across multiple CPU architectures
            - Intel SSE, AVX, AVX-512
            - ARM Neon, SVE
            - PPC
            - RISC-V    
       Vector API, 
        - what you see is what you Get(WYSIWYG) API
        - Most Operations in Vector API have a clear mapping to vector hardware instructions on supporting CPU's
        - uses cases - Linear Algebra, image processing, character decoding, 
        - could be used within the Java Platform
        - Hostspot runtime C2 compiler contain numerous intrinsics and stubs leveraging vector hardware instructions
        - These could be replaced with cross platform Java code
        - Reducing the maintenance cost of the Java code base
        