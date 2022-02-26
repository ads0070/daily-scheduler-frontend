package Login;

public class User {
    
    private final String username;
    private final String password;
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String eMail;
    
    public static class Builder {
        
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String eMail;
        
        public Builder() {}
        
        public Builder(String username) {
            this.username = username;
        }
        
        public Builder(String username, String password, String firstName, String lastName, String phoneNumber, String eMail) {
            this.username = username;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
            this.eMail = eMail;
        }
        
        public Builder username(String value) {
            username = value;
            return this;
        }
        
        public Builder password(String value) {
            password = value;
            return this;
        }
        
        public Builder firstName(String value) {
            firstName = value;
            return this;
        }
        
        public Builder lastName(String value) {
            lastName = value;
            return this;
        }
        
        public Builder phoneNumber(String value) {
            phoneNumber = value;
            return this;
        }
        
        public Builder eMail(String value) {
            eMail = value;
            return this;
        }
        
        public User build() {
            return new User(this);
        }
    }

    private User(Builder builder) {
        username = builder.username;
        password = builder.password;
        firstName = builder.firstName;
        lastName = builder.lastName;
        phoneNumber = builder.phoneNumber;
        eMail = builder.eMail;
    }
    
    public static Builder builder() {
        return new Builder();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }
}
