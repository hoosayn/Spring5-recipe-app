package guru.springframework.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne    // not specifying cascade here because we do not want recipe to be deleted if notes are deleted
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
