# Garbage Collection in Java ☕🗑️

## What is Garbage Collection?

🔰 Garbage Collection (GC) is the automatic process of removing unused objects from memory.

🔰Automated process of deletion of code that is no longer needed,
    Java handles memory management automatically.



---

# Why GC is Used

- Frees memory
- Removes unused objects
- Prevents memory leaks


In C langauge :
a library function used to deallocate a block of memory that was previously reserved in the heap using 
free(), 
malloc(), 
calloc(), or 
realloc() 

In C++ :
keywords like del are used 

---

# Memory Areas

## Stack Memory
Stores:
- Variables
- References

## Heap Memory
Stores:
- Objects

GC mainly works on Heap Memory.

---

# When Object Becomes Eligible for GC

- Reference becomes `null`
- Reference changes to another object
- Object has no reference

---

# Requesting GC

```java
System.gc();
```

OR

```java
Runtime.getRuntime().gc();
```

JVM may ignore the request.

---

# Important Points

- GC is automatic
- JVM decides when to run GC
- Developers cannot force GC

---

# Modern Garbage Collectors

- G1 GC (by default agter java 1.6 version)
- ZGC
- Shenandoah

 