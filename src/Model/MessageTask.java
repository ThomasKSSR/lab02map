package Model;

import Utilis.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageTask extends Task{
    private String message;
    private String from;
    private String to;
    private LocalDateTime date;


    public MessageTask(String taskID, String description, String message, String from, String to, LocalDateTime date) {
        super(taskID, description);
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }
    @Override
    public String toString(){
        return String.format(super.toString() + "|message=" + message + "|from=" + from + "|to=" + to + "|date=" + date.format(Constants.DATE_TIME_FORMATTER) );

    }
    @Override
    public void execute(){
        System.out.println(toString());
    }

}
