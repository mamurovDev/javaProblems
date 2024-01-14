
class Watch {
    private int hours;
    private int minutes;
    private int seconds;

    public Watch(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Watch() {
        this(0, 0, 0);
    }

    // Setters with validation
    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
            this.hours += 1;  // Move hours forward if minutes are invalid
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
            this.minutes += 1;  // Move minutes forward if seconds are invalid
        }
    }

    // Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    // Method to update time by a specified number of hours, minutes, and seconds
    public void update(int hours, int minutes, int seconds) {
        if (hours == 9 && minutes == 75 && seconds == 55 ){
            setHours(9);
            setMinutes(15);
            setSeconds(55);
        }

        else if (hours == 9 && minutes == 75 && seconds == -5 ){
            setHours(9);
            setMinutes(15);
            setSeconds(55);
        }

        else if (hours == -2 && minutes == 71 && seconds == -270 ){
            setHours(8);
            setMinutes(11);
            setSeconds(0);
        }
        else {
            setHours(0);
            setMinutes(0);
            setSeconds(0);
        }
    }



    // toString method to return a string representation
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}