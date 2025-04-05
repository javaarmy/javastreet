```mermaid
flowchart LR
    A[Source Collection] --> B(Spliterator Creation)
    B --> C{Try Split?}
    C -- Yes --> D[Sub-Spliterator]
    C -- No --> E[Process Remaining Elements]
    D --> C
    E --> F[Element Processing e.g. map, filter, reduce]
    F --> G[Result Accumulation]
    G --> H[Final Result]
    B --> E
    style A fill:#f9f,stroke:#333,stroke-width:2px
    style B fill:#ccf,stroke:#333,stroke-width:2px
    style C fill:#9f9,stroke:#333,stroke-width:2px
    style D fill:#ccf,stroke:#333,stroke-width:2px
    style E fill:#ccf,stroke:#333,stroke-width:2px
    style F fill:#ffc,stroke:#333,stroke-width:2px
    style G fill:#ccf,stroke:#333,stroke-width:2px
    style H fill:#f9f,stroke:#333,stroke-width:2px
