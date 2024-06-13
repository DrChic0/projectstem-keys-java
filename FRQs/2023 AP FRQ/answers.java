//use to not be smart idk dont be completely reer

public int findFreeBlock(int period, int duration) {
        // Iterate through each possible start minute in the period
        for (int startMinute = 0; startMinute <= 60 - duration; startMinute++) {
            boolean blockFound = true;

            // Check each minute in the block to see if it is free
            for (int minute = startMinute; minute < startMinute + duration; minute++) {
                if (!isMinuteFree(period, minute)) {
                    blockFound = false;
                    break;
                }
            }

            // If a block is found, return the starting minute of that block
            if (blockFound) {
                return startMinute;
            }
        }

        // If no suitable block is found, return -1
        return -1;
    }

public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        // Iterate through each period from startPeriod to endPeriod
        for (int period = startPeriod; period <= endPeriod; period++) {
            // Use findFreeBlock to find the first block of free minutes in the current period
            int startMinute = findFreeBlock(period, duration);

            // If a free block is found, reserve it and return true
            if (startMinute != -1) {
                reserveBlock(period, startMinute, duration);
                return true;
            }
        }

        // If no suitable block is found in any period, return false
        return false;
    }

public class Sign {
    private String message;
    private int width;

    // Constructor
    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    // Method to return the number of lines needed to display the text on the sign
    public int numberOfLines() {
        if (message.isEmpty()) {
            return 0;
        }
        return (message.length() + width - 1) / width;
    }

    // Method to return the message broken into lines separated by semicolons
    public String getLines() {
        if (message.isEmpty()) {
            return null;
        }
        
        StringBuilder result = new StringBuilder();
        int length = message.length();
        
        for (int i = 0; i < length; i += width) {
            if (i > 0) {
                result.append(";");
            }
            int end = Math.min(i + width, length);
            result.append(message, i, end);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage
        Sign sign = new Sign("HelloWorld", 3);
        System.out.println(sign.numberOfLines()); // Output: 4
        System.out.println(sign.getLines());      // Output: Hel;loW;orl;d
    }
}

public void cleanData(double lower, double upper) {
        // Create a new list to store valid temperatures
        ArrayList<Double> cleanedTemperatures = new ArrayList<>();

        // Iterate through the temperatures and add valid temperatures to the new list
        for (Double temp : temperatures) {
            if (temp >= lower && temp <= upper) {
                cleanedTemperatures.add(temp);
            }
        }

        // Replace the original temperatures list with the cleaned list
        temperatures = cleanedTemperatures;
    }

public int longestHeatWave(double threshold) {
        int longest = 0;
        int currentLength = 0;

        for (Double temp : temperatures) {
            if (temp > threshold) {
                currentLength++;
                if (currentLength > longest) {
                    longest = currentLength;
                }
            } else {
                // Reset currentLength if the temperature is not above the threshold
                if (currentLength >= 2) {  // Ensure it was a valid heat wave before resetting
                    currentLength = 0;
                } else {
                    currentLength = 0;
                }
            }
        }

        // In case the heat wave continues till the end of the list
        if (currentLength >= 2 && currentLength > longest) {
            longest = currentLength;
        }

        return longest;
    }

public boolean moveCandyToFirstRow(int col) {
        // Check if the element at row 0 and column col already contains a piece of candy
        if (box[0][col] != null) {
            return true;
        }

        // Search the remaining rows in column col for a piece of candy
        for (int row = 1; row < box.length; row++) {
            if (box[row][col] != null) {
                // Move the candy to the first row
                box[0][col] = box[row][col];
                // Set the previous location to null
                box[row][col] = null;
                return true;
            }
        }

        // Return false if no candy was found in the specified column
        return false;
    }

public Candy removeNextByFlavor(String flavor) {
        // Traverse the box from the last row to the first row
        for (int row = box.length - 1; row >= 0; row--) {
            // Traverse each row from left to right
            for (int col = 0; col < box[row].length; col++) {
                // Check if the current position has a Candy object with the desired flavor
                if (box[row][col] != null && box[row][col].getFlavor().equals(flavor)) {
                    // Remove the candy from the box
                    Candy removedCandy = box[row][col];
                    box[row][col] = null;
                    return removedCandy;
                }
            }
        }
        // Return null if no Candy with the desired flavor is found
        return null;
    }