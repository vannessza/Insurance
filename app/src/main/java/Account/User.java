package Account;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String nama, email, password, tanggalLahir, nomorTelepon;

    public User(String nama, String email, String password, String tanggalLahir, String telepon) {
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.tanggalLahir = tanggalLahir;
        this.nomorTelepon = telepon;
    }

    public User() {
        this.nama="";
        this.email="";
        this.password="";
        this.tanggalLahir="";
        this.nomorTelepon="";
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTelepon() {
        return nomorTelepon;
    }

    public void setTelepon(String telepon) {
        this.nomorTelepon = telepon;
    }


    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    protected User(Parcel in) {
        nama = in.readString();
        email = in.readString();
        password = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(email);
        dest.writeString(password);
        dest.writeString(tanggalLahir);
        dest.writeString(nomorTelepon);

    }
}
