package Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Plan100Model {
    private long No,PremiTahunan, Klaim, NilaiDijamin, DeathTerminal, TotalKlaim, NilaitidakDijamin;

    public Plan100Model() {
        No = 0;
        PremiTahunan = 0;
        Klaim = 0;
        NilaiDijamin = 0;
        DeathTerminal = 0;
        TotalKlaim = 0;
        NilaitidakDijamin = 0;
    }
    public Plan100Model(long no, long premiTahunan, long klaim, long nilaiDijamin, long deathTerminal, long totalKlaim, long nilaitidakDijamin) {
        No = no;
        PremiTahunan = premiTahunan;
        Klaim = klaim;
        NilaiDijamin = nilaiDijamin;
        DeathTerminal = deathTerminal;
        TotalKlaim = totalKlaim;
        NilaitidakDijamin = nilaitidakDijamin;
    }
    protected Plan100Model(Parcel in){
        No= in.readLong();
        PremiTahunan = in.readLong();
        Klaim = in.readLong();
        NilaiDijamin = in.readLong();
        DeathTerminal = in.readLong();
        TotalKlaim = in.readLong();
        NilaitidakDijamin = in.readLong();
    }

    public void writeToParcel(Parcel dest, int flags){
        dest.writeLong(No);
        dest.writeLong(PremiTahunan);
        dest.writeLong(Klaim);
        dest.writeLong(NilaiDijamin);
        dest.writeLong(DeathTerminal);
        dest.writeLong(TotalKlaim);
        dest.writeLong(NilaitidakDijamin);
    }
    public int describeContents(){
        return 0;
    }

    public static final Parcelable.Creator<Plan100Model> CREATOR = new Parcelable.Creator<Plan100Model>() {
        @Override
        public Plan100Model createFromParcel(Parcel in) {
            return new Plan100Model(in);
        }

        @Override
        public Plan100Model[] newArray(int size) {
            return new Plan100Model[size];
        }
    };

    public long getNo() {
        return No;
    }

    public void setNo(long no) {
        No = no;
    }

    public long getPremiTahunan() {
        return PremiTahunan;
    }

    public void setPremiTahunan(long premiTahunan) {
        PremiTahunan = premiTahunan;
    }

    public long getKlaim() {
        return Klaim;
    }

    public void setKlaim(long klaim) {
        Klaim = klaim;
    }

    public long getNilaiDijamin() {
        return NilaiDijamin;
    }

    public void setNilaiDijamin(long nilaiDijamin) {
        NilaiDijamin = nilaiDijamin;
    }

    public long getDeathTerminal() {
        return DeathTerminal;
    }

    public void setDeathTerminal(long deathTerminal) {
        DeathTerminal = deathTerminal;
    }

    public long getTotalKlaim() {
        return TotalKlaim;
    }

    public void setTotalKlaim(long totalKlaim) {
        TotalKlaim = totalKlaim;
    }

    public long getNilaitidakDijamin() {
        return NilaitidakDijamin;
    }

    public void setNilaitidakDijamin(long nilaitidakDijamin) {
        NilaitidakDijamin = nilaitidakDijamin;
    }
}
