package com.branden;

/**
 * Problem 3, Smartphone:
 * A smartphone is running 3 apps, each of which syncs and download data from a different server.

 * App A syncs and downloads data every hour, and downloads 0.5KB each time
 * App B syncs and downloads daily, and downloads 2KB every time
 * App C, when installed, takes up 1MB. This app syncs and downloads every 4 hours, and every time it syncs itdownloads 0.1% of its current size.

 * With all apps installed, the phone has 5MB of free space.
 * With all 3 apps running continuously, how long will it be before the phone runs out of space?

 * Assume the phone is running continuously and nothing else is using space on the phone.

 * Hint 1: the modulus operator is helpful. An expression like ( number % 4 == 0 ) is true if number divides evenly by 4.
 * Hint 2: the answer is several thousand hours.
 */
public class AdvancedProblem3 {
    static void run() {

        // times per day
        final int hourly = 1;
        final int daily = hourly * 24;

        // convert all units to bytes
        // 5 MB to bytes

        int freeSpace = 5000000;

        // App A
        // ------
        // 0.5KB = 500 bytes

        int appAupateSize = 500;
        // every hour
        int appAupdateRate = hourly;

        // App B
        // ------
        // 2KB

        int appBupdateSize = 2000;
        // every 4 hours
        int appBupdateRate = daily;

        // App C
        // ------
        // 1MB

        double appCSize = 1000000;
        // every 24 hours
        int appCupdateRate = hourly * 4;
        double appCupdateSize;
        int hour = 1;
        while (freeSpace > 0) {

            if (hour % appAupdateRate == 0) {
                freeSpace -= appAupateSize;
            }
            if (hour % appBupdateRate == 0) {
                freeSpace -= appBupdateSize;
            }
            if (hour % appCupdateRate == 0) {
                // update size is 1 percent of current size
                appCupdateSize =  appCSize * 0.0001;
                // new app c size
                appCSize = appCSize + appCupdateSize;

                freeSpace -= appCupdateSize;
            }
            hour++;

        }
        System.out.println(String.format("It took %d hours to reach the phones capacity", hour));

    }
}