package practice_test.model;

public class Player {
    //    Mã cầu thủ, HỌ và tên,ngày sinh , dịa chỉ , đội tuyển
    String id;
    String name;
    String date;
    String adress;
    String team;

    public Player(String id, String name, String date, String adress, String team) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.adress = adress;
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void keckPenalty() {

    }

    public String getInfo() {
        return id + "," + name + "," + date + "," + adress + "," + team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", adress='" + adress + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
