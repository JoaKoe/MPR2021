package pjatk.factory;

import javax.persistence.*;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idUser;
    private String nameUser;

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public User (Long id, String name)
    {
        this.idUser = idUser;
        this.nameUser = nameUser;
    }

}
