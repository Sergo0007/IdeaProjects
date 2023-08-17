package homework_21;

public class Phone extends Device {
    private String phone;
    private String call;
    private String sms;


    public Phone(int model, String brand) {
        super(model, brand);

    }

    public String getPhone() {
        return phone;
    }

    public String getCall() {
        return call;
    }

    public String getSms() {
        return sms;
    }

    public void callerCalled() {


    }

    public void gotTextSms() {


    }


    public String toString() {
        return "Phone: " +   ",callerCalled "  + ",gotTextSms " ;

    }

}




