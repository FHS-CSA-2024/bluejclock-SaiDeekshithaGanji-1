package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        System.out.println("Testing Clock Display:");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2,45);
        String test2Output = test2.getTime();
        System.out.println("\tArg Con Test - " + test2Output);
        
        test2.setTime(5,15);
        String test3Output = test2.getTime();
        System.out.println("\tSet Time Test - " + test3Output);
        
        //TODO: Write a TickTest
        //Tick test for 03:32 to 03:33
        ClockDisplay tickTestCD1 = new ClockDisplay(3,32);
        String tickTestCD1Output = tickTestCD1.getTime();
        System.out.println("\n\tTickTest1 before increment - " + tickTestCD1Output);
        tickTestCD1.timeTickCD();
        tickTestCD1Output = tickTestCD1.getTime();
        System.out.println("\tTickTest1 After increment - " + tickTestCD1Output);
        
        // Tick test for 03:09 to 03:10
        ClockDisplay tickTestCD2 = new ClockDisplay(3,9);
        String tickTestCD2Output = tickTestCD2.getTime();
        System.out.println("\n\tTickTest2 before increment - " + tickTestCD2Output);
        tickTestCD2.timeTickCD();
        tickTestCD2Output = tickTestCD2.getTime();
        System.out.println("\tTickTest2 After increment - " + tickTestCD2Output);
        
        // Tick test for 01:59 to 02:00
        ClockDisplay tickTestCD3 = new ClockDisplay(1,59);
        String tickTestCD3Output = tickTestCD3.getTime();
        System.out.println("\n\tTickTest3 before increment - " + tickTestCD3Output);
        tickTestCD3.timeTickCD();
        tickTestCD3Output = tickTestCD3.getTime();
        System.out.println("\tTickTest3 After increment - " + tickTestCD3Output);
        
        //  Tick test for 09:59 to 10:00
        ClockDisplay tickTestCD4 = new ClockDisplay(9,59);
        String tickTestCD4Output = tickTestCD4.getTime();
        System.out.println("\n\tTickTest4 before increment - " + tickTestCD4Output);
        tickTestCD4.timeTickCD();
        tickTestCD4Output = tickTestCD4.getTime();
        System.out.println("\tTickTest4 After increment - " + tickTestCD4Output);
        
        //  Tick test for 23:59 to 00:00
        ClockDisplay tickTestCD5 = new ClockDisplay(23,59);
        String tickTestCD5Output = tickTestCD5.getTime();
        System.out.println("\n\tTickTest5 before increment - " + tickTestCD5Output);
        tickTestCD5.timeTickCD();
        tickTestCD5Output = tickTestCD5.getTime();
        System.out.println("\tTickTest5 After increment - " + tickTestCD5Output);
        
        
        
        
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        //  * Tick test for 01:00:59 to 01:01:00
        //  * Tick test for 01:59:59 to 02:00:00
        //  * Tick test for 23:59:59 to 00:00:00
        
        System.out.println("\n\nTesting Clock Display Seconds: ");
        ClockDisplaySeconds test4 = new ClockDisplaySeconds();
        String test4Output = test4.getTime();
        System.out.println("\tEmpty Con Test - " + test4Output);
        
        ClockDisplaySeconds test5 = new ClockDisplaySeconds(2,45,55);
        String test5Output = test5.getTime();
        System.out.println("\tArg Con Test - " + test5Output);
        
        test5.setTime(5,15,58);
        String test6Output = test5.getTime();
        System.out.println("\tSet Time Test - " + test6Output);
        
        //TODO: Write a TickTest
        //Tick test for 03:32:59 to 03:33:00
        ClockDisplaySeconds tickTest1 = new ClockDisplaySeconds(3,32,59);
        String tickTest1Output = tickTest1.getTime();
        System.out.println("\n\tTickTest1 CDS before increment - " + tickTest1Output);
        tickTest1.timeTick();
        tickTest1Output = tickTest1.getTime();
        System.out.println("\tTickTest1 CDS After increment - " + tickTest1Output);
        
        
        //  * Tick test for 01:00:59 to 01:01:00
        ClockDisplaySeconds tickTest2 = new ClockDisplaySeconds(1,0,59);
        String tickTest2Output = tickTest2.getTime();
        System.out.println("\n\tTickTest2 CDS before increment - " + tickTest2Output);
        tickTest2.timeTick();
        tickTest2Output = tickTest2.getTime();
        System.out.println("\tTickTest2 CDS After increment - " + tickTest2Output);
        
        //  * Tick test for 01:59:59 to 02:00:00
        ClockDisplaySeconds tickTest3 = new ClockDisplaySeconds(1,59,59);
        String tickTest3Output = tickTest3.getTime();
        System.out.println("\n\tTickTest3 CDS before increment - " + tickTest3Output);
        tickTest3.timeTick();
        tickTest3Output = tickTest3.getTime();
        System.out.println("\tTickTest3 CDS After increment - " + tickTest3Output);
        
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickTest4 = new ClockDisplaySeconds(23,59,59);
        String tickTest4Output = tickTest4.getTime();
        System.out.println("\n\tTickTest4 CDS before increment - " + tickTest4Output);
        tickTest4.timeTick();
        tickTest4Output = tickTest4.getTime();
        System.out.println("\tTickTest4 CDS After increment - " + tickTest4Output);
        
        
        /*CHALLENGE*/
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics 
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32PM to 03:33PM
        //  * Tick test for 11:59PM to 12:00AM
        //  * Tick test for 11:59AM to 12:00PM
        //  * Tick test for 12:59PM to 01:00PM
        
        System.out.println("\nTesting Clock Display12Hour:");
        ClockDisplay12Hour test7 = new ClockDisplay12Hour();
        String test7Output = test7.getTime();
        System.out.println("\n\tEmpty Con Test - " + test7Output);
        
        ClockDisplay12Hour test8 = new ClockDisplay12Hour(3,37,false);
        String test8Output = test8.getTime();
        System.out.println("\tArg Con Test - " + test8Output);
        test8.setTime(5,15);
        String test9Output = test8.getTime();
        System.out.println("\tSet Time Test - " + test9Output);
        
       //  * Tick test for 03:32PM to 03:33PM
       ClockDisplay12Hour tickTest5 = new ClockDisplay12Hour(3,32, false);
       String tickTest5Output = tickTest5.getTime();
       System.out.println("\n\tTickTest1 CD12H before increment - " + tickTest5Output);
       tickTest5.timeTick();
       tickTest5Output = tickTest5.getTime();
       System.out.println("\tTickTest1 CD12H After increment - " + tickTest5Output);
       
       //  * Tick test for 11:59PM to 12:00AM
       ClockDisplay12Hour tickTest6 = new ClockDisplay12Hour(11,59, false);
       String tickTest6Output = tickTest6.getTime();
       System.out.println("\n\tTickTest2 CD12H before increment - " + tickTest6Output);
       tickTest6.timeTick();
       tickTest6Output = tickTest6.getTime();
       System.out.println("\tTickTest2 CD12H After increment - " + tickTest6Output);
       
       //  * Tick test for 11:59AM to 12:00PM
       ClockDisplay12Hour tickTest7 = new ClockDisplay12Hour(11,59, true);
       String tickTest7Output = tickTest7.getTime();
       System.out.println("\n\tTickTest3 CD12H before increment - " + tickTest7Output);
       tickTest7.timeTick();
       tickTest7Output = tickTest7.getTime();
       System.out.println("\tTickTest3 CD12H After increment - " + tickTest7Output);
       
       //  * Tick test for 12:59PM to 01:00PM
       ClockDisplay12Hour tickTest8 = new ClockDisplay12Hour(12,59, false);
       String tickTest8Output = tickTest8.getTime();
       System.out.println("\n\tTickTest4 CD12H before increment - " + tickTest8Output);
       tickTest8.timeTick();
       tickTest8Output = tickTest8.getTime();
       System.out.println("\tTickTest4 CD12H After increment - " + tickTest8Output);
       
    }
}
