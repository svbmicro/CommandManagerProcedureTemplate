# CommandManagerProcedureTemplate
Use this template to develop Microstrategy Command manager procedures in useful java environment (IntelliJ IDEA, NetBeans, Eclipse)

## WHY
Have you try to develop big procedure in command manager? This is a big challenge. There are a lot of errors in java syntax. We used to avoid these problems because IDE help us. That is why you'd better to use IDE for developing procedure and run it in command manager.

## HOW TO USE THIS TAMPLATE 
1. Load all files in one project
2. Insert your code to the main class. [Here](https://github.com/svbmicro/CommandManagerProcedureTemplate/blob/09a7f0f6e05ba998eaf38abaeab35f4a7ed3516e/Main.java#L8) 
3. Use only full path for java classes. Example:
```
//You can't use import java.io. Use full path. 
  java.io.BufferedReader in;
  java.io.BufferedWriter out;

  in = new java.io.BufferedReader(new java.io.InputStreamReader(clientSocket.getInputStream()));
  out = new java.io.BufferedWriter(new java.io.OutputStreamWriter(clientSocket.getOutputStream()));
```
3. Done syntax check
4. Copy code to command manager and run it.

I hope it will be helpful.
