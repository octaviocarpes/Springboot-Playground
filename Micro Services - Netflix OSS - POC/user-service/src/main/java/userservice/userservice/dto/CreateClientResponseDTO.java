package userservice.userservice.dto;

public class CreateClientResponseDTO {

    private String name;
    private String email;
    private String username;

    public CreateClientResponseDTO(String name, String email, String username) {
        this.name = name;
        this.email = email;
        this.username = username;
    }


}
