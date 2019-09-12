package duke.task;

/**
 * A Task that contains both a description and a date where the task takes place.
 */
public class Event extends Task {
    protected String dateTime;

    /**
     * Constructs an instance of an event task.
     *
     * @param description the description fo the event task.
     * @param dt the date of that event task.
     */
    public Event(String description, String dt) {
        super(description);
        this.dateTime = dt;
    }

    /**
     * Informs the event date.
     *
     * @return event date.
     */
    public String getDateTime() {
        return dateTime;
    }

    /**
     * Provides the string representation of an instance of event task.
     *
     * @return the event task's string representation.
     */
    @Override
    public String toString() {
        return String.format("[E][%s] %s (at: %s)", getStatusIcon(), getDescription(), getDateTime());
    }
}
