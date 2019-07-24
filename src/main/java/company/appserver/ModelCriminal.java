package company.appserver;

public class ModelCriminal {

    private int id;
    private String firstName;
    private String lastName;
    private String nickname;
    private int crimeFamilyId;

    private ModelCriminal() {};

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getCrimeFamilyId() {
        return crimeFamilyId;
    }

    public void setCrimeFamilyId(int crimeFamilyId) {
        this.crimeFamilyId = crimeFamilyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class Builder {

        private ModelCriminal model;

        public Builder() {
            model = new ModelCriminal();
        }

        public void setId(int id) {
            model.setId(id);
        }

        public void setLastName(String lastName) {
            model.setLastName(lastName);
        }

        public ModelCriminal build() {
            //validate parameters
            //set defaults
            //calculate dependent fields
            return model;
        }

    }
}
