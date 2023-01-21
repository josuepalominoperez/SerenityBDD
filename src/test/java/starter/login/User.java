package starter.login;

/*
Accepted usernames are:
Anuel2023@
Anuel2024@
Anuel2025@

 */
public enum User {
    Cantante_2023("Anuel2023@","Anuel2023@","cantante del 2023"),
    Cantante_2024("Anuel2024@","Anuel2024@","cantante del 2024"),
    Cantante_2025("Anuel2025@","Anuel2025@","cantante del 2025");

    private final String username;
    private final String password;
    private final String description;

    User(String username,String password,String description) {
        this.username=username;
        this.password=password;
        this.description=description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return description;
    }
}
