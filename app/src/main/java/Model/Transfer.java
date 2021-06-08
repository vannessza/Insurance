package Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Transfer implements Parcelable {

    private String uangDeposit;

    public Transfer(String uangDeposit) {
        this.uangDeposit = uangDeposit;
    }

    public String getUangDeposit() {
        return uangDeposit;
    }

    public void setUangDeposit(String uangDeposit) {
        this.uangDeposit = uangDeposit;
    }

    public static Creator<Transfer> getCREATOR() {
        return CREATOR;
    }

    public Transfer() {
        this.uangDeposit="";
    }

    protected Transfer(Parcel in) {
        uangDeposit = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uangDeposit);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Transfer> CREATOR = new Creator<Transfer>() {
        @Override
        public Transfer createFromParcel(Parcel in) {
            return new Transfer(in);
        }

        @Override
        public Transfer[] newArray(int size) {
            return new Transfer[size];
        }
    };
}
