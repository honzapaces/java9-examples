package xyz.honzpaces.java9.samples.processapi;

import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;

/**
 * Created by janpa on 25.04.2016.
 */
public class ProcessHandleExample {

    public static void main(String[] args) throws IOException {
        Process notePadProcess = new ProcessBuilder("notepad").start();
        notePadProcess.onExit();
        currentProcess();
        getAllProcesses();
    }

    public static void currentProcess(){
        ProcessHandle currentProcess = ProcessHandle.current();
        printProcessInfo(currentProcess);
    }

    public static void printProcessInfo(ProcessHandle proc){
        System.out.println("Process Info");
        System.out.println("PID:" + proc.getPid());
        System.out.println("Command: "+ proc.info().command().orElse("empty command"));
        System.out.println("Arguments: "+ proc.info().arguments().orElse(new String[] {"no arguemnts"}));
        System.out.println("User: "+ proc.info().user().orElse("no user"));
        System.out.println("Start: "+ proc.info().startInstant().orElse(Instant.now()));
        System.out.println("Cpu Duration: "+ proc.info().totalCpuDuration().orElse(Duration.ZERO));
    }

    public static void getAllProcesses(){
        ProcessHandle.allProcesses()
                .filter(processHandle -> processHandle.info().command().isPresent())
                .forEach((processHandle) -> printProcessInfo(processHandle));
    }
}
