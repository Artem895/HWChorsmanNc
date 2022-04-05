package ChorsmanHomeWork.ChHW2.Chapter2;

import com.opencsv.bean.CsvBindByName;

public class Mycl {
    @CsvBindByName(column = "step_id")
    private int step_id;
    @CsvBindByName(column = "timestamp")
    private int timestamp;
    @CsvBindByName(column = "submission_status")
    private String submission_status;
    @CsvBindByName(column = "user_id")
    private int user_id;

    /*public  Mycl(int step_id, int timestamp, String  submission_status, int user_id) {
        this.step_id = step_id;
        this.timestamp = timestamp;
        this.submission_status = submission_status;
        this.user_id = user_id;
    }*/

    public int getStep_id() {
        return step_id;
    }

    public void setStep_id(int step_id) {
        this.step_id = step_id;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getSubmission_status() {
        return submission_status;
    }

    public void setSubmission_status(String submission_status) {
        this.submission_status = submission_status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Mycl{" +
                "step_id=" + step_id +
                ", timestamp=" + timestamp +
                ", submission_status=" + submission_status +
                ", user_id=" + user_id +
                '}';
    }
}

