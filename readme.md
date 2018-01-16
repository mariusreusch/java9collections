Collections Refueled by Stuart Marks
https://www.youtube.com/watch?v=LI8rpkOGU3c

Collections.unmodifiableList()

Map.of, Map.ofEntries, Set.of, List.of: 10 overloaded methosds plus varargs

why not "collection literals" as in in other lamguages?

Why 10 overloads?
From the JEP docs itself -
Description -
These will include varargs overloads, so that there is no fixed limit on the collection size. However, the collection instances so created may be tuned for smaller sizes. Special-case APIs (fixed-argument overloads) for up to ten of elements will be provided. While this introduces some clutter in the API, it avoids array allocation, initialization, and garbage collection overhead that is incurred by varargs calls. Significantly, the source code of the call site is the same regardless of whether a fixed-arg or varargs overload is called.
https://stackoverflow.com/a/41918976/1992820