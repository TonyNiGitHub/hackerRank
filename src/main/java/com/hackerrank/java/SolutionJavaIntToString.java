package com.hackerrank.java;

import java.security.Permission;
import java.util.Scanner;

public class SolutionJavaIntToString {
    //DoNotTerminate.forbitExit();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String s = String.valueOf(n);
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}

// The following class will prevent you from terminating the code using exit(0)!
/*
class DoNotTerminate {
    public  static class ExitRappedException extends SecurityException {
        private static final long serialVersionUID = 1;
    }

    public static void forbitExit() {
        final SecurityManager securityManager = new SecurityManager(); {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")){
                    throw new ExitRappedException()
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

 */