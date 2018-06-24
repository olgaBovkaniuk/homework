package com.gmail.olgabovkaniuk.bovkaniuk_12.task2;

import com.gmail.olgabovkaniuk.util.ScannerService;

public class ExceptionService {
    private ScannerService scannerService = new ScannerService();

    public void getException() {
        int number = 0;
        System.out.println("Please, enter a number: ");
        number = scannerService.getNumber();
        while (true) {
            if (number >= 1 && number <= 3) {
                getExceptionByNumber(number);
                System.out.println("Please, enter a number: ");
                number = scannerService.getNumber();
            } else if (number == 0) {
                System.out.println("This is 0!!! End of programme.");
                break;
            } else {
                System.out.println("Please, enter a number from 1 to 3: ");
                number = scannerService.getNumber();
            }
        }
    }

    private void getExceptionByNumber(int number) {
        try {
            switch (number) {
                case 1:
                    throw new FirstException("This is FIRST exception!");
                case 2:
                    throw new SecondException("This is SECOND exception!");
                case 3:
                    throw new ThirdException("This is THIRD exception!");
                default:
                    break;
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class FirstException extends RuntimeException {
    public FirstException(String message) {
        super(message);
    }
}

class SecondException extends RuntimeException {
    public SecondException(String message) {
        super(message);
    }
}

class ThirdException extends RuntimeException {
    public ThirdException(String message) {
        super(message);
    }
}
