# Threads-and-the-Singleton

When I first tried to create this, I made the mistake of trying to contain it all within one class
Clearly this violates many things I should know, So I separated it into three classes
I was able to get the project to build and code to run.

this is what i see when i run the code in the termminal output. 

/Users/Retina1/Library/Java/JavaVirtualMachines/openjdk-21.0.2/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=51322:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/Retina1/IdeaProjects/Threads-and-the-Singleton/out/production/Threads-and-the-Singleton SingletonTest
Singleton instance hash code from thread 21: 1472029495
Singleton instance hash code from thread 22: 1472029495
Singleton instance hash code from thread 23: 1472029495

Process finished with exit code 0

Every time I rerun the code,the hash ID changes.
I also observe the thread ID, confirming that it is indeed running
Across multiple threads. So this shows that the object is being accessed
Across different threads.